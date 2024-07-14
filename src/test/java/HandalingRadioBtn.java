import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandalingRadioBtn {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement element1 = driver.findElement(By.id("vfb-7-1"));

        element1.isDisplayed();

        //Select Radio Button
        if (!(element1.isSelected())) {
            element1.click();
        } else {
            System.out.println("Checkbox is already Selected!!");
        }

    }

}
