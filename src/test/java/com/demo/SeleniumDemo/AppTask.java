package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement frame123=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame123);
		//driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//a[@href='https://www.w3schools.com/']")).click();
		Thread.sleep(1000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		//Actions act= new Actions(driver);
	   // driver.findElement(By.xpath("/html/body/nav/ul/li/a")).click();
		driver.findElement(By.id("runbtn")).click();
	    



	

	}

}
