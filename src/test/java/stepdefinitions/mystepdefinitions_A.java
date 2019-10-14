package stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import io.cucumber.java.hu.De;
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
import utility.Constants;
import utility.HookA;


public class mystepdefinitions_A extends HookA {

		
	static Properties selectors = new Properties();
	
    static {
        try {
            selectors.load(mystepdefinitions_A.class.getResourceAsStream("selector.properties"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    @Before ("@UserA")
    public void beforeScenarioA(Scenario scenario) throws FileNotFoundException, InterruptedException, IOException, ParseException {
    	
    if (Adriver == null) {
    		
    		String ScenarioName= scenario.getName();
    		System.out.println("Scenario Name that User A takes part in is : <"+ ScenarioName +">");
    		
    		if (ScenarioName.contains("Login")) {
    		    
    			System.out.println("Adriver is null, creating the driver!");
           	    System.out.println("Starting the Application A!");
    	    	RemoteLaunch_Client_A();
    		}
           
    		else  {
    		
    			System.out.println("Adriver is null, creating the driver!");
           	    System.out.println("Starting the Application A!");
    	    	RemoteLaunch_Client_A(); 	
	    	   	typeA(selectors.getProperty("user1.name"), selectors.getProperty("login.username.input"));
	    	   	typeA(selectors.getProperty("user1.password"), selectors.getProperty("login.password.input"));
	    	   	clickA(selectors.getProperty("login.submit.button"));
	    	   	Thread.sleep(3000);
    		}
	    		
    	}
    	
    else {
    		
    		   System.out.println("User A is already up, continue");
    	}
    	
    	
    }
    
    
   @After ("@UserA") 
    public void afterScenarioA(Scenario scenario) throws InterruptedException, IOException{
  
	   
	   if (scenario.isFailed()) {
		      Reporter.log("Exited the Application A!"); 
	    	  Adriver.quit();
	    	  Adriver=null;
	    	  Thread.sleep(3000);
	    	  
		}
	   
	   else {
		   
		     System.out.println("Feature passed!");
	   }
      
    }  
   
   @And("^UserA exits client$")
   public void usera_exits_client() throws Throwable {
   	System.out.println("Exiting the Application A!");
    Reporter.log("Exiting the Application A!"); 
    Adriver.quit();
	Adriver=null;
	Thread.sleep(3000);

    
   }
    
	public static  RemoteWebDriver getAdriver() {
        return Adriver;
    }
    
	   @Given("^UserA test method$")
	    public void usera_test_method() throws Throwable {
    	   Thread.sleep(3000);
		   String A=Adriver.findElement(By.xpath("//*[@id=\"kandy--login\"]/div[1]")).getText();
		   System.out.println(A);
		  
		   
	    }
	   
	   
	   @And("^UserA choose \"([^\"]*)\" to send message$")
	    public void usera_choose_something_to_send_message(String strArg1) throws Throwable {
	        
		// ******Method to choose the contact with name "strArg1"********************		   
	    List<WebElement> d= Adriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
		d.iterator().next().click();
		   
	    }

	   @And("^UserA checks if the message from \"([^\"]*)\" received is \"([^\"]*)\"$")
	    public void usera_checks_if_the_message_from_something_received_is_something(String strArg1, String strArg2) throws Throwable {
	        
	    	// ******Method to choose the contact with name "strArg2"********************	
	    	List<WebElement> k= Adriver.findElements(By.xpath("//*[@title='"+strArg1+"']"));
			k.iterator().next().click();
			Thread.sleep(5000);
			
			// ******Method to check if the received message is same as "strArg1" ********************	
	    	
	    	List<WebElement> d= Adriver.findElements(By.xpath("//*[@class='text-message']/div[1]"));
	    	int y=d.size();
			String message_received=d.get(y-1).getText();
	        Assert.assertEquals(message_received, strArg2);
		    System.out.println("Message received successfully from "+strArg1);
		    	
	    }
	   
	   @And("^UserA select \"([^\"]*)\"$")
	    public void usera_select_something(String strArg1) throws Throwable {
		   
		   selectA(selectors.getProperty(strArg1));
		   
		   
	    }
	   
	   @And("^UserA right clicks on \"([^\"]*)\"$")
	    public void usera_right_clicks_on_something(String strArg1) throws Throwable {
	        
		   right_click_A(selectors.getProperty(strArg1));
	    }


	    
	    @And("^UserA opens \"([^\"]*)\"$")
	    public void usera_opens_something(String strArg1) throws Throwable {
	        Adriver.get(strArg1);
	    }

	  	   
         
    @Given("^UserA is launched$")
    public void usera_is_launched() throws Throwable {
    	  
 //   	RemoteLaunch_Client_A();
    	System.out.println("Application A is started!");
        Reporter.log("Application A is started!");
        System.out.println("Driver="+Adriver);
      
        
    }
   
    @Given("^UserA logs into kandy with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void usera_logs_into_kandy_with_something_something_something(String strArg1, String strArg2, String strArg3) throws Throwable {
       
    	RemoteLaunch_Client_A();
    	typeA(selectors.getProperty("login.kandyusername"), strArg1);
    	typeA(selectors.getProperty("login.kandyauthname"), strArg2);
    	typeA(selectors.getProperty("login.kandypassword"), strArg3);
    	clickA(selectors.getProperty("login.kandysubmit"));
    	    	
    }
    
    @And("^UserA logs into skype with \"([^\"]*)\" \"([^\"]*)\"$")
    public void usera_logs_into_skype_with_something_something(String strArg1, String strArg2) throws Throwable {
    
      	typeA(selectors.getProperty("login.skypeusername"), strArg1);
    	typeA(selectors.getProperty("login.skypepassword"), strArg2);
    	clickA(selectors.getProperty("login.skypesubmit"));
    	
    }
    
    @And("^UserA checks if \"([^\"]*)\" is added$")
    public void usera_checks_if_something_is_added(String strArg1) throws Throwable {
       
    	List<WebElement> d= Adriver.findElements(By.xpath("//*[@class='text-message']/div[1]"));
    	int y=d.size();
		String message_received=d.get(y-1).getText();
    //    Assert.assertEquals(message_received, strArg2);
	    System.out.println("Message received successfully");
    	
    }
    
    @When("^UserA clicks \"([^\"]*)\"$")
    public void usera_clicks_something(String strArg1) throws Throwable {
    	clickA(selectors.getProperty(strArg1));

    }

    @Then("^UserA can see \"([^\"]*)\" on \"([^\"]*)\" location$")
    public void usera_can_see_something_on_something_location(String strArg1, String strArg2) throws Throwable {
    	verifyA(strArg1,selectors.getProperty(strArg2));
    }

	@Then("^UserA can verify \"([^\"]*)\" is present$")
	public void usera_can_verify_something_is_present(String strArg1) throws Throwable {
		verify_presence_A(strArg1);
	}
       
    
    @And("^UserA enters \"([^\"]*)\" to \"([^\"]*)\"$")
    public void usera_enters_something_to_something(String strArg1, String strArg2) throws Throwable {
    	
    	typeA(selectors.getProperty(strArg1), selectors.getProperty(strArg2));
    }

    @And("^UserA waits for \"([^\"]*)\" seconds$")
    public void usera_waits_for_something_seconds(String strArg1) throws Throwable {
    	String strArg2 = strArg1+"000";
        int sleeptime=Integer.parseInt(strArg2);
    	Thread.sleep(sleeptime);

    }


    @Given("^UserA launches$")
    public void usera_launches() throws Throwable {
    


		Thread.sleep(1000);
		Adriver.findElement(By.xpath("//*[@id=\"kandy-login__input--username\"]")).sendKeys("1234");
		Thread.sleep(1000);
		Adriver.findElement(By.id("kandy-login__input--password")).sendKeys("1234");
		Thread.sleep(1000);
		Adriver.findElement(By.id("kandy-login__input--button--login")).click();

		System.out.println("Das ist ersten arbeit");
    }


}
