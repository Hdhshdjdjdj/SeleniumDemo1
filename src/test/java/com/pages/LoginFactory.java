package com.pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

 

public class LoginFactory {

    

    WebDriver driver;

    

    @FindBy(xpath="//input[@name='user-name']")

    WebElement username;

    

    @FindBy(id="password")

    WebElement password;

    

    @FindBy(how=How.XPATH,using="//input[@id='login-button']")

    WebElement logbtn;

    

    public LoginFactory(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements(driver,this);

    }
   

          

 

    public void swaglog(String uid,String pwd) {

        username.sendKeys(uid);

        password.sendKeys(pwd);

       

    }
    public void clickbtn() {
    	 logbtn.click();
    }

  

}

	


