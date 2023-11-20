package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.challenges.ChallengeMovomarathonPage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ChallengeMenu {

    private final SelenideElement menu;

    public ChallengeMenu() {
        this.menu = $x("//ul[contains(@id, 'challenge']");
    }

    public ElementsCollection getListOfMenuItems() {
        return menu.$$("li");
    }

    public String getTextOfMenuItem(int index) {
        return getListOfMenuItems().get(index).$x(".//a").getText();
    }

    public String getLinkOfMenuItem(int index) {
        return getListOfMenuItems().get(index).$x(".//a").getAttribute("href");
    }

    public ChallengeMovomarathonPage openMovomarathonChallenge() {
        menu.$x(".//a[contains(text(), 'Мовомарафон')]").click();
        return new ChallengeMovomarathonPage();
    }
}
