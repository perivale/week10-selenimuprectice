package browesertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser ="chrome";
    static String url = "http://the-internet.herokuapp.com/login";
    static String driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            //create obj
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            //manage window
            driver.manage().window().maximize();
            //set time
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title = driver.getTitle();
            System.out.println(driver.getTitle());
            //get current url
            System.out.println("current url" + driver.getTitle());
            //find the username name filed element
            WebElement username = driver.findElement(By.name("username"));
            //sending email fild element
            username.sendKeys("tomsmith");
            //find the password field element
            WebElement password = driver.findElement(By.id("password"));
            //sending password filed element
            password.sendKeys("SuperSecret");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            //set the obj
            WebDriver driver = new FirefoxDriver();
            //launch the browser
            driver.get(url);
            //maximize window
            driver.manage().window().maximize();
            //we get implicite time to drive
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            //get the title of the page
            driver.getTitle();
            System.out.println(driver.getTitle());
            //get current url
            System.out.println("Current URL =" + driver.getTitle());
            //find the username filed element
            WebElement username = driver.findElement(By.id("username"));
            //sending username filed element
            username.sendKeys("tomsmith");
            //find password filed element
            WebElement password = driver.findElement(By.name("password"));
            //sending password filed element
            password.sendKeys("SuperSecret");

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            //set the obj
            WebDriver driver=new EdgeDriver();
            driver.get(url);
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
        }
        else {
            System.out.println("invalid bowser found");
        }

    }}