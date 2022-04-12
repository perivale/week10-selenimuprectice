package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
 static String browser ="chrome";
    static String url = "https://www.saucedemo.com/";
    static String driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            //set obj
            WebDriver driver=new ChromeDriver();
            driver.get(url);
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

        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            //set the obj
            WebDriver driver=new FirefoxDriver();
            driver.get(url);
            //set the window maximize
            driver.manage().window().maximize();
            //get the implicite size
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            //get the title of the page
            driver.getTitle();
            System.out.println(driver.getTitle());
            //get the current url
            System.out.println("Current url="+driver.getTitle());
            //find the username files element
            WebElement username=driver.findElement(By.id("user-name"));
            //sending the username filed element
            username.sendKeys("standard_user");
            //find the password filed element
            WebElement password =driver.findElement(By.name("password"));
            //sending the filed element
            password.sendKeys("secret_sauce");
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            //set obj
            WebDriver driver=new EdgeDriver();
            driver.get(url);
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

        }
        else{
            System.out.println("Invalid bowser found");
        }
    }


}
