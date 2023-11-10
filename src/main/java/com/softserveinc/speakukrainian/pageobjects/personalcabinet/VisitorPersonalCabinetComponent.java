package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class VisitorPersonalCabinetComponent extends AbstractPersonalCabinetComponent{

    private final SelenideElement applicationsLink = $x("//li[contains(@data-menu-id, 'applications')]//a");

    public ApplicationsPage openApplicationsPage(){
        applicationsLink.click();
        return new ApplicationsPage();
    }

}
