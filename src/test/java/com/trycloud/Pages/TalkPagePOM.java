package com.trycloud.Pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TalkPagePOM {
    public  String message = "sorry not sorry";

    @FindBy(xpath = "(//div[@class='select2-search'])[2]/input")
    public WebElement InputSearchBoxInTalk;

    @FindBy(xpath = "//div[@id='s2id_select-participants']/a")
    public WebElement NextConversationText;//in order to send keys to InputSearchBoxInTalk first you need to click to this element

    @FindBy(xpath = "//div[contains(@id,'select2-result-label-')]")//list for all users in the talk search box
    public List<WebElement> users;

    @FindBy(xpath = "//div[contains(@data-placeholder,'New message')]")
//when you click to a user the message box appears
    public WebElement newMessageBox;

    @FindBy(xpath = "//div[@class='message']")
    public List<WebElement> messages;

    public void sendingMessageThroughTalk(String user) {
        MainPagePOM mainPagePOM = new MainPagePOM();//for using the header I created the MainPagePOM object
        PageFactory.initElements(Driver.getDriver(), mainPagePOM);//initialized it
        mainPagePOM.buttonTalk.click();//click to talk
        BrowserUtils.sleep(3);
        PageFactory.initElements(Driver.getDriver(), this);// initliaze this pages elements

        NextConversationText.click();//click to search button
        InputSearchBoxInTalk.sendKeys(user);//search for a user

        BrowserUtils.sleep(3);
//        talkPagePOM.users.forEach(p->{
//            System.out.println(p.getText());
//        });
        users.get(0).click();//get the first one appears on the list

        BrowserUtils.sleep(3);


        newMessageBox.sendKeys(message + Keys.ENTER);//find the message box and sent message

        BrowserUtils.sleep(3);//assertion happens in the test base


    }


}
