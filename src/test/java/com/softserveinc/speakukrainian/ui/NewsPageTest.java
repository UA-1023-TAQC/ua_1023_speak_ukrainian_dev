package com.softserveinc.speakukrainian.ui;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubDetailPage;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.pageobjects.news.DetailsNewsPage;
import com.softserveinc.speakukrainian.pageobjects.news.NewsCardComponent;
import com.softserveinc.speakukrainian.pageobjects.news.NewsPage;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.text;

public class NewsPageTest extends TestRunner {

    @Test(description = "TUA-33: Verify that the user can open any article in different ways")
    public void verifyUserCanOpenArticleInDifferentWays() {
        //Click on third main image in article blocks
        NewsCardComponent card = new HomePage()
                .getHeader()
                .openNewsPage()
                .getNewsCardList()
                .get(2);
        String newsTitle = card.getNewsTitle().text();
        card.clickOnImage().getTitle().shouldHave(text(newsTitle));

        //Click on third title in article blocks
        new DetailsNewsPage()
                .getHeader()
                .openNewsPage()
                .getNewsCardList()
                .get(2)
                .clickOnTitle()
                .getTitle()
                .shouldHave(text(newsTitle));

        //Click on third "Детальніше" button in article blocks
        new DetailsNewsPage()
                .getHeader()
                .openNewsPage()
                .getNewsCardList()
                .get(2)
                .clickOnDetail()
                .getTitle()
                .shouldHave(text(newsTitle));

        //Click on third date info in article blocks
        new DetailsNewsPage()
                .getHeader()
                .openNewsPage()
                .getNewsCardList()
                .get(2)
                .getNewsDate()
                .click();
        new DetailsNewsPage()
                .getTitle()
                .shouldHave(text(newsTitle));
    }

    @Test(description = "TUA-31: Verify that all buttons are active on the 'Новини' page and corresponding pages are opened ")
    public void verifyAllButtonsActiveOnNewsPageAndCorrespondingPagesOpened() {
        //open an article page
        NewsCardComponent newsCard = new HomePage()
                .getHeader()
                .openNewsPage()
                .getNewsCardList()
                .get(1);
        String newsTitle = newsCard.getNewsTitle().text();
        newsCard.clickOnDetail().getTitle().shouldHave(text(newsTitle));

        //open a club page
        ClubCardComponent clubCard = new DetailsNewsPage()
                .getHeader()
                .openNewsPage()
                .getClubCardList()
                .get(1);
        String clubName = clubCard.getClubNameText();
        clubCard.clickOnDetail().getHeaderContainerTitle().shouldHave(text(clubName));

        //change city and check suggested clubs
        NewsPage newsPage = new ClubDetailPage()
                .getHeader()
                .openCitiesMenu()
                .chooseCity("Дніпро")
                .getHeader()
                .openNewsPage();
        newsPage.getTitleSideBar()
                .shouldHave(text("Гуртки у місті Дніпро"));
        List<ClubCardComponent> clubCards = newsPage.getClubCardList();
        for (ClubCardComponent card: clubCards) {
            card.getClubAddress().shouldHave(partialText("Дніпро"));
        }
    }

}