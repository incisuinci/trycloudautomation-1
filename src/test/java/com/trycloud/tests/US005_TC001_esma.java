package com.trycloud.tests;

import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.Pages.TalkPagePOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US005_TC001_esma extends TestBase {

    @BeforeMethod
    public void setUpClass() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LogInPagePOM log = new LogInPagePOM();
        PageFactory.initElements(Driver.getDriver(), log);
        log.LogIn(ConfigurationReader.getProperty("username53"), ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(3);
    }

    @Test
    public void t1() {
        MenuBarPOM menuBarPOM = new MenuBarPOM();
        PageFactory.initElements(Driver.getDriver(), menuBarPOM);
        TalkPagePOM talkPagePOM = new TalkPagePOM();
        PageFactory.initElements(Driver.getDriver(), talkPagePOM);

        menuBarPOM.buttonContactMenuClick();
        talkPagePOM.allUsersInTalkPage.get(1).click();
        BrowserUtils.sleep(3);
        String expectedTitle = talkPagePOM.usersInContactDropDown.get(1).getText();
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
        BrowserUtils.sleep(3);
    }

    public void teardown(){
        Driver.closeDriver();
    }
}


