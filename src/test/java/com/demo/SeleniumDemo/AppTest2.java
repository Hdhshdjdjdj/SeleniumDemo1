package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https:/jqueryui.com/droppable/");
		
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Gm")).click();
		driver.findElement(By.tagName("i frame"));
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dst).perform();
		if(dst.getText().matches("Dropped!"));
		{
			System.out.println("successfully dropped");
		}
		driver.close();


	}

}
