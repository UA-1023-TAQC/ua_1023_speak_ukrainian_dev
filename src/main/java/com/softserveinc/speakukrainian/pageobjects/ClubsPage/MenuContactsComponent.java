package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class MenuContactsComponent extends ClubDetailPage{


    public static final SelenideElement MENU_CONTACTS =
            $x("//div[@class='//div[@class='ant-layout-sider-children']']");

    public SelenideElement getMenuContacts() {
        return MENU_CONTACTS;
    }

    public SelenideElement getMenuContactsAddress(){
        return getMenuContacts().$("//div[1]/span[2]");
    }

    public String getMenuContactsAddressText(){
        return getMenuContactsAddress().getText();
    }

    public SelenideElement getMenuContactsAge(){
        return getMenuContacts().$("//div[3]/span[1]");
    }

    public String getMenuContactsAgeText(){
        return getMenuContactsAge().getText();
    }

    public SelenideElement getMenuContactsYears(){
        return getMenuContacts().$("//div[3]/span[2]");
    }

    public String getMenuContactsYearsText(){
        return getMenuContactsYears().getText();
    }

    public SelenideElement getMenuContactsContactClub(){
        return getMenuContacts().$("//div[5]/span");
    }

    public String getMenuContactsContactClubText(){
        return getMenuContactsContactClub().getText();
    }

    public SelenideElement getMenuContactsWebSite(){
        return getMenuContacts().$(By.linkText("https://agclub.com.ua/"));
    }

    public String getMenuContactsWebSiteText(){
        return getMenuContactsWebSite().getText();
    }

    public SelenideElement getMenuContactPhone(){
        return getMenuContacts().$("//div[5]/div/div[2]/span");
    }

    public String getMenuContactsPhoneText(){
        return getMenuContactPhone().getText();
    }

    public SelenideElement getSimilarClub(){
        return getMenuContacts().$("//p[@class='label']");
    }

    public String getSimilarClubText(){
        return getSimilarClub().getText();
    }
}
