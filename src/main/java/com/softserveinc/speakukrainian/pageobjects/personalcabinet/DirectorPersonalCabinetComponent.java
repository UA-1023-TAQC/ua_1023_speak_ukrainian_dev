package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DirectorPersonalCabinetComponent extends AbstractPersonalCabinetComponent{

    private final SelenideElement registrationsLink = $x("//li[contains(@data-menu-id, 'registrations')]//a");

    public RegistrationsPage openApplicationsPage(){
        registrationsLink.click();
        return new RegistrationsPage();
    }
}
