package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.pages.*;

import Reopository.Utils1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class LoginTest {
	WebDriver driver;
	LoginFactory log;

@Given("user is on the login page of swag labs")
public void user_is_on_the_login_page_of_swag_labs() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	
    // Write code here that turns the phrase above into concrete actions
    
}
@When("user enter uname & password")
public void user_enter_uname_password() {
	log.swaglog("standard_user", "secret_sauce");
    // Write code here that turns the phrase above into concrete actions
    
}
@When("user clicks on login button")
public void user_clicks_on_login_button() {
	log.clickbtn();
    // Write code here that turns the phrase above into concrete actions
   
}
@Then("Login should be successful")
public void login_should_be_successful() {
	Assert.assertEquals(false, false);
	Utils1.capture(driver);
    // Write code here that turns the phrase above into concrete actions
   
}

}
