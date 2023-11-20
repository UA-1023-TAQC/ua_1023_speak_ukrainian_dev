package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddCenterClubsModal extends BaseComponent {

    public static final SelenideElement TITLE_LIST = $x("//form/span[@class='ant-typography css-18v7s9k']");
    public static final SelenideElement FINISH_BTN = $x("//button[@class='finish-btn']");

    public static final SelenideElement CLUBS_ERROR_MESSAGE = $("#clubs_help");

    public SelenideElement getTitleList(){
        return TITLE_LIST;
    }

    public String getTitleText(){
        return getTitleList().getText();
    }

    public SelenideElement getClubsErrorMessage(){
        return CLUBS_ERROR_MESSAGE;
    }

    public String getClubsErrorMessageText(){
        return getClubsErrorMessage().getText();
    }

    public SelenideElement getFinishButton() {
        return FINISH_BTN;
    }

    public AddCenterDescriptionModal clickBackButton(){
        getBackButton().click();
        return new AddCenterDescriptionModal();
    }

    public HomePage clickCloseWindowButton(){
        getFinishButton().click();
        return new HomePage();
    }
}
