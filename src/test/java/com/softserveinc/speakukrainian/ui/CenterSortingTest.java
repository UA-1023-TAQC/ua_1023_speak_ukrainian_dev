package com.softserveinc.speakukrainian.ui;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.CenterCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import com.softserveinc.speakukrainian.utils.jdbc.entity.CenterEntity;
import com.softserveinc.speakukrainian.utils.jdbc.services.CenterService;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;

public class CenterSortingTest extends TestRunner {
    @Test
    // https://jira.softserve.academy/projects/TUA/issues/TUA-440
    public void centerSorting(){
        new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCentreRadioButton();


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
            Collections.sort(listOfCenters);
            softAssert.assertEquals(listOfCenters.get(i), centersInDatabase.get(i).getName());
        }
        softAssert.assertAll();

    }
}
