package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class ChallengeMovomarathonPage extends AbstractChallenge {
    /** https://speak-ukrainian.org.ua/challenges/1
     Мовомаратон «30 років - 30 кроків»
    */

    private final ChallengeDayCarousel challengeDayCarousel = new ChallengeDayCarousel();
    private final ElementsCollection challengeDescriptionLinks = $$("div.challenge-description p a");

    public final SelenideElement PageTitle = $("h1");

    public String getPageTitleText() {
        return getPageTitle().getText();
    }

}
