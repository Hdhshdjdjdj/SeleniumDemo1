package com.demo.SeleniumDemo;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 class Robot1 {

	public static void main(String[] args) throws AWTException ,InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		
	

		Robot rod=new Robot();

		        Thread.sleep(2000);

		        rod.keyPress(KeyEvent.VK_DOWN);

		        Thread.sleep(2000);

		        rod.keyPress(KeyEvent.VK_TAB);

		        Thread.sleep(2000);

		        rod.keyPress(KeyEvent.VK_TAB);

		        Thread.sleep(2000);

		        rod.keyPress(KeyEvent.VK_TAB);

		        Thread.sleep(2000);

		        rod.keyPress(KeyEvent.VK_ENTER);
		        
		        

		        driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).click();

		                System.out.println(driver.getTitle());
		
		
		
		
		

	}

	
		
	}


