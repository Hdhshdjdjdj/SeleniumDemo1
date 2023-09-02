package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	WebDriver driver;
    By filter=By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select");
    By AtoZ=By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[1]");
    By Add=By.id("add-to-cart-sauce-labs-backpack");
    public void Homepage(WebDriver driver) {
           this.driver=driver;
       }
    public void clickfilterMethod() {
        driver.findElement(filter).click();
    }
    public void filterName() {
        Actions act= new Actions(driver);
        act.sendKeys("Name (A to Z)").click().build().perform();  
    }
    public void FirstList() {
        driver.findElement(Add).click();

    }
}

