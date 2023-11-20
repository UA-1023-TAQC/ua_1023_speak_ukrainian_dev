package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.io.File;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class EditProfileModal {

    private final SelenideElement closeButton = $(".user-edit button.ant-modal-close");
    private final SelenideElement modalTitle = $("div.edit-header");
    private final ElementsCollection roleRadioButtons = $$("input.ant-radio-button-input");
    private final SelenideElement selectedRoleName = $("label.ant-radio-button-wrapper-checked div.role-name");
    private final SelenideElement lastNameInput = $("#edit_lastName");
    private final SelenideElement firstNameInput = $("#edit_firstName");
    private final SelenideElement phoneNumberInput = $("#edit_phone");
    private final SelenideElement emailInput = $("#edit_email");
    private final SelenideElement photoInput = $("#edit_urlLogo");
    private final SelenideElement photoTooltip = $("div.ant-tooltip-inner");
    private final SelenideElement changePasswordCheckbox = $("input.checkbox");
    private final SelenideElement currentPasswordInput = $("#edit_currentPassword");
    private final SelenideElement newPasswordInput = $("#edit_password");
    private final SelenideElement confirmPasswordInput = $("#edit_confirmPassword");
    private final SelenideElement submitButton = $("button.submit-button");

    public MyProfilePage closeModal(){
        closeButton.click();
        return new MyProfilePage();
    }

    public void selectRole(String role) {
        String roleValue;
        if (role.equals("user") || role.equals("visitor")){
            roleValue = "ROLE_USER";
        }else {
            roleValue = "ROLE_MANAGER";
        }
        roleRadioButtons.find(value(roleValue)).click();
    }

    public String getCurrentLastName(){
        return lastNameInput.getValue();
    }

    public EditProfileModal editLastName(String newLastName){
        lastNameInput.clear();
        lastNameInput.sendKeys(newLastName);
        return this;
    }

    public String getCurrentFirstName(){
        return firstNameInput.getValue();
    }

    public EditProfileModal editFirstName(String newFirstName){
        firstNameInput.clear();
        firstNameInput.sendKeys(newFirstName);
        return this;
    }

    public String getCurrentPhoneNumber(){
        return phoneNumberInput.getValue();
    }

    public EditProfileModal editPhoneNumber(String newPhoneNumber){
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(newPhoneNumber);
        return this;
    }

    public String getCurrentEmail(){
        return emailInput.getValue();
    }

    public EditProfileModal editEmail(String newEmail){
        emailInput.clear();
        emailInput.sendKeys(newEmail);
        return this;
    }

    public EditProfileModal uploadPhoto(String filePath){
        photoInput.uploadFile(new File(filePath));
        return this;
    }

    public String getPhotoTooltipText(){
        return getPhotoTooltip().text();
    }

    public EditProfileModal changePassword(String oldPassword, String newPassword){
        changePasswordCheckbox.setSelected(true);
        currentPasswordInput.sendKeys(oldPassword);
        newPasswordInput.sendKeys(newPassword);
        confirmPasswordInput.sendKeys(newPassword);
        return this;
    }

    public MyProfilePage submitChanges(){
        submitButton.click();
        return new MyProfilePage();
    }

}
