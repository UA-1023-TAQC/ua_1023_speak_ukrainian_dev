package com.softserveinc.speakukrainian.ui.guest;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.*;

public class HomePageTest extends TestRunner {

    @Test
    public void verifyTitle() {
        homePage
                .getHeader()
                .openGuestProfileMenu()
                .openLogin();

    }

    @Test
    public void verifyAdvancedSearchButtonOpensTheSearchSection() {
        AdvancedSearch open = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn();
        assertTrue(open.isTitleDisplayed(), "Advanced Search Component is not displayed");
        open.getAdvancedSearchComponent().shouldBe(visible);
        AdvancedSearch close = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn();
        assertFalse(close.isTitleDisplayed(), "Advanced Search Component is displayed");
        open.getAdvancedSearchComponent().shouldNotBe(visible);
    }

    @Test
    public void verifySearchFieldBehaviorForInvalidNumberOfSymbolsEntered(){
        String text1 = "a";
        Header header = homePage.getHeader();
        header.setSearchClub(text1);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(header.getSearchClubInputLength(), text1.length());

        String text2 = text1 + "bcdeabcdeabcdeabcdeabcdeabcdeab" +
                "cdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdea" +
                "bcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde" +
                "abcdeabcdeabcdeabcdeabcdeabcde";
        header.setSearchClub(text2);
        softAssert.assertEquals(header.getSearchClubInputLength(), text2.length());
        ClubsPage clubsPage = new ClubsPage();
        softAssert.assertEquals(clubsPage.getClubsNotFoundText(),"За критеріями пошуку гуртків не знайдено");

        String text3 = text2 + "a";
        header.setSearchClub(text3);
        softAssert.assertEquals(header.getSearchClubInputLength(), text3.length());
        softAssert.assertEquals(clubsPage.getClubsNotFoundText(),"За критеріями пошуку гуртків не знайдено");
        softAssert.assertAll();
    }
}
