package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.elements.Checkbox;

import static com.codeborne.selenide.Selenide.*;

public class AdvancedSearch extends Checkbox {
    private final SelenideElement title = $("div.club-list-label");
    private final SelenideElement ageInput =$x("//*[@id=\"basic_age\"]/div/div[2]/input");
    private final SelenideElement remoteCheckbox = $x("//*[@id=\"basic_isOnline\"]/label/span[1]");
    private final SelenideElement remoteCheckboxName = $x("//*[@id=\"basic_isOnline\"]/label/span[2]");
    private final SelenideElement remoteTitle = $x("//*[@id=\"basic\"]/span[5]");

    public String getTitleText(){
        return title.text();
    }

    public String getRemoteCheckboxText(){
        return remoteCheckboxName.text();
    }

    public void clickOnRemoteCheckbox(){
        remoteCheckbox.click();
    }


    public SelenideElement setAgeInput(int age){
        return ageInput.setValue(String.valueOf(age)).pressEnter();
    }

}
