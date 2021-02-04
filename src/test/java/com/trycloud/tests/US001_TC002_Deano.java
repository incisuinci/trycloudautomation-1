package com.trycloud.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class US001_TC002_Deano {


    @Test
    public void testCase1U2(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*driver.get("https://trycloud.net/");

        driver.findElement(By.id("menu-item-47")).click();

         */

        driver.get("http://qa.trycloud.net/index.php/login?redirect_url=/index.php/apps/files/");

        driver.findElement(By.id("user")).sendKeys("User23");


        driver.findElement(By.id("password")).sendKeys("Userpass12");

        driver.findElement(By.id("submit-form")).click();

    }



}




