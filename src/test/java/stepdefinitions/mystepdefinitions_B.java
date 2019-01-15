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

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HookB;


public class mystepdefinitions_B extends HookB {

	
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
    		
    			System.out.println("Bdriver is null, creating the driver!");
           	    System.out.println("Starting the Application B!");
    	    	RemoteLaunch_Client_B(); 	
	    	   	typeB(selectors.getProperty("login.kandyusername"), selectors.getProperty("userB.kandy.name"));
	    	   	typeB(selectors.getProperty("login.kandyauthname"), selectors.getProperty("userB.kandy.auth"));
	    	   	typeB(selectors.getProperty("login.kandypassword"), selectors.getProperty("userB.kandy.pass"));
	    	   	clickB(selectors.getProperty("login.kandysubmit"));         
	    	   	typeB(selectors.getProperty("login.skypeusername"), selectors.getProperty("userB.skype.name"));
	    	   	typeB(selectors.getProperty("login.skypepassword"), selectors.getProperty("userB.skype.pass"));
	    	   	clickB(selectors.getProperty("login.skypesubmit")); 
	    	   	clickB(selectors.getProperty("contacts.credentialssaveno"));
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
  
    
    @And("^UserB choose \"([^\"]*)\" to send message$")
    public void userb_choose_something_to_send_message(String strArg1) throws Throwable {
        
	// ******Method to choose the contact with name "strArg1"********************		   
    List<WebElement> d= Bdriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
	d.iterator().next().click();
	   
    }

    @And("^UserB checks if the message from \"([^\"]*)\" received is \"([^\"]*)\"$")
    public void userb_checks_if_the_message_from_something_received_is_something(String strArg1, String strArg2) throws Throwable {
    	
    	// ******Method to choose the contact with name "strArg2"********************	
    	List<WebElement> k= Bdriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
		k.iterator().next().click();
		Thread.sleep(5000);
    	
		// ******Method to checek if the received message is same as "strArg1" ********************	
		
    	List<WebElement> d= Bdriver.findElements(By.xpath("//*[@class='text-message']/div[1]"));
    	int y=d.size();
		String message_received=d.get(y-1).getText();
        Assert.assertEquals(message_received, strArg2);
	    System.out.println("Message received successfully from "+strArg1);
	    	
    }
    
    
    @And("^UserB opens \"([^\"]*)\"$")
    public void userb_opens_something(String strArg1) throws Throwable {
        Bdriver.get(strArg1);
    }

       
    @Given("^UserB is launched$")
    public void userb_is_launched() throws Throwable {
    	  RemoteLaunch_Client_B();
    	  System.out.println("Driver="+Bdriver);
    	  System.out.println("Application B is started!");
          Reporter.log("Application B is started!");
      
    
    }
    
    
    @Given("^UserB logs into kandy with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userb_logs_into_kandy_with_something_something_something(String strArg1, String strArg2, String strArg3) throws Throwable {
       
    	RemoteLaunch_Client_B();
    	typeB(selectors.getProperty("login.kandyusername"), strArg1);
    	typeB(selectors.getProperty("login.kandyauthname"), strArg2);
    	typeB(selectors.getProperty("login.kandypassword"), strArg3);
    	clickB(selectors.getProperty("login.kandysubmit"));
    	    	
    }
    
 
    @And("^UserB logs into skype with \"([^\"]*)\" \"([^\"]*)\"$")
    public void userb_logs_into_skype_with_something_something(String strArg1, String strArg2) throws Throwable {
    
      	typeB(selectors.getProperty("login.skypeusername"), strArg1);
    	typeB(selectors.getProperty("login.skypepassword"), strArg2);
    	clickB(selectors.getProperty("login.skypesubmit"));
    	
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

	public static By Kandyusername=By.id("username-kandy");
	
    @And("^UserB enters \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userb_enters_something_to_something(String strArg1, String strArg2) throws Throwable {
    	typeB(selectors.getProperty(strArg2), strArg1);
   
       	
    	
    }

    @And("^UserB waits for \"([^\"]*)\" seconds$")
    public void userb_waits_for_something_seconds(String strArg1) throws Throwable {
        int sleeptime=Integer.parseInt(strArg1);
    	Thread.sleep(sleeptime);

    }
    
    
}
