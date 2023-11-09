package com.softserveinc.speakukrainian.pageobjects.components.RegistrationModal;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SocialMedia {

    public SelenideElement getGoogleRegistrationLinkIcon(){
        return $x("//a[contains(@href, \"google\")]')");
    }

    public void clickGoogleRegistrationLinkIcon(){
        getGoogleRegistrationLinkIcon().click();
    }

    public SelenideElement getFacebookRegistrationLinkIcon(){
        return $x("//a[contains(@href, \"facebook\")]')");
    }

    public void clickFacebookRegistrationLinkIcon(){
        getFacebookRegistrationLinkIcon().click();
    }

}
