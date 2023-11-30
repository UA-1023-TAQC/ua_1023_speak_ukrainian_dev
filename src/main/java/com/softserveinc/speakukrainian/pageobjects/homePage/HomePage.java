package com.softserveinc.speakukrainian.pageobjects.homePage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.SpeakingClub;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;
import static com.softserveinc.speakukrainian.utils.PropertyUtil.getAdminHomePageUrl;
import static com.softserveinc.speakukrainian.utils.PropertyUtil.getHomePageUrl;

@Getter
public class HomePage extends BasePage {

    public static final SelenideElement TITLE_BLOCK =
            $x("//a[contains(text(), 'Клуб української мови \"Розмовляй\"')]");
    public static final SelenideElement IMG_BLOCK = $x("//img[@class='banner-image']");
    public static final SelenideElement IMG_CHALLENGE = $x("/html/body/div[1]/div/div[2]/main/div/div[4]/div[1]/div[2]/img");
    public static final SelenideElement CLUBS_HEADER = $x("//div[@class='categories-header']");

    public SelenideElement getChallengeImg() {
        return IMG_CHALLENGE;
    }

    public SelenideElement getClubsHeader(){
        return CLUBS_HEADER;
    }

    public SelenideElement getClubsHeaderTitle() {
        return getClubsHeader().$x(".//h2");
    }

    public SelenideElement getClubsHeaderButton() {
        return getClubsHeader().$x(".//button");
    }

    public HomePage open() {
        Selenide.open(getHomePageUrl());
        return this;
    }

    public HomePage openAdmin() {
        Selenide.open(getAdminHomePageUrl());
        return this;
    }
    public String getClubsHeaderButtonText() {
        return getClubsHeaderButton().getText();
    }

    public ClubsPage clickClubsHeaderButton() {
        getClubsHeaderButton().click();
        return new ClubsPage();
    }

    public SelenideElement getSpeakingClubBlockTitle() {
        return TITLE_BLOCK;
    }

    public String  getSpeakingClubBlockTitleText() {
        return getSpeakingClubBlockTitle().getText();
    }

    public SelenideElement getSpeakingClubImg() {
        return IMG_BLOCK;

    }

    public SpeakingClub clickSpeakingClubImg() {
        getSpeakingClubImg().click();
        return new SpeakingClub();
    }

}