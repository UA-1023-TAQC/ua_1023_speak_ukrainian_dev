package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$;

@Getter
public class ChallengeAboutTeachUkrainianPage extends AbstractChallenge {
    /** https://speak-ukrainian.org.ua/challenges/2
     Про челендж «Навчай українською»
    */

    private final ElementsCollection webinarTitlesList = $$("div.challenge-description h1:not(:first-child)");
    private final ElementsCollection webinarsIframeList = $$("iframe");

}
