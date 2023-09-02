package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions act=new Actions(driver);
		String parenthandle=driver.getWindowHandle();

		
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");

		


	}

}
