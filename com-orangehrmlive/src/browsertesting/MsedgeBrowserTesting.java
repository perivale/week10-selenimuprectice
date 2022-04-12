package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MsedgeBrowserTesting {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","Driver/msedgedriver.exe");
        //create obj
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);
        //manage maximum window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.getTitle();
        System.out.println(driver.getTitle());
        //get current url
        System.out.println("Current Url="+driver.getTitle());
        //find the user element
        WebElement username=driver.findElement(By.id("txtUsername"));
        //sending username filed element
        username.sendKeys("Admin");
        //find the password element
        WebElement password=driver.findElement(By.name("txtPassword"));
        //sending password to password filed
        password.sendKeys("admin123");





    }

}
