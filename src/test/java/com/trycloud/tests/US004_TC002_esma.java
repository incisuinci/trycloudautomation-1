package com.trycloud.tests;

import com.trycloud.Pages.MainPagePOM;
import com.trycloud.Pages.TalkPagePOM;
import com.trycloud.tests.base.TestBaseWithLogin;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class US004_TC002_esma extends TestBaseWithLogin {


    @Test
    public void t1() {
        MainPagePOM mainPagePOM = new MainPagePOM();
        TalkPagePOM talkPagePOM = new TalkPagePOM();
        PageFactory.initElements(Driver.getDriver(), mainPagePOM);
        mainPagePOM.buttonTalk.click();
        BrowserUtils.sleep(3);
        PageFactory.initElements(Driver.getDriver(), talkPagePOM);

        talkPagePOM.NexConversationText.click();
        talkPagePOM.InputSearchBoxInTalk.sendKeys("User30");

        BrowserUtils.sleep(3);


    }

    @AfterClass
    public void close() {
        Driver.closeDriver();
    }
}
