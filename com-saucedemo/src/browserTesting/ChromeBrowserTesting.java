package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        //set obj
        WebDriver driver=new ChromeDriver();
        driver.get(baseurl);
        //set window maximize
        driver.manage().window().maximize();
        //we give implisite to get time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title= driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("Current url="+title);
        //find the username files element
        WebElement username=driver.findElement(By.id("user-name"));
        //sending username field element
        username.sendKeys("locked_out_user");
        //find the password fild element
        WebElement password=driver.findElement(By.id("password"));
        //sending password filed element
        password.sendKeys("secret_sauce");
        //get the pagesource
       String pagesource= driver.getPageSource();
        System.out.println(pagesource);
        //close
        driver.close();



    }
}