package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromebrowserTesting {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);//launch browser
        //give implicit manage to maximum
        driver.manage().window().maximize();
        //give implicite time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title=driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("Current url="+title);
        //find the email filed element
        WebElement username=driver.findElement(By.id("txtUsername"));
        //sending email filed element
        username.sendKeys(" Admin");
        //find pass word filed  password element
        WebElement password= driver.findElement(By.name("txtPassword"));
        //sending password filed to password filed
        password.sendKeys("admin123");





    }
}