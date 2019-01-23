package runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;


@CucumberOptions(
        features = {"src/test/resources/features/Ecemy_test.feature"},
        
        	
        glue = {"stepdefinitions", "utility"},
        plugin = {"pretty", "html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:"},
        tags = {}
        )
public class ecemy_report_Test extends AbstractTestNGCucumberTests {


    @BeforeClass
    public  static void setup() {

            }

    @AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        //Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setSystemInfo("os", System.getProperty("os.name"));
        Reporter.setTestRunnerOutput("Sample test runner output message"); }
}


