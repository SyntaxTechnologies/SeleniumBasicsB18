package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        click on the first button and get the text out of it and display on console
        driver.findElement(By.xpath("//button[@id='show_text_synchronize']")).click();

        WebElement text1 = driver.findElement(By.xpath("//div[@class='card-body']/p"));
        System.out.println(text1.getText());
    }
}
