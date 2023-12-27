package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
// instiating the isntance of chrome driver
        WebDriver driver= new ChromeDriver();
//        maximize the screen
        driver.manage().window().maximize();

//goto a url
      driver.get("https://www.google.com");
//        driver.manage().window().fullscreen();

// get the title
        String title = driver.getTitle();
        System.out.println("the title of the page is "+ title);

//        get the url of the page
        String url = driver.getCurrentUrl();
        System.out.println("the url is "+url);
// slow down code
        Thread.sleep(4000);
//        close the window
        driver.quit();


    }
}
