package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.HomePage;
import com.softserveinc.speakukrainian.pageobjects.SearchCertificatesPage;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddCenterMainInformationModal;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.MyProfilePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ProfileMenu {

    private static final SelenideElement DROPDOWN_MENU = $("ul.ant-dropdown-menu");
    private static final SelenideElement ADD_CLUB = $("//li[contains(@data-menu-id,'add_club')]");
    private static final SelenideElement ADD_CENTER = $("//li[contains(@data-menu-id,'add_centre')]");
    private static final SelenideElement SEARCH_CERTIFICATES_LINK = $("//li[contains(@data-menu-id,'search_certificates')]");
    private static final SelenideElement PROFILE_LINK = $("//li[contains(@data-menu-id,'profile')]");
    private static final SelenideElement LOGOUT = $("//li[contains(@data-menu-id,'logout')]");

    public AddClubModal openAddClubModal(){
        ADD_CLUB.click();
        return new AddClubModal();
    }

    public AddCenterMainInformationModal openAddCenterModal(){
        ADD_CENTER.click();
        return new AddCenterMainInformationModal();
    }

    public SearchCertificatesPage openSearchCertificatesPage(){
        SEARCH_CERTIFICATES_LINK.click();
        return new SearchCertificatesPage();
    }

    public MyProfilePage openMyProfilePage(){
        PROFILE_LINK.click();
        return new MyProfilePage();
    }

    public HomePage logout(){
        LOGOUT.click();
        return new HomePage();
    }

}
