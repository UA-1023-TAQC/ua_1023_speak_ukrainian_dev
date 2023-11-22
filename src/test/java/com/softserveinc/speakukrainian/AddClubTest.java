package com.softserveinc.speakukrainian;

import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.components.AddLocationModal;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.utils.PropertyUtil;
import com.softserveinc.speakukrainian.utils.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddClubTest extends TestRunner {

    @Test
    public void verifyThatDirectorCanAddLocationOfClub() {
        homePage
                .getHeader()
                .openGuestProfileMenu()
                .openLogin()
                .setEmailInput(PropertyUtil.getDirectorEmail())
                .setPasswordInput(PropertyUtil.getDirectorPassword())
                .clickSubmitBtn();

        AddClubModal addClub = new Header()
                .openProfileMenu()
                .openAddClubModal()
                .setClubName("Number")
                .selectCategory(2)
                .setInputAgeFrom(10)
                .setInputAgeTo(15)
                .clickNextStepBtn();

        AddLocationModal addLocation = new AddLocationModal().clickAddLocation();
        Assert.assertEquals(addLocation.getTitleText(), "Додати локацію");
        addLocation.setLocationName("ЧислаNumbers12345=/*()_:;#%^?[]");
        Assert.assertEquals(addLocation.getCheckCircle().size(), 2);
        addLocation.pickCityName(0)
                .pickDistrictName(0);
        Assert.assertEquals(addLocation.getCurrentCityName(), "Київ");
        Assert.assertEquals(addLocation.getCurrentDistrictName(), "Деснянський");
        addLocation.pickStationName()
                .setAddressName("ЧислаNumbers.,/-")
                .setCoordinates("49.829104498711104, 24.005058710351314")
                .setPhoneNumber("0972222222")
                .clickAddBtn();
        AddClubModal clubModal = new AddClubModal();
        Assert.assertEquals(clubModal.getCurrentLocation().getText(), "ЧислаNumbers12345=/*()_:;#%^?[]");
        addLocation.setContactPhoneNumber("0972222222")
                .clickNextStepBtn()
                .setDescription("ЧислаNumbers12345!\"#$%&'()*+,-./:;<=>?@[]^_`{}~")
                .clickComplete();


    }

}
