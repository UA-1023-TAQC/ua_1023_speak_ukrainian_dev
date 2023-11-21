package com.softserveinc.speakukrainian.utils;

import org.testng.annotations.BeforeMethod;

public class TestRunnerWithDirector extends TestRunner {
    @BeforeMethod
    public void loginAsDirector() {
        {
            homePage
                    .getHeader()
                    .openGuestProfileMenu()
                    .openLogin()
                    .setEmailInput(PropertyUtil.getDirectorEmail())
                    .setPasswordInput(PropertyUtil.getDirectorPassword())
                    .clickSubmitBtn();
        }
    }
}
