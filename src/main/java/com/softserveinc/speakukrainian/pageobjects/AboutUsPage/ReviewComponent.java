package com.softserveinc.speakukrainian.pageobjects.AboutUsPage;

import com.codeborne.selenide.SelenideElement;

public class ReviewComponent {
    private SelenideElement node;
    public ReviewComponent(SelenideElement node) {
            this.node = node;
        }

    public SelenideElement getReviewSelenideElement() {
        return node;
    }
    public String getReviewText() {
        return node.text();
    }
}
