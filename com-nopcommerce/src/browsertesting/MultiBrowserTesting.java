package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MultiBrowserTesting {

        static String browser ="chrome";
        static String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        static String driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);//browser launch
            //manage maximize
            driver.manage().window().maximize();
            //get time implicite
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title=driver.getTitle();
            System.out.println(title);
            //get current url
            System.out.println("Current Url="+driver.getCurrentUrl());
            String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
            //find the email field element
            WebElement emailField= driver.findElement(By.id("Email"));
            //sending email filed element
            emailField.sendKeys("shilpa5_2010@yahoo.in");
            //find the password filed element
            WebElement passwordField=driver.findElement(By.name("Password"));
            //sending password to password filed element
            passwordField.sendKeys("sh123");
            //get page source
            driver.getPageSource();
            System.out.println(driver.getPageSource());


        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
            WebDriver driver1 = new FirefoxDriver();
            driver1.get(url);
            //manage maximize
            driver1.manage().window().maximize();
            //get time implicite
            driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title= driver1.getTitle();
            System.out.println(title);
            //get current url
            System.out.println("Current Url="+driver1.getCurrentUrl());
            String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
            //find the email field element
            WebElement emailField= driver1.findElement(By.id("Email"));
            //sending email filed element
            emailField.sendKeys("shilpa2_2010@yahoo.in");
            //find the password filed element
            WebElement passwordField=driver1.findElement(By.name("Password"));
            //sending password to password filed element
            passwordField.sendKeys("prime123");
            //get page source
            driver1.getPageSource();
            System.out.println(driver1.getPageSource());
            //closing driver
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
            WebDriver webDriver = new EdgeDriver();
            webDriver.get(url);
            //manage maximize
            webDriver.manage().window().maximize();
            //get time implicite
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title= webDriver.getTitle();
            System.out.println(title);
            //get current url
            System.out.println("Current Url="+webDriver.getCurrentUrl());
            String loginurl="https://demo.nopcommerce.com/login?returnUrl=%2F";
            //find the email field element
            WebElement emailField= webDriver.findElement(By.id("Email"));
            //sending email filed element
            emailField.sendKeys("shilpa2_2010@yahoo.in");
            //find the password filed element
            WebElement passwordField=webDriver.findElement(By.name("Password"));
            //sending password to password filed element
            passwordField.sendKeys("prime123");
            //get page source
            webDriver.getPageSource();
            System.out.println(webDriver.getPageSource());
        } else {
            System.out.println("Invalid browser found");
        }

        }


    }




