package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplcitWaits {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

//        find the button for the alert
        driver.findElement(By.xpath("//button[@id='show_alert']")).click();
// explicit wait for alert to appear
//       declaration
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
//        move the focus to alert and accept it
        driver.switchTo().alert().accept();

//        click on the button to change text
        driver.findElement(By.xpath("//button[@id='changetext_button']")).click();

//        wait until the text changes and then get the chnaged text
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement textElement = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textElement.getText());



    }
}
