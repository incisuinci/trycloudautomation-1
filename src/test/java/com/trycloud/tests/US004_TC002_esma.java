package com.trycloud.tests;

import com.trycloud.Pages.TalkPagePOM;
import com.trycloud.tests.base.TestBaseWithLogin;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class US004_TC002_esma extends TestBaseWithLogin {


    @Test(description = "Validation of sending message by searching user")
    public void t1() {
        TalkPagePOM talkPagePOM = new TalkPagePOM();
        talkPagePOM.sendingMessageThroughTalk("User50");
        Assert.assertEquals(talkPagePOM.messages.get(talkPagePOM.messages.size() - 2).getText(), talkPagePOM.message, "The message is not sent and displayed!!");

    }
    //change
    //fdndjfjfn

    @AfterClass
    public void close() {
        Driver.closeDriver();
    }
}
