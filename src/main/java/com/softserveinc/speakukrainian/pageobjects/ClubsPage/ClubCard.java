package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;

public class ClubCard {
    public SelenideElement node;
    public ClubCard(SelenideElement card) {
        this.node = card;
    }

    public SelenideElement getClubsName() {
        return node.$x("//div[@class=\"title\"]/div[@class=\"name\"]");
    }

    public SelenideElement getClubsTag() {
        return node.$x("//span[@class=\"ant-tag tag css-ff6qag\"]//span[@class=\"name\"]");
    }

    public SelenideElement getClubsDesc() {
        return node.$x("//div[@class=\"ant-card-body\"]/p[@class=\"description\"]");
    }

    public SelenideElement getClubsAddress() {
        return node.$x("//div[@class=\"address\"]/span[@class=\"oneAddress\"]");
    }

    public SelenideElement getClubsDetails() {
        return node.$x("//div[@class=\"ant-card-body\"]/a[@class=\"ant-btn css-ff6qag ant-btn-default outlined-button details-button\"]");
    }
}

