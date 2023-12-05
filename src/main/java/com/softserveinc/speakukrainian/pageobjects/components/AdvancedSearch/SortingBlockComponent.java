package com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;

import static com.codeborne.selenide.Selenide.$x;

public class SortingBlockComponent {

    public SelenideElement node;
    public SortingBlockComponent(SelenideElement sortBlock) {
        this.node = sortBlock;
    }

    public ClubsPage clickSortByAlphabetOrRating(String sortBy) {
        this.node.$x(String.format(".//span[contains(text(), '%s')]", sortBy)).click();
        return new ClubsPage();
    }

    public ClubsPage clickArrowUpOrDown(String arrowUpOrDown){
        this.node.$x(String.format(".//span[@aria-label='%s']", arrowUpOrDown)).click(); //arrow-up or arrow-down
        return new ClubsPage();
    }
}
