package com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class AdvancedSearch {

    private final SelenideElement titleComponent = $("div.club-list-label");
    private final SelenideElement clubRadioButton = $x("//*[@id='basic_isCenter']/label[1]/span[1]/input");
    private final SelenideElement clubRadioButtonLabel = $x("//*[@id=\"basic_isCenter\"]/label[1]/span[2]");
    private final SelenideElement centreRadioButtonLabel = $x("//*[@id=\"basic_isCenter\"]/label[2]/span[2]");
    private final SelenideElement centreRadioButton = $x("//*[@id=\"basic_isCenter\"]/label[2]/span[1]/input");
    private final SelenideElement ageInput = $x("//*[@id=\"basic_age\"]/div/div[2]/input");
    private final SelenideElement remoteCheckbox = $x("//*[@id=\"basic_isOnline\"]/label/span[1]");
    private final SelenideElement remoteCheckboxLabel = $x("//*[@id=\"basic_isOnline\"]/label/span[2]");
    private final SelenideElement cityDropDownMenu = $x("//input[@id='basic_cityName']");
    private final SelenideElement districtDropDownMenu = $x("//input[@id='basic_districtName']");
    private final SelenideElement nearestSubwayStationDropDownMenu = $x("//input[@id='basic_stationName']");
    private final ElementsCollection categoriesCheckboxesBlock = $$("div#basic_categoriesName " +
            "input[type='checkbox']");


    public String getTitleText() {
        return titleComponent.text();
    }

    public void clickOnClubRadioButton() {
        clubRadioButton.click();
    }

    public boolean isClubRadioButtonSelected() {
        return clubRadioButton.isSelected();
    }

    public String getClubRadioButtonText() {
        return clubRadioButtonLabel.text();
    }

    public void clickOnCentreRadioButton() {
        centreRadioButton.click();
    }

    public boolean isCentreRadioButtonSelected() {
        return centreRadioButton.isSelected();
    }

    public String getCentreRadioButtonText() {
        return centreRadioButtonLabel.text();
    }

    public CityDropDownMenuSearch clickOnCityDropDownMenu() {
        cityDropDownMenu.click();
        return new CityDropDownMenuSearch();
    }

    public DistrictDropDownMenuSearch clickOnDistrictDropDownMenu() {
        districtDropDownMenu.click();
        return new DistrictDropDownMenuSearch();
    }

    public SubwayStationDropDownMenuSearch clickOnSubwayStationDropDownMenu() {
        nearestSubwayStationDropDownMenu.click();
        return new SubwayStationDropDownMenuSearch();
    }

    public String getRemoteCheckboxText() {
        return remoteCheckboxLabel.text();
    }

    public void clickOnRemoteCheckbox() {
        remoteCheckbox.click();
    }

    public boolean isRemoteCheckboxSelected() {
        return remoteCheckbox.isSelected();
    }

    public void clickOnCategoriesCheckbox(int index) {
        categoriesCheckboxesBlock.get(index).click();
    }

    public boolean isCategoriesCheckboxSelectedByIndex(int index) {
        return categoriesCheckboxesBlock
                .get(index)
                .isSelected();
    }

    public String getCategoriesCheckboxTextByIndex(int index) {
        return categoriesCheckboxesBlock
                .get(index)
                .getAttribute("value");
    }

    public AdvancedSearch setAgeInput(int age) {
        ageInput.sendKeys(String.valueOf(age));
        return this;
    }
}