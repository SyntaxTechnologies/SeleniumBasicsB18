package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
//        initiate the instance of WebDriver
       WebDriver driver=new ChromeDriver();
//       maximnize
        driver.manage().window().maximize();
//        goto google.com
        driver.get("https://www.google.com");

//        facebook.com
        driver.navigate().to("https://www.fb.com");
//        go back to google.com
        driver.navigate().back();
        Thread.sleep(2000);
//        go back to fb.com
        driver.navigate().forward();
//refresh
        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.close();



    }
}
