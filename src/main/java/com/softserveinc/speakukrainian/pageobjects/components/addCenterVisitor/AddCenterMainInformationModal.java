package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class AddCenterMainInformationModal extends BaseComponent {

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
    public static final SelenideElement TOOLTIP = $("div[role='tooltip']");




    public SelenideElement getContainerTitle() {
        return TITLE_MODAL;
    }

    public String getContainerTitleText() {
        return getContainerTitle().getText();
    }

    public SelenideElement getInputTitle() {
        return TITLE_MODAL;
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

    public AddCenterMainInformationModal clickNextStepButton(){
        getNextStepButton().click();
        return new AddCenterMainInformationModal();
    }


}
