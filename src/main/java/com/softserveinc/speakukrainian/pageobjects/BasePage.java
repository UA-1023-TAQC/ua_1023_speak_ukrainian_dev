package com.softserveinc.speakukrainian.pageobjects;

import com.softserveinc.speakukrainian.pageobjects.components.Footer;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.actions;

public abstract class BasePage {

    protected static final Header HEADER = new Header();
    protected static final Footer FOOTER = new Footer();


    public void pressArrowDown(int count) {
        for (int i=0; i<count; i++) {
            actions()
                    .sendKeys(Keys.ARROW_DOWN)
                    .sendKeys(Keys.ENTER)
                    .build()
                    .perform();
        }
    }
}
