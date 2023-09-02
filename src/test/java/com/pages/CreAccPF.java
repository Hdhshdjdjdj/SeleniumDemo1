package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreAccPF {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	WebElement rediffmail;
	
	@FindBy(xpath="//*[@id=\"newpasswd\"]")
	WebElement passwordField;
	
	@FindBy(xpath="//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")
	WebElement altmail;
	
	@FindBy(xpath="//*[@id=\"Register\"]")
	WebElement accbtn;
	
	public CreAccPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createAccount(String fullName, String rediffmailId, String password,
                              String retypePassword, String alternateEmail) {
        name.sendKeys(fullName);
        rediffmail.sendKeys(rediffmailId);
        passwordField.sendKeys(password);
        altmail.sendKeys(alternateEmail);
        accbtn.click();
    }
}
    
