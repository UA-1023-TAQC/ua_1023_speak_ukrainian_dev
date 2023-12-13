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
        String location = "Дніпро";
        String clubName = "Дитячий центр \"Умнічка\"";
        List<ClubCardComponent> listResult = new HomePage()
                .getHeader()
                .openCitiesMenu()
                .chooseCity(location)
                .getHeader()
                .setValueInput(clubName)
                .clickSearchFieldBtn()
                .getClubsCard();

        List<String> actualClubsListName = new ArrayList<>();
        for (ClubCardComponent tmp : listResult) {
            actualClubsListName.add(tmp.getClubNameText());
        }
        System.out.println("actual" + actualClubsListName);

        List<ClubEntity> expectedClubList = clubService.getAllByLocation(location);
        List<ClubEntity> clubsName = clubService.getAllByName(clubName);
        for(ClubEntity expected: clubsName){
            assertEquals(expected.getName(), clubName);
        }

        List<String> expectedClubsListName = new ArrayList<>();
        for(ClubEntity expected: expectedClubList){
            if(expected.getName().contains(clubName)) {
                expectedClubsListName.add(expected.getName());
//            assertEquals(expected.getName(), clubName);
            }
        }
        System.out.println("expected" + expectedClubsListName);

    }
}
