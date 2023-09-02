package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPF {
	WebDriver driver;
	LoginBurgerFactory loginPage;

    @BeforeMethod
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
  
        driver = new ChromeDriver();
        driver.get("https://www.burgerking.in/"); 
        loginPage = new LoginBurgerFactory();
    }

    @Test
    public void testLoginWithMobileNumberAndGetOTP() throws InterruptedException {
        LoginPF.enterMobileNumber("1234567890"); 
        loginPage.clickGetOTPButton();

        
        Thread.sleep(30000); 

      
    }

    private static void enterMobileNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
	


