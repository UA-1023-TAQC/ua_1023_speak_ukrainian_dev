package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.Objects;

@Getter
public class ClubCardComponent {
    public SelenideElement node;
    private final SelenideElement clubName;
    private final SelenideElement clubDetail;
    private final SelenideElement clubAddress;
    private final ElementsCollection ratingList;

    public ClubCardComponent(SelenideElement card) {
        this.node = card;
        this.clubName = node.$("div.name");
        this.clubDetail = node.$("a.details-button");
        this.clubAddress = node.$("span.oneAddress");
        this.ratingList = node.$$x(".//div[@role='radio']");
    }

    public String getClubNameText() {
        return clubName.text();
    }

    public ClubDetailPage clickOnDetail() {
        clubDetail.click();
        return new ClubDetailPage();
    }

    public Integer getCountOfRating() {
        int count = 0;
        for (SelenideElement rate : ratingList) {

            if (Objects.equals(rate.getAttribute("aria-checked"), "true")) {
                count++;
            }
        }
        return count;

    }

}

