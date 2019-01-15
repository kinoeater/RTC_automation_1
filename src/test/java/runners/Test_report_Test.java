package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;


//@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 1,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true,
//   excludeCoverageTags = {"@flaky" },
//  includeCoverageTags = {"@passed" },
outputFolder = "target")

@CucumberOptions(features = {"src/test/resources/features/Contact_Actions.feature"}
        , glue = {"stepdefinitions", "utility"}
        , plugin = {"pretty","html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" }
        , tags = {"@UserA"}
)


@Test
public class Test_report_Test extends ExtendedTestNGRunner {

	
	}



