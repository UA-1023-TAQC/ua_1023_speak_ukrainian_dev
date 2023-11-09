package com.softserveinc.speakukrainian.pageobjects.components.RegistrationModal;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class RegistrationModal {

    private final SelenideElement closeBtn = $x("//button[@aria-label='Close']");
    private final SelenideElement title = $x("//div[@class='registration-header']");
    private final SelenideElement socialMedia = $x("//div[@class='items-active']");
    private final SelenideElement roleSelectionBlock = $x("//div[contains(@class, 'ant-radio-group') and contains(@class, 'ant-radio-group-solid') and contains(@class, 'button-container')]");

    private final SelenideElement lastNameLabel = $x("//label[@title='Прізвище']");
    private final SelenideElement lastNameInput = $x("//input[@id='lastName']");
    private final ElementsCollection lastNameError = lastNameInput.$$x(".//div[@class='ant-form-item-explain-error']");

    private final SelenideElement firstNameLabel = $x("//label[@title='Ім`я']");
    private final SelenideElement firstNameInput = $x("//input[@id='firstName']");
    private final ElementsCollection firstNameError = firstNameInput.$$x(".//div[@class='ant-form-item-explain-error']");

    private final SelenideElement phoneNumberLabel = $x("//label[@title='Телефон']");
    private final SelenideElement phoneNumberInput = $x("//input[@id='phone']");
    private final SelenideElement phoneNumberInputPrefix = $x("//span[@input='ant-input-prefix']");
    private final SelenideElement phoneIcon = $x("//span[@aria-label='phone']");
    private final ElementsCollection phoneNumberError = phoneNumberInput.$$x(".//div[@class='ant-form-item-explain-error']");

    private final SelenideElement emailLabel = $x("//label[@title='Email']");
    private final SelenideElement emailInput = $x("//input[@id='email']");
    private final SelenideElement emailIcon = $x("//span[@aria-label='mail']");
    private final ElementsCollection emailError = emailInput.$$x("//div[@class='ant-form-item-explain-error']");

    private final SelenideElement passwordLabel = $x("//label[@title='Пароль']");
    private final SelenideElement passwordInput = $x("//input[@id='password']");
    private final ElementsCollection passwordError = passwordInput.$$x("//div[@class='ant-form-item-explain-error']");
    private final SelenideElement passwordEyeToggle = $x("//span[@aria-label='phone']");

    private final SelenideElement confirmPasswordLabel = $x("//label[@title='Підтвердження паролю']");
    private final SelenideElement confirmPasswordInput = $x("//input[@id='confirm']");
    private final ElementsCollection confirmPasswordError = confirmPasswordInput.$$x("//div[@class='ant-form-item-explain-error']\"");
    private final SelenideElement confirmPasswordEyeToggle = confirmPasswordInput.$x("//div[@class='ant-form-item-explain-error']");

    private final SelenideElement registerBtn = $x("");

    public String getTitleText(){
        return title.getText();
    }

    public SelenideElement getRegIcons(){
        return $x("//div[@class='items-active']");
    }

    public String getTitleText2(){
        return getTitle().text();
    }







}
