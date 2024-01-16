package review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

//        click on the button enable checkboxes
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableButton.click();

//        finding all the checkboxes
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
//        iterate
        for(WebElement checkBox: allCheckboxes){
            String option = checkBox.getAttribute("value");
            if(option.equals("Checkbox-1") || option.equals("Checkbox-4")){
                checkBox.click();

            }

        }

    }
}
