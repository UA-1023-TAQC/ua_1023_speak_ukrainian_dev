package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class CenterCardComponent {
    public SelenideElement node;
    private final SelenideElement centerName;

    public CenterCardComponent(SelenideElement card) {
        this.node = card;
        this.centerName = node.$("div.center-name");
    }

    public String getCenterNameText(){
        return centerName.text();
    }
}
