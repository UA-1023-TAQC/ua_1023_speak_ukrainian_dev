package com.softserveinc.speakukrainian.pageobjects.ClubsPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddChildModal extends SignUpForClubModal {
    public static final SelenideElement MALE = $x("//input[@value='MALE']");
    public static final SelenideElement FEMALE = $x("//input[@value='FEMALE']");
    public static final SelenideElement INPUT_NAME = $("#add-child_firstName");
    public static final SelenideElement INPUT_LAST_NAME = $("#add-child_firstName");
    public static final SelenideElement INPUT_AGE = $("#add-child_firstName");

    public static final SelenideElement ADD_BUTTON =
            $x("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/div/form/div[5]/div/div/div/div/button");
    public static final SelenideElement CLOSE_BUTTON =
            $x("/html/body/div[6]/div/div[2]/div/div[2]/button");

    public SelenideElement getModalTitle() {
        return TITLE_MODAL;
    }

    public String getModalTitleText() {
        return getModalTitle().getText();
    }


    /**
     * The method returns the title of each input field of the modal window
     *
     * @param textInputTitle text contained in the title of input
     * @return xpath defined with the specified text in title of input
     */
    public String getInputTitle(String textInputTitle) {
        return $x("//label[contains(text(), '" + textInputTitle + "')]").getText();
    }

    /**
     * The method returns the error message of each input field of the modal window
     *
     * @param textError text error message of input
     * @return xpath defined with the specified text error message of input
     */
    public String getErrorText(String textError) {
        return $x("//div[contains(text(), '" + textError + "')]").getText();
    }


    public AddChildModal setLastName(String text) {
        INPUT_LAST_NAME.shouldBe(empty).setValue(text).shouldHave(value(text));
        return this;
    }

    public AddChildModal setName(String text) {
        INPUT_NAME.shouldBe(empty).setValue(text).shouldHave(value(text));
        return this;
    }


    public AddChildModal setAge(String text) {
        INPUT_AGE.shouldBe(empty).setValue(text).shouldHave(value(text));
        return this;
    }

    public SelenideElement getMale() {
        return MALE;
    }

    public String getMaleText() {
        return getMale().getText();
    }

    public AddChildModal clickMale() {
        getMale().click();
        return this;
    }

    public SelenideElement getFemale() {
        return FEMALE;
    }

    public String getFemaleText() {
        return getFemale().getText();
    }

    public AddChildModal clickFemale() {
        getFemale().click();
        return this;
    }


    public SelenideElement getAddButton() {
        return ADD_BUTTON;
    }

    public String getAddButtonText() {
        return getAddButton().getText();
    }

    public ClubDetailPage clickAddButton() {
        getAddButton().click();
        return new ClubDetailPage();
    }

    public ClubDetailPage clickCloseButton() {
        CLOSE_BUTTON.click();
        return new ClubDetailPage();
    }

}
