package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplaodingAfile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/upload-image.php");

        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='image-file']"));
//        please place your own file path in here
        uploadFile.sendKeys("C:\\Users\\moazzam\\Desktop\\abc.png");

    }
}
