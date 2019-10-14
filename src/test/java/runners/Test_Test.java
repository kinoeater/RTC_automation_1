package runners;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src/test/resources/features/LaunchA.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
 
)


@Test
public class Test_Test extends AbstractTestNGCucumberTests {

	
	}



