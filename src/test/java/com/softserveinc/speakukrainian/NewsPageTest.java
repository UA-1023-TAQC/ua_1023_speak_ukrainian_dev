package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.pageobjects.news.DetailsNewsPage;
import com.softserveinc.speakukrainian.pageobjects.news.NewsCardComponent;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class NewsPageTest extends TestRunner {

    @Test
    public void verifyUserCanOpenArticleInDifferentWays(){
        //Click on third main image in article blocks
        NewsCardComponent card = new HomePage()
                .getHeader()
                .openNewsPage()
                .getNewsCardList()
                .get(2);
        String newsTitle = card.getNewsTitle().text();
        System.out.println("title:  " + newsTitle);
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
}
