package com.softserveinc.speakukrainian.pageobjects.news;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;


@Getter
public class NewsCardComponent {
    public SelenideElement node;
    private final SelenideElement newsTitle;
    private final SelenideElement newsImage;
    private final SelenideElement newsDetail;
    private final SelenideElement newsDate;

    public NewsCardComponent(SelenideElement card) {
        this.node = card;
        this.newsTitle = node.$("div#newsTitle");
        this.newsImage = node.$("div#newsImage");
        this.newsDetail = node.$("div#detailButton a");
        this.newsDate = node.$("div#newsDate");
    }

    public DetailsNewsPage clickOnImage(){
        newsImage.click();
        return new DetailsNewsPage();
    }

    public DetailsNewsPage clickOnTitle() {
        newsTitle.click();
        return new DetailsNewsPage();
    }

    public DetailsNewsPage clickOnDetail() {
        newsDetail.click();
        return new DetailsNewsPage();
    }
}
