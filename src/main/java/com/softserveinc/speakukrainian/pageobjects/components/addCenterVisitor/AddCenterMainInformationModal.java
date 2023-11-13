package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class AddCenterMainInformationModal{

    public static final ElementsCollection MENU_ITEMS =
            $$x("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div/div/div");
    public static final SelenideElement TITLE_CONTAINER = $x("//div[@class='modal-title']");
    public static final SelenideElement NAME_OF_CENTER = $x("//span[contains(text(), 'Назва центру')]");
    public static final SelenideElement INPUT_NAME_OF_CENTER = $("#basic_name");
    public static final SelenideElement INPUT_NAME_OF_CENTER_ERROR =
            $x("//div[@class='ant-form-item-explain-error']");
    public static final SelenideElement LOCATIONS = $x("//span[contains(text(), 'Локації')]");
    public static final SelenideElement ADD_LOCATION = $x("//main/div[3]/form/div[1]/div[2]/button");
    public static final SelenideElement CREATED_LOCATION =
            $x("//button[@class='ant-btn css-18v7s9k ant-btn-default add-location-btn']");
    public static final SelenideElement CHECKBOX_LOCATION = $x("//input[@class='ant-checkbox-input']");
    public static final SelenideElement ERROR_LOCATION = $x("//span[contains(text(), 'Локації')]");
    public static final SelenideElement NEXT_STEP_BUTTON = $x("//button[contains(text(), 'Наступнмй крок')]");
    public static final SelenideElement TOOLTIP = $("div[role='tooltip']");
    public static final SelenideElement CLOSE_WINDOW_BUTTON = $x("/html/body/div[5]/div/div/div/div[2]/button");


    public ElementsCollection getListMenuItems(){
        return MENU_ITEMS;
    }
    public SelenideElement getListMenuElement(int index) {
        return getListMenuItems().get(index);
    }

    public SelenideElement getListMenuItemsTitle(int index) {
        SelenideElement title = getListMenuElement(index).$x("//div[@class='ant-steps-item-title']");
        return title;
    }

    public String getListMenuItemsTitleText(int index) {
        return getListMenuItemsTitle(index).getText();
    }

    public SelenideElement getListMenuItemsIcon(int index) {
        SelenideElement icon = getListMenuElement(index).$x("//span");
        return icon;
    }

    public String getListMenuItemsIconText(int index) {
        return getListMenuItemsIcon(index).getText();
    }

    public SelenideElement getContainerTitle() {
        return TITLE_CONTAINER;
    }

    public String getContainerTitleText() {
        return getContainerTitle().getText();
    }

    public SelenideElement getInputTitle() {
        return TITLE_CONTAINER;
    }

    public String getInputTitleText() {
        return getInputTitle().getText();
    }

    public SelenideElement getInputField() {
        return INPUT_NAME_OF_CENTER;
    }

    public AddCenterMainInformationModal setInputValue(String value) {
        getInputField().setValue(value);
        return this;
    }

    public SelenideElement getTooltipInner() {
        return TOOLTIP;
    }

    public String getTooltipText() {
        return getTooltipInner().getText();
    }

    public SelenideElement getInputNameOfCenterError() {
        return INPUT_NAME_OF_CENTER_ERROR;
    }

    public String getInputNameOfCenterErrorText() {
        return getInputNameOfCenterError().getText();
    }



    public SelenideElement getLocations() {
        return LOCATIONS;
    }

    public String getLocationsText() {
        return getLocations().getText();
    }

    public SelenideElement getAddLocation() {
        return ADD_LOCATION;
    }

    public String getAddLocationText() {
        return getAddLocation().getText();
    }

    public AddCenterContactsModal clickAddLocation(){
        getAddLocation().click();
        return new AddCenterContactsModal();
    }

    public SelenideElement getCreatedLocation() {
        return CREATED_LOCATION;
    }

    public String getCreatedLocationText() {
        return getCreatedLocation().getText();
    }

    public SelenideElement getCreatedLocationCheckbox() {
        return CHECKBOX_LOCATION;
    }

    public AddLocationModal clickCreatedLocation(){
        getCreatedLocationCheckbox().click();
        return new AddLocationModal();
    }

    public SelenideElement getCreatedLocationError() {
        return ERROR_LOCATION;
    }

    public String getCreatedLocationErrorText() {
        return getCreatedLocationError().getText();
    }

    public SelenideElement getNextStepButton() {
        return NEXT_STEP_BUTTON;
    }

    public String getNextStepButtonText() {
        return getNextStepButton().getText();
    }

    public AddCenterMainInformationModal clickNextStepButton(){
        getNextStepButton().click();
        return new AddCenterMainInformationModal();
    }

    public SelenideElement getCloseWindowButton() {
        return CLOSE_WINDOW_BUTTON;
    }

    public HomePageVisitor clickCloseWindowButton(){
        getCloseWindowButton().click();
        return new HomePageVisitor();
    }

}
