package com.demo.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement e=driver.findElement(By.cssSelector("#cars"));
		// TODO Auto-generated method stub
		
		Select s=new Select(e);
		boolean b=s.isMultiple();
		System.out.println(b);
		
		//s.selectByIndex(2);
		s.selectByValue("saab");
		s.selectByVisibleText("Volvo");
		
		s.deselectByIndex(2);
		s.deselectByValue("saab");
		s.deselectByVisibleText("Volvo");
		System.out.println("1st selected option");
	       s.selectByIndex(1);
	       WebElement d1=s.getFirstSelectedOption();
	       String second =d.getAttribute("value");
	     System.out.println(second);

	}

}
