package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LoginModal {

    private final SelenideElement closeBtn = $x("//span[@aria-label='close']");
    private final SelenideElement loginHeader = $x("//div[@class='login-header']");
    private final SelenideElement loginUsingGoogle = $x("//a[contains(@href, 'google')]");
    private final SelenideElement loginUsingFacebook = $x("//a[contains(@href, 'authorize/facebook')]");
    private final SelenideElement emailInput = $x("//input[@id='basic_email']");
    private final SelenideElement passwordInput = $x("//input[@id='basic_password']");
    private final SelenideElement eyeLabel = $x("//span[@aria-label='eye']");
    private final SelenideElement submitBtn = $x("//button[@type='submit']");
    private final SelenideElement forgotPassword = $x("//a[@class='restore-password-button']");
    private final SelenideElement checkCircleElement = $x("//span[@aria-label='check-circle']");
    private final SelenideElement closeCircleElement = $x("//span[@aria-label='close-circle']");

    public void clickCloseBtn(){
        closeBtn.click();
    }

    public String getTextHeader(){
        return loginHeader.getText();
    }

    public GoogleLogin clickLoginGoogle(){
        loginUsingGoogle.click();
        return new GoogleLogin();
    }

    public FacebookLogin clickLoginFacebook(){
        loginUsingFacebook.click();
        return new FacebookLogin();
    }

    public LoginModal setEmailInput(String email){
        emailInput.sendKeys(email);
        return this;
    }

    public LoginModal setPasswordInput(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginModal clickEyeBtn(){
        eyeLabel.click();
        return this;
    }

    public UserHomePage clickSubmitBtn(){
        submitBtn.click();
        return new UserHomePage();
    }

    public ResetPasswordModal clickForgotPassword(){
        forgotPassword.click();
        return new ResetPasswordModal();
    }

    public boolean checkCircleElementDisplayed(){
        return checkCircleElement.isDisplayed();
    }

    public boolean checkCloseElementDisplayed(){
        return closeCircleElement.isDisplayed();
    }

}
