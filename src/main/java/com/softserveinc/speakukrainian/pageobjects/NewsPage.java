package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class NewsPage {
    private final Header header = new Header();

    public ElementsCollection getNewsTitleList() {
        return Selenide.$$x("//*[@id=\"newsTitle\"]");
    }

    public ElementsCollection getPhotoList() {
        return Selenide.$$x("//*[@id=\"newsImage\"]");
    }

    public ElementsCollection getNewsDetailList() {
        return Selenide.$$x("//*[@id=\\\"detailButton\\\"]/a\"");
    }

    public ElementsCollection getNewsDateList() {
        return Selenide.$$x("//*[@id=\"newsDate\"]");
    }

    public SelenideElement getRightArrow() {
        return Selenide.$("span.anticon-right");
    }
}
