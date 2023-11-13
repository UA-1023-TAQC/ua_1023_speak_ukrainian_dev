package com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddCenterDescriptionModal extends BaseComponent {

    public static final SelenideElement LOGO = $x("//span[contains(text(), 'Логотип')]");
    public static final SelenideElement UPLOAD_LOGO = $x("//span[contains(text(), 'Завантажити лого')]");

    public static final SelenideElement PHOTO = $x("//span[contains(text(), 'Фото')]");
    public static final SelenideElement UPLOAD_PHOTO = $x("//span[contains(text(), 'Завантажити фото')]");

    public static final SelenideElement DESCRIPTION = $x("//span[contains(text(), 'Опис')]");
    public static final SelenideElement DESCRIPTION_FIELD = $x("//textarea");
    public static final SelenideElement DESCRIPTION_FIELD_ERROR_MESSAGE = $("#basic_description_help");

    public SelenideElement getLogo(){
        return LOGO;
    }

    public String getLogoText(){
        return getLogo().getText();
    }

    public SelenideElement getUploadLogo(){
        return UPLOAD_LOGO;
    }

    public String getUploadLogoText(){
        return getUploadLogo().getText();
    }

    public void clickUploadLogo(){
        getUploadLogo().click();
    }

    public SelenideElement getPhoto(){
        return PHOTO;
    }

    public String getPhotoText(){
        return getPhoto().getText();
    }

    public SelenideElement getUploadPhoto(){
        return UPLOAD_PHOTO;
    }

    public String getUploadPhotoText(){
        return getUploadPhoto().getText();
    }

    public void clickUploadPhoto(){
        getUploadPhoto().click();
    }

    public SelenideElement getDescription(){
        return DESCRIPTION;
    }

    public String getDescriptionText(){
        return getDescription().getText();
    }

    public SelenideElement getDescriptionField(){
        return DESCRIPTION_FIELD;
    }

    public AddCenterDescriptionModal setTextDescriptionField(String value){
        getDescriptionField().setValue(value);
        return this;
    }

    public SelenideElement getDescriptionErrorMessage(){
        return DESCRIPTION_FIELD_ERROR_MESSAGE;
    }

    public String getDescriptionErrorMessageText(){
        return getDescriptionErrorMessage().getText();
    }

    public AddCenterClubsModal clickNextStepButton(){
        getNextStepButton().click();
        return new AddCenterClubsModal();
    }

    public AddCenterContactsModal clickBackButton(){
        getBackButton().click();
        return new AddCenterContactsModal();
    }
}
