package com.softserveinc.speakukrainian.pageobjects.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.CssClass;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$x;

public class Checkbox {
    private final SelenideElement checkboxName =$x("./span");
    private final SelenideElement checkboxInput =$x("//input[@type='checkbox']");

    public String getCheckboxName(){
        return checkboxName.text();
    }

    public void clickOnCheckbox(){
        checkboxInput.click();
    }

//    public  isChecked(){
//      //  return checkboxInput.parent().shouldHave().
//        $x("//input[@type='checkbox']").shouldHave();
//    } //Why is it not working?
}
//"ant-checkbox-checked"