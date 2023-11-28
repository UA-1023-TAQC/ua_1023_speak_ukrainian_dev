package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class AddClubModal {

    private final SelenideElement CloseBtn = $x("/html/body/div[6]/div/div[2]/div/div[2]/button");
    private final SelenideElement title = $x("//div[contains(text(), 'Додати гурток')]");
    private final SelenideElement ClubName = $x("//input[@id='basic_name']");
    private final ElementsCollection Categories = $$x("//div[@id='basic_categories']/label");
    private final SelenideElement InputAgeFrom = $x("//input[@id='basic_ageFrom']");
    private final SelenideElement IncreaseAgeFromBtn = $x("//*[@id=\"basic\"]/div[3]/div/div/div/div/span/div[1]/div/div/div/div/div/div[1]/span[1]");
    private final SelenideElement DecreaseAgeFromBtn = $x("//*[@id=\"basic\"]/div[3]/div/div/div/div/span/div[1]/div/div/div/div/div/div[1]/span[2]");
    private final SelenideElement InputAgeTo = $x("//input[@id=\"basic_ageTo\"]");
    private final SelenideElement IncreaseAgeToBtn = $x("//*[@id=\"basic\"]/div[3]/div/div/div/div/span/div[2]/div/div/div/div/div/div[1]/span[1]");
    private final SelenideElement DecreaseAgeToBtn = $x("//*[@id=\"basic\"]/div[3]/div/div/div/div/span/div[2]/div/div/div/div/div/div[1]/span[2]");
    private final SelenideElement CenterName = $x("//input[@id='basic_centerId']");
    private final ElementsCollection ListCenterName = $$("//div[@class='rc-virtual-list-holder-inner']/div");
    private final SelenideElement NextStepBtn = $x("//span[contains(text(), 'Наступний крок')]");
    private final SelenideElement AddLocation = $x("//span[contains(text(), 'Додати локацію')]");
    private final SelenideElement ToggleBtn = $x("//button[@class='ant-switch css-13usanc ant-switch-checked']");
    private final ElementsCollection Workday = $$("//div[@id=\"basic_workDay\"]/div");
    private final SelenideElement InputTimeFrom = $x(".//div[1]/input[@placeholder='HH:mm']");
    private final SelenideElement InputTimeTo = $x(".//div[3]/input[@placeholder='HH:mm']");
    private final ElementsCollection HourTime= $$("//ul[@class=\"ant-picker-time-panel-column\"][1]/li");
    private final ElementsCollection MinutesTime = $$("//ul[@class=\"ant-picker-time-panel-column\"][2]/li");
    private final SelenideElement ContactPhoneNumber = $x("//input[@id=\"basic_contactТелефон\"]");
    private final SelenideElement ContactFacebook = $x("//input[@id=\"basic_contactFacebook\"]");
    private final SelenideElement ContactWhatsApp = $x("//input[@id=\"basic_contactWhatsApp\"]");
    private final SelenideElement ContactMail = $x("//input[@id=\"basic_contactПошта\"]");
    private final SelenideElement ContactSkype = $x("//input[@id=\"basic_contactSkype\"]");
    private final SelenideElement ContactSite = $x("//input[@id=\"basic_contactSite\"]");
    private final SelenideElement BackBtn = $x("//span[contains(text(), 'Назад')]");
    private final SelenideElement DownloadLogo = $x("//span[contains(text(), 'Завантажити лого')]");
    private final SelenideElement DownloadCoverArt = $x("//span[contains(text(), 'Завантажити обкладинку')]");
    private final SelenideElement AddGallery = $x("//*[@id=\"basic\"]/div[3]/div/div/div/div/span/div/div/span");
    private final SelenideElement Description = $x("//textarea[@id='basic_description']");
    private final SelenideElement Complete = $x("//*[@id=\"basic\"]/div[5]/button[2]");
    private final ElementsCollection ErrorMessagesAboutDescription = $$x("//div[@class='ant-form-item-explain-error']");
    private final SelenideElement CurrentLocation = $x("//*[@id=\"basic\"]/div[1]/div/div/div/div/div/div/div/ul/li/div/div/h4");

    public void clickCloseBtn(){
        CloseBtn.click();
    }

    public String getTitleText(){
        return title.getText();
    }

    public AddClubModal setClubName(String text){
        ClubName.setValue(text);
        return this;
    }

    public AddClubModal selectCategory(int index){
        if (index > 0 && index < Categories.size()){
            Categories.get(index).click();
        }
        return this;
    }

    public AddClubModal setInputAgeFrom(int age){
        InputAgeFrom.setValue(String.valueOf(age));
        return this;
    }

    private enum AgeAction{
        INCREASE,
        DECREASE
    }

    public AddClubModal clickAgeFromBtn(AgeAction action){
        SelenideElement ageBtn = (action == AgeAction.DECREASE) ? DecreaseAgeFromBtn : IncreaseAgeFromBtn;
        ageBtn.click();
        return this;
    }

    public AddClubModal setInputAgeTo(int age){
        InputAgeTo.setValue(String.valueOf(age));
        return this;
    }

    public AddClubModal clickAgeToBtn(AgeAction action){
        SelenideElement ageBtn = (action == AgeAction.INCREASE) ? IncreaseAgeToBtn : DecreaseAgeToBtn;
        ageBtn.click();
        return this;
    }

    public ElementsCollection clickCenterName(){
        CenterName.click();
        return ListCenterName;
    }

    public AddClubModal clickListCenterName(int index){
        if (index >= 0 && index < ListCenterName.size()){
            SelenideElement center = ListCenterName.get(index);
            center.shouldBe(visible, Duration.ofSeconds(1)).click();
        }
        return this;
    }

    public AddClubModal clickNextStepBtn(){
        NextStepBtn.click();
        return this;
    }

    public AddLocationModal clickAddLocation(){
        AddLocation.click();
        return new AddLocationModal();
    }

    public AddClubModal clickToggleBtn(){
        ToggleBtn.click();
        return this;
    }

    public AddClubModal selectWorkdayByInput(int index, String timeFrom, String timeTo){
        if (index >= 0 && index < Workday.size()){
            SelenideElement selectedWorkday = Workday.get(index);
            selectedWorkday.click();

            SelenideElement selectedInputTimeFrom = selectedWorkday.$(".//div[1]/input[@placeholder='HH:mm']");
            SelenideElement selectedInputTimeTo = selectedWorkday.$(".//div[3]/input[@placeholder='HH:mm']");
            if (selectedInputTimeFrom.exists() && timeFrom != null){
                selectedInputTimeFrom.setValue(timeFrom);
            }
            if (selectedInputTimeTo.exists() && timeTo != null) {
                selectedInputTimeTo.setValue(timeTo);
            }
        }
        return this;
    }

    public AddClubModal selectWorkdayByBtn(int index, int indexHourTime, int indexMinutesTime){
        if (index >= 0 && index < Workday.size()){
            SelenideElement selectedWorkday = Workday.get(index);
            selectedWorkday.click();

            SelenideElement selectedInputTimeFrom = selectedWorkday.$(".//div[1]/input[@placeholder='HH:mm']");
            selectedInputTimeFrom.click();
            SpecifyingAppropriateTime(indexHourTime, indexMinutesTime);
            SpecifyingAppropriateTime(indexHourTime, indexMinutesTime);
        }
        return this;
    }

    public void SpecifyingAppropriateTime(int indexHourTime, int indexMinutesTime){
        if (indexHourTime >= 0 && indexHourTime < HourTime.size()){
            HourTime.get(indexHourTime).click();
        }
        if (indexMinutesTime >= 0 && indexMinutesTime < MinutesTime.size()){
            MinutesTime.get(indexMinutesTime).click();
        }
    }

    public AddClubModal setContactPhoneNumber(String number){
        ContactPhoneNumber.setValue(number);
        return this;
    }

    public AddClubModal setContactFacebook(String text){
        ContactFacebook.setValue(text);
        return this;
    }

    public AddClubModal setContactWhatsApp(String text){
        ContactWhatsApp.setValue(text);
        return this;
    }

    public AddClubModal setContactMail(String email){
        ContactWhatsApp.setValue(email);
        return this;
    }

    public AddClubModal setContactSkype(String text){
        ContactWhatsApp.setValue(text);
        return this;
    }

    public AddClubModal setContactSite(String text){
        ContactSite.setValue(text);
        return this;
    }

    public AddClubModal clickBackBtn(){
        BackBtn.click();
        return this;
    }

    public AddClubModal clickDownloadLogo(String filePath){
        DownloadLogo.click();
        SelenideElement input = $x("//input[@id=\"basic_urlLogo\"]");
        input.uploadFile(new File(filePath));
        return this;
    }

    public AddClubModal clickDownloadCoverArt(String filePath){
        DownloadCoverArt.click();
        SelenideElement input = $x("//input[@id=\"basic_urlBackground\"]");
        input.uploadFile(new File(filePath));
        return this;
    }

    public AddClubModal clickAddGallery(String filePath){
        AddGallery.click();
        SelenideElement input = $x("//*[@id=\"basic\"]/div[3]/div/div/div/div/span/div/div/span/input");
        input.uploadFile(new File(filePath));
        return this;
    }

    public AddClubModal setDescription(String text){
        Description.setValue(text);
        return this;
    }

    public void clickComplete(){
        Complete.click();
    }

    public String[] getStrErrorMessagesAboutDescription(){
        String[] msgs = new String[2];
            msgs[0]= ErrorMessagesAboutDescription.get(0).getText();
            msgs[1]= ErrorMessagesAboutDescription.get(1).getText();
        return  msgs;
    }


}
