package utility;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BaseA extends driver_factory {






    //-----Teardown method----	    

    public static void teardownA() {
        Adriver.quit();

    }


    //---read JSON file---


    public static String readjsonfile(String path, String key) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(path));
        JSONObject jo = (JSONObject) obj;
        String value = (String) jo.get(key);

        System.out.println(value);
        return value;

    }


    // method that helps to click on certain clickable elements

    public static void clickA(String sel) {

        By by = getByA(sel);
        waitForElementVisibilityOfA(sel);
        WebElement el = Adriver.findElement(by);
        el.click();

    }


    public void actionMoveAndClick(String sel) throws Exception {

        By by = getByA(sel);

        WebElement el = Adriver.findElement(by);
        Actions action = new Actions(Adriver);
        WebDriverWait wait = new WebDriverWait(Adriver, 30);

        try {
            waitForElementClickableA(sel);
            action.moveToElement(el).click().build().perform();
            System.out.println("Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + by.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = el;
            Boolean elementPresent =  wait.until(ExpectedConditions.elementToBeClickable(by)).isEnabled();
            if (elementPresent == true) {
                action.moveToElement(el).click().build().perform();
                System.out.println("(Stale Exception) - Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + el.toString() + ">");
            }
        } catch (Exception e) {
            System.out.println("Unable to Action Move and Click on the WebElement, using locator: " + "<" + el.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement, Exception: " + e.getMessage());
        }
    }



    // method that helps to select on certain clickable elements

    public static void selectA(String sel) {

        By by = getByA(sel);
        waitForElementClickableA(sel);
        WebElement el = Adriver.findElement(by);
        Actions action = new Actions(Adriver);
        action.moveToElement(el).click().build().perform();
     // action.moveToElement(el).doubleClick().build().perform();

    }

    // method that helps to right click on certain elements    
    public static void right_click_A(String sel) {

        By by = getByA(sel);
        waitForElementClickableA(sel);
        WebElement el = Adriver.findElement(by);
        Actions action = new Actions(Adriver);
        action.moveToElement(el).contextClick().build().perform();

    }





    // method that helps to type sth into certain input fields
    public static void typeA(String keys, String sel) {

        By by = getByA(sel);
        waitForElementVisibilityOfA(sel);
        WebElement el = Adriver.findElement(by);
        el.sendKeys(keys);
    }

    // method that helps to verify the text of a certain locator, if it is wrong, takes a screenshot

    public static void verifyA(String keys, String sel) throws Exception {

            Thread.sleep(1000);
        try {

            By by = getByA(sel);

            WebElement myDynamicElement = (new WebDriverWait(Adriver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(by));

            String text = myDynamicElement.getText();

            Assert.assertTrue(keys.equalsIgnoreCase(text));
            System.out.println("UserA can see " + "< " + text + " > element," +
                " Scenario is going well so far for userA!");


        } catch (AssertionError error) {

            By by = getByA(sel);
            WebElement myDynamicElement = (new WebDriverWait(Adriver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(by));

               String text = myDynamicElement.getText();
            //  System.out.println(text);

            Assert.assertTrue(keys.equalsIgnoreCase(text));
            System.out.println("Second try with catch! UserA can see " + "< " + text + " > element," +
                " Scenario is going well so far for userA!");

        } catch (Exception e) {

            Assert.fail("Could not find the " + keys);
        }

    }


    public static void verify_presence_A(String sel) throws Exception {

        Thread.sleep(1000);
        By by = getByA(sel);

        try {

            WebDriverWait wait = new WebDriverWait(Adriver, 60);

            wait.until(ExpectedConditions.visibilityOfElementLocated(by));


            System.out.println("UserA verifies that " + "< " + sel + " > is present," +
                    " Scenario is going well so far for userA!");

        } catch (AssertionError error) {


            WebDriverWait wait = new WebDriverWait(Adriver, 60);

            wait.until(ExpectedConditions.presenceOfElementLocated(by));


            System.out.println("UserA verifies that " + "< " + sel + " > is present," +
                    " Scenario is going well so far for userA!");


        } catch (Exception e) {

            Assert.fail(" ------>  Could not find the " + sel + " element");
        }

    }






    // method that helps to choose correct locator from the selectors.properties file
    public static By getByA(String sel) {

        By by = null;
        if (!sel.contains("//"))
            by = By.id(sel);
        else if (sel.contains("//"))
            by = By.xpath(sel);
        else
            System.err.println("Undefined selector type" + sel);

        return by;
    }

    // method that helps to wait certain elements to wait to be visible
    public static void waitForElementVisibilityOfA(String sel) {

        By by = getByA(sel);

        WebDriverWait wait = new WebDriverWait(Adriver, 60);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public static void waitForElementClickableA(String sel) {

        By by = getByA(sel);

        WebDriverWait wait = new WebDriverWait(Adriver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void waitForPresenceOfElementA(String sel) {

        By by = getByA(sel);

        WebDriverWait wait = new WebDriverWait(Adriver, 30);

        wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }





    // method that helps to take a screenshot

    public static void screenshotA(String capture) throws IOException {

        File file = ((TakesScreenshot) Adriver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");
        String ScreenShotFileName = dateFormat.format(new Date());
        FileUtils.copyFile(file, new File(Constants.Screenshot_folder + capture + "_" + ScreenShotFileName + ".jpg"));

    }

    // This method moves the files and sub-folders of previous test output under test-output folder

    public static void Take_TestOutput_Backup() throws IOException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");
        String destFilename = dateFormat.format(new Date());
        File srcFolder = new File("./test-output");
        File destFolder = new File("D:\\" + "Execution_Archive_" + destFilename);
        System.out.println("This test is done at " + destFilename + " test output is being moved to " + "D:\\" + "Execution_Archive_" + destFilename);

        //make sure source exists
        if (!srcFolder.exists()) {
            System.out.println("Directory does not exist at mentioned location.");
            //just exit
            System.exit(0);
        } else {

            try {
                copy_Folder(srcFolder, destFolder);
                FileUtils.cleanDirectory(srcFolder);
            } catch (IOException e) {
                e.printStackTrace();
                //error, just exit
                System.exit(0);
            }
        }
    }


    //This method copies one folder to another

    public static void copy_Folder(File src, File dest)
    throws IOException {

        if (src.isDirectory()) {
            //if directory not exists, create it
            if (!dest.exists()) {
                dest.mkdir();
                System.out.println("Directory copied from " +
                    src + " to " + dest);
            }
            //list all the directory contents
            String files[] = src.list();

            for (String file: files) {
                //construct the src and dest file structure
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                //recursive copy
                copy_Folder(srcFile, destFile);
            }

        } else {
            //if file, then copy it.
            //Use bytes stream to support all file types
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = in .read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            in .close();
            out.close();
            System.out.println("File copied from " + src + " to " + dest);

        }
    }







}