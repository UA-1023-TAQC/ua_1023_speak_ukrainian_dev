package com.softserveinc.speakukrainian.pageobjects.components.RegistrationModal;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
@Setter
public class RegistrationModal {

    private final SelenideElement closeBtn = $x("//button[@aria-label='Close']");
    private final SelenideElement title = $x("//div[@class='registration-header']");

    private final SelenideElement googleAuthorize = $x("//a[contains(@href, 'authorize/google')]");
    private final SelenideElement facebookAuthorize = $x("//a[contains(@href, 'authorize/facebook')]");

    private final SelenideElement userBtn = $$x("//span[starts-with(@class, 'ant-radio-button')]").get(0);
    private final SelenideElement managerBtn = $$x("//span[starts-with(@class, 'ant-radio-button')]").get(2);
    private final SelenideElement userText = $$x("//div[@class='button-box']").get(0);
    private final SelenideElement managerText = $$x("//div[@class='button-box']").get(1);

    private final SelenideElement lastNameLabel = $x("//label[@title='Прізвище']");
    private final SelenideElement lastNameInput = $x("//input[@id='lastName']");
    private final String nodeError = ".//div[@class='ant-form-item-explain-error']";
    private final ElementsCollection lastNameError = lastNameInput.$$x(nodeError);

    private final SelenideElement firstNameLabel = $x("//label[@title='Ім`я']");
    private final SelenideElement firstNameInput = $x("//input[@id='firstName']");
    private final ElementsCollection firstNameError = firstNameInput.$$x(nodeError);

    private final SelenideElement phoneNumberLabel = $x("//label[@title='Телефон']");
    private final SelenideElement phoneNumberInput = $x("//input[@id='phone']");
    private final SelenideElement phoneNumberInputPrefix = $x("//span[@input='ant-input-prefix']");
    private final SelenideElement phoneIcon = $x("//span[@aria-label='phone']");
    private final ElementsCollection phoneNumberError = phoneNumberInput.$$x(nodeError);

    private final SelenideElement emailLabel = $x("//label[@title='Email']");
    private final SelenideElement emailInput = $x("//input[@id='email']");
    private final SelenideElement emailIcon = $x("//span[@aria-label='mail']");
    private final ElementsCollection emailError = emailInput.$$x(nodeError);

    private final SelenideElement passwordLabel = $x("//label[@title='Пароль']");
    private final SelenideElement passwordInput = $x("//input[@id='password']");
    private final ElementsCollection passwordError = passwordInput.$$x(nodeError);
    private final SelenideElement passwordEyeToggle = $x("//span[@aria-label='ant-input-password-icon']");

    private final SelenideElement confirmPasswordLabel = $x("//label[@title='Підтвердження паролю']");
    private final SelenideElement confirmPasswordInput = $x("//input[@id='confirm']");
    private final ElementsCollection confirmPasswordError = confirmPasswordInput.$$x(nodeError);
    private final SelenideElement confirmPasswordEyeToggle = confirmPasswordInput.$x("//span[@aria-label='ant-input-password-icon']");

    private final SelenideElement registerBtn = $x("//button[@class='registration-button']");
    private final SelenideElement consentWarning = $x("//div[contains(text(),'Натискаючи кнопку \"Зареєструватися\", я даю згоду на обробку персональних даних')]");


    public void clickCloseBtn(){
        closeBtn.click();
    }
    public String getTitleText(){
        return title.getText();
    }

    public void clickGoogleAuthorize(){
        googleAuthorize.click();
    }

    public void clickFacebookAuthorize(){
        facebookAuthorize.click();
    }

    public void clickUserBtn(){
        userBtn.click();
    }

    public void clickManagerBtn(){
        managerBtn.click();
    }

    public String getUserText(){
        return userText.getText();
    }

    public String getManagerText(){
        return managerText.getText();
    }

    public String getLastNameText(){
        return lastNameLabel.getText();
    }

    public String getLastNameValue(){
        return lastNameInput.getValue();
    }

    public RegistrationModal setLastName(String lastName){
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public String getFirstNameText(){
        return firstNameLabel.getText();
    }

    public String getFirstNameValue(){
        return firstNameInput.getValue();
    }

    public RegistrationModal setFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public String getPhoneNumberText(){
        return phoneNumberLabel.getText();
    }

    public String getPhoneNumberValue(){
        return phoneNumberInput.getValue();
    }

    public RegistrationModal setPhoneNumber(String phoneNumber){
        phoneNumberInput.sendKeys(phoneNumber);
        return this;
    }

    public String getEmailText(){
        return emailLabel.getText();
    }

    public String getEmailValue(){
        return emailInput.getValue();
    }

    public RegistrationModal setEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }

    public String getPasswordText(){
        return passwordLabel.getText();
    }

    public String getPasswordValue(){
        return passwordInput.getValue();
    }

    public RegistrationModal setPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public String getConfirmPasswordText(){
        return confirmPasswordLabel.getText();
    }

    public String getConfirmPasswordValue(){
        return confirmPasswordInput.getValue();
    }

    public RegistrationModal setConfirmPassword(String confirmPassword){
        confirmPasswordInput.sendKeys(confirmPassword);
        return this;
    }

    public void clickRegisterBtn(){
        registerBtn.click();
    }
}
