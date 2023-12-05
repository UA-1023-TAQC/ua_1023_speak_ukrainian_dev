package com.softserveinc.speakukrainian.ui.guest;

import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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
}
