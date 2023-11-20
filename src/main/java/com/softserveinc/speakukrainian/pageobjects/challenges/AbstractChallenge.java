package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.components.Header;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public abstract class AbstractChallenge extends BasePage {

    protected final SelenideElement bannerTitle = $("div.banner span");
    protected final SelenideElement donateButton = $("button.donate-button");
    protected final SelenideElement challengeTitle = $("div.challenge-description h1");
    protected final ElementsCollection challengeDescription = $$("div.challenge-description p");
    protected final SelenideElement applyButton = $("button.apply-button");

    public void donateToProject(){
        donateButton.click();
    }

    public void applyForChallenge(){
        applyButton.click();
    }

}
