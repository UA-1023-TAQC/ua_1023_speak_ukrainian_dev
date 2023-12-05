package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


@Getter
public class ClubsPage extends BasePage {
    private final ElementsCollection clubsCard = $$(".content-clubs-list.content-clubs-block>div");

    private final ElementsCollection centersCard = $$x("//div[@class='content-center-list content-center-block']/div");

    private final SelenideElement sortByAlphabet = $x("//span[@class='control-sort-option'] [contains(text(),'алфавіт')]");

    private final SelenideElement sortByRating = $x("//span[@class='control-sort-option'] [contains(text(),'рейтинг')]");

    private final SelenideElement sixthCenterCard = $x("//div[@class='content-center-list content-center-block']/div[6]");

    public List<ClubCardComponent> getClubsCard() {
        List<ClubCardComponent> result = new ArrayList<>(clubsCard.size());
        for (SelenideElement card: clubsCard) {
            result.add(new ClubCardComponent(card));
        }
        return result;
    }

    public List<CenterCardComponent> getCentersCard() {
        sixthCenterCard.shouldBe(visible);
        List<CenterCardComponent> result = new ArrayList<>(centersCard.size());
        for (SelenideElement card: centersCard) {
            result.add(new CenterCardComponent(card));
        }
        return result;
    }
}
