package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class AddLocationModal extends BasePage {

    public static final SelenideElement TITLE_MODAL_ADD_LOCATION = $x("//div[contains(text(), 'Додати локацію')]");
    public static final SelenideElement NAME_OF_LOCATION = $x("//form/span[1]");
    public static final SelenideElement CITY = $x("//span[contains(text(), 'Місто')]");
    public static final SelenideElement CITY_DISTRICT = $x("//span[contains(text(), 'Район міста')]");
    public static final SelenideElement STATION = $x("//span[contains(text(), 'Метро/Місцевість')]");
    public static final SelenideElement ADDRESS = $x("//span[contains(text(), 'Адреса");
    public static final SelenideElement GEOGRAPHICAL_COORDINATES = $x("//span[contains(text(), 'Географічні координати')]");
    public static final SelenideElement PHONE = $x("//span[contains(text(), 'Номер телефону')]");

    public static final SelenideElement INPUT_NAME_OF_LOCATION = $("#name");
    public static final SelenideElement INPUT_ADDRESS = $("#address");
    public static final SelenideElement INPUT_GEOGRAPHICAL_COORDINATES = $("#coordinates");
    public static final SelenideElement INPUT_PHONE = $("#phone");
    public static final SelenideElement DROPDOWN_CITY_NAME = $("#cityName");
    public static final SelenideElement DROPDOWN_DISTRICT_NAME = $("#districtName");
    public static final SelenideElement DROPDOWN_STATION_NAME = $("#stationName");
    public static final ElementsCollection LIST_CITY_DROPDOWN =
            $$x("#/html/body/div[9]/div/div/div[2]/div[1]/div/div/div");

    public static final SelenideElement ADD_BUTTON =
            $x("button[class='ant-btn css-18v7s9k ant-btn-default flooded-button add-club-content-next']");
    public static final SelenideElement CLOSE_BUTTON =
            $x("/html/body/div[6]/div/div[2]/div/div[2]/button");
    public static final SelenideElement LOCATION_ERROR = $("#name_help");
    public static final SelenideElement CITY_NAME_ERROR = $("#cityName_help");
    public static final SelenideElement GEOGRAPHICAL_COORDINATES_ERROR = $x("#address_help");
    public static final SelenideElement PHONE_ERROR = $("#coordinates_help");
    public static final SelenideElement ADDRESS_ERROR = $("#phone_help");


    public SelenideElement getModalTitle() {
        return TITLE_MODAL_ADD_LOCATION;
    }

    public String getModalTitleText() {
        return getModalTitle().getText();
    }

    public SelenideElement getNameOfLocation() {
        return NAME_OF_LOCATION;
    }

    public String getNameOfLocationText() {
        return getNameOfLocation().getText();
    }

    public SelenideElement getInputOfLocation() {
        return INPUT_NAME_OF_LOCATION;
    }

    public AddLocationModal setInputValueOfLocation(String value) {
        getInputOfLocation().setValue(value);
        return this;
    }

    public SelenideElement getCity() {
        return CITY;
    }

    public String getCityText() {
        return getCity().getText();
    }

    public AddLocationModal clickCityDropDown(int count) {
        getCity().click();
        pressArrowDown(count);
        return this;
    }

    public SelenideElement getCityDistrict() {
        return CITY_DISTRICT;
    }

    public String getCityDistrictText() {
        return getCityDistrict().getText();
    }

    public AddLocationModal clickCityDistrictDropDown(int count) {
        getCityDistrict().click();
        pressArrowDown(count);
        return this;
    }

    public SelenideElement getStation() {
        return STATION;
    }

    public String getStationText() {
        return getStation().getText();
    }

    public AddLocationModal clickStationDropDown(int count) {
        getStation().click();
        pressArrowDown(count);
        return this;
    }

    public SelenideElement getAddress() {
        return ADDRESS;
    }

    public String getAddressText() {
        return getAddress().getText();
    }

    public SelenideElement getInputAddress() {
        return INPUT_ADDRESS;
    }

    public AddLocationModal setAddressValue(String value) {
        getInputAddress().setValue(value);
        return this;
    }

    public SelenideElement getGeographicalCoordinates() {
        return GEOGRAPHICAL_COORDINATES;
    }

    public String getGeographicalCoordinatesText() {
        return getGeographicalCoordinates().getText();
    }

    public SelenideElement getInputGeographicalCoordinates() {
        return INPUT_GEOGRAPHICAL_COORDINATES;
    }

    public AddLocationModal setGeographicalCoordinatesValue(String value) {
        getInputGeographicalCoordinates().setValue(value); //41.40338, 2.17403
        return this;
    }

    public SelenideElement getPhone() {
        return PHONE;
    }

    public String getPhoneText() {
        return getPhone().getText();
    }

    public SelenideElement getInputPhone() {
        return INPUT_PHONE;
    }

    public AddLocationModal setInputPhoneValue(String value) {
        getInputPhone().setValue(value);
        return this;
    }

    public SelenideElement getLocationError() {
        return LOCATION_ERROR;
    }

    public String getLocationErrorText() {
        return getLocationError().getText();
    }

    public SelenideElement getAddressError() {
        return ADDRESS_ERROR;
    }

    public String getAddressErrorText() {
        return getAddressError().getText();
    }

    public SelenideElement getGeographicalCoordinatesError() {
        return GEOGRAPHICAL_COORDINATES_ERROR;
    }

    public String getGeographicalCoordinatesErrorText() {
        return getGeographicalCoordinatesError().getText();
    }

    public SelenideElement getPhoneError() {
        return PHONE_ERROR;
    }

    public String getPhoneErrorText() {
        return getPhoneError().getText();
    }

    public SelenideElement getCityNameError() {
        return CITY_NAME_ERROR;
    }

    public String getCityNameErrorText() {
        return getCityNameError().getText();
    }

    public ElementsCollection getListCity() {
        return LIST_CITY_DROPDOWN;
    }

    public SelenideElement getAddButton() {
        return ADD_BUTTON;
    }

    public String getAddButtonText() {
        return getAddButton().getText();
    }

    public AddCenterContactsModal clickAddButton(){
        getAddButton().click();
        return new AddCenterContactsModal();
    }

    public SelenideElement getCloseButton() {
        return CLOSE_BUTTON;
    }

    public HomePage clickCloseWindowButton(){
        getCloseButton().click();
        return new HomePage();
    }

}
