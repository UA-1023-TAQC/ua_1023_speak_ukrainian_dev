package com.softserveinc.speakukrainian.utils;

import com.codeborne.selenide.Configuration;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.softserveinc.speakukrainian.utils.PropertyUtil.getDefaultBrowser;
import static com.softserveinc.speakukrainian.utils.PropertyUtil.getDefaultTimeOut;

public class TestRunner {
    protected final HomePage homePage = new HomePage();

    @BeforeSuite
    public void driverConfigurationAndTimeOut() {
        Configuration.browser = getDefaultBrowser();
        Configuration.timeout = getDefaultTimeOut() * 1000L;
        Configuration.pageLoadTimeout = 50 * 1000L;
    }

    @BeforeMethod
    public void navigateToUrl() {homePage.open();}
}
