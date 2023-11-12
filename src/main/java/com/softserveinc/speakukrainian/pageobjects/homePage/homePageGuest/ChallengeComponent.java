package com.softserveinc.speakukrainian.pageobjects.homePage.homePageGuest;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.homePage.homePageGuest.BaseHomePageGuest;
import lombok.Getter;

@Getter
public class ChallengeComponent extends BaseHomePageGuest {

    public SelenideElement getChallengeImg() {
        SelenideElement challengeImg = getChallengeBlock().$x(".//img");
        return challengeImg;
    }

    public SelenideElement getChallengeTitle() {
        SelenideElement challengeTitle = getChallengeBlock().$x(".//h2");
        return challengeTitle;
    }

    public String  getChallengeTitleText() {
        return getChallengeTitle().getText();
    }

    public SelenideElement  getChallengeDescription() {
        SelenideElement challengeDescription = getChallengeBlock().$x(".//span[@class='text']");
        return challengeDescription;
    }

    public String   getChallengeDescriptionText() {
        return getChallengeDescription().getText();
    }

    public SelenideElement  getChallengeLearnMoreBtn() {
        SelenideElement learnMoreBtn = getChallengeBlock().$x(".//button");
        return learnMoreBtn;
    }

    public String getChallengeLearnMoreBtnText() {
        return getChallengeLearnMoreBtn().getText();
    }

    public ChallengePage clickChallengeLearnMoreBtn() {
        getChallengeLearnMoreBtn().click();
        return new ChallengePage();
    }


}
