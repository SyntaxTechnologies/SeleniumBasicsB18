package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto gmail
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp38pz9MTMm0jE4s1rypYiZknsIchaU-TF-_y_1Vy2nZ-dFDDsZDs5fdZu8p5eHoN3ZRrNvZjw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-603892060%3A1704938994611810&theme=glif");
//click on the button help and privacy
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
//        get the window handle of the main page and save it in a variable
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);

//        switch the focus of the driver to the window privacy
//        get all the handles
        Set<String> allHandles = driver.getWindowHandles();
//        iterate
        for (String handle : allHandles) {
//            switch to the handle
            driver.switchTo().window(handle);
//            check if this is the desired window
            if (driver.getTitle().equals("Privacy Policy – Privacy & Terms – Google")) {
                break;
            }
        }

//        confirming that we are on privacy
        System.out.println(driver.getCurrentUrl());

//        switch the focus to main page
        driver.switchTo().window(mainPageHandle);
//        confirming that we are on main page
        System.out.println(driver.getCurrentUrl());


    }
}
