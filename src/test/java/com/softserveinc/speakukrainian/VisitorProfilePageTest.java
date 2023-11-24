package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddCenterMainInformationModal;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.EditProfileModal;
import com.softserveinc.speakukrainian.utils.TestRunnerWithVisitor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.text;

public class VisitorProfilePageTest extends TestRunnerWithVisitor {

    @Test
    public void verifyVisitorCanOpenApplicationsPage() {

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
  
  @Test
    public void testEnteringInvalidDataIntoLastNameField(){

        EditProfileModal openEditModal = new Header()
                .openProfileMenu()
                .openMyProfilePage()
                .editProfile();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(openEditModal.editLastName("AfBbCcDdEeFfGgHhIiJjKkLlMmNn")
                .getLastNameErrorMessage(),"Прізвище не може містити більше, ніж 25 символів");
        softAssert.assertEquals(openEditModal.editLastName("!@#$%^&,")
                .getLastNameErrorMessage(),"Прізвище не може містити спеціальні символи");
        softAssert.assertEquals(openEditModal.editLastName("1234")
                .getLastNameErrorMessage(),"Прізвище не може містити цифри");
        softAssert.assertEquals(openEditModal.editLastName("-Lastname")
                .getLastNameErrorMessage(),"Прізвище повинно починатися і закінчуватися літерою");
        softAssert.assertEquals(openEditModal.editLastName("< Lastname>")
                .getLastNameErrorMessage(),"Прізвище не може містити спеціальні символи");
        softAssert.assertEquals(openEditModal.editLastName("'Lastname")
                .getLastNameErrorMessage(),"Прізвище повинно починатися і закінчуватися літерою");
        softAssert.assertEquals(openEditModal.editLastName("Lastname-")
                .getLastNameErrorMessage(),"Прізвище повинно починатися і закінчуватися літерою");
        softAssert.assertEquals(openEditModal.editLastName("Lastname'")
                .getLastNameErrorMessage(),"Прізвище повинно починатися і закінчуватися літерою");
        softAssert.assertEquals(openEditModal.editLastName("")
                .getLastNameErrorMessage(),"Будь ласка введіть Ваше прізвище");
        softAssert.assertAll();
    }

    @Test
    //https://jira.softserve.academy/projects/TUA/issues/TUA-356
    public void verifyPhoneErrorMessage() {

        EditProfileModal personalCabinet = new Header()
                .openProfileMenu()
                .openMyProfilePage()
                .editProfile();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(personalCabinet
                .editPhoneNumber("06895")
                .getErrorMessage(), "Телефон не відповідає вказаному формату");
        softAssert.assertEquals(personalCabinet
                .editPhoneNumber("06593859632586")
                .getErrorMessage(), "Телефон не відповідає вказаному формату");
        softAssert.assertEquals(personalCabinet
                .editPhoneNumber("jngeoлщшогнеп")
                .getErrorMessage(), "Телефон не може містити літери");
        softAssert.assertEquals(personalCabinet
                .editPhoneNumber("")
                .getErrorMessage(), "Будь ласка введіть Ваш номер телефону");
        softAssert.assertAll();
    }

    @Test(description = "TUA-252 [Center] Verify that error messages is displayed after user leaves fields empty and " +
            "clicks 'Наступний крок' button on 'Основна інформація' tab")
    public void verifyErrorMessagesDisplayedAfterUserLeavesFieldsEmptyAndClicksNextButtonOnAddCenterModal() {
        AddCenterMainInformationModal addCenterMainInformationModal = new Header()
                .openProfileMenu()
                .openMyProfilePage()
                .addCenter();
        addCenterMainInformationModal.clickNextStepButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(addCenterMainInformationModal
                        .getInputNameOfCenterErrorText(), "Некоректна назва центру");
        softAssert.assertEquals(addCenterMainInformationModal.getCreatedLocationErrorText(),
                "Додайте і виберіть локацію");
        softAssert.assertAll();
    }
    
}
