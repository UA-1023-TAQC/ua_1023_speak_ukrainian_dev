package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ManagerChatModal extends ClubDetailPage{

    public static final SelenideElement TITLE_CHAT_MODAL =
            $x("//div[@class='MessageToClubManager_title__GVetP']");
    public static final SelenideElement SUBTITLE_CHAT_MODAL =
            $x("//div[@class='MessageToClubManager_content__U5voh']");

    public static final ElementsCollection LINKS_CONTACTS =
            $$x("/html/body/div[5]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div");

    public static final SelenideElement TITLE_TEXTAREA =
            $x("//label[@title='Написати організатору гуртка']");

    public static final SelenideElement TEXTAREA =
            $x("//textarea[@placeholder='Додайте опис']");

    public static final SelenideElement SEND_BUTTON =
            $x("/html/body/div[5]/div/div[2]/div/div[2]/div/div[2]/form/div[2]/button");
    public static final SelenideElement CLOSE_BUTTON_CHAT_MODAL =
            $x("/html/body/div[5]/div/div[2]/div/div[2]/button");


    public ElementsCollection getListContacts() {
        return LINKS_CONTACTS;
    }
    public SelenideElement getListContactsElement(int index) {
        return getListContacts().get(index);
    }

    public SelenideElement getElementTitle(int index) {
        return getListContactsElement(index).$x(".//span");
    }

    public String getBannerTitleText(int index) {
        return getElementTitle(index).getText();
    }

    public SelenideElement getElementIcon(int index) {
        return getListContactsElement(index).$x("./div");
    }

    public SelenideElement getTitleChatModal(){
        return TITLE_CHAT_MODAL;
    }

    public String getTitleChatModalText(){
        return getTitleChatModal().getText();
    }

    public SelenideElement getSubTitleChatModal(){
        return SUBTITLE_CHAT_MODAL;
    }

    public String getSubTitleChatModalText(){
        return getSubTitleChatModal().getText();
    }

    public SelenideElement getSendButton() {
        return SEND_BUTTON;
    }

    public String getButtonText(){
        return getSendButton().getText();
    }

    public ClubDetailPage clickButton(){
        getSendButton().click();
        return new ClubDetailPage();
    }

    public ClubDetailPage clickCloseButton(){
        CLOSE_BUTTON_CHAT_MODAL.click();
        return new ClubDetailPage();
    }

    public SelenideElement getTitleTextarea(){
        return TITLE_TEXTAREA;
    }

    public String getTitleTextareaText(){
        return getTitleTextarea().getText();
    }

    public SelenideElement getTextarea(){
        return TEXTAREA;
    }

    public ManagerChatModal setTextTextArea(String text){
        getTextarea().setValue(text);
        return this;
    }
}
