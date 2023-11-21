package com.softserveinc.speakukrainian.utils;

import org.testng.annotations.BeforeMethod;

public class TestRunnerWithAdmin extends TestRunner {

    @BeforeMethod
    public void loginAsAdmin() {
        {
            homePage
                    .getHeader()
                    .openGuestProfileMenu()
                    .openLogin()
                    .setEmailInput(PropertyUtil.getAdminEmail())
                    .setPasswordInput(PropertyUtil.getAdminPassword())
                    .clickSubmitBtn();
        }
    }

}
