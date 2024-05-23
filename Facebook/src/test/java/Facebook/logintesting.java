package Facebook;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class logintesting {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        WebElement inputEmail =driver.findElement(By.id("email"));
        inputEmail.sendKeys("dummymail@gmail.com");
        WebElement password =driver.findElement(By.id("pass"));
        password.sendKeys("132071");
         WebElement button =driver.findElement(By.name("login"));
         button.click();

    }


}
