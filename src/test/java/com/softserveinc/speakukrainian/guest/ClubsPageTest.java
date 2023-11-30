package com.softserveinc.speakukrainian.guest;

import com.codeborne.selenide.Configuration;
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

        List<ClubCardComponent> clubsCardsExpectedList = new HomePage()
                .getHeader()
                .clickAdvancedSearchBtn()
                .clickSortByAlphabetOrRating("за алфавітом")
                .getClubsCard();

        List<String> expectedSortItems = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsExpectedList) {
            expectedSortItems.add(tmp.getClubNameText());
        }

        System.out.println(expectedSortItems);


        System.out.println("exp " + expectedSortItems.size());

        refresh();
        Configuration.pageLoadStrategy = "normal";

        List<ClubCardComponent> clubsCardsActualList = new ClubsPage()
                .getClubsCard();
        List<String> actualSortItems = new ArrayList<>();
        for (ClubCardComponent tmp : clubsCardsActualList) {
            actualSortItems.add(tmp.getClubNameText());
        }
        System.out.println(actualSortItems);
        Collections.sort(actualSortItems);
        System.out.println(actualSortItems);
        List<String> sliceListActualSortItems = actualSortItems.subList(0, 6);
        System.out.println(sliceListActualSortItems);
        System.out.println(sliceListActualSortItems.size());

       assertEquals(expectedSortItems, sliceListActualSortItems);
    }
}
