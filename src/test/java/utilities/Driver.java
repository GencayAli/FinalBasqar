package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private  static WebDriver driver;

    public static  WebDriver  getDriver(){

        if (driver==null){

            //TODO System.SetProperty nin karisiligi olarak prijeyi chromdriver la
            // calisacak sekilde buraya set etmis olduk

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

            // firefox icinde asagidaki gibi yapiliyor
//            WebDriverManager.firefoxdriver().setup();
//            driver=new FirefoxDriver();
        }

        return driver;
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
