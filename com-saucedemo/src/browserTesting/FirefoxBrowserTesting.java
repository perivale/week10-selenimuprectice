package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class FirefoxBrowserTesting {
    public static void main(String[] args) {
        String baseurl="https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        //set the obj
        WebDriver driver=new FirefoxDriver();
        driver.get(baseurl);
        //set the window maximize
        driver.manage().window().maximize();
        //get the implicite size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        driver.getTitle();
        System.out.println(driver.getTitle());
        //get the current url
        System.out.println("Current url="+driver.getTitle());
        //find the username files element
        WebElement username=driver.findElement(By.id("user-name"));
        //sending the username filed element
        username.sendKeys("standard_user");
        //find the password filed element
        WebElement password =driver.findElement(By.name("password"));
        //sending the filed element
        password.sendKeys("secret_sauce");
        //get the page source
       String getcode= driver.getPageSource();
        System.out.println(getcode);
        //close window
        driver.close();







          }    }