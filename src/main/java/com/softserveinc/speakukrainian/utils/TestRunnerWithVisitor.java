package com.softserveinc.speakukrainian.utils;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.BaseComponent;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.EditProfileModal;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.List;

public class TestRunnerWithVisitor extends TestRunner {

    @BeforeMethod
    public void loginAsVisitor() {
        {
            homePage
                    .getHeader()
                    .openGuestProfileMenu()
                    .openLogin()
                    .setEmailInput(PropertyUtil.getVisitorEmail())
                    .setPasswordInput(PropertyUtil.getVisitorPassword())
                    .clickSubmitBtn();
        }
    }

    @AfterMethod
    public void logOutAfterTest() {
        SelenideElement closeEditModalBtn = new EditProfileModal().getCloseButton();
        SelenideElement closeAddCenterModalBtn = new BaseComponent().getCloseAddCenterModalButton();
        SelenideElement closeAddClubModalBtn = new AddClubModal().getCloseBtn();

        List<SelenideElement>  closeModalButtons = Arrays.asList(closeEditModalBtn, closeAddClubModalBtn, closeAddCenterModalBtn);
        for (SelenideElement closeButton: closeModalButtons){
            if (closeButton.exists() && closeButton.isEnabled()) {
                closeButton.click();
            }
        }
        homePage.logOutFromSystem();
    }

}
