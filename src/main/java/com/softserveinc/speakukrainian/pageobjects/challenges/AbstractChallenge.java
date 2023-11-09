package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.components.Header;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public abstract class AbstractChallenge {

    private final SelenideElement bannerTitle = $("div.banner span");
    private final SelenideElement donateButton = $("button.donate-button");
    private final SelenideElement challengeTitle = $("div.challenge-description h1");
    private final ElementsCollection challengeDescription = $$("div.challenge-description p");
    private final SelenideElement applyButton = $("button.apply-button");
    private final Header header = new Header();

    public void donateToProject(){
        donateButton.click();
    }

    public void applyForChallenge(){
        applyButton.click();
    }

}
