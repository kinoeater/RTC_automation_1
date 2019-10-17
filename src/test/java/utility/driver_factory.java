package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class driver_factory {

    public static RemoteWebDriver Adriver;
    public static RemoteWebDriver Bdriver;
    public static RemoteWebDriver Cdriver;
    private static String BinaryPath = Constants.BinaryPath;
    private static String hubURL =Constants.hubURL;



    public static void RemoteLaunch_Client_A() throws InterruptedException, FileNotFoundException, IOException, org.json.simple.parser.ParseException {


        System.setProperty(Constants.Driver_name, Constants.ChromeDriver_path);
        ChromeOptions options = new ChromeOptions();
        options.setBinary(BinaryPath);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Adriver = new RemoteWebDriver(new URL(hubURL), options);
        Thread.sleep(3000);


        for (String hand : Adriver.getWindowHandles()) {
            Adriver.switchTo().window(hand);
        }

        JavascriptExecutor js = (JavascriptExecutor) Adriver;
        Thread.sleep(1000);
        js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();"); //maximize the window via JS

        //  System.out.println(Adriver.getPageSource());

        Thread.sleep(1000);


    }




    public static void RemoteLaunch_Client_B() throws InterruptedException, MalformedURLException {


        System.setProperty(Constants.Driver_name, Constants.ChromeDriver_path);
        ChromeOptions options = new ChromeOptions();
        options.setBinary(BinaryPath);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        Bdriver = new RemoteWebDriver(new URL(hubURL), options);

        Thread.sleep(7000);


        for (String hand: Bdriver.getWindowHandles()) {
            Bdriver.switchTo().window(hand);
        }


        JavascriptExecutor js = (JavascriptExecutor) Bdriver;
        Thread.sleep(1000);
        js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();"); //maximize the window via JS


    }

    public static void RemoteLaunch_Client_C() throws InterruptedException, MalformedURLException {

        String BinaryPathB = "C:\\ConnectMe_Desktop_forSVAutomation\\ConnectMe Desktop - forSVAutomation.exe";
        String huburl = "http://217.78.102.126:4444/wd/hub";

        ChromeOptions options = new ChromeOptions();
        options.setBinary(BinaryPathB);
        DesiredCapabilities capabilities = new DesiredCapabilities();


        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        Cdriver = new RemoteWebDriver(new URL(huburl), options);

        Thread.sleep(7000);


        for (String hand: Cdriver.getWindowHandles()) {
            Cdriver.switchTo().window(hand);
        }


        JavascriptExecutor js = (JavascriptExecutor) Cdriver;
        Thread.sleep(1000);
        js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();"); //maximize the window via JS


    }


    //-----Constructors remote driver----

    public static WebDriver getBdriver() {
        return Bdriver;
    }

    public static WebDriver getAdriver() {
        return Adriver;
    }

    public static WebDriver getCdriver() {
        return Cdriver;
    }




}


