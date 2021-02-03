package com.trycloud.tests;

import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class US002_TC001_Jair extends TestBase {

    @Test
    public void Test1  (){

        MenuBarPOM driverMenuBar = new MenuBarPOM();
        PageFactory.initElements(Driver.getDriver(),driverMenuBar);

        //Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(driverMenuBar.buttonFile).perform();

        BrowserUtils.hoover(driverMenuBar.buttonFile);



        System.out.println("driverMenuBar.buttonFile.getText() = " + driverMenuBar.buttonFile.getText());

       /* driverMenuBar.buttonFile.click();
        //BrowserUtils.sleep(3);

        driverMenuBar.buttonActivity.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonGallery.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonTalk.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonCalendar.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonDeck.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonAnnouncement.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonNotification.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonContactMenu.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonSettings.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonHomeNextCloudLogo.click();*/












    }



}
