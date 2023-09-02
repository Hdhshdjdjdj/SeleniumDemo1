package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppFind {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		//driver.get("https://www.rediff.com");
		//driver.get("https://www.saucedemo.com");
		//System.setProperty("webdrive.chrome.driver","C:\\Drivers\\chromedriver_win32 (4) (1))\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	    WebDriver driver1=new ChromeDriver();
	        driver1.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");

	    driver1.manage().window().maximize();
	        Actions act=new Actions(driver1);
	        WebElement a=driver1.findElement(By.tagName("a"));  
//	        act.moveToElement(a).click().build().perform();
//	    act.click(a).build().perform();
	//act.doubleClick(a).build().perform();

	 


		// TODO Auto-generated method stub
		//Actions act= new Actions(driver);
		
		//WebElement uname=driver.findElement(By.id("user-name"));
		//uname.click();
		//act.moveToElement(uname).sendKeys("standard_user").build().perform();
		 
		//WebElement pass=driver.findElement(By.id("password"));
		//pass.click();
		//act.moveToElement(uname).sendKeys("secret_sauce").build().perform();
		
		//WebElement log=driver.findElement(By.id("login"));
		
		//act.moveToElement(log).click().build().perform();

		
		
		 
		//WebElement a=driver.findElement(By.xpath("//*[@id=\"signin_info\"]a[2]"));
		//act.moveToElement(a).doubleClick().build().perform();
		//act.doubleClick(a).build().perform();
		//act.moveToElement(a).contextClick().build().perform();
		//act.contextClick(a).build().perform();
	}
	
		

	}


