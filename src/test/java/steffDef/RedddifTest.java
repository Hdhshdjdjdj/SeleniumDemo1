package steffDef;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.RediffPF;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedddifTest {
	WebDriver driver;
	RediffPF red;
@Given("user is on home page")
public void user_is_on_home_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
	   
	}
	@When("user gives keyword in search field")
	public void user_gives_in_search_field(DataTable keyword) {
		red= new RediffPF(driver);
		List<String> cells=keyword.asList(String.class);
		red.searchText(cells.get(0));
		
	    
	}
	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		red.searchbtn();
	    
	}
	@Then("search data should be displayed")
	public void search_data_should_be_displayed() {
		driver.close();
	   
	}

	}



