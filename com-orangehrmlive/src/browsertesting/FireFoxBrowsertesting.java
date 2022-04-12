package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowsertesting {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();//call obj
        driver.get(baseurl);
        //manage maximum window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.getTitle();
        System.out.println(driver.getTitle());
        //get current url
        System.out.println("current url="+driver.getTitle());
        //find the user filed element
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        //find the password filed element
        WebElement password=driver.findElement(By.name("txtPassword"));
        password.sendKeys("admin123");




    }
}
