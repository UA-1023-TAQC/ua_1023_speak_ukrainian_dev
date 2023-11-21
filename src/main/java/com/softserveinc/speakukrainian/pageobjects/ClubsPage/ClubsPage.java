package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;



@Getter
public class ClubsPage {
    private final List<SelenideElement> clubsCard = $$(".content-clubs-list .content-clubs-block");

    public List<ClubCard> getClubsCard() {
        List<ClubCard> result = new ArrayList<>(clubsCard.size());
        for (SelenideElement card: clubsCard) {
            result.add(new ClubCard(card));
        }
        return result;
    }
}
