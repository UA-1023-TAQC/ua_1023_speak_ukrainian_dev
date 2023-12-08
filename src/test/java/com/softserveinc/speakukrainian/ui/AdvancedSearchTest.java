package com.softserveinc.speakukrainian.ui;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.CenterCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import com.softserveinc.speakukrainian.utils.jdbc.entity.CenterEntity;
import com.softserveinc.speakukrainian.utils.jdbc.services.CenterService;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void centerSortingByRating(){
        new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCentreRadioButton()
                .clickOnSortByRating();

        List<CenterCardComponent> centers = new ClubsPage().getCentersCard();
        List<String> listOfCenters = new ArrayList<>();

        for (CenterCardComponent center : centers){
            String rating = center.getCenterNameText();
            listOfCenters.add(rating);
        }

        List<CenterEntity> centersInDatabase = new CenterService().getCentersAscendingByRating();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(listOfCenters.size(), centersInDatabase.size());
        for (int i = 0; i < listOfCenters.size(); i++){
            softAssert.assertEquals(listOfCenters.get(i), centersInDatabase.get(i).getName());
        }

        new AdvancedSearch().clickOnSortArrowUp();

        List<CenterCardComponent> centersDescending = new ClubsPage().getCentersCard();
        List<String> listOfCentersDescending = new ArrayList<>();

        for (CenterCardComponent center : centersDescending){
            String rating = center.getCenterNameText();
            listOfCentersDescending.add(rating);
        }

        List<CenterEntity> centersInDatabaseDescending = new CenterService().getCentersDescendingByRating();

        softAssert.assertEquals(listOfCentersDescending.size(), centersInDatabaseDescending.size());
        for (int i = 0; i < listOfCentersDescending.size(); i++){
            softAssert.assertEquals(listOfCentersDescending.get(i), centersInDatabaseDescending.get(i).getName());
        }
        softAssert.assertAll();
    }
}
