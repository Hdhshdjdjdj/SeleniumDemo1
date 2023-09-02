package steffdef3;
import java.util.List;

import java.util.Map;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginFactory;

import io.cucumber.datatable.DataTable;





import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFun {
	



	    WebDriver driver;

	    LoginFactory log;

	    

	    

	    @Given("user is on the login page of swag labs")

	    public void user_is_on_the_login_page_of_swag_labs() {

	          WebDriverManager.chromedriver().setup();

	           driver= new ChromeDriver();

	           driver.get("https://www.saucedemo.com/v1/");

	           driver.manage().window().maximize();

	       

	    }

	    @When("user enter uname & password")

	    public void user_enter_uname_password(DataTable dataTable) {

	           List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

	            log = new LoginFactory(driver);

	            for (Map<String, String> credential : credentials) {

	                String username = credential.get("username");

	                String password = credential.get("password");

	                log.swaglog(username, password);

	            }

	       

	    }

	    @When("user clicks on login button")

	    public void user_clicks_on_login_button() {

	        log.clickbtn();

	 

	    }

	    @Then("Login should be successful")

	    public void login_should_be_successful() {

	        driver.close();

	      

	    }

	 

}
