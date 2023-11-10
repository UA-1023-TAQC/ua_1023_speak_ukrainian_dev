package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class ChallengeTeachUkrainianPage extends AbstractChallenge {
    /** https://speak-ukrainian.org.ua/challenges/3
     Челендж «Навчай українською»
     */

    private final ChallengeDayCarousel challengeDayCarousel = new ChallengeDayCarousel();
    private final SelenideElement challengeTable = $("table.hardcoded-table");
    private final ElementsCollection challengeTableLinks = $$("tr a");

}
