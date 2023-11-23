package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.EditProfileModal;
import com.softserveinc.speakukrainian.utils.TestRunnerWithDirector;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;

public class DirectorProfilePageTest extends TestRunnerWithDirector {

    @Test
    public void verifyThatErroMessageAppearsWhenTheUserEntersLessThan40Symbols() {
        homePage
                .getHeader()
                .openProfileMenu()
                .openMyProfilePage()
                .addClub()
                .setClubName("Про Танц")
                .selectCategory(5)
                .clickNextStepBtn()
        ;

    }
}
