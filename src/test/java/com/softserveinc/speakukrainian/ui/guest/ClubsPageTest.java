package com.softserveinc.speakukrainian.ui.guest;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import com.softserveinc.speakukrainian.utils.jdbc.entity.ClubEntity;
import com.softserveinc.speakukrainian.utils.jdbc.services.ClubService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ClubsPageTest extends TestRunner {

    ClubService clubService= new ClubService();

    @BeforeMethod
    public void openClubsPage(){
        new ClubsPage()
                .getHeader()
                .openClubsPage();
    }

    @Test
    public void testSearchResultByLocationDB(){
        String clubName = "Комунальний позашкільний навчальний заклад \"Центр позашкільної роботи №3\" Дніпровської міської ради";
        new ClubsPage()
                .getHeader()
                .openCitiesMenu()
                .chooseCity("Дніпро");

        List<ClubCardComponent> listResult = new HomePage()
                .getHeader()
                .setValueInput(clubName)
                .clickSearchFieldBtn()
                .getClubsCard();

        List<String> actualClubsListName = new ArrayList<>();
        for (ClubCardComponent tmp : listResult) {
            actualClubsListName.add(tmp.getClubAddressText());
        }

        String location = "Дніпро";
        List<ClubEntity> expectedClubList = clubService.getAllByLocation(location);
        List<String> expectedClubsListName = new ArrayList<>();
        for(ClubEntity expected: expectedClubList){
            expectedClubsListName.add(expected.getName());
            assertEquals(expected.getName(), clubName);
        }

        assertEquals(expectedClubsListName.size(), actualClubsListName.size());
        assertEquals(expectedClubsListName, actualClubsListName);

    }
}
