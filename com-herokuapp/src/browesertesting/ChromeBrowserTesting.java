package browesertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        //create obj
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);
        //manage window
        driver.manage().window().maximize();
        //set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       String title= driver.getTitle();
        System.out.println(driver.getTitle());
        //get current url
        System.out.println("current url"+driver.getTitle());
        //find the username name filed element
        WebElement username=driver.findElement(By.name("username"));
        //sending email fild element
        username.sendKeys("tomsmith");
        //find the password field element
        WebElement password= driver.findElement(By.id("password"));
        //sending password filed element
        password.sendKeys("SuperSecret");
        //get page source
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //close
        driver.close();

    }
}