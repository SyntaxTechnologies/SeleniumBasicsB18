package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://www.ebay.com/");
//        get all the links from ebay.com and print on screen

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for(WebElement link:allLinks){
//extract the text from the webElement
            String text = link.getText();
            System.out.println(text);
//extract the link from the webelement
            String linkAddress = link.getAttribute("href");
            System.out.println(linkAddress);

        }

    }
}
