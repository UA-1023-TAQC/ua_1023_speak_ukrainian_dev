package com.softserveinc.speakukrainian.pageobjects;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.softserveinc.speakukrainian.pageobjects.components.Header;

public class ClubsPage {
    private final Header header = new Header();
    private final ElementsCollection clubsName = Selenide.$$x("//div[@class=\"title\"]/div[@class=\"name\"]");
    private final ElementsCollection clubsTag = Selenide.$$x("//span[@class=\"ant-tag tag css-ff6qag\"]//span[@class=\"name\"]");
    private final ElementsCollection clubsDesc = Selenide.$$x("//div[@class=\"ant-card-body\"]/p[@class=\"description\"]");
    private final ElementsCollection clubsAddress = Selenide.$$x("//div[@class=\"address\"]/span[@class=\"oneAddress\"]");
    private final ElementsCollection clubsDetails = Selenide.$$x("//div[@class=\"ant-card-body\"]/a[@class=\"ant-btn css-ff6qag ant-btn-default outlined-button details-button\"]");

    public String getSideBarClubNameByIndex(int index) {
        String clubs = "";
        if (index >= 0 && index < clubsName.size()) {
            clubs = clubsName.get(index).getText();
        }
        return clubs;
    }

    public String getClubsTagByIndex(int index) {
        String tag = "";
        if (index >= 0 && index < clubsTag.size()) {
            tag = clubsTag.get(index).getText();
        }
        return tag;
    }

    public String getClubsDescByIndex(int index) {
        String desc = "";
        if (index >= 0 && index < clubsDesc.size()) {
            desc = clubsDesc.get(index).getText();
        }
        return desc;
    }

    public String getClubsAddressByIndex(int index) {
        String address = "";
        if (index >= 0 && index < clubsAddress.size()) {
            address = clubsAddress.get(index).getText();
        }
        return address;
    }

}


