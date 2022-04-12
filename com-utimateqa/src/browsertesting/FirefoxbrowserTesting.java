package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxbrowserTesting {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        //set obj
        WebDriver driver=new FirefoxDriver();
        driver.get(baseurl);//launch browser
        //manage window
        driver.manage().window().maximize();
        // give time to implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title
        String title= driver.getTitle();
        System.out.println(title);
        //current url
        System.out.println("currentURL="+driver.getCurrentUrl());
        String loginurl="Current URL="+"https://courses.ultimateqa.com/users/sign_in";
        //find the email filed element
        WebElement emailid= driver.findElement(By.name("user[email]"));
        //sending the email filed element
        emailid.sendKeys("shilpa2_2010@yahoo.com");
        //find the eamil filed element
        WebElement password=driver.findElement(By.id("user[password]"));
        //sending the  email filed element
        password .sendKeys("sh123");
        //pagesource code
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //close
      //  driver.close();



    }
}