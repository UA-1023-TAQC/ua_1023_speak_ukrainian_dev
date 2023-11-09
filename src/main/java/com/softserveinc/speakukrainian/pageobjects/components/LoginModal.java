package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginModal {

    private final SelenideElement closeBtn = $x("//span[@aria-label='close']");
    private final SelenideElement login_header = $x("//div[@class='login-header']");
    private final SelenideElement login_using_google = $x("//a[contains(@href, 'google')]");
    private final SelenideElement login_using_facebook = $x("//a[contains(@href, 'authorize/facebook')]");
    private final SelenideElement email_input = $x("//input[@id='basic_email']");
    private final SelenideElement password_input = $x("//input[@id='basic_password']");
    private final SelenideElement eye_label = $x("//span[@aria-label='eye']");
    private final SelenideElement submitBtn = $x("//button[@type='submit']");
    private final SelenideElement forgot_password = $x("//a[@class='restore-password-button']");

    public void clickCloseBtn(){
        closeBtn.click();
    }

    public String getTextHeader(){
        return login_header.getText();
    }

    public GoogleLogin clickLoginGoogle(){
        login_using_google.click();
        return new GoogleLogin();
    }

    public FacebookLogin clickLoginFacebook(){
        login_using_facebook.click();
        return new FacebookLogin();
    }

    public void setEmailInput(String text){
        email_input.sendKeys(text);
    }

    public void setPasswordInput(String text){
        password_input.sendKeys(text);
    }

    public void clickEyeBtn(){
        eye_label.click();
    }

    public UserHomePage clickSubmitBtn(){
        submitBtn.click();
        return new UserHomePage();
    }

    public ResetPasswordModal clickForgotPassword(){
        forgot_password.click();
        return new ResetPasswordModal();
    }

}
