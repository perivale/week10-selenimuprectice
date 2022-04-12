package browesertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MsadgeBrowserTesting {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        //set the obj
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);
        //manage the window
        driver.manage().window().maximize();
        // we get implicit time to get
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the value to title
        driver.getTitle();
        System.out.println(driver.getTitle());
        //get current url
        System.out.println("Current url="+driver.getTitle());
        //find the username filed element
        WebElement username=driver.findElement(By.name("username"));
        //sending username fild element
        username.sendKeys("tomsmith");
        //find the password filed element
        WebElement password =driver.findElement(By.id("password"));
        //sending the password filed element
        password.sendKeys("SuperSecret");
        driver.getPageSource();
        //get page source
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        //close
        driver.close();

    }
}
