package stepdefinitions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseC;


public class mystepdefinitions_C extends BaseC {

	
	static Properties selectors = new Properties();
	
    static {
        try {
            selectors.load(mystepdefinitions_C.class.getResourceAsStream("selector.properties"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	
	
	
  
    public static  RemoteWebDriver getCdriver() {
        return Cdriver;
    }

    @Before ("@UserC") 
    public void beforeScenarioA(Scenario scenario) throws FileNotFoundException, InterruptedException, IOException, ParseException {
    	
    if (Cdriver == null) {
    		
    		String ScenarioName= scenario.getName();
    		System.out.println("Scenario Name that User C takes part in is : <"+ ScenarioName + ">");
    		
    		if (ScenarioName.contains("Login")) {
    		    
    			System.out.println("Cdriver  is null, creating the driver!");
           	    System.out.println("Starting the Application C!");
    	    	RemoteLaunch_Client_C();
    		}
           
    		else  {
    		
    			System.out.println("Cdriver is null, creating the driver!");
           	    System.out.println("Starting the Application C!");
    	    	RemoteLaunch_Client_C(); 	
	    	   	typeC(selectors.getProperty("login.kandyusername"), selectors.getProperty("userC.kandy.name"));
	    	   	typeC(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userC.kandy.auth"));
	    	   	typeC(selectors.getProperty("login.kandypassword"), selectors.getProperty("userC.kandy.pass"));
	    	   	clickC(selectors.getProperty("login.kandysubmit"));         
	    	   	typeC(selectors.getProperty("login.skypeusername"), selectors.getProperty("userC.skype.name"));
	    	   	typeC(selectors.getProperty("login.skypepassword"), selectors.getProperty("userC.skype.pass"));
	    	   	clickC(selectors.getProperty("login.skypesubmit")); 
	    	   	clickC(selectors.getProperty("contacts.credentialssaveno"));
	    	   	Thread.sleep(3000);
    		}
	    		
    	}
    	
    else {
    		
    		   System.out.println("User C is already up, continue");
    	}
    	
    	
    }
    
    
   @After ("@UserC") 
    public void afterScenarioC(Scenario scenario) throws InterruptedException, IOException{
  
	   
	   if (scenario.isFailed()) {
		      Reporter.log("Exited the Application C!"); 
	    	  Cdriver.quit();
	    	  Cdriver=null;
	    	  Thread.sleep(3000);
	    	
		}
	   
	   else {
		   
		     System.out.println("Feature passed!");
	   }
      
    }  

   @And("^UserC exits client$")
   public void userc_exits_client() throws Throwable {
   	  System.out.println("Exiting the Application C!");
      Reporter.log("Exiting the Application C!"); 
      Cdriver.quit();
 	  Cdriver=null;
 	  Thread.sleep(3000);
    	
   }
   
    
    @Given("^UserC test method$")
    public void userc_test_method() throws Throwable {
    	
    	
    }
  
    
    @And("^UserC choose \"([^\"]*)\" to send message$")
    public void userc_choose_something_to_send_message(String strArg1) throws Throwable {
        
	// ******Method to choose the contact with name "strArg1"********************		   
    List<WebElement> d= Cdriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
	d.iterator().next().click();
	   
    }

    @And("^UserC checks if the message from \"([^\"]*)\" received is \"([^\"]*)\"$")
    public void userc_checks_if_the_message_from_something_received_is_something(String strArg1, String strArg2) throws Throwable {
    	
    	// ******Method to choose the contact with name "strArg2"********************	
    	List<WebElement> k= Cdriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
		k.iterator().next().click();
		Thread.sleep(5000);
    	
		// ******Method to check if the received message is same as "strArg1" ********************	
		
    	List<WebElement> d= Cdriver.findElements(By.xpath("//*[@class='text-message']/div[1]"));
    	int y=d.size();
		String message_received=d.get(y-1).getText();
        Assert.assertEquals(message_received, strArg2);
	    System.out.println("Message received successfully from "+strArg1);
	    	
    }
    
    
    @And("^UserC opens \"([^\"]*)\"$")
    public void userc_opens_something(String strArg1) throws Throwable {
        Cdriver.get(strArg1);
    }

       
    @Given("^UserC is launched$")
    public void userc_is_launched() throws Throwable {
    	  RemoteLaunch_Client_C();
    	  System.out.println("Driver="+Cdriver);
    	  System.out.println("Application B is started!");
          Reporter.log("Application B is started!");
      
    
    }
    
    
    @Given("^UserC logs into kandy with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userc_logs_into_kandy_with_something_something_something(String strArg1, String strArg2, String strArg3) throws Throwable {
       
    	RemoteLaunch_Client_C();
    	typeC(selectors.getProperty("login.kandyusername"), strArg1);
    	typeC(selectors.getProperty("login.kandyauthname"), strArg2);
    	typeC(selectors.getProperty("login.kandypassword"), strArg3);
    	clickC(selectors.getProperty("login.kandysubmit"));
    	    	
    }
    
 
    @And("^UserC logs into skype with \"([^\"]*)\" \"([^\"]*)\"$")
    public void userc_logs_into_skype_with_something_something(String strArg1, String strArg2) throws Throwable {
    
      	typeC(selectors.getProperty("login.skypeusername"), strArg1);
    	typeC(selectors.getProperty("login.skypepassword"), strArg2);
    	clickC(selectors.getProperty("login.skypesubmit"));
    	
    }
   
    @When("^UserC clicks \"([^\"]*)\"$")
    public void userc_clicks_something(String strArg1) throws Throwable {
    	
       	clickC(selectors.getProperty(strArg1));
    }
    
    @And("^UserC right clicks on \"([^\"]*)\"$")
    public void userc_right_clicks_on_something(String strArg1) throws Throwable {
        
	   right_click_C(selectors.getProperty(strArg1));
    }


    @Then("^UserC can see \"([^\"]*)\" on \"([^\"]*)\" location$")
    public void userc_can_see_something_on_something_location(String strArg1, String strArg2) throws Throwable {
    	verifyC(strArg1,selectors.getProperty(strArg2));
    }

	public static By Kandyusername=By.id("username-kandy");
	
    @And("^UserC enters \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userc_enters_something_to_something(String strArg1, String strArg2) throws Throwable {
    	typeC(selectors.getProperty(strArg2), strArg1);
   
       	
    	
    }

    @And("^UserC waits for \"([^\"]*)\" seconds$")
    public void userc_waits_for_something_seconds(String strArg1) throws Throwable {
        int sleeptime=Integer.parseInt(strArg1);
    	Thread.sleep(sleeptime);

    }
    
    
}
