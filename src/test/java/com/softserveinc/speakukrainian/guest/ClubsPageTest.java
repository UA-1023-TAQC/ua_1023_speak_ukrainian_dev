package com.softserveinc.speakukrainian.guest;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.refresh;
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





        List<ClubCardComponent> ls =  new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCityDropDownMenu()
                .selectCityFromDropDown("Харків")
                .getSortBlock()
                .clickSortByAlphabetOrRating("за рейтингом")
                .getClubsCard();

        List<Integer> actualSortItemsRating = new ArrayList<>();
        for (ClubCardComponent tmp : ls) {

            actualSortItemsRating.add(tmp.getCountOfRating());
        }

        System.out.println("count" +  actualSortItemsRating);
        System.out.println("count" + actualSortItemsRating.size());
        System.out.println("counts" + ls.size());

        refresh();

                homePage
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickOnCityDropDownMenu()
                .selectCityFromDropDown("Харків");

        List<ClubCardComponent> ls1 = new ClubsPage()
                .getClubsCard();
        List<Integer> expectedSortItemsRating = new ArrayList<>();
        for (ClubCardComponent tmp : ls1) {
            expectedSortItemsRating.add(tmp.getCountOfRating());
        }
        Collections.sort(expectedSortItemsRating);
        System.out.println("count" +  expectedSortItemsRating);
    }

}


