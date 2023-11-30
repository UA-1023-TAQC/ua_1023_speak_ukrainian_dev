package com.softserveinc.speakukrainian.pageobjects.AboutUsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AboutUsPage {
    private static final String MAIN_PREFIX = "/html/body/div[1]/div/div[2]/main";
    private static final SelenideElement MAIN_PHOTO = $x("//div[@class='title']");
    private static final SelenideElement MAIN_PHOTO_TITLE1 = MAIN_PHOTO.$$("span").first();
    private static final SelenideElement MAIN_PHOTO_TITLE2 = MAIN_PHOTO.$$("span").last();
    private static final SelenideElement OUR_CONTACTS_TEXT = $x("//div[@class='text']");
    private static final SelenideElement OUR_CONTACTS_FACEBOOK_BTN = $x("//div[@class='anticon anticon-facebook icon']");
    private static final SelenideElement OUR_CONTACTS_YOUTUBE_BTN = $x("//div[@class='anticon anticon-youtube icon']");
    private static final SelenideElement OUR_CONTACTS_INSTAGRAM_BTN = $x("//div[@class='anticon anticon-instagram icon']");
    private static final SelenideElement OUR_CONTACTS_EMAIL_BTN = $x("//div[@class='anticon anticon-mail icon']");
    private static final SelenideElement HELP_PROJECT_BTN = $x("//div[@class='help-button']//button");
    private static final SelenideElement ABOUT_THE_INITIATIVE_TITLE = $x(MAIN_PREFIX + "/div/div[2]/div/div");
    private static final SelenideElement ABOUT_THE_INITIATIVE_DESCRIPTION = $x(MAIN_PREFIX + "/div/div[3]/div/div/div/p");
    private static final SelenideElement NATALKA_FEDECHKO_TITLE = $x(MAIN_PREFIX + "/div/div[4]/div/div/span");
    private static final SelenideElement NATALKA_FEDECHKO_DESCRIPTION = $x(MAIN_PREFIX + "/div/div[4]/div/div/p[1]/span");
    private static final SelenideElement NATALKA_FEDECHKO_GENERAL_INFO = $x(MAIN_PREFIX + "/div/div[4]/div/div/p[2]");
    private static final SelenideElement NATALKA_FEDECHKO_PHOTO = $x(MAIN_PREFIX + "/div/div[4]/div/img");
    private static final SelenideElement IVANNA_KOBELEVA_TITLE = $x(MAIN_PREFIX + "/div/div[5]/div/div/span");
    private static final SelenideElement IVANNA_KOBELEVA_DESCRIPTION = $x(MAIN_PREFIX + "/div/div[5]/div/div/p[1]");
    private static final SelenideElement IVANNA_KOBELEVA_GENERAL_INFO = $x(MAIN_PREFIX + "/div/div[5]/div/div/p[2]");
    private static final SelenideElement IVANNA_KOBELEVA_PHOTO = $x(MAIN_PREFIX + "/div/div[5]/div/img");
    private static final SelenideElement NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE = $x(MAIN_PREFIX + "/div/div[6]/div/div");
    private static final SelenideElement NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE_DESCRIPTION = $x(MAIN_PREFIX + "/div/div[7]/div/div/div/p");
    private static final SelenideElement YOUTUBE_VIDEO = $x("//div[@class='video']");
    private static final SelenideElement AMBASSADORS_OF_THE_PROJECT_TITLE = $x(MAIN_PREFIX + "/div/div[9]/div/div");
    private static final SelenideElement AMBASSADORS_OF_THE_FIRST_BLOCK = $x(MAIN_PREFIX + "/div/div[10]");
    private static final SelenideElement AMBASSADORS_OF_THE_SECOND_BLOCK = $x(MAIN_PREFIX + "/div/div[11]");
    private static final SelenideElement AMBASSADORS_OF_THE_THIRD_BLOCK = $x(MAIN_PREFIX + "/div/div[12]");
    private static final SelenideElement AMBASSADORS_OF_THE_FOURTH_BLOCK = $x(MAIN_PREFIX + "/div/div[13]");
    private static final SelenideElement REVIEWS_TITLE = $x(MAIN_PREFIX + "/div/div[14]/div");
    private static final ElementsCollection REVIEWS_LIST = $$x(MAIN_PREFIX + "/div/div[15]/div/div/p");



    public SelenideElement getMainPhoto() {
        return MAIN_PHOTO;
    }

    public SelenideElement getMainPhotoTitle1() {
        return MAIN_PHOTO_TITLE1;
    }

    public String getMainPhotoTitle1Text() {
        return MAIN_PHOTO_TITLE1.text();
    }

    public SelenideElement getMainPhotoTitle2() {
        return MAIN_PHOTO_TITLE2;
    }

    public String getMainPhotoTitle2Text() {
        return MAIN_PHOTO_TITLE2.text();
    }

    public SelenideElement getOurContacts() {
        return OUR_CONTACTS_TEXT;
    }

    public String getOurContactsText() {
        return OUR_CONTACTS_TEXT.text();
    }

    public SelenideElement getOurContactsFacebookBtn() {
        return OUR_CONTACTS_FACEBOOK_BTN;
    }

    public void clickOurContactsFacebookBtn() {
        OUR_CONTACTS_FACEBOOK_BTN.click();
    }

    public SelenideElement getOurContactsYoutubeBtn() {
        return OUR_CONTACTS_YOUTUBE_BTN;
    }

    public void clickOurContactsYoutubeBtn() {
        OUR_CONTACTS_YOUTUBE_BTN.click();
    }

    public SelenideElement getOurContactsInstagramBtn() {
        return OUR_CONTACTS_INSTAGRAM_BTN;
    }

    public void clickOurContactsInstagramBtn() {
        OUR_CONTACTS_INSTAGRAM_BTN.click();
    }

    public SelenideElement getOurContactsEmailBtn() {
        return OUR_CONTACTS_EMAIL_BTN;
    }

    public void clickOurContactsEmailBtn() {
        OUR_CONTACTS_EMAIL_BTN.click();
    }

    public SelenideElement getHelpProjectBtn() {
        return HELP_PROJECT_BTN;
    }

    public void clickHelpProjectBtn() {
        HELP_PROJECT_BTN.click();
    }

    public SelenideElement getAboutTheInitiativeTitle() {
        return ABOUT_THE_INITIATIVE_TITLE;
    }

    public String getAboutTheInitiativeTitleText() {
        return ABOUT_THE_INITIATIVE_TITLE.text();
    }

    public SelenideElement getAboutTheInitiativeDescription() {
        return ABOUT_THE_INITIATIVE_DESCRIPTION;
    }

    public String getAboutTheInitiativeDescriptionText() {
        return ABOUT_THE_INITIATIVE_DESCRIPTION.text();
    }

    public SelenideElement getNatalkaFedechkoTitle() {
        return NATALKA_FEDECHKO_TITLE;
    }

    public String getNatalkaFedechkoTitleText() {
        return NATALKA_FEDECHKO_TITLE.text();
    }

    public SelenideElement getNatalkaFedechkoDescription() {
        return NATALKA_FEDECHKO_DESCRIPTION;
    }

    public String getNatalkaFedechkoDescriptionText() {
        return NATALKA_FEDECHKO_DESCRIPTION.text();
    }

    public SelenideElement getNatalkaFedechkoGeneralInfo() {
        return NATALKA_FEDECHKO_GENERAL_INFO;
    }

    public String getNatalkaFedechkoGeneralInfoText() {
        return NATALKA_FEDECHKO_GENERAL_INFO.text();
    }

    public SelenideElement getNatalkaFedechkoPhoto() {
        return NATALKA_FEDECHKO_PHOTO;
    }

    public SelenideElement getIvannaKobelevaTitle() {
        return IVANNA_KOBELEVA_TITLE;
    }

    public String getIvannaKobelevaTitleText() {
        return IVANNA_KOBELEVA_TITLE.text();
    }

    public SelenideElement getIvannaKobelevaDescription() {
        return IVANNA_KOBELEVA_DESCRIPTION;
    }

    public String getIvannaKobelevaDescriptionText() {
        return IVANNA_KOBELEVA_DESCRIPTION.text();
    }

    public SelenideElement getIvannaKobelevaGeneralInfo() {
        return IVANNA_KOBELEVA_GENERAL_INFO;
    }

    public String getIvannaKobelevaGeneralInfoText() {
        return IVANNA_KOBELEVA_GENERAL_INFO.text();
    }

    public SelenideElement getIvannaKobelevaPhoto() {
        return IVANNA_KOBELEVA_PHOTO;
    }

    public AmbassadorBlockComponent getAmbassadorElement(SelenideElement node) {
        AmbassadorBlockComponent ambassadorBlockComponent = new AmbassadorBlockComponent(node);
        return ambassadorBlockComponent;
    }

    public SelenideElement getNavchayUkrayinskoyuInitiativeMiddle() {
        return NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE;
    }
    public String getNavchayUkrayinskoyuInitiativeMiddleText() {
        return getNavchayUkrayinskoyuInitiativeMiddle().text();
    }

    public SelenideElement getNavchayUkrayinskoyuInitiativeMiddleDescription() {
        return NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE_DESCRIPTION;
    }
    public String getNavchayUkrayinskoyuInitiativeMiddleDescriptionText() {
        return getNavchayUkrayinskoyuInitiativeMiddleDescription().text();
    }

    public SelenideElement getYoutubeVideo() {
        return YOUTUBE_VIDEO;
    }

    public SelenideElement getAmbassadorsOfTheProjectTitle() {
        return AMBASSADORS_OF_THE_PROJECT_TITLE;
    }

    public String getAmbassadorsOfTheProjectTitleText() {
        return getAmbassadorsOfTheProjectTitle().text();
    }

    public SelenideElement getAmbassadorsOfTheFirstBlock() {
        return AMBASSADORS_OF_THE_FIRST_BLOCK;
    }

    public SelenideElement getAmbassadorsOfTheSecondBlock() {
        return AMBASSADORS_OF_THE_SECOND_BLOCK;
    }

    public SelenideElement getAmbassadorsOfTheThirdBlock() {
        return AMBASSADORS_OF_THE_THIRD_BLOCK;
    }

    public SelenideElement getAmbassadorsOfTheFourthBlock() {
        return AMBASSADORS_OF_THE_FOURTH_BLOCK;
    }

    public SelenideElement getReviewsTitle() {
        return REVIEWS_TITLE;
    }
    public String getReviewsTitleText() {
        return getReviewsTitle().text();
    }

    public ReviewComponent getReviewsList(SelenideElement node) {
        ReviewComponent reviewComponent = new ReviewComponent(node);
        return reviewComponent;
    }
}


