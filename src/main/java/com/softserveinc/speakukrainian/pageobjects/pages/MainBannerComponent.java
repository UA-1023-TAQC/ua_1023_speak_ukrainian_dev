package com.softserveinc.speakukrainian.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;
import lombok.Getter;

@Getter
public class MainBannerComponent {

    HomePageGuest home = new HomePageGuest();

    public SelenideElement getBannerTitle() {
        var title = getHome().getMainBannerBlock().$x("./div/div/div/div/div[1]/div/div/div/div/h2");
        return title;
    }

    public String getBannerTitleText() {
        return getBannerTitle().text();
    }

    public SelenideElement getBannerDescription() {
        var description = getHome().getMainBannerBlock().$x("./div/div/div/div/div[1]/div/div/div/div/span");
        return description;
    }

    public String getBannerDescriptionText() {
        return getBannerDescription().getText();
    }

    public SelenideElement getDetailBtn() {
        var btn = getHome().getMainBannerBlock().$x("./div/div/div/div/div[2]/div/div/div/div/a/button");
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