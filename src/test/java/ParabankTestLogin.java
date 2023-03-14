import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParabankTestLogin {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com");
    }

    @Test
    public void TC0001(){
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
        userName.sendKeys("testuser");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
        txtPassword.sendKeys("weqıewqoııoeqwoıeqwoıeoqıwoıewqoıeowıqoıeqwıowqeıoewıoqoıqew");


       driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();

    }

    @Test
    public void TC0002(){

        WebElement password = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
        password.sendKeys("weqıewqoııoeqwoıeqwoıeoqıwoıewqoıeowıqoıeqwıowqeıoewıoqoıqew");


        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();

    }

    @AfterTest
    public void after(){
        driver.quit();
    }

}
