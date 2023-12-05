package com.softserveinc.speakukrainian.ui.guest;

import com.softserveinc.speakukrainian.pageobjects.components.AddClubModal;
import com.softserveinc.speakukrainian.pageobjects.components.AddLocationModal;
import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.utils.PropertyUtil;
import com.softserveinc.speakukrainian.utils.TestRunner;
import com.softserveinc.speakukrainian.utils.jdbc.entity.ClubEntity;
import com.softserveinc.speakukrainian.utils.jdbc.services.ClubService;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.text.SimpleDateFormat;
import java.util.List;

public class AddClubTest extends TestRunner {

    ClubService clubService= new ClubService();
    @Test
    public void verifyThatDirectorCanAddLocationOfClub() {
        homePage
                .getHeader()
                .openGuestProfileMenu()
                .openLogin()
                .setEmailInput(PropertyUtil.getDirectorEmail())
                .setPasswordInput(PropertyUtil.getDirectorPassword())
                .clickSubmitBtn();
        SoftAssert softAssert = new SoftAssert();
        String name = "Number"+ new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        List<ClubEntity> clubs = clubService.getAllByName(name);
        softAssert.assertEquals(clubs.size(), 0);
        AddClubModal addClub = new Header()
                .openProfileMenu()
                .openAddClubModal()
                .setClubName(name)
                .selectCategory(2)
                .setInputAgeFrom(10)
                .setInputAgeTo(15)
                .clickNextStepBtn();

        AddLocationModal addLocation = new AddLocationModal().clickAddLocation();



        softAssert.assertEquals(addLocation.getTitleText(), "Додати локацію");
        addLocation.setLocationName("ЧислаNumbers12345=/*()_:;#%^?[]");
        addLocation.pickCityName(0)
                .pickDistrictName(0);
        softAssert.assertEquals(addLocation.getCurrentCityName(), "Київ");
        softAssert.assertEquals(addLocation.getCurrentDistrictName(), "Деснянський");
        addLocation.pickStationName()
                .setAddressName("ЧислаNumbers.,/-")
                .setCoordinates("49.829104498711104, 24.005058710351314")
                .setPhoneNumber("0972222222");
        softAssert.assertEquals(addLocation.getCheckCircle().size(), 6);
        addLocation.clickAddBtn();
        AddClubModal clubModal = new AddClubModal();
        softAssert.assertEquals(clubModal.getCurrentLocation().getText(), "ЧислаNumbers12345=/*()_:;#%^?[]");
        addLocation.setContactPhoneNumber("0972222222")
                .clickNextStepBtn()
                .setDescription("ЧислаNumbers12345!\"#$%&'()*+,-./:;<=>?@[]^_`{}~")
                .clickComplete();
        clubs = clubService.getAllByName(name);
        softAssert.assertEquals(clubs.size(), 1);
        softAssert.assertAll();

    }

}
