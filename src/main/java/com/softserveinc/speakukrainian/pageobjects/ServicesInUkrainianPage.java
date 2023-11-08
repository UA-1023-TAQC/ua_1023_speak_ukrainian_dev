package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ServicesInUkrainianPage {

    public SelenideElement getFAQTitle() {
        return Selenide.$x("//div[@class='faq-title']");
    }

    public String getFAQTitleText() {
        return getFAQTitle().getText();
    }

    public SelenideElement getFAQQuestionServiceDenial() {
        return Selenide.$x("//div[@class='ant-collapse-item panel'][1]");
    }

    public String getFAQQuestionServiceDenialText() {
        return getFAQQuestionServiceDenial().getText();
    }

    public SelenideElement getFAQQuestionWhereToComplain() {
        return Selenide.$x("//div[@class='ant-collapse-item panel'][2]");
    }

    public String getFAQQuestionWhereToComplainText() {
        return getFAQQuestionWhereToComplain().getText();
    }

    public SelenideElement getFAQQuestionWhatComplainContains() {
        return Selenide.$x("//div[@class='ant-collapse-item panel'][3]");
    }

    public String getFAQQuestionWhatComplainContainsText() {
        return getFAQQuestionWhatComplainContains().getText();
    }
}
