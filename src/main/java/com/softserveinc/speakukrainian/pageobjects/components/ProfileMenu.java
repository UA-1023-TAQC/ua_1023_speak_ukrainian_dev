package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.homePage.HomePage;
import com.softserveinc.speakukrainian.pageobjects.SearchCertificatesPage;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddCenterMainInformationModal;
import com.softserveinc.speakukrainian.pageobjects.personalcabinet.MyProfilePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ProfileMenu {

    private final SelenideElement dropdownMenu = $x("ul.ant-dropdown-menu");
    private final SelenideElement addClubBtn = $x("//li[contains(@data-menu-id,'add_club')]");
    private final SelenideElement addCenterBtn = $x("//li[contains(@data-menu-id,'add_centre')]");
    private final SelenideElement searchCertificatesLink = $x("//li[contains(@data-menu-id,'search_certificates')]");
    private final SelenideElement profileLink = $x("//li[contains(@data-menu-id,'profile')]");
    private final SelenideElement logoutBtn = $x("//li[contains(@data-menu-id,'logout')]");

    public AddClubModal openAddClubModal(){
        addClubBtn.click();
        return new AddClubModal();
    }

    public AddCenterMainInformationModal openAddCenterModal(){
        addCenterBtn.click();
        return new AddCenterMainInformationModal();
    }

    public SearchCertificatesPage openSearchCertificatesPage(){
        searchCertificatesLink.click();
        return new SearchCertificatesPage();
    }

    public MyProfilePage openMyProfilePage(){
        profileLink.click();
        return new MyProfilePage();
    }

    public HomePage logout(){
        logoutBtn.click();
        return new HomePage();
    }

}
