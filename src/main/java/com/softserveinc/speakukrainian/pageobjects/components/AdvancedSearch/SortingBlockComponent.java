package com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;

public class SortingBlockComponent {

    public SelenideElement node;
    public SortingBlockComponent(SelenideElement sortBlock) {
        this.node = sortBlock;
    }

    public ClubsPage clickSortByAlphabetOrRating(String sortBy) {
        this.node.$x(".//span[contains(text(), '" + sortBy + "')]").click();
        return new ClubsPage();
    }

    public ClubsPage clickArrowUpOrDown(String arrowUpOrDown){
        this.node.$x(".//span[@aria-label='" + arrowUpOrDown + "']").click(); //arrow-up or arrow-down
        return new ClubsPage();
    }
}
