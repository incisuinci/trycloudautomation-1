package com.trycloud.tests.base;

import applicationRunner.SuitStarter;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class TestBase extends SuitStarter {
    public WebDriver driver;

    @BeforeClass
    public void setupClass() {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterClass
    public void teardownClass() {
        driver.close();
    }

    public void login(){
        WebElement loginBox=driver.findElement(By.xpath("//input[@id='user']"));
        loginBox.sendKeys(ConfigurationReader.getProperty("username83"));

        WebElement passwordBox=driver.findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();


    }
}
