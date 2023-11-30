package com.softserveinc.speakukrainian.visitor;

import com.softserveinc.speakukrainian.pageobjects.components.Header;
import com.softserveinc.speakukrainian.pageobjects.components.addCenterVisitor.AddCenterMainInformationModal;
import com.softserveinc.speakukrainian.utils.TestRunnerWithVisitor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddCenterModalTest extends TestRunnerWithVisitor {

    @Test(description = "TUA-252 [Center] Verify that error messages is displayed after user leaves fields empty and " +
            "clicks 'Наступний крок' button on 'Основна інформація' tab")
    public void verifyErrorMessagesDisplayedAfterUserLeavesFieldsEmptyAndClicksNextButtonOnAddCenterModal() {
        AddCenterMainInformationModal addCenterMainInformationModal = new Header()
                .openProfileMenu()
                .openMyProfilePage()
                .addCenter();
        addCenterMainInformationModal.clickNextStepButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(addCenterMainInformationModal
                .getInputNameOfCenterErrorText(), "Некоректна назва центру");
        softAssert.assertEquals(addCenterMainInformationModal.getCreatedLocationErrorText(),
                "Додайте і виберіть локацію");
        softAssert.assertAll();
    }

}
