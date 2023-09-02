package com.pages;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffPF {
	WebDriver driver;

    

	 

    @FindBy(xpath="//*[@id=\"srchquery_tbox\"]")

    WebElement searchfeild;

    

    @FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")

    WebElement searchicon;

    

    public RediffPF(WebDriver driver) {

        this.driver=driver;

        PageFactory.initElements( driver,this);

    }

    

    public void searchText(String key) {

        searchfeild.sendKeys(key);

    }

    

    public void searchbtn() {

        searchicon.click();

    }

 

	
	
	
	

}
