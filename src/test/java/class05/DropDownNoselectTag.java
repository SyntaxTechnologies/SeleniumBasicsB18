package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownNoselectTag {
    public static void main(String[] args) {

            WebDriver driver=new ChromeDriver();
//
            driver.manage().window().maximize();

//        goto syntax projects.com
            driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php#");

//            find the dropDown and perform a click operation
        WebElement dd = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dd.click();
//        find all the options and select your desired destination

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for(WebElement option:options){
            String optionText = option.getText();
            if(optionText.equals("japan")){
                option.click();
            }
        }
    }
}
