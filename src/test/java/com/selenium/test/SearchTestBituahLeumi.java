package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTestBituahLeumi {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        wd.navigate().to("https://www.btl.gov.il/Pages/default.aspx");
    }

    @Test
    public void searchFormTest(){
        wd.findElement(By.name("search")).click();
        wd.findElement(By.name("search")).sendKeys("Avtala");
        wd.findElement(By.id("ctl00_Topmneu_ContactsHyperLink")).click();
        wd.findElement(By.id("ctl00_Topmneu_HyperLink9")).click();
        wd.findElement(By.id("vm_userZehut")).click();
        wd.findElement(By.id("vm_userZehut")).sendKeys("234567564");
        wd.findElement(By.id("vm_userName")).click();
        wd.findElement(By.id("vm_userName")).sendKeys("FJ8TLG9");
        wd.findElement(By.id("vm_password")).click();
        wd.findElement(By.id("vm_password")).sendKeys("aKnt35w");
      
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
