package com.testpng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void initbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		driver.get("https://www.google.com");}
		
	
@Test
public void imageopt()
{
	driver.findElement(By.linkText("images")).click();
}
@AfterClass
public void teardown()
{
	driver.close();
}
}
	


	


