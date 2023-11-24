package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.EditProfileModal;
import com.softserveinc.speakukrainian.utils.TestRunnerWithDirector;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;

public class DirectorProfilePageTest extends TestRunnerWithDirector {

    @Test
    public void verifyThatErroMessageAppearsWhenTheUserEntersLessThan40Symbols() {
        final String CLUB_NAME = "Про Танц(R)";
        final String[] expectedErrorMessagesAboutDescription = {"Некоректний опис гуртка",
                "Опис гуртка може містити від 40 до 1500 символів."};
        final int CATEGORY_INDEX = 5;
        final int AGE_FROM = 8;
        final int AGE_TO = 18;
        final String CONTACT_PHONE = "1234567890";

        AddClubModal addClub = homePage
                .getHeader()
                .openProfileMenu()
                .openMyProfilePage()
                .addClub()
                .setClubName(CLUB_NAME)
                .selectCategory(CATEGORY_INDEX)
                .setInputAgeFrom(AGE_FROM).setInputAgeTo(AGE_TO)
                .clickNextStepBtn();

        addClub.setContactPhoneNumber(CONTACT_PHONE)
                .clickNextStepBtn();

        addClub.setDescription(CLUB_NAME)
                        .clickComplete();
        Assert.assertEquals(addClub.getErrorMessagesAboutDescription(), expectedErrorMessagesAboutDescription, "");

    }
}
