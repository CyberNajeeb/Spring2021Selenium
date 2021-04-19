package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    @Test
    public void test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        //or
        // driver.navigate().to("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Java Books To Read", Keys.ENTER);
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        Assert.assertEquals("Java Books To Read - Google Search", driver.getTitle());
        driver.navigate().to("http://Amazon.com");

        Thread.sleep(1000);
        driver.quit();
    }

}
