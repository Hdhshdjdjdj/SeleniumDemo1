package com.testpng;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver driver;
	
	@BeforeTest  
	public void intializeBrowser(){
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
		
		
	}
	@Test  (timeOut=1000, expectedExceptions= {NoSuchElementException.class})
	//@Parameters({"username" , "password"})
	public void test2() {
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		////driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("username")).sendKeys("standard-user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
	}
	@AfterTest 
	
	
	public void teardown()
	{
		driver.close();
	}
	

}
