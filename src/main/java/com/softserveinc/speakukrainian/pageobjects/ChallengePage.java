package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.challenges.AbstractChallenge;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class ChallengePage extends AbstractChallenge {
    /** https://speak-ukrainian.org.ua/challenge
    Про челендж "Навчай українською"
    */

    private final SelenideElement challengeTitle = $("div.challenge-description .title");
    private final SelenideElement challengeDescription = $("div.challenge-description .text");
    private final ElementsCollection webinarsList = $$("div.webinar-items .video");
    private final SelenideElement webinarTitle = $("span.title");
    private final SelenideElement webinarVideoIframe = $("iframe");

}
