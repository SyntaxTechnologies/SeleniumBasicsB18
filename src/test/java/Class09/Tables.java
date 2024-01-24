package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();



//        iterate over to find the row number of the desired id


        boolean notFound=true;
        while (notFound) {//false
            int count = 0;
         //get the id column
            List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            for (WebElement id : ids) {
                if (id.getText().equals("103333A")) {
                    System.out.println("the row number is" + (count + 1));
//                click on the checkbox
                    String xpath = "//table/tbody/tr[" + (count + 1) + "]/td[1]";
                    WebElement checkBox = driver.findElement(By.xpath(xpath));
                    checkBox.click();
                    notFound=false;
                }
                count = count + 1;
            }
//            click on the next page
            if(notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}


///9
