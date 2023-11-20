package com.softserveinc.speakukrainian.pageobjects.homePage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BannerComponent extends HomePage {

    public static final ElementsCollection MAIN_BANNER =
            $$x("/html/body/div[1]/div/div[2]/main/div/div[2]/div/div/div/div/div");
    public static final SelenideElement ARROW = $x(".//button");
    public static final SelenideElement ARROW_LEFT =
            $x("//span[@class='anticon anticon-arrow-left arrow']");
    public static final SelenideElement ARROW_RIGHT =
            $x("//span[@class='anticon anticon-arrow-right arrow']");
    public ElementsCollection getMainBannerBlock() {
        return MAIN_BANNER;
    }
    public SelenideElement getListBannerElement(int index) {
        return getMainBannerBlock().get(index);
    }

    public SelenideElement getBannerTitle(int index) {
        return getListBannerElement(index).$x(".//h2");
    }

    public String getBannerTitleText(int index) {
        return getBannerTitle(index).getText();
    }

    public SelenideElement getBannerDescription(int index) {
        return getBannerTitle(index).$x("./div/div/div/div/div[1]/div/div/div/div/span");
    }

    public String getBannerDescriptionText(int index) {
        return getBannerDescription(index).getText();
    }

    public SelenideElement getDetailBtn(int index) {
        return getBannerTitle(index).$x(".//button");
    }

    public String getDetailBtnText(int index) {
        return getDetailBtn(index).getText();
    }

    public ClubsPage clickDetailBtn(int index) {
        getDetailBtn(index).click();
        return new ClubsPage();
    }

    public BannerComponent clickArrowLeft(int count) {
        SelenideElement arrowLeft = ARROW_LEFT;
        for (int i = 0; i <= count; i++) {
            arrowLeft.click();
        }
        return this;
    }

    public BannerComponent clickArrowRight(int count) {
        SelenideElement arrowRight = ARROW_RIGHT;
        for (int i = 0; i <= count; i++) {
            arrowRight.click();
        }
        return this;
    }
}
