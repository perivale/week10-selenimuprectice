package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTestingBrowser {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);//launch the url
        driver.manage().window().maximize();//maximize window
        ///we give imlicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title=driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("Current url="+driver.getCurrentUrl());
        String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginurl);
        System.out.println("Current URL ="+driver.getCurrentUrl());
        //find the email filed element
        WebElement emailfilde=driver.findElement(By.id("Email"));
        //sending email filed element
        emailfilde.sendKeys("shilpa2_2010@yahoo.in");
        //find the eamil filed element
        WebElement passwordfiled=driver.findElement(By.name("Password"));
        //sending password to password filed
        passwordfiled.sendKeys("shilpa123");
        //get page resource
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //close
        driver.close();


    }
}