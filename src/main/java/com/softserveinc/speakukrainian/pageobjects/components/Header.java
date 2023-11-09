package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage;
import lombok.Getter;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class Header {

    private final SelenideElement logo = $x("//header//div[@class='logo']");
    private final SelenideElement clubs = $x("//header//div[@class='center-side']/ul/li[1]/span[2]/a");
    private final SelenideElement challenge = $x("//header//span[@class='challenge-text']");
    private final SelenideElement news = $x("//header//div[@class='center-side']/ul/li[3]/span[2]/a");
    private final SelenideElement about = $x("//header//div[@class='center-side']/ul/li[4]/span[2]/a");
    private final SelenideElement servicesInUkrainian = $x("//header//div[@class='center-side']/ul/li[5]/span[2]/a");
    private final SelenideElement city = $x("//header//div[@class='right-side-menu']/div[contains(@class,'city')]/span");
    private final SelenideElement addClub = $x("//header//div[@class='right-side-menu']/button[contains(@class,'add-club-button')]/span");
    private final SelenideElement userProfile = $x("//header//div[@class='right-side-menu']/div[contains(@class,'user-profile')]");

    public ClubsPage openClubsPage(){
        clubs.click();
        return new ClubsPage();
    }

    public NewsPage openNewsPage(){
        news.click();
        return new NewsPage();
    }

    public AboutPage openAboutPage(){
        about.click();
        return new AboutPage();
    }

    public ServicesInUkrainianPage openServicesInUkrainianPage(){
        servicesInUkrainian.click();
        return new ServicesInUkrainianPage();
    }

    public GuestProfileMenu openGuestProfileMenu(){
        $x("//div[contains(@class,'user-profile')]").click();
        return new GuestProfileMenu();
    }

    public String getLogoURL(){
        return logo.$x("/parent::a").getAttribute("href");
    }
}
