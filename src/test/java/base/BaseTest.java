package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException {

       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
    }

     @AfterSuite

    public void teardown(){
        driver.quit();
    }

    }

