package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Footer {
    private final SelenideElement logo = $(".footer-social a[href] > div.footer-logo");
    private final SelenideElement descriptionLogo = $(".footer-social .description .text");
    private final SelenideElement donateButton = $(".footer-donate .donate-button");
    private final ElementsCollection sponsorsList = $$(".sponsors a");
    private final ElementsCollection socialMediaLinks = $$(".links a");

    public SelenideElement getLogo(){
        return logo;
    }

    public String getDescriptionText(){
        return descriptionLogo.text();
    }

    public String getDonateButtonText(){
        return donateButton.text();
    }

    public SelenideElement getDonateButton(){
        return donateButton;
    }
    public void clickDonateButton(){
        getDonateButton().click();
    }

    public String getSocialMediaAriaLabelByIndex(int index) {
        return socialMediaLinks.get(index).$("span").getAttribute("aria-label");
    }

    public void clickOnSocialMediaByIndex(int index){
        socialMediaLinks.get(index).click();
    }

    public String getSponsorAltTextByIndex(int index) {
        return sponsorsList.get(index).$("img").getAttribute("alt");
    }

    public void clickOnSponsorByIndex(int index) {
        sponsorsList.get(index).click();
    }
}
