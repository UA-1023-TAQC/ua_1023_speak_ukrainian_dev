package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.VisitorPersonalCabinetComponent;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

public class VisitorProfilePageTest extends TestRunner {

    @Test
    public void verifyUserProfileOpens(){
        VisitorPersonalCabinetComponent personalCabinet = (VisitorPersonalCabinetComponent)new HomePage()
                .getHeader()
                .openProfileMenu()
                .openMyProfilePage()
                .getPersonalCabinetComponents().get(0);

        personalCabinet.openApplicationsPage();
    }
}
