package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MsedgedBrowserTesting {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        //set obj
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);
        //manage window
        driver.manage().window().maximize();
        //get the implicit the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title=driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("CurrentURL="+title);
        String loginurl="https://www.saucedemo.com/";
        //find username filed element
        WebElement username=driver.findElement(By.name("user-name"));
        //sending the filed element
        username.sendKeys("problem_user");
        //find password filed element
        WebElement password= driver.findElement(By.id("password"));
        //sending the filed element
        password.sendKeys("secret_sauce");
        //get the page source
        String pagesource=driver.getPageSource();
        System.out.println(pagesource);
        //colse the window
        driver.close();





    }
}