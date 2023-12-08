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
    private final SelenideElement cityDropDownMenu =   $x("//*[@id='basic']/div[2]");
    private final SelenideElement districtDropDownMenu = $x("//*[@id='basic']/div[3]");
    private final SelenideElement subwayStationDropDownMenu = $x("//*[@id='basic']/div[4]");
    private final ElementsCollection categoriesCheckboxesBlock = $$("div#basic_categoriesName " +
            "input[type='checkbox']");

    private final SelenideElement sortByAlphabet = $x("//span[@class='control-sort-option'] [contains(text(),'алфавіт')]");

    private final SelenideElement sortByRating = $x("//span[@class='control-sort-option'] [contains(text(),'за рейтингом')]");

    private final SelenideElement sortArrowUp = $x("//span[@class='anticon anticon-arrow-up control-sort-arrow']");

    private final SelenideElement sortArrowDown = $x("//span[@class='anticon anticon-arrow-down control-sort-arrow']");

    private final SelenideElement AdvancedSearchComponent = $("aside");

    public String getTitleText() {
        return titleComponent.text();
    }

    public AdvancedSearch clickOnClubRadioButton() {
        clubRadioButton.click();
        return this;
    }

    public boolean isClubRadioButtonSelected() {
        return clubRadioButton.isSelected();
    }

    public String getClubRadioButtonText() {
        return clubRadioButtonLabel.text();
    }

    public AdvancedSearch clickOnCentreRadioButton() {
        centreRadioButton.click();
        return this;
    }

    public boolean isCentreRadioButtonSelected() {
        return centreRadioButton.isSelected();
    }

    public String getCentreRadioButtonText() {
        return centreRadioButtonLabel.text();
    }

    public void clickOnCityDropDownMenu(){
        cityDropDownMenu.click();
    }

    public AdvancedSearch selectCityFromDropDown(String cityName){
        $x("//div[contains(@title, '" + cityName + "')]").click();
        return new AdvancedSearch();
    }

    public void clickOnDistrictDropDownMenu(){
        districtDropDownMenu.click();
    }

    public AdvancedSearch selectDistrictFromDropDown(String district){
        $x("//div[contains(@title, '" + district + "')]").click();
        return new AdvancedSearch();
    }

    public void clickOnSubwayStationDropDownMenu(){
        subwayStationDropDownMenu.click();
    }

    public AdvancedSearch selectSubwayStationFromDropDown(String stationName) {
        $x("//div[contains(@title, '" + stationName + "')]").click();
        return new AdvancedSearch();
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

    public boolean isCityDropDownPresent() {
        return cityDropDownMenu.exists();
    }

    public boolean isDistrictDropDownPresent() {
        return districtDropDownMenu.exists();
    }

    public boolean isSubwayStationDropDownPresent() {
        return subwayStationDropDownMenu.exists();
    }

    public boolean isAgeInputPresent() {
        return ageInput.exists();
    }

    public boolean isRemoteCheckboxPresent() {
        return remoteCheckbox.exists();
    }

    public boolean isCategoriesCheckboxesBlockPresent() {
        return categoriesCheckboxesBlock.first().exists();
    }

    public boolean isTitleDisplayed() {
       return this.titleComponent.isDisplayed();
    }

    public AdvancedSearch clickOnSortByAlphabet(){
        sortByAlphabet.click();
        return this;
    }

    public AdvancedSearch clickOnSortByRating(){
        sortByRating.click();
        return this;
    }

    public AdvancedSearch clickOnSortArrowUp(){
        sortArrowUp.click();
        return this;
    }

    public AdvancedSearch clickOnSortArrowDown(){
        sortArrowDown.click();
        return this;
    }

}
