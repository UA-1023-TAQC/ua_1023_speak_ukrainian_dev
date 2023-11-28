package com.softserveinc.speakukrainian.pageobjects.news;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import lombok.Getter;

@Getter
public class DetailsNewsPage extends BasePage {
    private final SelenideElement title = Selenide.$x("//div[@id=\"major-title\"]");
    private final SelenideElement contactFacebook = Selenide.$("span.anticon-facebook");
    private final SelenideElement contactYouTube = Selenide.$("span.anticon-youtube");
    private final SelenideElement contactInstagram = Selenide.$("span.anticon-instagram");
    private final SelenideElement contactMail = Selenide.$("span.anticon-mail");
    private final SelenideElement donateButton = Selenide.$("button.donate-button");
    private final SelenideElement newsDate = Selenide.$("//div[@id=\"date\"]");
    private final SelenideElement newsDesc = Selenide.$x("//div[@id=\"description\"]");
    private final SelenideElement otherNews = Selenide.$x("//div[@class=\"other-news\"]//div[@class=\"title\"]");
    private final ElementsCollection titleOtherNews = Selenide.$$x("//div[@id=\"newsTitle\"]");
    private final ElementsCollection dateOtherNews = Selenide.$$x("//div[@id=\"newsDate\"]");
    private final ElementsCollection detailOtherNews = Selenide.$$x("//div[@id=\"detailButton\"]");
    private final SelenideElement rightArrow = Selenide.$("span.anticon-arrow-right");
    private final SelenideElement leftArrow = Selenide.$("span.anticon-arrow-left");

    public String getTitleText() {
        return title.getText();
    }

    public String getNewsDate() {
        return newsDate.getText();
    }

    public void clickOnContactFacebook() {
        contactFacebook.click();
    }

    public void clickOnContactInstagram() {
        contactInstagram.click();
    }

    public void clickOnContactYouTube() {
        contactYouTube.click();
    }

    public void clickOnContactMail() {
        contactMail.click();
    }

    public void clickOnDonateButton() {
        donateButton.click();
    }

    public String getNewsDesc() {
        return newsDesc.getText();
    }

    public String getOtherNews() {
        return otherNews.getText();
    }

    public String getTitleOtherNews(int index) {
        String title = "";
        if (index >= 0 && index < titleOtherNews.size()) {
            title = titleOtherNews.get(index).getText();
        }
        return title;
    }

    public String getDateOtherNews(int index) {
        String date = "";
        if (index >= 0 && index < dateOtherNews.size()) {
            date = dateOtherNews.get(index).getText();
        }
        return date;
    }

    public DetailsNewsPage clickDetailOtherNews(int index) {
        detailOtherNews.get(index);
        return this;
    }

    public DetailsNewsPage clickRightArrow() {
        rightArrow.click();
        return this;
    }

    public DetailsNewsPage clickLeftArrow() {
        leftArrow.click();
        return this;
    }
}
