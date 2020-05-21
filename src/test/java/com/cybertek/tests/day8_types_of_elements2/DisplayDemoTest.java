package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemoTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("pwd"));

        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());
        System.out.println("passwordInput.isDisplayed() = " + passwordInput.isDisplayed());


        //verify that username not displayed in the screen
        Assert.assertFalse(usernameInput.isDisplayed(),"Verify inputbox not displayed");
        //click start button
        //we locate and click at the same time
        driver.findElement(By.cssSelector("#start>button")).click();
        //wait until it appears
        Thread.sleep(6000);
        //verify username displayed on the screen
        Assert.assertTrue(usernameInput.isDisplayed(),"verify username input displayed");
    }
}