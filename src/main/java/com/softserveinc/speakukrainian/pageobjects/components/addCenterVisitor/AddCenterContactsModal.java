package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class AddCenterContactsModal extends BaseComponent {

    public static final SelenideElement TITLE_FORM = $x("//span[class='ant-typography css-18v7s9k']");
    public static final ElementsCollection LIST_INPUT_FIELD =
            $$x("//main/div[3]/form/div[1]/div/div/div/div/div/div");
    public static final SelenideElement INPUT_PHONE_ERROR_MESSAGE = $("#contacts_contactТелефон_help");


    public ElementsCollection getListMenuItems(){
        return LIST_INPUT_FIELD;
    }

    public AddCenterContactsModal getListMenuElement(int index, String value) {
        getListMenuItems().get(index).setValue(value);
        return this;
    }

    public SelenideElement getTitleForm(){
        return TITLE_FORM;
    }

    public String getTitleFormText(){
        return getTitleForm().getText();
    }

    public SelenideElement getInputPhoneErrorMessage(){
        return INPUT_PHONE_ERROR_MESSAGE;
    }

    public String getInputPhoneErrorMessageText(){
        return getInputPhoneErrorMessage().getText();
    }

    public AddCenterDescriptionModal clickNextStepButton(){
        getNextStepButton().click();
        return new AddCenterDescriptionModal();
    }

    public AddCenterMainInformationModal clickBackButton(){
        getBackButton().click();
        return new AddCenterMainInformationModal();
    }
}
