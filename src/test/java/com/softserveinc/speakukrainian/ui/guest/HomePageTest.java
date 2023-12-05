package com.softserveinc.speakukrainian.ui.guest;


import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class HomePageTest extends TestRunner {

    @Test
    public void verifyTitle() {
        homePage
                .getHeader()
                .openGuestProfileMenu()
                .openLogin();

    }
}
