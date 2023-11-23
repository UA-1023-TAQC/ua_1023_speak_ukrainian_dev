package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class MovomarathonPage extends TestRunner {

    @Test
    public void verifyChallengeMovomarathonPageIsDisplayed() {
        new HomePage()
                .getHeader()
                .openChallengeMenu()
                .openMovomarathonChallenge()
                .getPageTitle()
                .shouldHave(text("Мовомаратон «30 років - 30 кроків»"));
    }
}
