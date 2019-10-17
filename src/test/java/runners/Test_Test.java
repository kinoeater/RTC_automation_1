package runners;


import com.cucumber.listener.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.Constants;

import java.io.File;
import java.io.IOException;


@CucumberOptions(features = {"src/test/resources/features/test2.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"}
 
)


@Test
public class Test_Test extends AbstractTestNGCucumberTests {


	
	}



