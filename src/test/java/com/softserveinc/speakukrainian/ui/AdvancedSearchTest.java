package com.softserveinc.speakukrainian.ui;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.refresh;
import static org.testng.Assert.assertEquals;

public class AdvancedSearchTest extends TestRunner {

    @Test
    // https://jira.softserve.academy/projects/TUA/issues/TUA-510
    public void centerRadiobuttonDisablesParameters(){

        AdvancedSearch advancedSearch = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCentreRadioButton();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertFalse(advancedSearch.isClubRadioButtonSelected());
        softAssert.assertTrue(advancedSearch.isCentreRadioButtonSelected());
        softAssert.assertFalse(advancedSearch.isAgeInputPresent());
        softAssert.assertFalse(advancedSearch.isRemoteCheckboxPresent());
        softAssert.assertFalse(advancedSearch.isCategoriesCheckboxesBlockPresent());

        softAssert.assertAll();
    }

    @Test
    //https://jira.softserve.academy/projects/TUA/issues/TUA-509
    public void clubRadiobuttonEnablesParameters(){

        AdvancedSearch advancedSearch = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(advancedSearch.isClubRadioButtonSelected());
        softAssert.assertFalse(advancedSearch.isCentreRadioButtonSelected());
        softAssert.assertTrue(advancedSearch.isCityDropDownPresent());
        softAssert.assertTrue(advancedSearch.isDistrictDropDownPresent());
        softAssert.assertTrue(advancedSearch.isSubwayStationDropDownPresent());
        softAssert.assertTrue(advancedSearch.isAgeInputPresent());
        softAssert.assertTrue(advancedSearch.isRemoteCheckboxPresent());
        softAssert.assertTrue(advancedSearch.isCategoriesCheckboxesBlockPresent());

        softAssert.assertAll();
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
        new AdvancedSearch()
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
        List<String> actualSortItemsDecreasing = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualListByAlphabet) {
            actualSortItemsDecreasing.add(tmp.getClubNameText());
        }
        Collections.reverse(expectedSortItemsByAlphabet);
        assertEquals(expectedSortItemsByAlphabet, actualSortItemsDecreasing);

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
        List<ClubCardComponent> clubsCardsActualListByRatingDecreasing =  new AdvancedSearch()
                .getSortBlock()
                .clickArrowUpOrDown("arrow-down")
                .getClubsCard();
        List<Integer> actualSortItemsByRatingDecreasing = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualListByRatingDecreasing) {
            actualSortItemsByRatingDecreasing.add(tmp.getCountOfRating());
        }
        assertEquals(expectedSortItemsByRating, actualSortItemsByRatingDecreasing);
    }

    @AfterMethod
    public void closeAdvancedSearch(){
        homePage
                .getHeader()
                .clickLogo();
        refresh();
    }
}
