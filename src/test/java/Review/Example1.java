package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        //        initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
//       maximnize
        driver.manage().window().maximize();
//        goto fb.com
        driver.get("https://www.fb.com");

//        get the create new account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();

//        send the name
//        WebElement name = driver.findElement(By.name("firstname"));
//        name.sendKeys("john");

        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("john");


    }
}
