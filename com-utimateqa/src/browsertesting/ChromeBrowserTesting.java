package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        //set the obj
        WebDriver driver=new ChromeDriver();
        //launch the browser
        driver.get(baseurl);
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
        password.sendKeys("123sh");
        //page sourece code
       String pagesource= driver.getPageSource();
        System.out.println(pagesource);
        //close
       // driver.close();

    }
}