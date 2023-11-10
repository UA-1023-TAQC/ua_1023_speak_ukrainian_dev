package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
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
    private final SelenideElement checkCircleElement = $x("//span[@aria-label='check-circle']");
    private final SelenideElement closeCircleElement = $x("//span[@aria-label='close-circle']");

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

    public LoginModal setEmailInput(String email){
        email_input.sendKeys(email);
        return this;
    }

    public LoginModal setPasswordInput(String password){
        password_input.sendKeys(password);
        return this;
    }

    public LoginModal clickEyeBtn(){
        eye_label.click();
        return this;
    }

    public UserHomePage clickSubmitBtn(){
        submitBtn.click();
        return new UserHomePage();
    }

    public ResetPasswordModal clickForgotPassword(){
        forgot_password.click();
        return new ResetPasswordModal();
    }

    public boolean checkCircleElementDisplayed(){
        return checkCircleElement.isDisplayed();
    }

    public boolean checkCloseElementDisplayed(){
        return closeCircleElement.isDisplayed();
    }

}
