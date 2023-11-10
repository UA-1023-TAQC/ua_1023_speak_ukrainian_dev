package com.softserveinc.speakukrainian.pageobjects.challenges;

import lombok.Getter;


@Getter
public class ChallengeUnitedPage extends AbstractChallenge {
    /** https://speak-ukrainian.org.ua/challenges/5
     "Єдині" - це 28 днів підтримки у переході на українську
    */

    private final ChallengeDayCarousel challengeDayCarousel = new ChallengeDayCarousel();

}
