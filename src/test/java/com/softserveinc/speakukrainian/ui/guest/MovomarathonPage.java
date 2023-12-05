package com.softserveinc.speakukrainian.ui.guest;

import com.softserveinc.speakukrainian.pageobjects.challenges.ChallengeMovomarathonPage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MovomarathonPage extends TestRunner {

    @BeforeMethod
    public void openClubsPage() {
        homePage
                .getHeader()
                .openChallengeMenu()
                .openMovomarathonChallenge();
    }

    @Test
    public void verifyChallengeMovomarathonPageIsDisplayed() {
        new ChallengeMovomarathonPage()
                .getPageTitleText()
                .equals("Мовомаратон «30 років - 30 кроків»");
    }
}
