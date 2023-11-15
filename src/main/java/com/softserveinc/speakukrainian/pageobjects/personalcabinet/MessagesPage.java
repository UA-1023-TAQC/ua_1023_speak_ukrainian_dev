package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MessagesPage {

    private final SelenideElement searchInput = $x("//div[@class='searchAndFilter']//input[contains(@class, 'searchBox')]");
    private final SelenideElement listBoxInput = $x("//span[@class='ant-select-selection-search']//input");
    private final SelenideElement listBoxItemByText = $x("//div[@role='listbox']//div[contains(@title, '%s')]");
    private final SelenideElement unreadMessageFilterBtn = $x("(//div[@class='filterContainer']//button)[1]");
    private final SelenideElement noAnswerFilterBtn = $x("(//div[@class='filterContainer']//button)[2]");
    private final SelenideElement noMessageText = $x("//div[@class='ant-list-empty-text']//div[@class='noMessages']");
    private final SelenideElement totalOfUnreadMessages = $x("(//div[contains(text(), 'У вас')]/text())[2]");

    public MessagesPage typeValueInSearchInput(String value) {
        searchInput.shouldBe(Condition.visible).type(value);
        return this;
    }

    public MessagesPage clickOnListBox() {
        listBoxInput.shouldBe(Condition.enabled).click();
        return this;
    }

    public MessagesPage clickOnListBoxItemByText(String text) {
        SelenideElement item = $x(String.format("//div[@role='listbox']//div[contains(@title, '%s')]", text));
        item.shouldBe(Condition.enabled).click();
        return this;
    }

    public MessagesPage clickOnUnreadMessageFilterBtn() {
        unreadMessageFilterBtn.shouldBe(Condition.enabled).click();
        return this;
    }

    public MessagesPage clickOnNoAnswerFilterBtn() {
        noAnswerFilterBtn.shouldBe(Condition.enabled).click();
        return this;
    }

    public boolean isNoMessageTextVisible() {
        try {
            return noMessageText.shouldBe(Condition.visible).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public Integer getTotalOfUnreadMessages() {
        return Integer.valueOf(totalOfUnreadMessages.getText());
    }

}