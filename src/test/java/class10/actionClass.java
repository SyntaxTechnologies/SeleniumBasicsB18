package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//        hover
        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action= new Actions(driver);
//        add .perform after the desired action
        action.moveToElement(hover).perform();

//        get the button right click
        WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click!']"));
        action.contextClick(rightClick).perform();

//        dragable
        WebElement dragable = driver.findElement(By.id("draggable"));
//        droplocation
        WebElement dropLoc = driver.findElement(By.id("droppable"));
//        action.dragAndDrop(dragable,dropLoc).perform();
// we use build at end if we are chaining different actions together
        action.clickAndHold(dragable).moveToElement(dropLoc).release().build().perform();


    }
}
