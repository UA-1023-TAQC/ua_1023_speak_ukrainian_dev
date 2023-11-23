package com.softserveinc.speakukrainian.utils;

import com.codeborne.selenide.SelenideElement;
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
        SelenideElement closeModalBtn = new EditProfileModal().getCloseButton();
        if (closeModalBtn.exists() && closeModalBtn.isEnabled()) {
            closeModalBtn.click();
        }
        homePage.logOutFromSystem();
    }

}
