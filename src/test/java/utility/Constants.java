package utility;

import org.openqa.selenium.TakesScreenshot;

import java.io.*;
import java.util.Date;

public class Constants {

    /*---------Credentials ---------------*/
    public static String BinaryPath = "C:\\softphone\\RTC_Soft_Phone_SB1_Cisco_Video\\RTC Soft Phone SB1 Cisco Video.exe";

    /*Ribbon AS path:  C:\softphone\RTC_Soft_Phone_SB1_RibbonAS_Video\RTC Soft Phone SB1 RibbonAS Video.exe
    * KBS.UCC path = C:\softphone\RTC_Soft_Phone_KBSUCC\RTC Soft Phone KBS-UCC.exe */
    public static String config = "Cisco";
    public static String hubURL = "http://217.78.109.210:4444/wd/hub";
    public static String ChromeDriver_path = "C:\\softphone\\chromedriver.exe";
    public static String Driver_name ="webdriver.chrome.driver";
    public static String Screenshot_folder ="D:\\Users\\myol\\automation\\RTC_automation_1\\test-output\\ScreenShot";

    public static void copyLatestExtentReport() throws IOException {  // takes the latest report an give it a name with the current date
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");
        File source = new File(System.getProperty("user.dir") +File.separator+"output"+File.separator+"report.html");
        File dest = new File(System.getProperty("user.dir") +File.separator+"output"+File.separator+ date.toString() + ".html");
        copyFileUsingStream(source, dest);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

        } finally {
            is.close();
            os.close();
        }
    }


}
