package com.softserveinc.speakukrainian.pageobjects.homePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ChallengeComponent extends HomePageGuest {

    public static final SelenideElement CHALLENGE_BLOCK = $x("//div[@class='about-challenge']");

    public SelenideElement getChallengeBlock(){
        return CHALLENGE_BLOCK;
    }
    public SelenideElement getChallengeTitle() {
        return getChallengeBlock().$x(".//h2");
    }

    public String  getChallengeTitleText() {
        return getChallengeTitle().getText();
    }

    public SelenideElement  getChallengeDescription() {
        return getChallengeBlock().$x(".//span[@class='text']");
    }

    public String   getChallengeDescriptionText() {
        return getChallengeDescription().getText();
    }

    public SelenideElement  getChallengeLearnMoreBtn() {
        return getChallengeBlock().$x(".//button");
    }

    public String getChallengeLearnMoreBtnText() {
        return getChallengeLearnMoreBtn().getText();
    }

    public ChallengePage clickChallengeLearnMoreBtn() {
        getChallengeLearnMoreBtn().click();
        return new ChallengePage();
    }
}
