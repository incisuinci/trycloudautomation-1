package com.trycloud.tests;

import com.trycloud.Pages.MainPagePOM;
import com.trycloud.tests.base.TestBaseWithLogin;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class US002_TC001_Jair extends TestBaseWithLogin {

    @Test
    public void Test1 (){

        MainPagePOM mainPagePOM = new MainPagePOM();
        PageFactory.initElements(Driver.getDriver(),mainPagePOM);
        mainPagePOM.ButtonActivityClick();








    }



}
