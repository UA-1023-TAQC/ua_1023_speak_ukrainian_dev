package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;


@Getter
public class ClubsPage {
    private final ElementsCollection clubsCard = $$(".content-clubs-list .content-clubs-block");

    public List<ClubCard> getClubsCard() {
        List<ClubCard> result = new ArrayList<>(clubsCard.size());
        for (SelenideElement card: clubsCard) {
            result.add(new ClubCard(card));
        }
        return result;
    }
}
