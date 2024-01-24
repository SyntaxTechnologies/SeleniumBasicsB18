package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static Utils.ConfigReader.read;

public class CommonMethods {

public  static WebDriver driver;
    public static void openBrowserAndLaunchApplication() throws IOException {
//
        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "FireFox":
                driver=new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get(read("url"));
        }


    public static void closeBrowser() {
        if(driver!= null) {
            driver.quit();
          }
    }

    public  static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropDown(WebElement dropDown, String visibleText){
        Select sel =new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }
    public static void selectFromDropDown(String value, WebElement dropDown ){
        Select sel =new Select(dropDown);
        sel.selectByValue(value);
    }
    public static void selectFromDropDown( WebElement dropDown,int index ){
        Select sel =new Select(dropDown);
        sel.selectByIndex(index);
    }

   public static WebDriverWait getwait(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICIT_WAIT));
        return  wait;
   }

   public static void waitForElementToBeClickAble(WebElement element){
        getwait().until(ExpectedConditions.elementToBeClickable(element));
   }

   public static void click(WebElement element){
        waitForElementToBeClickAble(element);
        element.click();
   }

//   frame
//    checkboxes
//    radioButtons
//    multipleWindows

}

