package com.softserveinc.speakukrainian.pageobjects.homePage.homePage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import static com.codeborne.selenide.Selenide.*;

public class HomePageGuest {
    public static final ElementsCollection MAIN_BANNER =
            $$x("/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div/div/div");
    public static final ElementsCollection LIST_CLUBS_ITEMS =
            $$x("/html/body/div[1]/div/div[2]/main/div/div[3]/div[2]/div/div/div/div/div/div");
    public static final SelenideElement CLUBS_HEADER = $x("//div[@class='categories-header']");
    public static final SelenideElement CHALLENGE_BLOCK = $x("//div[@class='about-challenge']");
    public static final SelenideElement ARROW_PREV =
            $x("//span[@class='anticon anticon-arrow-left arrows-prev']");
    public static final SelenideElement ARROW_NEXT =
            $x("//span[@class='anticon anticon-arrow-right arrows-next']");

    public static final SelenideElement ARROW = $x(".//button");
    public static final SelenideElement ARROW_LEFT =
            $x("//span[@class='anticon anticon-arrow-left arrow']");
    public static final SelenideElement ARROW_RIGHT =
            $x("//span[@class='anticon anticon-arrow-right arrow']");
    public static final SelenideElement TITLE_BLOCK =
            $x("//a[contains(text(), 'Клуб української мови \"Розмовляй\"')]");
    public static final SelenideElement IMG_BLOCK = $x("//img[@class='banner-image']");

    public ElementsCollection getMainBannerBlock() {
        return MAIN_BANNER;
    }

    public ElementsCollection getListClubsItems(){
        return LIST_CLUBS_ITEMS;
    }

    public SelenideElement getClubsHeader(){
        return CLUBS_HEADER;
    }

    public SelenideElement getChallengeBlock(){
        return CHALLENGE_BLOCK;
    }

    public SelenideElement getChallengeImg() {
        SelenideElement challengeImg = getChallengeBlock().$x(".//img");
        return challengeImg;
    }

    public SelenideElement getChallengeTitle() {
        SelenideElement challengeTitle = getChallengeBlock().$x(".//h2");
        return challengeTitle;
    }

    public String  getChallengeTitleText() {
        return getChallengeTitle().getText();
    }

    public SelenideElement  getChallengeDescription() {
        SelenideElement challengeDescription = getChallengeBlock().$x(".//span[@class='text']");
        return challengeDescription;
    }

    public String   getChallengeDescriptionText() {
        return getChallengeDescription().getText();
    }

    public SelenideElement  getChallengeLearnMoreBtn() {
        SelenideElement learnMoreBtn = getChallengeBlock().$x(".//button");
        return learnMoreBtn;
    }

    public String getChallengeLearnMoreBtnText() {
        return getChallengeLearnMoreBtn().getText();
    }

    public ChallengePage clickChallengeLearnMoreBtn() {
        getChallengeLearnMoreBtn().click();
        return new ChallengePage();
    }

    public SelenideElement getListClubsElement(int index) {
        return getListClubsItems().get(index);
    }

    public SelenideElement getListClubsItemsTitle(int index) {
        SelenideElement title = getListClubsElement(index).$x(".//div[@class='name']");
        return title;
    }

    public String getListClubsItemsTitleText(int index) {
        return getListClubsItemsTitle(index).getText();
    }

    public SelenideElement getListClubsItemsDescription(int index) {
        SelenideElement description = getListClubsElement(index).$x(".//div[@class='description']");
        return description;
    }

    public String getListClubsItemsDescriptionText(int index) {
        return getListClubsItemsDescription(index).getText();
    }

    public SelenideElement getListClubsItemsIcon(int index) {
        SelenideElement icon = getListClubsElement(index).$x(".//img");
        return icon;
    }

    public ClubsPage clickListClubsItemsViewBtn(int index) {
        SelenideElement btn = getListClubsElement(index).$x(".//div[@class='details']");
        btn.click();
        return new ClubsPage();
    }

    public HomePageGuest  clickArrowPrev(int count) {
        SelenideElement arrowPrev = ARROW_PREV;
        for (int i = 0; i <= count; i++) {
            arrowPrev.click();
        }
        return this;
    }

    public HomePageGuest clickArrowNext(int count) {
        SelenideElement arrowPrev = ARROW_NEXT;
        for (int i = 0; i <= count; i++) {
            arrowPrev.click();
        }
        return this;
    }

    public SelenideElement getClubsHeaderTitle() {
        SelenideElement blockTitle = getClubsHeader().$x(".//h2");
        return blockTitle;
    }

    public SelenideElement getClubsHeaderButton() {
        SelenideElement clubsBtn = getClubsHeader().$x(".//button");
        return clubsBtn;
    }

    public String getClubsHeaderButtonText() {
        return getClubsHeaderButton().getText();
    }

    public ClubsPage clickClubsHeaderButton() {
        getClubsHeaderButton().click();
        return new ClubsPage();
    }

    public SelenideElement getListBannerElement(int index) {
        return getMainBannerBlock().get(index);
    }

    public SelenideElement getBannerTitle(int index) {
        var title = getListBannerElement(index).$x(".//h2");
        return title;
    }

    public String getBannerTitleText(int index) {
        return getBannerTitle(index).getText();
    }

    public SelenideElement getBannerDescription(int index) {
        var description = getBannerTitle(index).$x("./div/div/div/div/div[1]/div/div/div/div/span");
        return description;
    }

    public String getBannerDescriptionText(int index) {
        return getBannerDescription(index).getText();
    }

    public SelenideElement getDetailBtn(int index) {
        var btn = getBannerTitle(index).$x(".//button");
        return btn;
    }

    public String getDetailBtnText(int index) {
        return getDetailBtn(index).getText();
    }

    public ClubsPage clickDetailBtn(int index) {
        getDetailBtn(index).click();
        return new ClubsPage();
    }

    public HomePageGuest clickArrowLeft(int count) {
        SelenideElement arrowLeft = ARROW_LEFT;
        for (int i = 0; i <= count; i++) {
            arrowLeft.click();
        }
        return this;
    }

    public HomePageGuest clickArrowRight(int count) {
        SelenideElement arrowRight = ARROW_RIGHT;
        for (int i = 0; i <= count; i++) {
            arrowRight.click();
        }
        return this;
    }

    public SelenideElement getSpeakingClubBlockTitle() {
        SelenideElement blockTitle = TITLE_BLOCK;
        return blockTitle;
    }

    public String  getSpeakingClubBlockTitleText() {
        return getSpeakingClubBlockTitle().getText();
    }

    public SelenideElement getSpeakingClubImg() {
        SelenideElement blockImg = IMG_BLOCK;
        return blockImg;
    }

    public SpeakingClub clickSpeakingClubImg() {
        getSpeakingClubImg().click();
        return new SpeakingClub();
    }



}