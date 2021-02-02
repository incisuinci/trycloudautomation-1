package com.trycloud.tests.base;

import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class TestBaseWithLogin extends TestBase {
    @BeforeMethod
    public void login(){
        LogInPagePOM login = new LogInPagePOM();
        PageFactory.initElements(Driver.getDriver(),login);
        login.LogIn("user23","Userpass123");
    }
}
