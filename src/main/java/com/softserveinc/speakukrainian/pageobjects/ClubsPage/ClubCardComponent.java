package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> getCountOfRating() {
        List<String> res = new ArrayList<>(getRatingList().size());
        int count = 0;
        String i;
        for (SelenideElement rate : ratingList) {

//            res.add(rate.getAttribute("aria-checked"));
//            List<String> my = rate.getAttribute("aria-checked");
            if (rate.getAttribute("aria-checked").equals("false")) ;
                res.add(rate.getAttribute("aria-checked"));

        }
        return res;

    }

}

