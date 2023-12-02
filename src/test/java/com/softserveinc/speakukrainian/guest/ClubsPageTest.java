package com.softserveinc.speakukrainian.guest;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ClubsPageTest extends TestRunner {

    @BeforeMethod
    public void openClubsPage() {
        homePage
                .getHeader()
                .openClubsPage();
    }


    @Test
    public void testSortClubsCart() {
//        List<ClubCardComponent> clubsCardsExpectedList;
//        List<ClubCardComponent> clubsCardsActualList;
//
//        clubsCardsActualList = new HomePage()
//                .getHeader()
//                .clickAdvancedSearchBtn()
//                .clickOnCityDropDownMenu()
//                .selectCityFromDropDown("Харків")
//                .clickSortByAlphabetOrRating("за алфавітом")
//                .getClubsCard();
//
//        List<String> actualSortItems = new ArrayList<>();
//        for (ClubCardComponent tmp : clubsCardsActualList) {
//            actualSortItems.add(tmp.getClubNameText());
//        }
//
//        refresh();
////        Configuration.pageLoadStrategy = "normal";
//
//        homePage
//                .getHeader()
//                .clickAdvancedSearchBtn()
//                .clickOnCityDropDownMenu()
//                .selectCityFromDropDown("Харків");
//
//        clubsCardsExpectedList = new ClubsPage()
//                .getClubsCard();
//        List<String> expectedSortItems = new ArrayList<>();
//        for (ClubCardComponent tmp : clubsCardsExpectedList) {
//            expectedSortItems.add(tmp.getClubNameText());
//        }
//
//        Collections.sort(expectedSortItems);
//        assertEquals(expectedSortItems, actualSortItems);
//
//        clubsCardsActualList = new AdvancedSearch()
//                .clickArrowUpOrDown("arrow-up")
//                .getClubsCard();
//
//        List<String> actualSortItemsReverse = new ArrayList<>();
//        for (ClubCardComponent tmp : clubsCardsActualList) {
//            actualSortItemsReverse.add(tmp.getClubNameText());
//        }
//
//        Collections.reverse(expectedSortItems);
//
//        assertEquals(expectedSortItems, actualSortItemsReverse);





        ClubCardComponent ls =  new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCityDropDownMenu()
                .selectCityFromDropDown("Харків")
                .clickSortByAlphabetOrRating("за алфавітом")
                .getClubsCard()
                .get(1);
        String clubName = ls.getClubNameText();
//        List<List<String>> expectedSortItemsRating = new ArrayList<>();
//        for (ClubCardComponent tmp : ls) {
//
//            expectedSortItemsRating.add(tmp.getCountOfRating());
//        }

        System.out.println("count" + clubName);
//        System.out.println("count" + expectedSortItemsRating.size());
//        System.out.println("counts" + ls.size());
    }

}


