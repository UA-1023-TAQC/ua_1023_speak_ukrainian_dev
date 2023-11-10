package com.softserveinc.speakukrainian.pageobjects.homePageGuest;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MainBannerComponent extends HomePageGuest{

    public static final SelenideElement TITLE = $x("./div/div/div/div/div[1]/div/div/div/div/h2");
    public static final SelenideElement DESCRIPTION = $x("./div/div/div/div/div[1]/div/div/div/div/span");
    public static final SelenideElement DETAIL_BUTTON = $x("./div/div/div/div/div[2]/div/div/div/div/a/button");

    public SelenideElement getBannerTitle() {
        var title = getMainBannerBlock().$x("./div/div/div/div/div[1]/div/div/div/div/h2");
        return title;
    }

    public String getBannerTitleText() {
        return getBannerTitle().text();
    }

    public SelenideElement getBannerDescription() {
        var description = getMainBannerBlock().$x("./div/div/div/div/div[1]/div/div/div/div/span");
        return description;
    }

    public String getBannerDescriptionText() {
        return getBannerDescription().getText();
    }

    public SelenideElement getDetailBtn() {
        var btn = getMainBannerBlock().$x("./div/div/div/div/div[2]/div/div/div/div/a/button");
        return btn;
    }

    public String getDetailBtnText() {
        return getDetailBtn().getText();
    }

    public ClubsPage clickDetailBtn() {
        getDetailBtn().click();
        return new ClubsPage();
    }

}