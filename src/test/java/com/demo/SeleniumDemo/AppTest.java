package com.demo.SeleniumDemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	public static void main(String[]args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	//WebDriver driver= new ChromeDriver();
	//driver.get("https://www.saucedemo.com");
	//driver.manage().window().maximize();
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://www.zomato.com");
	
	WebElement l=driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/web_assets/81f3ff974d82520780078ba1cfbd453a1583259680.png\']"));
	
	//driver.findElement(By.xpath("//input[contains(@name,'user-name']")).sendKeys("standard_user");   
	//driver.findElement(By.xpath("//input[contains(@id,'Password']")).sendKeys("secret_sauce");
	

	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");

	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

	//driver.findElement(By.xpath("//input[@type='submit']")).click();	
	//WebElement a= driver.findElement(By.id("user-name"));
	//a.sendKeys("standard_user");
	
	//WebElement b= driver.findElement(By.name("password"));
	//b.sendKeys("secret_sauce");
	
	//WebElement c= driver.findElement(By.id("login-button"));
	//c.click();
	
	
	 
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	//driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	//driver.findElement(By.id("login-button")).click();
	
	//driver.close();
	
}
}

   