package com.trycloud.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.Format;

public class TalkPagePOM {

    @FindBy(xpath = "(//div[@class='select2-search'])[2]/input")
    public WebElement InputSearchBoxInTalk;

    @FindBy(xpath = "(//div[@class='select2-search'])[2]/input")
    public WebElement NexConversationText;//in order to send keys to InputSearchBoxInTalk first you need to click to this element

    String xpathForUsers ="select2-result-label-%s";




}
