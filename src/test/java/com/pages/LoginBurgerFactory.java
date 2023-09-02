package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBurgerFactory {
	  WebDriver driver;

	    @FindBy(id = "mobileNumber") 
	     WebElement mobileNumberInput;

	    @FindBy(id = "getOTPButton") 
	    private WebElement getOTPButton;

	    public void LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterMobileNumber(String mobileNumber) {
	        mobileNumberInput.sendKeys(mobileNumber);
	    }

	    public void clickGetOTPButton() {
	        getOTPButton.click();
	    }
	}