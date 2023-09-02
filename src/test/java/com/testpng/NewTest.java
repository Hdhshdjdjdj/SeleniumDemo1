package com.testpng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void firstMethod() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		//hard assert
		String expectedtitle="Google";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,expectedtitle,"Title mismatched");
		
		
		//soft assert
		String expurl="www.google.com";
		String acturl=driver.getCurrentUrl();
		SoftAssert soft=new SoftAssert();

        soft.assertEquals(acturl, expurl, "url not same");

        soft.assertAll();
		
		
  }
}
