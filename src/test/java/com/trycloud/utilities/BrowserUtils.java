package com.trycloud.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void hoover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }


}
