package com.softserveinc.speakukrainian.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePageGuest{
    public static final SelenideElement MAIN_BANNER = $x("/html/body/div[1]/div/div[2]/main/div/div[2]");

    public SelenideElement getMainBannerBlock() {
        return $(MAIN_BANNER);
    }
}