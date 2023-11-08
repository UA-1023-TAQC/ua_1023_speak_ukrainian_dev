package com.softserveinc.speakukrainian.pageobjects.components;

import com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class Header {
    public ClubsPage openClubsPage(){
        $x("//*[@id=\"root\"]/div/header/div[2]/ul/li[1]/span[2]/a").click();
        return new ClubsPage();
    }
    public GuestProfileMenu openGuestProfileMenu(){
        $x("//div[contains(@class,'user-profile')]").click();
        return new GuestProfileMenu();
    }
}
