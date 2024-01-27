package class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        TakesScreenshot ss=(TakesScreenshot) driver;
//take ss
        File screenShot = ss.getScreenshotAs(OutputType.FILE);
//        save on computer
        FileUtils.copyFile(screenShot,new File("screenshot/image2.png"));

    }
}
