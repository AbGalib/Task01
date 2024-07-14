import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class dropDown {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement element3 = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(element3);
        //Select By Index
        select.selectByIndex(0);
        //Select by Value
        select.selectByValue("6");
        //Select By text
        select.selectByVisibleText("Green");


    }
}
