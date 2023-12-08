package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class ClubCardComponent {
    public SelenideElement node;
    private final SelenideElement clubName;
    private final SelenideElement clubDetail;
    private final SelenideElement clubAddress;

    public ClubCardComponent(SelenideElement card) {
        this.node = card;
        this.clubName = node.$("div.name");
        this.clubDetail = node.$("a.details-button");
        this.clubAddress = node.$("span.oneAddress");
    }

    public String getClubNameText(){
        return clubName.text();
    }

    public ClubDetailPage clickOnDetail() {
        clubDetail.click();
        return new ClubDetailPage();
    }

    public String getClubAddressText(){
        return clubAddress.text();
    }

}
