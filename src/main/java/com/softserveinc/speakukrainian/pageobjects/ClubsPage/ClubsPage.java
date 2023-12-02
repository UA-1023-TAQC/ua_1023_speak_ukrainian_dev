package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;


@Getter
public class ClubsPage extends BasePage {
    private final ElementsCollection clubsCard = $$(".content-clubs-list.content-clubs-block>div");

    public List<ClubCardComponent> getClubsCard() {
        List<ClubCardComponent> result = new ArrayList<>(clubsCard.size());
        for (SelenideElement card: clubsCard) {
            result.add(new ClubCardComponent(card));
        }
        return result;
    }
}
