package com.softserveinc.speakukrainian.pageobjects.challenges;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.softserveinc.speakukrainian.pageobjects.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class TaskPage extends BasePage {

    private final SelenideElement taskTitle = $("div.task-header");
    private final SelenideElement taskImage = $("img.task-image");
    private final SelenideElement taskHeaderText = $("div.header-content div.task-text");
    private final SelenideElement taskContentText = $("div.task-content div.task-text");
    private final ElementsCollection taskLinks = $$("div.task-text a");


}
