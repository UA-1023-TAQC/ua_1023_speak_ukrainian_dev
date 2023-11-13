package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class SearchCertificatesPage {
    private final SelenideElement searchInput = $x("//input[@class='ant-input css-18v7s9k']");

    public void inputText(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
    }
}
