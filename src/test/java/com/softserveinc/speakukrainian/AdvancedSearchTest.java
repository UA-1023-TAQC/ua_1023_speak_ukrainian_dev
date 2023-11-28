package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdvancedSearchTest extends TestRunner {

    @Test
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
}
