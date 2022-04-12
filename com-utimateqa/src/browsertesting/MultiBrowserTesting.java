package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser = "chrome";
    static String url = "http://the-internet.herokuapp.com/login";
    static String driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        //set the obj
        WebDriver driver=new ChromeDriver();
        //launch the browse
            driver.get(url);
        //manage window
        driver.manage().window().maximize();
        // get the implicit window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title
        String title= driver.getTitle();
        System.out.println(title);
        //get my url
        System.out.println("CURRENT URL="+driver.getTitle());
        String loginurl ="https://courses.ultimateqa.com/users/sign_in";
        //find email element
        WebElement emailid=driver.findElement(By.id("user[email]"));
        //sending to email id element
        emailid.sendKeys("prime123@gmail.com");
        //find password element
        WebElement password =driver.findElement(By.name("user[password]"));
        //sending the passowrd to passowrd filed
        password.sendKeys("SuperSecret");
        //page sourece code
        String pagesource= driver.getPageSource();
        System.out.println(pagesource);

    }else if(browser.equalsIgnoreCase("Firefox")){
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        //set obj
        WebDriver driver=new FirefoxDriver();
        driver.get(url);//launch browser
        //manage window
        driver.manage().window().maximize();
        // give time to implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title
        String title= driver.getTitle();
        System.out.println(title);
        //current url
        System.out.println("currentURL="+driver.getCurrentUrl());
        String loginurl="Current URL="+"https://courses.ultimateqa.com/users/sign_in";
        //find the email filed element
        WebElement emailid= driver.findElement(By.name("user[email]"));
        //sending the email filed element
        emailid.sendKeys("shilpa2@gmile.com");
        //find the eamil filed element
        WebElement password=driver.findElement(By.id("user[password]"));
        //sending the  email filed element
        password .sendKeys("SuperSecret");
        //pagesource code
        driver.getPageSource();
        System.out.println(driver.getPageSource());
    }
    else if(browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            //set obj
            WebDriver driver = new EdgeDriver();
            //launch browser
            driver.get(browser);
            //manage window
            driver.manage().window().maximize();
            // give time to implicit time
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            // get the title
            String title = driver.getTitle();
            System.out.println(title);
            //current url
            System.out.println("currentURL=" + driver.getCurrentUrl());
            String loginurl = "Current URL=" + "https://courses.ultimateqa.com/users/sign_in";
            //find the email filed element
            WebElement emailid = driver.findElement(By.name("user[email]"));
            //sending the email filed element
            emailid.sendKeys("123sh@gmail.com");
            //find the eamil filed element
            WebElement password = driver.findElement(By.id("user[password]"));
            //sending the  email filed element
            password.sendKeys("SuperSecret");
            //pagesource code
            driver.getPageSource();
            System.out.println(driver.getPageSource());
        }else{
            System.out.println("Invalid browser found");
}}


}





