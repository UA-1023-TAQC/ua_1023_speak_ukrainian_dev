package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class CenterCardComponent {
    public SelenideElement node;
    private final SelenideElement clubName;

    public CenterCardComponent(SelenideElement card) {
        this.node = card;
        this.clubName = node.$("div.center-name");
    }

    public String getClubNameText(){
        return clubName.text();
    }
}
