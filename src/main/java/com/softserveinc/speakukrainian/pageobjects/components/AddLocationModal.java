package com.softserveinc.speakukrainian.pageobjects.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;


import static com.codeborne.selenide.Selenide.*;

@Getter
public class AddLocationModal extends AddClubModal{

    private final SelenideElement CloseBtn = $x("/html/body/div[7]/div/div[2]/div/div[2]/button");
    private final SelenideElement Title = $x("//div[contains(text(), 'Додати локацію')]");
    private final SelenideElement LocationName = $x("//*[@id=\"name\"]");
    private final SelenideElement CityName = $x("//*[@id=\"cityName\"]");
    private final SelenideElement DistrictName = $x("//*[@id=\"districtName\"]");
    private final SelenideElement StationName = $x("//*[@id=\"stationName\"]");
    private final SelenideElement AddressName = $x("//*[@id=\"address\"]");
    private final SelenideElement Coordinates = $x("//*[@id=\"coordinates\"]");
    private final SelenideElement PhoneNumber = $x("//*[@id=\"phone\"]");
    private final SelenideElement AddBtn = $x("//button[@type=\"submit\"]/span[contains(text(), 'Додати')]");
    private final ElementsCollection CheckCircle = $$x("//span[@aria-label=\"check-circle\"]");
    private final ElementsCollection ListLocationName = $$x("//div[@class=\"rc-virtual-list-holder-inner\"]/div");
    private final ElementsCollection ListDistrictName = $$x("//div[@class=\"rc-virtual-list-holder-inner\"]/div");
    private final SelenideElement FieldCityName = $x("//div[1]/div/div/div/div/div/div/div/span[2]");
    private final SelenideElement FieldDistrictName = $x("//div[2]/div/div/div/div/div/div/div/span[2]");

    public String getTitleText(){
        return Title.getText();
    }
    public AddLocationModal setLocationName(String text){
        LocationName.setValue(text);
        return this;
    }

    public AddLocationModal pickCityName(int index){
        clickAndPickFromList(CityName, ListLocationName, index);
        return this;
    }

    public String getCurrentCityName(){
        return FieldCityName.getText();
    }
    public String getCurrentDistrictName(){
        return FieldDistrictName.getText();
    }

    public AddLocationModal pickDistrictName(int index){
        clickAndPickFromList(DistrictName, ListDistrictName, index);
        return this;
    }

    public AddLocationModal pickStationName(){
        /*
        If you select an element from ListDistrictName, all elements from ListStationName disappear,
        so you need to specify one thing in the tests
         */
        StationName.click();
        return this;
    }

    public AddLocationModal setAddressName(String text){
        AddressName.setValue(text);
        return this;
    }

    public AddLocationModal setCoordinates(String text){
        Coordinates.setValue(text);
        return this;
    }

    public AddLocationModal setPhoneNumber(String number){
        PhoneNumber.setValue(number);
        return this;
    }

    public void  clickAddBtn(){
        AddBtn.click();
    }

    private void clickAndPickFromList(SelenideElement dropdown, ElementsCollection list, int index){
        dropdown.click();
        if (index >= 0 && index < list.size()){
            list.get(index).click();
        }
    }

}
