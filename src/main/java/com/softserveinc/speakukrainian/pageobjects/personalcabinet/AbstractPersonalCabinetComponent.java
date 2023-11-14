package com.softserveinc.speakukrainian.pageobjects.personalcabinet;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public abstract class AbstractPersonalCabinetComponent {

    protected final SelenideElement profileLink = $x("//li[contains(@data-menu-id, 'profile')]//a");
    protected final SelenideElement messagesLink = $x("//li[contains(@data-menu-id, 'messages')]//a");
    protected final SelenideElement complaintsLink = $x("//li[contains(@data-menu-id, 'complaints')]//a");
    protected final SelenideElement certificatesLink = $x("//li[contains(@data-menu-id, 'certificates')]//a");

    public MyProfilePage openMyProfilePage(){
        profileLink.click();
        return new MyProfilePage();
    }

    public MessagesPage openMessagesPage(){
        messagesLink.click();
        return new MessagesPage();
    }
    public ComplaintsPage openComplaintsPage(){
        complaintsLink.click();
        return new ComplaintsPage();
    }

    public CertificatesPage openCertificatesPage(){
        certificatesLink.click();
        return new CertificatesPage();
    }

}
