package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ChallengeDayCarousel {

    private final SelenideElement challengeDayCarousel = $("div.challenge-day-carousel");
    private final SelenideElement challengeDayHeader = $("div.challenge-day-header");
    private final SelenideElement challengeDayBlock = $("div.challenge-day-block");
    private final SelenideElement challengeDaySlide = $("div.slick-slide");
    private final SelenideElement challengeDayCard = $("div.primitive-card");
    private final SelenideElement challengeDayCardName = $("div.primitive-card div.name");
    private final SelenideElement rightArrow = $("span.arrows-next");
    private final SelenideElement leftArrow = $("span.arrows-prev");

    public void moveForward(int times){
        for (int i = 0; i < times; i++) {
            rightArrow.click();
        }
    }

    public void moveBackward(int times){
        for (int i = 0; i < times; i++) {
            leftArrow.click();
        }
    }

    public TaskPage viewTask(){
        challengeDayCard.click();
        return new TaskPage();
    }
}
