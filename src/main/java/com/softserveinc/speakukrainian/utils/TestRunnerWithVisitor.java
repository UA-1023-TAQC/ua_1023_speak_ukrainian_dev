package com.softserveinc.speakukrainian.utils;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.BaseComponent;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.EditProfileModal;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
        SelenideElement closeAddCenterModalBtn = new BaseComponent().getCloseWindowButton();
        if (closeEditModalBtn.exists() && closeEditModalBtn.isEnabled()) {
            closeEditModalBtn.click();
        }
        if (closeAddCenterModalBtn.exists() && closeAddCenterModalBtn.isEnabled()) {
            closeAddCenterModalBtn.click();
        }
        homePage.logOutFromSystem();
    }

}
