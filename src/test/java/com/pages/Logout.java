package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout {
    WebDriver driver;
  @Test
  public void VerifyHomePage() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    LogPage lg=new LogPage(driver);
    lg.typeuser();
    lg.typepass();
    lg.clickbtn();
    HomePage h=new HomePage();

h.clickfilterMethod();
h.filterName();
h.FirstList();
  }

}
