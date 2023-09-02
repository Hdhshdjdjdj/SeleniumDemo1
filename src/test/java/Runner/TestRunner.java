package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


	
@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\feature\\Login1.feature",glue="StepDeff9",tags="login",plugin= {"pretty","Html:target/Cucumber-report.html","junit:target/JUNITReports/log.xml","json:target/JSONReports/log.json"})

	 

public class TestRunner extends AbstractTestNGCucumberTests{

	 
	

}
