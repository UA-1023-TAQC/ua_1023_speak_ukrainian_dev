package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BaseComponent extends BasePage {

    public static final SelenideElement TITLE_MODAL =
            $x("//main[@class='ant-layout-content add-center-container css-18v7s9k']/div[1]");
    public static final ElementsCollection MENU_ITEMS =
            $$x("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div/div/div");
    public static final SelenideElement NEXT_STEP_BUTTON = $x("//span[contains(text(), 'Наступний крок')]");
    public static final SelenideElement BACK_BUTTON = $x("//span[contains(text(), 'Назад')]");
    public static final SelenideElement CLOSE_WINDOW_BUTTON = $x("//button[@aria-label]");
    public ElementsCollection getListMenuItems(){
        return MENU_ITEMS;
    }

    public SelenideElement getListMenuElement(int index) {
        return getListMenuItems().get(index);
    }

    public SelenideElement getListMenuItemsTitle(int index) {
        SelenideElement title = getListMenuElement(index).$x("//div[@class='ant-steps-item-title']");
        return title;
    }

    public String getListMenuItemsTitleText(int index) {
        return getListMenuItemsTitle(index).getText();
    }

    public SelenideElement getListMenuItemsIcon(int index) {
        SelenideElement icon = getListMenuElement(index).$x("//span");
        return icon;
    }

    public String getListMenuItemsIconText(int index) {
        return getListMenuItemsIcon(index).getText();
    }

    public SelenideElement getNextStepButton() {
        return NEXT_STEP_BUTTON;
    }

    public String getNextStepButtonText() {
        return getNextStepButton().getText();
    }

    public SelenideElement getBackButton() {
        return BACK_BUTTON;
    }

    public String getBackButtonText() {
        return getBackButton().getText();
    }

    public SelenideElement getCloseWindowButton() {
        return CLOSE_WINDOW_BUTTON;
    }

    public HomePageVisitor clickCloseWindowButton(){
        getCloseWindowButton().click();
        return new HomePageVisitor();
    }
}
