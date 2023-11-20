package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class CitiesMenu {
    private final SelenideElement citiesMenu;
    public CitiesMenu() {
        this.citiesMenu = $x("/html/body/div[4]/div");
    }

    public SelenideElement getCity(String city) {
        return citiesMenu.$x("./li/span[contains(text(),'" + city + "')]");
    }

    public ElementsCollection getListOfCities() {
        return citiesMenu.$$("li");
    }

    public ClubsPage chooseCity(String city) {
        getCity(city).click();
        return new ClubsPage();
    }
}
