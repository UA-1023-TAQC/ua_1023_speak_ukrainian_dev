package com.softserveinc.speakukrainian.pageobjects.AboutUsPage;

import com.codeborne.selenide.SelenideElement;

public class AmbassadorBlockComponent {
    private SelenideElement node;

    public AmbassadorBlockComponent(SelenideElement node) {
        this.node = node;
    }

    public SelenideElement getAmbassadorImage() {
        return node.$("img");
    }

    public String getAmbassadorSpeechText() {
        return getAmbassadorSpeech().text();
    }

    public SelenideElement getAmbassadorSpeech() {
        return node.$("p");
    }
}