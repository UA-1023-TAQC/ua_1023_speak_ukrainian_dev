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


public class CenterSortingTest extends TestRunner {
    @Test
    // https://jira.softserve.academy/projects/TUA/issues/TUA-440
    public void centerSorting(){
        new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCentreRadioButton()
                .clickOnSortByAlphabet()
                .clickOnSortArrowDown();

        List<CenterCardComponent> centers = new ClubsPage().getCentersCard();

        List<String> listOfCenters = new ArrayList<>();

        for (CenterCardComponent center: centers){
            String name = center.getCenterNameText();
            listOfCenters.add(name);
        }

        List<CenterEntity> centersInDatabase = new CenterService().getFirstSixCentersAscendingByName();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(listOfCenters.size(), centersInDatabase.size());
        for (int i = 0; i < listOfCenters.size(); i++){
            softAssert.assertEquals(listOfCenters.get(i), centersInDatabase.get(i).getName());
        }

        new AdvancedSearch().clickOnSortArrowUp();

        List<CenterCardComponent> centersDescending = new ClubsPage().getCentersCard();

        List<String> listOfCentersDescending = new ArrayList<>();

        for (CenterCardComponent center: centersDescending){
            String name = center.getCenterNameText();
            listOfCentersDescending.add(name);
        }

        List<CenterEntity> centersInDatabaseDescending = new CenterService().getFirstSixCentersDescendingByName();

        softAssert.assertEquals(listOfCentersDescending.size(), centersInDatabaseDescending.size());
        for (int i = 0; i < listOfCentersDescending.size(); i++){
            softAssert.assertEquals(listOfCentersDescending.get(i), centersInDatabaseDescending.get(i).getName());
        }
        softAssert.assertAll();
    }
}
