package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.components.RegistrationModal.RegistrationModal;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestRunner {

    @Test
    // https://jira.softserve.academy/projects/TUA/issues/TUA-454
    public void verifyFilledTextIsSavedAfterClosingAndReopeningRegistrationModal() {

        final String TEST_LAST_NAME = "Вайтович";
        final String TEST_FIRST_NAME = "Світлана";
        final String TEST_PHONE = "671234567";
        final String TEST_EMAIL = "svitlanawhite@gmail.com";
        final String TEST_PASSWORD = "12345678";

        RegistrationModal registrationModal = new HomePage()
                .getHeader()
                .openGuestProfileMenu()
                .openRegister()
                .setFirstName(TEST_FIRST_NAME)
                .setLastName(TEST_LAST_NAME)
                .setPhoneNumber(TEST_PHONE)
                .setEmail(TEST_EMAIL)
                .setPassword(TEST_PASSWORD)
                .setConfirmPassword(TEST_PASSWORD);

        registrationModal.clickCloseBtn();

        RegistrationModal newRegistrationModal = new HomePage()
                .getHeader()
                .openGuestProfileMenu()
                .openRegister();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(TEST_LAST_NAME, newRegistrationModal.getLastNameText());
        softAssert.assertEquals(TEST_FIRST_NAME, newRegistrationModal.getFirstNameText());
        softAssert.assertEquals(TEST_PHONE, newRegistrationModal.getPhoneNumberText());
        softAssert.assertEquals(TEST_EMAIL, newRegistrationModal.getEmailText());
        softAssert.assertEquals(TEST_PASSWORD, newRegistrationModal.getPasswordText());
        softAssert.assertEquals(TEST_PASSWORD, newRegistrationModal.getConfirmPasswordText());

        softAssert.assertAll();
    }
}
