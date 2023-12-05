package com.softserveinc.speakukrainian.ui.guest;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.refresh;
import static org.testng.Assert.assertEquals;

public class ClubsPageTest extends TestRunner {

    @BeforeMethod
    public void openClubsPage() {
        homePage
                .getHeader()
                .openClubsPage();
    }

    @Test(description = "TUA-103: Verify that sorting for advanced search works correctly")
    public void testSortClubsCart() {
        List<ClubCardComponent> clubsCardsExpectedListByAlphabet;
        List<ClubCardComponent> clubsCardsActualListByAlphabet;
        clubsCardsActualListByAlphabet = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCityDropDownMenu()
                .selectCityFromDropDown("Харків")
                .getSortBlock()
                .clickSortByAlphabetOrRating("за алфавітом")
                .getClubsCard();
        List<String> actualSortItemsByAlphabet = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualListByAlphabet) {
            actualSortItemsByAlphabet.add(tmp.getClubNameText());
        }

        refresh();

        homePage
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCityDropDownMenu()
                .selectCityFromDropDown("Харків");
        clubsCardsExpectedListByAlphabet = new ClubsPage()
                .getClubsCard();
        List<String> expectedSortItemsByAlphabet = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsExpectedListByAlphabet) {
            expectedSortItemsByAlphabet.add(tmp.getClubNameText());
        }
        Collections.sort(expectedSortItemsByAlphabet);
        assertEquals(expectedSortItemsByAlphabet, actualSortItemsByAlphabet);

        clubsCardsActualListByAlphabet = new AdvancedSearch()
                .getSortBlock()
                .clickArrowUpOrDown("arrow-up")
                .getClubsCard();
        List<String> actualSortItemsReverse = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualListByAlphabet) {
            actualSortItemsReverse.add(tmp.getClubNameText());
        }
        Collections.reverse(expectedSortItemsByAlphabet);
        assertEquals(expectedSortItemsByAlphabet, actualSortItemsReverse);

        List<ClubCardComponent> clubsCardsExpectedListByRating = new ClubsPage()
                .getClubsCard();
        List<Integer> expectedSortItemsByRating = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsExpectedListByRating) {
            expectedSortItemsByRating.add(tmp.getCountOfRating());
        }
        Collections.sort(expectedSortItemsByRating);
        List<ClubCardComponent> clubsCardsActualListByRating =  new AdvancedSearch()
                .getSortBlock()
                .clickSortByAlphabetOrRating("за рейтингом")
                .getClubsCard();
        List<Integer> actualSortItemsByRating = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualListByRating) {
            actualSortItemsByRating.add(tmp.getCountOfRating());
        }
        assertEquals(expectedSortItemsByRating, actualSortItemsByRating);

        Collections.reverse(expectedSortItemsByRating);
        List<ClubCardComponent> clubsCardsActualListByRatingReverse =  new AdvancedSearch()
                .getSortBlock()
                .clickArrowUpOrDown("arrow-down")
                .getClubsCard();
        List<Integer> actualSortItemsByRatingReverse = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualListByRatingReverse) {
            actualSortItemsByRatingReverse.add(tmp.getCountOfRating());
        }
        assertEquals(expectedSortItemsByRating, actualSortItemsByRatingReverse);
    }

}


