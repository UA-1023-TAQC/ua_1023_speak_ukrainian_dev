package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch;
import com.softserveinc.speakukrainian.pageobjects.components.LoginModal;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static org.testng.AssertJUnit.assertEquals;

public class AdvancedSearchTest extends TestRunner {
    @Test
    public void setKeys() {
        $x("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div[2]/span[2]").click();
        AdvancedSearch search = new AdvancedSearch();
        search.setAgeInput(12);
    }

    @Test
    public void Search() {
        $x("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div[2]/span[2]").click();
        AdvancedSearch search = new AdvancedSearch();
        search.clickOnRemoteCheckbox();
       String text = search.getRemoteCheckboxText();
        assertEquals("Доступний онлайн", text);
    }
}
