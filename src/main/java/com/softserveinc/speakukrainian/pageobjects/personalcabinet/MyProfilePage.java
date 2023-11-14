package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MyProfilePage {

    private final SelenideElement userName = $("div.user-name");
    private final SelenideElement userRole = $("div.user-role");
    private final SelenideElement userPhone = $("div.user-phone-data");
    private final SelenideElement userEmail = $("div.user-email-data");
    private final SelenideElement editButton = $("div.edit-button button");
    private final SelenideElement myClubsCentersSelection = $("div.ant-select-selector");
    private final SelenideElement addClubCenterButton = $("div.add-club-dropdown button");
    private final SelenideElement addClubOption = $x("//body/div[6]/div/ul/li[1]");
    private final SelenideElement addCenterOption = $x("//body/div[6]/div/ul/li[2]");
    private final AddClubComponent addClubComponent = new AddClubComponent();
    private final AddCenterComponent addCenterComponent = new AddCenterComponent();
    private final EditProfileModal editProfileModal = new EditProfileModal();

    public EditProfileModal editProfile(){
        editButton.click();
        return editProfileModal;
    }

    public MyProfilePage checkMyCenters(){
        myClubsCentersSelection.click();
        myClubsCentersSelection.sendKeys(Keys.ARROW_DOWN);
        return this;
    }

    public AddClubComponent addClub(){
        addClubCenterButton.click();
        addClubOption.click();
        return addClubComponent;
    }

    public AddCenterComponent addCenter(){
        addClubCenterButton.click();
        addCenterOption.click();
        return addCenterComponent;
    }

}
