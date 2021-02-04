package com.trycloud.tests.base;

import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US003_TC001 extends TestBase {
    /*3. Story: "As a user, I should be able to access to Files module."
         Test case #1 . verify users can access to Files module
                      . Login as a user
                      . Verify the page tile is Files module’s tile
*/
    MenuBarPOM driverMenuBar = new MenuBarPOM();

    @BeforeMethod
    public void SetUpElements() {

        PageFactory.initElements(Driver.getDriver(), driverMenuBar);
    }
    @Test(priority = 1)
    public void test1Inci(){
     driverMenuBar.buttonFileClick();
     BrowserUtils.sleep(1);
     Assert.assertTrue(driverMenuBar.buttonAllFiles.isDisplayed());
     driverMenuBar.buttonAllFilesClick();
     BrowserUtils.sleep(1);//want to see you running baby!!
     String expectedFilePageTitle = "All files";
     Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedFilePageTitle));



    }

}
