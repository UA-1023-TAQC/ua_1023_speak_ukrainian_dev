package com.softserveinc.speakukrainian.pageobjects.homePageGuest;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class SpeakingClubComponent {

    public static final SelenideElement TITLE_BLOCK =
            $x("//a[contains(text(), 'Клуб української мови \"Розмовляй\"')]");

    public static final SelenideElement IMG_BLOCK = $x("//img[@class='banner-image']");

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



