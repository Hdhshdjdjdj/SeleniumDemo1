package com.testpng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Data {
	WebDriver driver;
	  @Test()
	  public void main() {
	      System.setProperty("webdriver.http.factory", "jdk-http-client");
	      System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	      driver= new ChromeDriver();
	      driver.get("https://www.saucedemo.com/");
	      driver.manage().window().maximize();

	      driver.findElement(By.name("user-name")).sendKeys("standard_user");
	      driver.findElement(By.name("password")).sendKeys("secret_sauce");
	      driver.findElement(By.name("login-button")).click();

	      String expectedtitle="Swa Labs";
	      String actualtile=driver.getTitle();
	      Assert.assertEquals(expectedtitle, actualtile,"Title Missing");

	      driver.close();

}
}
