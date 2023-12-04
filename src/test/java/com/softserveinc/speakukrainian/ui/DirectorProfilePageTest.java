package com.softserveinc.speakukrainian.ui;

import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.components.AddLocationModal;
import com.softserveinc.speakukrainian.utils.TestRunnerWithDirector;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.CollectionCondition.empty;


public class DirectorProfilePageTest extends TestRunnerWithDirector {
    protected AddClubModal addClub;
    final String CLUB_NAME = "Про Танц(R)";
    final String CLUB_DESCRIPTION = "This is a Club so called Про Танц(R) btw";
    final String[] expectedErrorMessagesAboutDescription = {"Некоректний опис гуртка",
            "Опис гуртка може містити від 40 до 1500 символів."};
    final int CATEGORY_INDEX = 5;
    final int AGE_FROM = 8;
    final int AGE_TO = 18;
    final String CONTACT_PHONE = "1234567890";
    @BeforeMethod
    public void goToDescriptionField() {
        addClub = homePage
                .getHeader()
                .openProfileMenu()
                .openMyProfilePage()
                .addClub()
                .setClubName(CLUB_NAME)
                .selectCategory(CATEGORY_INDEX)
                .setInputAgeFrom(AGE_FROM).setInputAgeTo(AGE_TO)
                .clickNextStepBtn();
        addClub.
                setContactPhoneNumber(CONTACT_PHONE)
                .clickNextStepBtn();
    }

    @Test
    public void verifyThatErroMessageAppearsWhenTheUserEntersLessThan40SymbolsOrMoreThan1500Symbols() {
        addClub.setDescription(CLUB_DESCRIPTION.substring(0, 39));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(addClub.getStrErrorMessagesAboutDescription(), expectedErrorMessagesAboutDescription, "");

        addClub.getDescription().click();
        int n = addClub.getDescription().getText().length();
        for (int i = 0; i < n; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.setDescription(CLUB_DESCRIPTION.substring(0, 1));
        softAssert.assertEquals(addClub.getStrErrorMessagesAboutDescription(), expectedErrorMessagesAboutDescription, "");

        addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.setDescription(CLUB_DESCRIPTION.substring(0, 20));
        softAssert.assertEquals(addClub.getStrErrorMessagesAboutDescription(), expectedErrorMessagesAboutDescription, "");

        addClub.getDescription().click();
        n = addClub.getDescription().getText().length();
        for (int i = 0; i < n; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.setDescription(CLUB_DESCRIPTION.repeat(38));
        Assert.assertEquals(addClub.getErrorMessagesAboutDescription().get(0).getText(), expectedErrorMessagesAboutDescription[1], "");

        for (int i = 0; i < 21; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        for (int i = 0; i < 3; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        softAssert.assertAll();
    }

    @Test
    public void verifyThatDescriptionIsFilledInWithValidDataWhenTheUserEntersFrom40To1500Symbols() {
        AddLocationModal addLocation = new AddLocationModal();
        addClub.setDescription(CLUB_DESCRIPTION.repeat((25)));
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        Assert.assertEquals(addLocation.getCheckCircle().size(), 1);

        addClub.getDescription().sendKeys(Keys.CONTROL + "A");
        addClub.getDescription().sendKeys(Keys.DELETE);
        addClub.setDescription(CLUB_DESCRIPTION);
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        Assert.assertEquals(addLocation.getCheckCircle().size(), 1);

        addClub.getDescription().sendKeys(Keys.CONTROL + "A");
        addClub.getDescription().sendKeys(Keys.DELETE);
        addClub.setDescription(CLUB_DESCRIPTION.repeat(38));
        for (int i = 0; i < 21; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        Assert.assertEquals(addLocation.getCheckCircle().size(), 1);
    }

    @Test
    public void verifyThatDescriptionTextFieldIsFilledInWithValidData() {
        String Descriptions[] = {"Education students in Fourty Symbols 40s",
                                 "Український гурток як раз на сорок симво",
                                 "З цифрами 1234567890 різними 12 09 45600",
                                 "With a plenty of nums 8219304612 9069140",
                "З цифрами 1234567890 різними 12 09 45600 більше 40 менше 1500 таки так",
                "With a plenty of nums 8219304612 9069140 more than 40 less than 1500 y",
                "!\"#$%&'()*+,-./:;<=>?@[]^_`{}~!\"#$%&'()*+,-./:;<=>?@[]^_`{}~"
        };
        AddLocationModal addLocation = new AddLocationModal();
        for (var d:Descriptions) {
            addClub.setDescription(d);
            addClub.getErrorMessagesAboutDescription().shouldBe(empty);
            Assert.assertEquals(addLocation.getCheckCircle().size(), 1);
            addClub.getDescription().sendKeys(Keys.CONTROL + "A");
            addClub.getDescription().sendKeys(Keys.DELETE);
        }
    }

    @AfterMethod
    public  void  closeWindow(){
        addClub.clickCloseBtn();
        homePage
                .getHeader()
                .openProfileMenu()
                .logout();
    }

}