package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.components.LeaveComments;
import com.softserveinc.speakukrainian.pageobjects.components.ManagerChat;
import com.softserveinc.speakukrainian.pageobjects.components.SignUpForClub;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
@Getter
public class ClubDetailPage extends BasePage {

    public static final SelenideElement HEADER_CONTAINER =
            $(".ant-layout-header.page-header");
    public static final SelenideElement HEADER_IMG =
            $x("//div[@class='icon-box']");
    public static final SelenideElement HEADER_CLUB_TITLE =
            $x("//span[@class='club-name']");
    public static final SelenideElement HEADER_CLUB_CATEGORY =
            $x("//span[@class='name");
    public static final SelenideElement HEADER_BUTTON =
            $x("/html/body/div[1]/div/div[2]/main/div/header/div/div/div[2]/button");
    public static final SelenideElement MAIN_CONTENT =
            $x("//div[@class='content']");
    public static final SelenideElement MAIN_CONTENT_BUTTON =
            $x("/html/body/div[1]/div/div[2]/main/div/div/main/div[3]/button");
    public static final SelenideElement COMMENTS = $(".comment-label");
    public static final SelenideElement COMMENTS_BUTTON = $(".comment-button");


    public SelenideElement getHeaderContainer() {
        return HEADER_CONTAINER;
    }

    public SelenideElement getHeaderContainerImg() {
        return HEADER_IMG;
    }

    public SelenideElement getHeaderContainerTitle() {
        return HEADER_CLUB_TITLE;
    }

    public String getHeaderContainerTitleText(){
        return getHeaderContainerTitle().getText();
    }

    public SelenideElement getHeaderContainerClubCategory() {
        return HEADER_CLUB_CATEGORY;
    }

    public String getHeaderContainerClubCategoryText(){
        return getHeaderContainerClubCategory().getText();
    }

    public SelenideElement getHeaderContainerButton() {
        return HEADER_BUTTON;
    }

    public ManagerChat clickMainContainerButton(){
        getHeaderContainerButton().click();
        return new ManagerChat();
    }

    public String getHeaderContainerButtonText(){
        return getHeaderContainerButton().getText();
    }

    public SelenideElement getMainContent() {
        return MAIN_CONTENT;
    }

    public String getMainContentText(){
        return getMainContent().getText();
    }

    public SelenideElement getMainContentButton() {
        return MAIN_CONTENT_BUTTON;
    }


    public SignUpForClub clickMainContentButton(){
        getMainContentButton().click();
        return new SignUpForClub();
    }

    public String getMainContentButtonText(){
        return getMainContentButton().getText();
    }

    public SelenideElement getCommentsButton() {
        return COMMENTS_BUTTON;
    }

    public String getCommentsButtonText(){
        return getCommentsButton().getText();
    }

    public LeaveComments clickCommentsButton(){
        getCommentsButton().click();
        return new LeaveComments();
    }

    public SelenideElement getComments() {
        return COMMENTS;
    }

    public String getCommentsText(){
        return getComments().getText();
    }

}