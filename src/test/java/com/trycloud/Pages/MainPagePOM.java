package com.trycloud.Pages;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPagePOM extends TestBase {



    @FindBy(xpath = "//ul[@id='appmenu']/li[1]")
    WebElement buttonFile;
    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    WebElement buttonActivity;
    @FindBy(xpath = "//ul[@id='appmenu']/li[3]")
    WebElement buttonGallery;
    @FindBy(xpath = "//ul[@id='appmenu']/li[4]")
    WebElement buttonTalk;
    @FindBy(xpath = "//ul[@id='appmenu']/li[5]")
    WebElement buttonCalendar;
    @FindBy(xpath = "//ul[@id='appmenu']/li[6]")
    WebElement buttonDeck;
    @FindBy(xpath = "//ul[@id='appmenu']/li[7]")
    WebElement buttonAnnouncement;

    public void ButtonActivityClick() {
        buttonActivity.click();
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return buttonActivity.getScreenshotAs(outputType);
    }
}
