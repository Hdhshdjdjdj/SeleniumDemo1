package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

	    driver.manage().window().maximize();

	        

	    driver.findElement(By.id("alterButton")).click();

	    String text=driver.switchTo().alert().getText();

	    System.out.println(text);

	    Thread.sleep(1000);

	    driver.switchTo().alert().accept();

	        

	 
		
		

		
			}

}
