package stepdefinitions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseB;


public class mystepdefinitions_B extends BaseB {

	
	static Properties selectors = new Properties();
	
    static {
        try {
            selectors.load(mystepdefinitions_B.class.getResourceAsStream("selector.properties"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	
	
	
  
    public static  RemoteWebDriver getBdriver() {
        return Bdriver;
    }

    @Before ("@UserB") 
    public void beforeScenarioB(Scenario scenario) throws FileNotFoundException, InterruptedException, IOException, ParseException {
    	
    if (Bdriver == null) {
    		
    		String ScenarioName= scenario.getName();
    		System.out.println("Scenario Name that User B takes part in is : <"+ ScenarioName + ">");
    		
    		if (ScenarioName.contains("Login")) {
    		    
    			System.out.println("Bdriver  is null, creating the driver!");
           	    System.out.println("Starting the Application B!");
    	    	RemoteLaunch_Client_B();
    		}
           
    		else  {

                System.out.println("Adriver is null, creating the driver!");
                System.out.println("Starting the Application B!");
                RemoteLaunch_Client_B();
                typeB(selectors.getProperty("userA.name"), selectors.getProperty("login.username.input"));
                typeB(selectors.getProperty("userB.auth"), selectors.getProperty("login.username.input"));
                typeB(selectors.getProperty("userB.password"), selectors.getProperty("login.password.input"));
                clickB(selectors.getProperty("login.submit.button"));
                Thread.sleep(3000);
    		}
	    		
    	}
    	
    else {
    		
    		   System.out.println("User B is already up, continue");
    	}
    	
    	
    }
    
    
   @After ("@UserB") 
    public void afterScenarioB(Scenario scenario) throws InterruptedException, IOException{
  
	   
	   if (scenario.isFailed()) {
		      Reporter.log("Exited the Application B!"); 
	    	  Bdriver.quit();
	    	  Bdriver=null;
	    	  Thread.sleep(3000);
	    	
		}
	   
	   else {
		   
		     System.out.println("Feature passed!");
	   }
      
    }  

   @And("^UserB exits client$")
   public void userb_exits_client() throws Throwable {
   	System.out.println("Exiting the Application B!");
       Reporter.log("Exiting the Application B!"); 
      Bdriver.quit();
 	  Bdriver=null;
 	  Thread.sleep(3000);
    	
   }
   
    
    @Given("^UserB test method$")
    public void userb_test_method() throws Throwable {
    	
    	
    }



    @When("^UserB clicks \"([^\"]*)\"$")
    public void userb_clicks_something(String strArg1) throws Throwable {
    	
       	clickB(selectors.getProperty(strArg1));
    }
    
    @And("^UserB right clicks on \"([^\"]*)\"$")
    public void userb_right_clicks_on_something(String strArg1) throws Throwable {
        
	   right_click_B(selectors.getProperty(strArg1));
    }


    @Then("^UserB can see \"([^\"]*)\" on \"([^\"]*)\" location$")
    public void userb_can_see_something_on_something_location(String strArg1, String strArg2) throws Throwable {
    	verifyB(strArg1,selectors.getProperty(strArg2));
    }


	
    @And("^UserB enters \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userb_enters_something_to_something(String strArg1, String strArg2) throws Throwable {

        typeB(selectors.getProperty(strArg1), selectors.getProperty(strArg2));
    	
    }

    @And("^UserB waits for \"([^\"]*)\" seconds$")
    public void userb_waits_for_something_seconds(String strArg1) throws Throwable {

        String strArg2 = strArg1+"000";
        int sleeptime=Integer.parseInt(strArg2);
        Thread.sleep(sleeptime);

    }
    
    
}
