import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginApplication {

    //make Global Variable
    public static WebDriver driver;


    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver =  new FirefoxDriver(); // Open Web Browser
        //Open Web page by get Method_ get()
        driver.get(" https://opensource-demo.orangehrmlive.com/");
        // Find the web element and use a locator to locate the element
        //Give the input using sendkeys()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Local Variable
        WebElement userElement;
        WebElement passElement;


        //Define variable
        userElement = driver.findElement(By.name("username"));
        userElement.isDisplayed();
        userElement.clear();
        userElement.sendKeys("Admin");

        passElement = driver.findElement(By.name("password"));
        passElement.isDisplayed();
        passElement.clear();
        passElement.sendKeys("admin123");


        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
