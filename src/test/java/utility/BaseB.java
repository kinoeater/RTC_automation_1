package utility;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseB extends driver_factory {




    // method that helps to select on certain elements

    public static void selectB(String sel) {

        By by = getByB(sel);
        waitForElementClickableB(sel);
        WebElement el = Bdriver.findElement(by);
        Actions action = new Actions(Bdriver);
        action.moveToElement(el).click().build().perform();

    }


    // method that helps to right click on certain elements

    public static void right_click_B(String sel) {

        By by = getByB(sel);
        waitForElementVisibilityOfB(sel);
        WebElement el = Bdriver.findElement(by);
        Actions action = new Actions(Bdriver);
        action.moveToElement(el).contextClick().build().perform();

    }


    //method that helps to click on certain clickable elements

    public static void clickB(String sel) {

        By by = getByB(sel);
        waitForElementVisibilityOfB(sel);
        WebElement el = Bdriver.findElement(by);
        el.click();

    }

    // method that helps to type sth into certain input fields
    public static void typeB(String keys, String sel) {

        By by = getByB(sel);
        waitForElementVisibilityOfB(sel);
        WebElement el = Bdriver.findElement(by);


        el.sendKeys(keys);
    }

    // method that helps to verify the text of a certain locator, if it is wrong, takes a screenshot

    public static void verifyB(String keys, String sel) throws Exception {

        Thread.sleep(1000);
        try {

            By by = getByB(sel);
            WebElement myDynamicElement = (new WebDriverWait(Bdriver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(by));

            String text = myDynamicElement.getText();

            Assert.assertTrue(keys.equalsIgnoreCase(text));
            System.out.println("UserB can see " + "< " + text + " > element, " +
                "Scenario is going well so far for User B!");

        } catch (AssertionError error) {

            By by = getByB(sel);
            WebElement myDynamicElement = (new WebDriverWait(Bdriver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(by));

            String text = myDynamicElement.getText();
        //    System.out.println(text);

            Assert.assertTrue(keys.equalsIgnoreCase(text));
            System.out.println("Scond try with catch! UserB can see " + "< " + text + " > element," +
                " Scenario is going well so far for userB!");



            // Assert.fail("Could not find the " + keys);

        } catch (Exception e) {

            Assert.fail("Could not find the " + keys);
        }

    }


    // method that helps to take a screenshot

    public static void screenshotB(String capture) throws IOException {

        File file = ((TakesScreenshot) Bdriver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ss");
        String ScreenShotFileName = dateFormat.format(new Date());
        FileUtils.copyFile(file, new File(Constants.Screenshot_folder  + capture + "_" + ScreenShotFileName + ".jpg"));

    }


    // method that helps to choose correct locator from the selectors.properties file
    public static By getByB(String sel) {

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
    public static void waitForElementVisibilityOfB(String sel) {

        By by = getByB(sel);

        WebDriverWait wait = new WebDriverWait(Bdriver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public static void waitForElementClickableB(String sel) {

        By by = getByB(sel);

        WebDriverWait wait = new WebDriverWait(Bdriver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void waitForPresenceOfElementA(String sel) {

        By by = getByB(sel);

        WebDriverWait wait = new WebDriverWait(Bdriver, 30);

        wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public static void teardownB() {

        Bdriver.quit();

    }


    public static void flashB(String sel) throws Throwable {

        JavascriptExecutor js = ((JavascriptExecutor) Bdriver);
        By by = getByB(sel);
        WebElement element = Bdriver.findElement(by);
        String bgcolor = element.getCssValue("backgroundColor");

        changeColorB("rgb(0,200,0)", element);

        Thread.sleep(2000);
        changeColorB(bgcolor, element);



    }

    public static void changeColorB(String color, WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) Bdriver);
        js.executeAsyncScript("arguments[0].style.backgroundColor ='" + color + "'", element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {

        }
    }







}