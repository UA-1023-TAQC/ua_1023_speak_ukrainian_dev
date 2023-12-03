package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddCenterMainInformationModal;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunnerWithAdmin;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddLocationModal;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.page;

public class LocationComponentTest extends TestRunnerWithAdmin {
    private AddLocationModal addLocationModal;
    @BeforeMethod
    public void openAddLocationForm() {
        addLocationModal = (AddLocationModal) page(HomePage.class)
                .getHeader()
                .openProfileMenu()
                .openAddCenterModal()
                .openAddLocationModal();
    }

    public void logoutFromAccount() {
        HomePage homePage = page(HomePage.class);
        homePage.open()
                .logOutFromSystem();
    }

    @Test(description = "[TUA-159] Verify that a user can add location to the list of locations after filling in only mandatory fields with valid data")
    public void verifyAddLocationMandatoryFieldsValid() {
        String locationName = "Test Location #1";
        addLocationModal.setInputValueOfLocation(locationName)
                .clickCityDropDown(1)
                .setAddressValue("вулиця Сумська, 81")
                .setGeographicalCoordinatesValue("50.023631765458475, 36.250799018866005")
                .setInputPhoneValue("0977777777")
                .clickAddButton();
        Assert.assertTrue(AddCenterMainInformationModal.isNewLocationPresent(locationName),
                "New location: " + locationName + "not created");
        logoutFromAccount();
    }

    @Test(description = "[TUA-160] Verify that a 'Керівник' cannot add location to the list of locations after leaving all mandatory and optional fields empty")
    public void verifyAddLocationInvalid() {
        addLocationModal.clickAddButton();
        Assert.assertTrue(AddLocationModal.areErrorsDisplayed(), "Errors should be displayed for empty fields");
        logoutFromAccount();
    }
}