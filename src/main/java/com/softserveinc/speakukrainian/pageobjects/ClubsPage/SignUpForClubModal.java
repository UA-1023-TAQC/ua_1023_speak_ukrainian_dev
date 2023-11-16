package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignUpForClubModal {

    public static final SelenideElement TITLE_MODAL = $("#:ri:");
    public static final SelenideElement TITLE_CLUB =
            $x("//div[contains(text(), 'American Gymnastics Club ')]");
    public static final SelenideElement WHO_SIGN_UP = $x("//div[contains(text(), 'Кого записуємо?')]");
    public static final SelenideElement CHECKBOX =
            $x("//span[@class='ant-checkbox ant-wave-target css-18v7s9k']/input");
    public static final SelenideElement ADD_CHILD =
            $x("//button[@class='ant-btn css-18v7s9k ant-btn-default add-children-btn']");
    public static final SelenideElement INPUT = $("#registration-to-club_comment");
    public static final SelenideElement BUTTON =
            $x("//button[@class='ant-btn css-18v7s9k ant-btn-primary SignUpForClub_formButton__Jv2HP']");
    public static final SelenideElement CLOSE_BUTTON =
            $x("/html/body/div[6]/div/div[2]/div/div[2]/button");
    public static final SelenideElement CREATED_CHILD =
            $x("//label[@class='ant-checkbox-wrapper css-18v7s9k']");

    public SelenideElement getModalTitle() {
        return TITLE_MODAL;
    }

    public String getModalTitleText(){
        return getModalTitle().getText();
    }

    public SelenideElement getClubTitle() {
        return TITLE_CLUB;
    }

    public String getClubTitleText(){
        return getClubTitle().getText();
    }

    public SelenideElement getWhoSignUp() {
        return WHO_SIGN_UP;
    }

    public String getWhoSignUpText(){
        return getWhoSignUp().getText();
    }

    public SelenideElement getCheckbox() {
        return WHO_SIGN_UP;
    }

    public void clickCheckbox(){
        getCheckbox().click();
    }

    public String getCheckboxText(){
        return getCheckbox().$x("//div[contains(text(), 'Записати мене на гурток')]").getText();
    }

    public SelenideElement getAddChild() {
        return ADD_CHILD;
    }
    public String getAddChildText(){
        return getAddChild().getText();
    }

    public AddChildModal clickAddChild(){
        getAddChild().click();
        return new AddChildModal();
    }

    public SelenideElement getInput() {
        return INPUT;
    }

    public SignUpForClubModal setInputText(String text) {
        getInput().setValue(text);
        return this;
    }

    public SelenideElement getButton() {
        return BUTTON;
    }

    public String getButtonText(){
        return getButton().getText();
    }

    public ClubDetailPage clickButton(){
        getButton().click();
        return new ClubDetailPage();
    }

    public ClubDetailPage clickCloseButton(){
        CLOSE_BUTTON.click();
        return new ClubDetailPage();
    }

    public SelenideElement getCreatedChild(){
        return CREATED_CHILD;
    }

    public SelenideElement getCreatedChildImg(){
        return getCreatedChild().$x("//img");
    }

    public String getCreatedName(){
        return getCreatedChildImg().getText();
    }

    public SignUpForClubModal clickInputCreatedChild(){
        getCreatedChild().$x("//span[1]/input");
        return this;
    }

}
