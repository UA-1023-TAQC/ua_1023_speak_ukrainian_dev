package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.Selenide;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import lombok.Getter;

import static com.softserveinc.speakukrainian.utils.PropertyUtil.getHomePageUrl;

@Getter
public class HomePage {
    private final Header header = new Header();
    public HomePage open() {
        Selenide.open(getHomePageUrl());
        return this;
    }
}
