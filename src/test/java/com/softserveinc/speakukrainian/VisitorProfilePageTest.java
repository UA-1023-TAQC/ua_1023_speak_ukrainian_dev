package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.pageobjects.components.UserHomePage;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.EditProfileModal;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.VisitorPersonalCabinetComponent;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.text;
import static com.softserveinc.speakukrainian.utils.PropertyUtil.getVisitorEmail;
import static com.softserveinc.speakukrainian.utils.PropertyUtil.getVisitorPassword;

public class VisitorProfilePageTest extends TestRunner {

    @Test
    public void verifyVisitorCanOpenApplicationsPage() {
        UserHomePage userHomePage = new HomePage()
                .getHeader()
                .openGuestProfileMenu()
                .openLogin()
                .setEmailInput(getVisitorEmail())
                .setPasswordInput(getVisitorPassword())
                .clickSubmitBtn();

        new HomePage()
                .getHeader()
                .openProfileMenu()
                .openMyProfilePage()
                .getVisitorPersonalCabinet()
                .openApplicationsPage()
                .getTitle()
                .shouldHave(text("Заявки на реєстрацію"));
    }

    @Test
    public void verifyNameErrorMessage(){
        UserHomePage login = new Header()
                .openGuestProfileMenu()
                .openLogin()
                .setEmailInput(getVisitorEmail())
                .setPasswordInput(getVisitorPassword())
                .clickSubmitBtn();

        EditProfileModal personalCabinet = new Header()
                .openProfileMenu()
                .openMyProfilePage()
                .editProfile();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(personalCabinet.editFirstName("AfBbCcDdEeFfGgHhIiJjKkLlMmNn")
                .getFirstNameErrorMessage(), "Ім'я не може містити більше, ніж 25 символів");
        softAssert.assertEquals(personalCabinet.editFirstName("AfBbCcDdEeFfGgHhIiJjKkLlMm")
                .getFirstNameErrorMessage(), "Ім'я не може містити більше, ніж 25 символів");
        softAssert.assertEquals(personalCabinet.editFirstName("!@#$%^&,")
                .getFirstNameErrorMessage(), "Ім'я не може містити спеціальні символи");
        softAssert.assertEquals(personalCabinet.editFirstName("1234")
                .getFirstNameErrorMessage(), "Ім'я не може містити цифри");
        softAssert.assertEquals(personalCabinet.editFirstName("-Name")
                .getFirstNameErrorMessage(), "Ім'я повинно починатися та закінчуватися літерою");
        softAssert.assertEquals(personalCabinet.editFirstName("< Name>")
                .getFirstNameErrorMessage(), "Ім'я не може містити спеціальні символи");
        softAssert.assertEquals(personalCabinet.editFirstName("'Name")
                .getFirstNameErrorMessage(), "Ім'я повинно починатися та закінчуватися літерою");
        softAssert.assertEquals(personalCabinet.editFirstName("Name-")
                .getFirstNameErrorMessage(), "Ім'я повинно починатися та закінчуватися літерою");
        softAssert.assertEquals(personalCabinet.editFirstName("Name'")
                .getFirstNameErrorMessage(), "Ім'я повинно починатися та закінчуватися літерою");
        softAssert.assertEquals(personalCabinet.editFirstName("")
                .getFirstNameErrorMessage(), "Введіть Ваше ім'я");
        softAssert.assertAll();
    }
}