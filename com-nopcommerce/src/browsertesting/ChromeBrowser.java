package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create obj
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title=driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("Current Url="+driver.getCurrentUrl());
        String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        //find the email field element
        WebElement emailField= driver.findElement(By.id("Email"));
        //sending email filed element
        emailField.sendKeys("shilpa2_2010@yahoo.in");
        //find the password filed element
        WebElement passwordField=driver.findElement(By.name("Password"));
        //sending password to password filed element
        passwordField.sendKeys("prime123");
        //get page source
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //closing driver
        driver.close();


    }
}
