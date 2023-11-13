package com.softserveinc.speakukrainian.pageobjects;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.actions;

public abstract class BasePage {

    public void pressArrowDown(int count) {
        for (int i=0; i<count; i++) {
            actions().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        }
    }
}
