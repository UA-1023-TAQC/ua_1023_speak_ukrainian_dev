package com.softserveinc.speakukrainian;
import com.softserveinc.speakukrainian.pageobjects.components.LoginModal;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

public class HomePageTest extends TestRunner {

    @Test
    public void verifyTitle() {
        homePage
                .getHeader()
                .openGuestProfileMenu()
                .openLogin();

    }
}
