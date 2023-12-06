package com.softserveinc.speakukrainian.pageobjects.components.AdvancedSearch;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;

import static com.codeborne.selenide.Selenide.$x;

public class SortingBlockComponent {

    public SelenideElement node;
    public SortingBlockComponent(SelenideElement sortBlock) {
        this.node = sortBlock;
    }

    /**
     * The method defines the type of sorting - by alphabet or by rating
     *
     * @param sortBy tab text of the sorting block ("за алфавітом" or "по рейтингу")
     * @return Clubs page
     */
    public ClubsPage clickSortByAlphabetOrRating(String sortBy) {
        this.node.$x(String.format(".//span[contains(text(), '%s')]", sortBy)).click();
        return new ClubsPage();
    }

    /**
     * The method defines the sorting order - ascending or descending
     *
     * @param arrowUpOrDown defined with the specified aria-label attribute of the sorting block ("arrow-up" or "arrow-down")
     * @return Clubs page
     */

    public ClubsPage clickArrowUpOrDown(String arrowUpOrDown){
        this.node.$x(String.format(".//span[@aria-label='%s']", arrowUpOrDown)).click(); //arrow-up or arrow-down
        return new ClubsPage();
    }
}
