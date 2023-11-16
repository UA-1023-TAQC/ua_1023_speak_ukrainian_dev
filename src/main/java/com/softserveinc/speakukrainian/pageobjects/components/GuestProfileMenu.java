package com.softserveinc.speakukrainian.pageobjects.components;

import com.softserveinc.speakukrainian.pageobjects.components.RegistrationModal.RegistrationModal;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class GuestProfileMenu {

    public LoginModal openLogin(){
        $x("//div[contains(text(),'Увійти')]").click();
        $x("//div[contains(@class,'modal-login')]").shouldBe(visible, Duration.ofSeconds(5));
        return new LoginModal();
    }

    public RegistrationModal openRegister(){
        $x("//div[contains(text(),'Зареєструватися')]").click();
        $x("//div[contains(@class,'modal-registration')]").shouldBe(visible, Duration.ofSeconds(5));
        return new RegistrationModal();
    }
}
