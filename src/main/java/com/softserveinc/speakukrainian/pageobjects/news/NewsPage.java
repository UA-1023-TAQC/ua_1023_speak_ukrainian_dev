package com.softserveinc.speakukrainian.pageobjects.news;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubCardComponent;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class NewsPage extends BasePage {
    private final SelenideElement rightArrow = $("span.anticon-right");
    private final SelenideElement leftArrow = $("span.anticon-left");
    private final SelenideElement title = Selenide.$x("//div[@class=\"city-name-box-small-screen\"]/h2");
    private final SelenideElement titleSideBar = Selenide.$x("//div[@class=\"sider-header\"]/h2");
    private final ElementsCollection clubsName = Selenide.$$x("//div[@class=\"title\"]/div[@class=\"name\"]");
    private final ElementsCollection clubsTag = Selenide.$$x("//div[@class=\"club-tags-box\"]//span[@class=\"name\"]");
    private final ElementsCollection clubsDesc = Selenide.$$x("//div[@class=\"ant-card-body\"]/p[@class=\"description\"]");
    private final ElementsCollection clubsAddress = Selenide.$$x("//div[@class=\"address\"]/span[@class=\"oneAddress\"]");
    private final ElementsCollection clubsDetails = Selenide.$$x("//div[@class=\"ant-card-body\"]/a");
    private final SelenideElement clubPreReviewTitle = Selenide.$x("//div[@class=\"ant-modal-body\"]//div[@class=\"club-name\"]");
    private final SelenideElement clubPreReviewTag = Selenide.$x("//div[@class=\"ant-modal-body\"]//span[@class=\"name\"]");
    private final SelenideElement clubPreReviewAge = Selenide.$x("//div[@class=\"ant-modal-body\"]//span[@class=\"years\"]");
    private final ElementsCollection clubPreReviewContacts = Selenide.$$x("//div[@class=\"ant-modal-body\"]//span[@class=\"contact-name\"]");
    private final SelenideElement clubPreReviewButton = Selenide.$x("//div[@class=\"ant-modal-body\"]//button[@type=\"button\"]//a");
    private final SelenideElement clubsPreReviewDesc = Selenide.$x("//div[@class=\"ant-modal-body\"]//div[@class=\"description\"]");
    private final SelenideElement clubsPreReviewDownload = $("button.download-button");
    private final SelenideElement clubsClosePreReview = $("button.ant-modal-close");

    private final ElementsCollection newsCards = $$("div.news-content> :first-child>div");
    private final ElementsCollection clubCards = $$("div.club-sider>div:not(.sider-header)");

    public List<NewsCardComponent> getNewsCardList() {
        newsCards.shouldHave(sizeGreaterThan(0));
        List<NewsCardComponent> result = new ArrayList<>(newsCards.size());
        for (SelenideElement card: newsCards) {
            result.add(new NewsCardComponent(card));
        }
        return result;
    }

    public List<ClubCardComponent> getClubCardList() {
        clubCards.shouldHave(sizeGreaterThan(0));
        List<ClubCardComponent> result = new ArrayList<>(clubCards.size());
        for (SelenideElement card: clubCards) {
            result.add(new ClubCardComponent(card));
        }
        return result;
    }

    public String getTitle() {
        return title.getText();
    }

    public NewsPage clickRightArrow() {
        rightArrow.click();
        return this;
    }

    public NewsPage clickLeftArrow() {
        leftArrow.click();
        return this;
    }

    public String getSideBarTitle() {
        return titleSideBar.getText();
    }

    public String getSideBarClubNameByIndex(int index) {
        String clubs = "";
        if (index >= 0 && index < clubsName.size()) {
            clubs = clubsName.get(index).getText();
        }
        return clubs;
    }

    public String getClubsTagByIndex(int index) {
        String tag = "";
        if (index >= 0 && index < clubsTag.size()) {
            tag = clubsTag.get(index).getText();
        }
        return tag;
    }

    public String getClubsDescByIndex(int index) {
        String desc = "";
        if (index >= 0 && index < clubsDesc.size()) {
            desc = clubsDesc.get(index).getText();
        }
        return desc;
    }

    public String getClubsAddressByIndex(int index) {
        String address = "";
        if (index >= 0 && index < clubsAddress.size()) {
            address = clubsAddress.get(index).getText();
        }
        return address;
    }

    public NewsPage clickOnClubsAddressButtonByIndex(int index) {
        if (index >= 0 && index < clubsAddress.size()) {
            clubsAddress.get(index).click();
        }
        return this;
    }

    public ClubsPage clickOnClubsDetailButtonByIndex(int index) {
        if (index >= 0 && index < clubsDetails.size()) {
            clubsDetails.get(index).click();
        }
        return new ClubsPage();
    }

    public NewsPage clickOnClubsNameToClubsPreReviewByIndex(int index) {
        if (index >= 0 && index < clubsName.size()) {
            clubsName.get(index).click();
        }
        return this;
    }

    public String getClubPreReviewTitle() {
        return clubPreReviewTitle.getText();
    }

    public String getClubPreReviewTag() {
        return clubPreReviewTag.getText();
    }

    public String getClubPreReviewAge() {
        return clubPreReviewAge.getText();
    }

    public ElementsCollection getClubPreReviewContact() {
        return clubPreReviewContacts;
    }

    public ClubsPage clickOnPreReviewMoreAboutClub() {
        clubPreReviewButton.click();
        return new ClubsPage();
    }

    public String getClubsPreReviewDesc() {
        return clubsPreReviewDesc.getText();
    }

    public NewsPage clickOnClubsPreReviewDownload() {
        clubsPreReviewDownload.click();
        return this;
    }
    public NewsPage closeClubsPreReview() {
        clubsClosePreReview.click();
        return this;
    }
}