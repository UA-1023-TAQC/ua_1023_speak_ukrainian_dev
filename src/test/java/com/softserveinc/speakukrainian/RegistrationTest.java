package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.components.RegistrationModal.RegistrationModal;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestRunner {

    @Test
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

        Assert.assertEquals(TEST_LAST_NAME, newRegistrationModal.getLastNameText());
        Assert.assertEquals(TEST_FIRST_NAME, newRegistrationModal.getFirstNameText());
        Assert.assertEquals(TEST_PHONE, newRegistrationModal.getPhoneNumberText());
        Assert.assertEquals(TEST_EMAIL, newRegistrationModal.getEmailText());
        Assert.assertEquals(TEST_PASSWORD, newRegistrationModal.getPasswordText());
        Assert.assertEquals(TEST_PASSWORD, newRegistrationModal.getConfirmPasswordText());
    }
}
