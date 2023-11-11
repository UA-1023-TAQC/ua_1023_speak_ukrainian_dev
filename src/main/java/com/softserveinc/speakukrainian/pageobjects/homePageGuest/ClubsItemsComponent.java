package com.softserveinc.speakukrainian.pageobjects.homePageGuest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;
import lombok.Getter;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

@Getter
public class ClubsItemsComponent extends HomePageGuest {

    public static final SelenideElement ARROW_PREV =
            $x("//span[@class='anticon anticon-arrow-left arrows-prev']");

    public static final SelenideElement ARROW_NEXT =
            $x("//span[@class='anticon anticon-arrow-right arrows-next']");

    public static final SelenideElement ARROW = $x(".//button");

    public SelenideElement getListClubsElement(int index) {
        return getListClubsItems().get(index);
    }

    public String getListClubsItemsTitle(int index) {
        SelenideElement title = getListClubsElement(index).$x(".//div[@class='name']");
        return title.getText();
    }

    public String getListClubsItemsDescription(int index) {
        SelenideElement description = getListClubsElement(index).$x(".//div[@class='description']");
        return description.getText();
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

    public ClubsItemsComponent clickArrowPrev(int count) {
        SelenideElement arrowPrev = ARROW_PREV;
        for (int i = 0; i <= count; i++) {
            arrowPrev.click();
        }
        return this;
    }

    public ClubsItemsComponent clickArrowNext(int count) {
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

}
