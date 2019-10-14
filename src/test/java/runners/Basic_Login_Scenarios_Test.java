package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(features = {"src/test/resources/features/Basic_Login_Scenarios.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
 
)


@Test
public class Basic_Login_Scenarios_Test extends AbstractTestNGCucumberTests {

	
	}



