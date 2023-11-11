package com.softserveinc.speakukrainian.pageobjects.homePageGuest;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MainBannerComponent extends HomePageGuest{

    public static final SelenideElement ARROW_LEFT =
            $x("//span[@class='anticon anticon-arrow-left arrow']");

    public static final SelenideElement ARROW_RIGHT =
            $x("//span[@class='anticon anticon-arrow-right arrow']");

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

    public MainBannerComponent clickArrowLeft(int count) {
        SelenideElement arrowLeft = ARROW_LEFT;
        for (int i = 0; i <= count; i++) {
            arrowLeft.click();
        }
        return this;
    }

    public MainBannerComponent clickArrowNext(int count) {
        SelenideElement arrowRight = ARROW_RIGHT;
        for (int i = 0; i <= count; i++) {
            arrowRight.click();
        }
        return this;
    }

}