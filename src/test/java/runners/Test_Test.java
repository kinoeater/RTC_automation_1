package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;



@CucumberOptions(features = {"src/test/resources/features/Audio_Video_Call_Verify_Test.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
 
)


@Test
public class Test_Test extends AbstractTestNGCucumberTests {

	
	}



