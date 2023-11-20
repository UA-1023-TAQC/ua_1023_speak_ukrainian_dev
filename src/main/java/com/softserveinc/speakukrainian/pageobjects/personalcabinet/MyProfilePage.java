package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddCenterMainInformationModal;
import lombok.Getter;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MyProfilePage extends BasePage {

    private final SelenideElement userName = $("div.user-name");
    private final SelenideElement userRole = $("div.user-role");
    private final SelenideElement userPhone = $("div.user-phone-data");
    private final SelenideElement userEmail = $("div.user-email-data");
    private final SelenideElement editButton = $("div.edit-button button");
    private final SelenideElement myClubsCentersSelection = $("div.ant-select-selector");
    private final SelenideElement addClubCenterButton = $("div.add-club-dropdown button");
    private final SelenideElement addClubOption = $x("//body/div[6]/div/ul/li[1]");
    private final SelenideElement addCenterOption = $x("//body/div[6]/div/ul/li[2]");
    private final AddClubModal addClubModal = new AddClubModal();
    private final AddCenterMainInformationModal addCenterModal = new AddCenterMainInformationModal();
    private final EditProfileModal editProfileModal = new EditProfileModal();

    public EditProfileModal editProfile(){
        editButton.click();
        return editProfileModal;
    }

    public String getUserRoleText(){
        return userRole.text();
    }

    public MyProfilePage checkMyCenters(){
        myClubsCentersSelection.click();
        myClubsCentersSelection.sendKeys(Keys.ARROW_DOWN);
        return this;
    }

    public AddClubModal addClub(){
        addClubCenterButton.click();
        addClubOption.click();
        return addClubModal;
    }

    public AddCenterMainInformationModal addCenter(){
        addClubCenterButton.click();
        addCenterOption.click();
        return addCenterModal;
    }

    public VisitorPersonalCabinetComponent getVisitorPersonalCabinet(){
        return new VisitorPersonalCabinetComponent();
    }

    public DirectorPersonalCabinetComponent getDirectorPersonalCabinet(){
        return new DirectorPersonalCabinetComponent();
    }

}
