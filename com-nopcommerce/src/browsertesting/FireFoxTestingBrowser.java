package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTestingBrowser {
    public static void main(String[] args) {
        String baseurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //launch the url
        driver.get(baseurl);
        driver.manage().window().maximize();
        //we get impliment time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
       String title= driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("Current URL="+driver.getCurrentUrl());
        String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginurl);
        System.out.println("Current url="+driver.getCurrentUrl());
       // find the email element
        WebElement emailField=driver.findElement(By.id("Email"));
        //sending email filed element
        emailField.sendKeys("shilpa2_2010@yahoo.in");
       // find the password filed element
        WebElement passwordFiled=driver.findElement(By.name("Password"));
        //psending password to password filed
        passwordFiled.sendKeys("shilpa123");
        //get page resource
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //closing
        driver.close();





    }
}
