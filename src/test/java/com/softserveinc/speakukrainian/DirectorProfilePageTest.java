package com.softserveinc.speakukrainian;

import com.codeborne.selenide.Selenide;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunnerWithDirector;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import static com.codeborne.selenide.CollectionCondition.empty;


public class DirectorProfilePageTest extends TestRunnerWithDirector {
    protected AddClubModal addClub;
    final String CLUB_NAME = "Про Танц(R)";
    final String CLUB_DESCRIPTION = "This is a Club so called Про Танц(R) bt";
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
    public void verifyThatErroMessageAppearsWhenTheUserEntersLessThan40Symbols() {
        addClub.setDescription(CLUB_DESCRIPTION);

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
        addClub.setDescription(CLUB_DESCRIPTION.repeat(38) + "Total 1500 symbols");
        addClub.getDescription().sendKeys("More than 1500 smbls.");
        Assert.assertEquals(addClub.getErrorMessagesAboutDescription().get(0).getText(), expectedErrorMessagesAboutDescription[1], "");

        for (int i = 0; i < 21; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        for (int i = 0; i < 3; i++)
            addClub.getDescription().sendKeys(Keys.BACK_SPACE);
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
        softAssert.assertAll();
        addClub.clickComplete();
    }

    @Test
    public void verifyThatDescriptionIsFilledInWithValidDataWhenTheUserEntersFrom40To1500Symbols() {

        addClub.setDescription(CLUB_DESCRIPTION.repeat((25)));
        addClub.getErrorMessagesAboutDescription().shouldBe(empty);
    }
    @AfterMethod
    public  void  closeWindow(){
        addClub.clickComplete();
        homePage
                .getHeader()
                .openProfileMenu()
                .openMyProfilePage();
        var cp = new ClubsPage()
                .getClubsCard();
        System.out.println((cp));
        homePage
                .getHeader()
                .openProfileMenu()
                .logout();

    }

    @Test
    public void verifyAddClubModalCloseButton() {
        addClub.clickBackBtn()
                .clickBackBtn()
                .clickCloseBtn();
    }

}

