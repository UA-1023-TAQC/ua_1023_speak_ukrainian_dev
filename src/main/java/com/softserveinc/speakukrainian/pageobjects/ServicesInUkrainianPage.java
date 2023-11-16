package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import lombok.Getter;


@Getter
public class ServicesInUkrainianPage {

    private final SelenideElement mainTitle = Selenide.$x("//div[@class='title']");
    private final SelenideElement mainContent = Selenide.$x("//div[@class='content']");
    private final SelenideElement faqTitle = Selenide.$x("//div[@class='faq-title']");
    private final SelenideElement faqQuestionServiceDenial = Selenide.$x("//div[@class='ant-collapse-item panel'][1]");
    private final SelenideElement faqQuestionWhereToComplain = Selenide.$x("//div[@class='ant-collapse-item panel'][2]");
    private final SelenideElement faqQuestionWhatComplainContains = Selenide.$x("//div[@class='ant-collapse-item panel'][3]");


    public String getMainTitleText() {
        return mainTitle.$x(".//div[@class='text']").getText();
    }

    public String getMainContentTitleText() {
        return mainContent.$x(".//div[@class='content-title']").getText();
    }

    public String getMainContentText() {
        return mainContent.$x(".//div[@class='content-text']").getText();
    }

    public String getFAQTitleText() {
        return faqTitle.getText();
    }

    public String getFAQQuestionServiceDenialTitleText() {
        return faqQuestionServiceDenial.$x(".//div[@class='ant-collapse-header-text']").getText();
    }

    public String getFAQQuestionServiceDenialContentText() {
        return faqQuestionServiceDenial.$x(".//div[@class='ant-collapse-content-box']/p").getText();
    }

    public String getFAQQuestionWhereToComplainTitleText() {
        return faqQuestionWhereToComplain.$x(".//div[@class='ant-collapse-header-text']").getText();
    }

    public String getFAQQuestionWhereToComplainContentText() {
        return faqQuestionWhereToComplain.$x(".//div[@class='ant-collapse-content-box']/p").getText();
    }

    public String getFAQQuestionWhatComplainContainsTitleText() {
        return faqQuestionWhatComplainContains.$x(".//div[@class='ant-collapse-header-text']").getText();
    }

    public String getFAQQuestionWhatComplainContainsContentText() {
        return faqQuestionWhatComplainContains.$x(".//div[@class='ant-collapse-content-box']/p").getText();
    }
}
