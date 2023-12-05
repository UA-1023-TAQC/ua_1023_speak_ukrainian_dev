package com.softserveinc.speakukrainian.ui.guest;

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
