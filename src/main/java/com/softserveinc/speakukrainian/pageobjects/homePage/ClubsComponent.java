package com.softserveinc.speakukrainian.pageobjects.homePage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ClubsComponent extends HomePageGuest {

    public static final ElementsCollection LIST_CLUBS_ITEMS =
            $$x("/html/body/div[1]/div/div[2]/main/div/div[3]/div[2]/div/div/div/div/div/div");
    public static final SelenideElement ARROW_PREV =
            $x("//span[@class='anticon anticon-arrow-left arrows-prev']");
    public static final SelenideElement ARROW_NEXT =
            $x("//span[@class='anticon anticon-arrow-right arrows-next']");

    public ElementsCollection getListClubsItems(){
        return LIST_CLUBS_ITEMS;
    }

    public SelenideElement getListClubsElement(int index) {
        return getListClubsItems().get(index);
    }

    public SelenideElement getListClubsItemsTitle(int index) {
        return getListClubsElement(index).$x(".//div[@class='name']");
    }

    public String getListClubsItemsTitleText(int index) {
        return getListClubsItemsTitle(index).getText();
    }

    public SelenideElement getListClubsItemsDescription(int index) {
        return getListClubsElement(index).$x(".//div[@class='description']");
    }

    public String getListClubsItemsDescriptionText(int index) {
        return getListClubsItemsDescription(index).getText();
    }

    public SelenideElement getListClubsItemsIcon(int index) {
        return getListClubsElement(index).$x(".//img");
    }

    public ClubsPage clickListClubsItemsViewBtn(int index) {
        getListClubsElement(index).$x(".//div[@class='details']").click();
        return new ClubsPage();
    }

    public HomePageGuest clickArrowPrev(int count) {
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

}
