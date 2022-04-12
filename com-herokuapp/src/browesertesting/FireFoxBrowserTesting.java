package browesertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTesting {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        //set the obj
        WebDriver driver=new FirefoxDriver();
        //launch the browser
        driver.get(baseurl);
        //maximize window
        driver.manage().window().maximize();
        //we get implicite time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        driver.getTitle();
        System.out.println(driver.getTitle());
        //get current url
        System.out.println("Current URL ="+driver.getTitle());
        //find the username filed element
        WebElement username=driver.findElement(By.id("username"));
        //sending username filed element
        username.sendKeys("tomsmith");
        //find password filed element
        WebElement password=driver.findElement(By.name("password"));
        //sending password filed element
        password.sendKeys("SuperSecret");
        //get page source
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //close
        driver.close();

    }

}