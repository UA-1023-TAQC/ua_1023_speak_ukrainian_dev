package com.softserveinc.speakukrainian.pageobjects.AboutUsPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AboutUsPage {
    private static final String MAIN_XPATH_PREFIX = "/html/body/div[1]/div/div[2]/main";

    private static final SelenideElement MAIN_PHOTO_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[2]");
    private static final SelenideElement MAIN_PHOTO_TITLE1_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[2]/span[1]");
    private static final SelenideElement MAIN_PHOTO_TITLE2_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[2]/span[2]");
    private static final SelenideElement OUR_CONTACTS_TEXT_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/span");
    private static final SelenideElement OUR_CONTACTS_FACEBOOK_BTN_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[2]");
    private static final SelenideElement OUR_CONTACTS_YOUTUBE_BTN_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[3]");
    private static final SelenideElement OUR_CONTACTS_INSTAGRAM_BTN_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[4]");
    private static final SelenideElement OUR_CONTACTS_EMAIL_BTN_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[5]");
    private static final SelenideElement HELP_PROJECT_BTN_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[2]/a");
    private static final SelenideElement ABOUT_THE_INITIATIVE_TITLE_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[2]/div/div");
    private static final SelenideElement ABOUT_THE_INITIATIVE_DESCRIPTION_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[3]/div/div/div/p");
    private static final SelenideElement NATALKA_FEDECHKO_TITLE_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[4]/div/div/span");
    private static final SelenideElement NATALKA_FEDECHKO_DESCRIPTION_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[4]/div/div/p[1]/span");
    private static final SelenideElement NATALKA_FEDECHKO_GENERAL_INFO_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[4]/div/div/p[2]");
    private static final SelenideElement NATALKA_FEDECHKO_PHOTO_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[4]/div/img");
    private static final SelenideElement IVANNA_KOBELEVA_TITLE_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[5]/div/div/span");
    private static final SelenideElement IVANNA_KOBELEVA_DESCRIPTION_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[5]/div/div/p[1]");
    private static final SelenideElement IVANNA_KOBELEVA_GENERAL_INFO_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[5]/div/div/p[2]");
    private static final SelenideElement IVANNA_KOBELEVA_PHOTO_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[5]/div/img");
    private static final SelenideElement NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[6]/div/div");
    private static final SelenideElement NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE_DESCRIPTION_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[7]/div/div/div/p");
    private static final SelenideElement YOUTUBE_VIDEO_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[8]/div/div/div");
    private static final SelenideElement AMBASSADORS_OF_THE_PROJECT_TITLE_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[9]/div/div");
    private static final SelenideElement AMBASSADORS_OF_THE_FIRST_BLOCK_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[10]");
    private static final SelenideElement AMBASSADORS_OF_THE_SECOND_BLOCK_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[11]");
    private static final SelenideElement AMBASSADORS_OF_THE_THIRD_BLOCK_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[12]");
    private static final SelenideElement AMBASSADORS_OF_THE_FOURTH_BLOCK_XPATH = $x(MAIN_XPATH_PREFIX + "/div/div[13]");
    private static final SelenideElement REVIEWS_TITLE = $x(MAIN_XPATH_PREFIX + "/div/div[14]/div");
    private static final ElementsCollection REVIEWS_LIST = $$x(MAIN_XPATH_PREFIX + "/div/div[15]/div/div/p");



    public SelenideElement getMainPhoto() {
        return MAIN_PHOTO_XPATH;
    }

    public SelenideElement getMainPhotoTitle1() {
        return MAIN_PHOTO_TITLE1_XPATH;
    }

    public String getMainPhotoTitle1Text() {
        return MAIN_PHOTO_TITLE1_XPATH.text();
    }

    public SelenideElement getMainPhotoTitle2() {
        return MAIN_PHOTO_TITLE2_XPATH;
    }

    public String getMainPhotoTitle2Text() {
        return MAIN_PHOTO_TITLE2_XPATH.text();
    }

    public SelenideElement getOurContacts() {
        return OUR_CONTACTS_TEXT_XPATH;
    }

    public String getOurContactsText() {
        return OUR_CONTACTS_TEXT_XPATH.text();
    }

    public SelenideElement getOurContactsFacebookBtn() {
        return OUR_CONTACTS_FACEBOOK_BTN_XPATH;
    }

    public void clickOurContactsFacebookBtn() {
        OUR_CONTACTS_FACEBOOK_BTN_XPATH.click();
    }

    public SelenideElement getOurContactsYoutubeBtn() {
        return OUR_CONTACTS_YOUTUBE_BTN_XPATH;
    }

    public void clickOurContactsYoutubeBtn() {
        OUR_CONTACTS_YOUTUBE_BTN_XPATH.click();
    }

    public SelenideElement getOurContactsInstagramBtn() {
        return OUR_CONTACTS_INSTAGRAM_BTN_XPATH;
    }

    public void clickOurContactsInstagramBtn() {
        OUR_CONTACTS_INSTAGRAM_BTN_XPATH.click();
    }

    public SelenideElement getOurContactsEmailBtn() {
        return OUR_CONTACTS_EMAIL_BTN_XPATH;
    }

    public void clickOurContactsEmailBtn() {
        OUR_CONTACTS_EMAIL_BTN_XPATH.click();
    }

    public SelenideElement getHelpProjectBtn() {
        return HELP_PROJECT_BTN_XPATH;
    }

    public void clickHelpProjectBtn() {
        HELP_PROJECT_BTN_XPATH.click();
    }

    public SelenideElement getAboutTheInitiativeTitle() {
        return ABOUT_THE_INITIATIVE_TITLE_XPATH;
    }

    public String getAboutTheInitiativeTitleText() {
        return ABOUT_THE_INITIATIVE_TITLE_XPATH.text();
    }

    public SelenideElement getAboutTheInitiativeDescription() {
        return ABOUT_THE_INITIATIVE_DESCRIPTION_XPATH;
    }

    public String getAboutTheInitiativeDescriptionText() {
        return ABOUT_THE_INITIATIVE_DESCRIPTION_XPATH.text();
    }

    public SelenideElement getNatalkaFedechkoTitle() {
        return NATALKA_FEDECHKO_TITLE_XPATH;
    }

    public String getNatalkaFedechkoTitleText() {
        return NATALKA_FEDECHKO_TITLE_XPATH.text();
    }

    public SelenideElement getNatalkaFedechkoDescription() {
        return NATALKA_FEDECHKO_DESCRIPTION_XPATH;
    }

    public String getNatalkaFedechkoDescriptionText() {
        return NATALKA_FEDECHKO_DESCRIPTION_XPATH.text();
    }

    public SelenideElement getNatalkaFedechkoGeneralInfo() {
        return NATALKA_FEDECHKO_GENERAL_INFO_XPATH;
    }

    public String getNatalkaFedechkoGeneralInfoText() {
        return NATALKA_FEDECHKO_GENERAL_INFO_XPATH.text();
    }

    public SelenideElement getNatalkaFedechkoPhoto() {
        return NATALKA_FEDECHKO_PHOTO_XPATH;
    }

    public SelenideElement getIvannaKobelevaTitle() {
        return IVANNA_KOBELEVA_TITLE_XPATH;
    }

    public String getIvannaKobelevaTitleText() {
        return IVANNA_KOBELEVA_TITLE_XPATH.text();
    }

    public SelenideElement getIvannaKobelevaDescription() {
        return IVANNA_KOBELEVA_DESCRIPTION_XPATH;
    }

    public String getIvannaKobelevaDescriptionText() {
        return IVANNA_KOBELEVA_DESCRIPTION_XPATH.text();
    }

    public SelenideElement getIvannaKobelevaGeneralInfo() {
        return IVANNA_KOBELEVA_GENERAL_INFO_XPATH;
    }

    public String getIvannaKobelevaGeneralInfoText() {
        return IVANNA_KOBELEVA_GENERAL_INFO_XPATH.text();
    }

    public SelenideElement getIvannaKobelevaPhoto() {
        return IVANNA_KOBELEVA_PHOTO_XPATH;
    }

    public AmbassadorBlockComponent getAmbassadorElement(SelenideElement node) {
        AmbassadorBlockComponent ambassadorBlockComponent = new AmbassadorBlockComponent(node);
        return ambassadorBlockComponent;
    }

    public SelenideElement getNavchayUkrayinskoyuInitiativeMiddle() {
        return NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE_XPATH;
    }
    public String getNavchayUkrayinskoyuInitiativeMiddleText() {
        return getNavchayUkrayinskoyuInitiativeMiddle().text();
    }

    public SelenideElement getNavchayUkrayinskoyuInitiativeMiddleDescription() {
        return NAVCHAY_UKRAYINSKOYU_INITIATIVE_MIDDLE_DESCRIPTION_XPATH;
    }
    public String getNavchayUkrayinskoyuInitiativeMiddleDescriptionText() {
        return getNavchayUkrayinskoyuInitiativeMiddleDescription().text();
    }

    public SelenideElement getYoutubeVideo() {
        return YOUTUBE_VIDEO_XPATH;
    }

    public SelenideElement getAmbassadorsOfTheProjectTitle() {
        return AMBASSADORS_OF_THE_PROJECT_TITLE_XPATH;
    }

    public String getAmbassadorsOfTheProjectTitleText() {
        return getAmbassadorsOfTheProjectTitle().text();
    }

    public SelenideElement getAmbassadorsOfTheFirstBlock() {
        return AMBASSADORS_OF_THE_FIRST_BLOCK_XPATH;
    }

    public SelenideElement getAmbassadorsOfTheSecondBlock() {
        return AMBASSADORS_OF_THE_SECOND_BLOCK_XPATH;
    }

    public SelenideElement getAmbassadorsOfTheThirdBlock() {
        return AMBASSADORS_OF_THE_THIRD_BLOCK_XPATH;
    }

    public SelenideElement getAmbassadorsOfTheFourthBlock() {
        return AMBASSADORS_OF_THE_FOURTH_BLOCK_XPATH;
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


