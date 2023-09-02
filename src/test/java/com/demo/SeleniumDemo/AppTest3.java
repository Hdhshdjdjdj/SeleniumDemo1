package com.demo.SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		
		List<WebElement>e= driver.findElements(By.tagName("input"));
		System.out.println(e.size());
		
		
		
		
		//driver.get("https://www.saucedemo.com");
		
		//driver.navigate().to("https://www.google.com");
        //driver.manage().window().maximize();
        
       // driver.findElement(By.linkText("Gmail")).click();
       // Thread.sleep(2000);
       // driver.navigate().back();
        //Thread.sleep(2000);

       // driver.navigate().forward();
       // Thread.sleep(2000);

        //driver.navigate().refresh();
       // Thread.sleep(2000);
		
		//1st way
		//driver.get("https://www.google.com");
		//driver.get("https://www.saucedemo.com");
		//WebElement a = driver.findElement(By.cssSelector("#login-button"));

       // System.out.println(a.isEnabled());
		//String title=driver.getTitle();
		//System.out.println("Title is"+ title);
		 
		//String current=driver.getCurrentUrl();
		//System.out.println("Current url"+current);
		
		
		//2nd way
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//WebElement a= driver.findElement(By.id("user-name"));
		//System.out.println(a.getAttribute("class"));
		//System.out.println(a.getTagName());
		//System.out.println(a.getCssValue("font-family"));
		
		//System.out.println(a.getCssValue("width"));
		
		//driver.findElement(By.cssSelector()
		
		
		
		
		
	
		

		

        

	}

}
