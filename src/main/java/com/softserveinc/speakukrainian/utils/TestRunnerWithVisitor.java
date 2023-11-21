package com.softserveinc.speakukrainian.utils;

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
}
