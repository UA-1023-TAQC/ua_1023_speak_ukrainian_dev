package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.*;
import com.softserveinc.speakukrainian.pageobjects.AboutUsPage.AboutUsPage;
import com.softserveinc.speakukrainian.pageobjects.ClubsPage.ClubsPage;
import com.softserveinc.speakukrainian.pageobjects.news.NewsPage;
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
    private final SelenideElement city = $x("//header//div[contains(@class,'city')]/span");
    private final SelenideElement addClub = $x("//header//button[contains(@class,'add-club-button')]/span");
    private final SelenideElement addClubModal = $x("//div[contains(text(), 'Додати гурток')]/ancestor::div[@role='dialog']");
    private final SelenideElement userProfile = $x("//header//div[contains(@class,'user-profile')]");
    private final SelenideElement advancedSearchBtn = $x("//span[contains(@title,'Розширений пошук')]");

    public ClubsPage openClubsPage(){
        clubs.click();
        return new ClubsPage();
    }

    public ChallengeMenu openChallengeMenu(){
        challenge.click();
        return new ChallengeMenu();
    }

    public NewsPage openNewsPage(){
        news.click();
        return new NewsPage();
    }

    public AboutUsPage openAboutPage(){
        about.click();
        return new AboutUsPage();
    }

    public ServicesInUkrainianPage openServicesInUkrainianPage(){
        servicesInUkrainian.click();
        return new ServicesInUkrainianPage();
    }

    public CitiesMenu openCitiesMenu(){
        city.click();
        return new CitiesMenu();
    }

    public AddClubModal openAddClubModal(){
        addClub.click();
        addClubModal.shouldBe(visible, Duration.ofSeconds(2));
        return new AddClubModal();
    }

    public GuestProfileMenu openGuestProfileMenu(){
        userProfile.click();
        return new GuestProfileMenu();
    }

    public ProfileMenu openProfileMenu(){
        userProfile.click();
        return new ProfileMenu();
    }

    public String getLogoURL(){
        return logo.$x("/parent::a").getAttribute("href");
    }
}
