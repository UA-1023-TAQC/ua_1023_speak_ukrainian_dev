package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ServicesInUkrainianPage {

    public SelenideElement getFAQTitleElement() {
        return Selenide.$x("//div[@class='faq-title']");
    }

    public String getFAQTitleText() {
        return getFAQTitleElement().getText();
    }

    public SelenideElement getFAQQuestionServiceDenialElement() {
        return Selenide.$x("//div[@class='ant-collapse-item panel'][1]");
    }

    public String getFAQQuestionServiceDenialTitleText() {
        return getFAQQuestionServiceDenialElement()
                .$x("//div[@class='ant-collapse-header-text']")
                .getText();
    }

    public String getFAQQuestionServiceDenialContentText() {
        return getFAQQuestionServiceDenialElement()
                .$x(".//div[@class='ant-collapse-content-box']/p")
                .getText();
    }

    public SelenideElement getFAQQuestionWhereToComplainElement() {
        return Selenide.$x("//div[@class='ant-collapse-item panel'][2]");
    }

    public String getFAQQuestionWhereToComplainTitleText() {
        return getFAQQuestionWhereToComplainElement()
                .$x("//div[@class='ant-collapse-header-text']")
                .getText();
    }

    public String getFAQQuestionWhereToComplainContentText() {
        return getFAQQuestionWhereToComplainElement()
                .$x(".//div[@class='ant-collapse-content-box']/p")
                .getText();
    }

    public SelenideElement getFAQQuestionWhatComplaintContainsElement() {
        return Selenide.$x("//div[@class='ant-collapse-item panel'][3]");
    }

    public String getFAQQuestionWhatComplainContainsTitleText() {
        return getFAQQuestionWhatComplaintContainsElement()
                .$x("//div[@class='ant-collapse-header-text']")
                .getText();
    }

    public String getFAQQuestionWhatComplainContainsContentText() {
        return getFAQQuestionWhatComplaintContainsElement()
                .$x(".//div[@class='ant-collapse-content-box']/p")
                .getText();
    }
}
