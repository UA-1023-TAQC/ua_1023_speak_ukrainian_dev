package com.softserveinc.speakukrainian.pageobjects.homePageGuest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public abstract class HomePageGuest{
    public static final ElementsCollection MAIN_BANNER =
            $$x("/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div/div/div");

    public static final ElementsCollection LIST_CLUBS_ITEMS =
            $$x("/html/body/div[1]/div/div[2]/main/div/div[3]/div[2]/div/div/div/div/div/div");

    public static final SelenideElement CLUBS_HEADER = $x("//div[@class='categories-header']");

    public static final SelenideElement CHALLENGE_BLOCK = $x("//div[@class='about-challenge']");

    public ElementsCollection getMainBannerBlock() {
        return MAIN_BANNER;
    }

    public ElementsCollection getListClubsItems(){
        ElementsCollection list = LIST_CLUBS_ITEMS;
        return list;
    }

    public SelenideElement getClubsHeader(){
        SelenideElement header = CLUBS_HEADER;
        return header;
    }

    public SelenideElement getChallengeBlock(){
        SelenideElement challenge = CHALLENGE_BLOCK;
        return challenge;
    }

}