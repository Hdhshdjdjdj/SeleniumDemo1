package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com");
		driver.manage().window().maximize();

		// TODO Auto-generated method stub
		Actions act= new Actions(driver);
		
		String parenthandle=driver.getWindowHandle();
		System.out.println("Parent Window"+parenthandle);
		
		WebElement a=driver.findElement(By.xpath("//*[id="
		driver.findElement(By.id("buyheading")).click();
		
		

	}

}
