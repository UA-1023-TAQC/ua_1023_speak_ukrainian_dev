package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$;

@Getter
public class UkrainianLanguageClubSpeakPage extends AbstractChallenge {
    /** https://speak-ukrainian.org.ua/challenges/4
     Клуб української мови "Розмовляй"
     */

    private final ElementsCollection challengeDescriptionLinks = $$("div.challenge-description a");

}
