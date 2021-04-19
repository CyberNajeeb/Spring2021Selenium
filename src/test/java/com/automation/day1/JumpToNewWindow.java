package com.automation.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Set;

public class JumpToNewWindow {

    @Test
    public void test3() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);

        String currentWindowHandle = driver.getWindowHandle();
        Set<String> AllHandles = driver.getWindowHandles();
        for (Object allHandles : AllHandles) {
            if (!allHandles.equals(currentWindowHandle)){
                driver.switchTo().window(currentWindowHandle);
            }
        }
    }
}
