package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.components.UserHomePage;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.VisitorPersonalCabinetComponent;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

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
}
