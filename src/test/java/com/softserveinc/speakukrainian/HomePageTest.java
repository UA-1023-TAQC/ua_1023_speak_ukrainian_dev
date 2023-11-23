package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.components.LoginModal;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class HomePageTest extends TestRunner {

    @Test
    public void verifyTitle() {
        LoginModal loginModal = new HomePage()
                .getHeader()
                .openGuestProfileMenu()
                .openLogin();

    }

    @Test
    public void verifyAdvancedSearchButtonIsOpensSection() {
        AdvancedSearch open = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn();
        assertTrue(open.componentIsDisplayed(), "Advanced Search Component is not displayed");
        AdvancedSearch close = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn();
        assertFalse(close.componentIsDisplayed(), "Advanced Search Component is displayed");
    }
}
