import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Task01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {

            System.out.println("Opening web application...");
            driver.get("https://cbhis-vm-demo.arcapps.org");


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


            System.out.println("Logging in...");

            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));

            usernameField.sendKeys("testuser");
            passwordField.sendKeys("tester2024");
            loginButton.click();
            System.out.println("Login successful!");


        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            System.out.println("Execution completed. The browser will remain open.");
        }
    }
}
