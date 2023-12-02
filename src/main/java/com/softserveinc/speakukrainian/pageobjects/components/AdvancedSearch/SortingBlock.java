package com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;

public class SortingBlock{

    public SelenideElement node;
    public SortingBlock(SelenideElement sortBlock) {
        this.node = sortBlock;
    }

    public ClubsPage clickSortByAlphabetOrRating(String sortBy) {
        this.node.$x(".//span[contains(text(), '" + sortBy + "')]").click();
        return new ClubsPage();
    }

    public ClubsPage clickArrowUpOrDown(String upOrDown){
        this.node.$x(".//span[@aria-label='" + upOrDown + "']").click(); //arrow-up or arrow-down
        return new ClubsPage();
    }
}
