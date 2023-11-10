package com.softserveinc.speakukrainian.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AboutUsPage {
    private static final String MAIN_XPATH_PREFIX = "/html/body/div[1]/div/div[2]/main";
    private static final String MAIN_PHOTO_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[2]";
    private static final String MAIN_PHOTO_TITLE1_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[2]/span[1]";
    private static final String MAIN_PHOTO_TITLE2_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[2]/span[2]";
    private static final String OUR_CONTACTS_TEXT_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/span";
    private static final String OUR_CONTACTS_FACEBOOK_BTN_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[2]";
    private static final String OUR_CONTACTS_YOUTUBE_BTN_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[3]";
    private static final String OUR_CONTACTS_INSTAGRAM_BTN_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[4]";
    private static final String OUR_CONTACTS_EMAIL_BTN_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[1]/div/a[5]";
    private static final String HELP_PROJECT_BTN_XPATH = MAIN_XPATH_PREFIX + "/div/div[1]/div[3]/div[2]/a";
    private static final String ABOUT_THE_INITIATIVE_TITLE_XPATH = MAIN_XPATH_PREFIX + "/div/div[2]/div/div";
    private static final String ABOUT_THE_INITIATIVE_DESCRIPTION_XPATH = MAIN_XPATH_PREFIX + "/div/div[3]/div/div/div/p";
    private static final String NATALKA_FEDECHKO_TITLE_XPATH = MAIN_XPATH_PREFIX + "/div/div[4]/div/div/span";
    private static final String NATALKA_FEDECHKO_DESCRIPTION_XPATH = MAIN_XPATH_PREFIX + "/div/div[4]/div/div/p[1]/span";
    private static final String NATALKA_FEDECHKO_GENERAL_INFO_XPATH = MAIN_XPATH_PREFIX + "/div/div[4]/div/div/p[2]";
    private static final String NATALKA_FEDECHKO_PHOTO_XPATH = MAIN_XPATH_PREFIX + "/div/div[4]/div/img";
    private static final String IVANNA_KOBELEVA_TITLE_XPATH = MAIN_XPATH_PREFIX + "/div/div[5]/div/div/span";
    private static final String IVANNA_KOBELEVA_DESCRIPTION_XPATH = MAIN_XPATH_PREFIX + "/div/div[5]/div/div/p[1]";
    private static final String IVANNA_KOBELEVA_GENERAL_INFO_XPATH = MAIN_XPATH_PREFIX + "/div/div[5]/div/div/p[2]";
    private static final String IVANNA_KOBELEVA_PHOTO_XPATH = MAIN_XPATH_PREFIX + "/div/div[5]/div/img";

    public SelenideElement getMainPhoto() {
        return $x(MAIN_PHOTO_XPATH);
    }

    public SelenideElement getPhotoTitle1() {
        return $x(MAIN_PHOTO_TITLE1_XPATH);
    }

    public String getPhotoTitle1Text() {
        return $x(MAIN_PHOTO_TITLE1_XPATH).text();
    }

    public SelenideElement getPhotoTitle2() {
        return $x(MAIN_PHOTO_TITLE2_XPATH);
    }

    public String getPhotoTitle2Text() {
        return $x(MAIN_PHOTO_TITLE2_XPATH).text();
    }

    public SelenideElement getOurContacts() {
        return $x(OUR_CONTACTS_TEXT_XPATH);
    }

    public String getOurContactsText() {
        return $x(OUR_CONTACTS_TEXT_XPATH).text();
    }

    public SelenideElement getOurContactsFacebookBtn() {
        return $x(OUR_CONTACTS_FACEBOOK_BTN_XPATH);
    }

    public void clickOurContactsFacebookBtn() {
        $x(OUR_CONTACTS_FACEBOOK_BTN_XPATH).click();
        return;
    }

    public SelenideElement getOurContactsYoutubeBtn() {
        return $x(OUR_CONTACTS_YOUTUBE_BTN_XPATH);
    }

    public void clickOurContactsYoutubeBtn() {
        $x(OUR_CONTACTS_YOUTUBE_BTN_XPATH).click();
    }

    public SelenideElement getOurContactsInstagramBtn() {
        return $x(OUR_CONTACTS_INSTAGRAM_BTN_XPATH);
    }

    public void clickOurContactsInstagramBtn() {
        $x(OUR_CONTACTS_INSTAGRAM_BTN_XPATH).click();
    }

    public SelenideElement getOurContactsEmailBtn() {
        return $x(OUR_CONTACTS_EMAIL_BTN_XPATH);
    }

    public void clickOurContactsEmailBtn() {
        $x(OUR_CONTACTS_EMAIL_BTN_XPATH).click();
    }

    public SelenideElement getHelpProjectBtn() {
        return $x(HELP_PROJECT_BTN_XPATH);
    }

    public void clickHelpProjectBtn() {
        $x(HELP_PROJECT_BTN_XPATH).click();
    }

    public SelenideElement getAboutTheInitiativeTitle() {
        return $x(ABOUT_THE_INITIATIVE_TITLE_XPATH);
    }

    public String getAboutTheInitiativeTitleText() {
        return $x(ABOUT_THE_INITIATIVE_TITLE_XPATH).text();
    }

    public SelenideElement getAboutTheInitiativeDescription() {
        return $x(ABOUT_THE_INITIATIVE_DESCRIPTION_XPATH);
    }

    public String getAboutTheInitiativeDescriptionText() {
        return $x(ABOUT_THE_INITIATIVE_DESCRIPTION_XPATH).text();
    }

    public SelenideElement getNatalkaFedechkoTitle() {
        return $x(NATALKA_FEDECHKO_TITLE_XPATH);
    }

    public String getNatalkaFedechkoTitleText() {
        return $x(NATALKA_FEDECHKO_TITLE_XPATH).text();
    }

    public SelenideElement getNatalkaFedechkoDescription() {
        return $x(NATALKA_FEDECHKO_DESCRIPTION_XPATH);
    }

    public String getNatalkaFedechkoDescriptionText() {
        return $x(NATALKA_FEDECHKO_DESCRIPTION_XPATH).text();
    }

    public SelenideElement getNatalkaFedechkoGeneralInfo() {
        return $x(NATALKA_FEDECHKO_GENERAL_INFO_XPATH);
    }

    public String getNatalkaFedechkoGeneralInfoText() {
        return $x(NATALKA_FEDECHKO_GENERAL_INFO_XPATH).text();
    }

    public SelenideElement getNatalkaFedechkoPhoto() {
        return $x(NATALKA_FEDECHKO_PHOTO_XPATH);
    }

    public SelenideElement getIvannaKobelevaTitle() {
        return $x(IVANNA_KOBELEVA_TITLE_XPATH);
    }

    public String getIvannaKobelevaTitleText() {
        return $x(IVANNA_KOBELEVA_TITLE_XPATH).text();
    }

    public SelenideElement getIvannaKobelevaDescription() {
        return $x(IVANNA_KOBELEVA_DESCRIPTION_XPATH);
    }

    public String getIvannaKobelevaDescriptionText() {
        return $x(IVANNA_KOBELEVA_DESCRIPTION_XPATH).text();
    }

    public SelenideElement getIvannaKobelevaGeneralInfo() {
        return $x(IVANNA_KOBELEVA_GENERAL_INFO_XPATH);
    }

    public String getIvannaKobelevaGeneralInfoText() {
        return $x(IVANNA_KOBELEVA_GENERAL_INFO_XPATH).text();
    }

    public SelenideElement getIvannaKobelevaPhoto() {
        return $x(IVANNA_KOBELEVA_PHOTO_XPATH);
    }
}


