import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParabankTest {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com");

        WebElement linkRegister = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));

        linkRegister.click();

        WebElement firstName = driver.findElement(By.id("customer.firstName"));

        firstName.sendKeys("Test");

        WebElement lastName = driver.findElement(By.id("customer.lastName"));

        lastName.sendKeys("QA");

    }
}
