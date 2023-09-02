package steffdeff1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;


public class CreateTest {
	@Given("user is on create account page")
	public void user_is_on_create_account_page() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	   
	}
	@When("user give the credential to create ACCOUNT")
	public void user_give_the_credential_to_create_account(DataTable dataTable) {
		  List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	        String fullName = data.get(0).get("Full Name");
	        String rediffmailId = data.get(0).get("Choose Rediffmail ID");
	        String password = data.get(0).get("Password");
	        String alternateEmail = data.get(0).get("Alternate Email Address");
		
		
	   
	   
	}
	@When("user clicks on create account")
	public void user_clicks_on_create_account() {
		
		 
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("display the account created")
	public void display_the_account_created() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
