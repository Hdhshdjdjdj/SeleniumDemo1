package com.demo.SeleniumDemo;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();

	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	String parenthandle=driver.getWindowHandle();
	driver.findElement(By.id("inputValEnter")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[2]/div[4]/div/div/ul[2]/li[7]/div/a")).click();
	driver.findElement(By.xpath("/html/body/div[11]/div[7]/div[5]/div[3]/div[8]/section[1]/div[1]/div[3]/div[1]/a/p")).click();
		

		 

	WebElement addToCartButton = driver.findElement(By.id("add-cart-button-id"));
	addToCartButton.click();
		
		 

		}

		 


	}


