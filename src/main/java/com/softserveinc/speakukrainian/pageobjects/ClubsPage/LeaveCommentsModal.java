package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class LeaveCommentsModal extends ClubDetailPage{

    public static final SelenideElement TITLE_COMMENTS_MODAL =
            $x("//span[@class='comment-edit-title']");
    public static final SelenideElement TYPE_COMMENT =
            $("#rc-tabs-1-tab-1");

    public static final SelenideElement TYPE_CLAIM =
            $("#rc-tabs-1-tab-2");

    public static final SelenideElement NOTE_CLAIM =
            $x("//div[@class='complaint-note']");

    public static final SelenideElement SUBTITLE_COMMENTS_MODAL =
            $x("//div[@class='club-title-note']");

    public static final SelenideElement DESCRIPTION_TEXTAREA =
            $("#comment-edit_commentText");

    public static final SelenideElement SEND_BUTTON_COMMENTS_MODAL =
            $("#comment-edit_commentText");
    public static final SelenideElement CLOSE_BUTTON_COMMENTS_MODAL =
            $x("/html/body/div[6]/div/div[2]/div/div[2]/button");


    /**
     *
     * @param inputTitle css value of the title selector
     * @return xpath defined with the specified selector
     */
    public SelenideElement getFormInputTitle(String inputTitle) {
        return $x(String.format("//label[@title='%s']", inputTitle));
    }

    public String  getFormInputTitleText(String inputTitle) {
        return getFormInputTitle(inputTitle).getText();
    }

    /**
     *
     * @param value css value of the value selector
     * @return xpath defined with the specified selector
     */
    public SelenideElement getFormInput(String value) {
        return $x(String.format("//input[@value='%s']", value));
    }

    public LeaveCommentsModal setFormInputValue(String value,String inputText) {
        getFormInput(value).shouldBe(empty).setValue(inputText);
        return this;
    }

    /**
     *
     * @param positionRate css value of the aria-posinset selector
     * @return xpath defined with the specified selector
     */
    public SelenideElement getRatePositionCheckbox(String positionRate) {
        return $x(String.format("//div[@class='ant-col ant-form-item-control css-18v7s9k']//div[@aria-posinset='%s']", positionRate));
    }

    public LeaveCommentsModal setRatePosition(String positionRate){
        getRatePositionCheckbox(positionRate).click();
        return this;
    }

    public SelenideElement getTitleCommentsModal(){
        return TITLE_COMMENTS_MODAL;
    }

    public String getTitleCommentsModalText(){
        return getTitleCommentsModal().getText();
    }

    public SelenideElement getTypeComment(){
        return TYPE_COMMENT;
    }

    public String getTypeCommentText(){
        return getTypeComment().getText();
    }

    public LeaveCommentsModal clickTypeComment(){
        getTypeComment().click();
        return this;
    }

    public SelenideElement getTypeClaim(){
        return TYPE_CLAIM;
    }

    public String getTypeClaimText(){
        return getTypeClaim().getText();
    }

    public LeaveCommentsModal clickTypeClaim(){
        getTypeClaim().click();
        return this;
    }

    public SelenideElement getSubtitleCommentsModal(){
        return SUBTITLE_COMMENTS_MODAL;
    }

    public String getSubtitleCommentsModalText(){
        return getSubtitleCommentsModal().getText();
    }

    public SelenideElement getDescriptionTextarea(){
        return DESCRIPTION_TEXTAREA;
    }

    public LeaveCommentsModal setDescriptionTextarea(String text){
        getDescriptionTextarea().setValue(text);
        return this;
    }

    public SelenideElement getSendButtonCommentsModal() {
        return SEND_BUTTON_COMMENTS_MODAL;
    }

    public String getSendButtonCommentsModalText(){
        return getSendButtonCommentsModal().getText();
    }

    public ClubDetailPage clickSendButtonCommentsModal(){
        getSendButtonCommentsModal().click();
        return new ClubDetailPage();
    }

    public ClubDetailPage clickCloseButtonCommentModal(){
        CLOSE_BUTTON_COMMENTS_MODAL.click();
        return new ClubDetailPage();
    }

    public SelenideElement getNoteClaim(){
        return NOTE_CLAIM;
    }

    public String getNoteClaimText(){
        return getNoteClaim().getText();
    }

}
