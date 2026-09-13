package Pages.products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SelectItemPage extends AddPage {


    public SelectItemPage(WebDriver driver){
        super(driver);
    }

    public void SelectItem() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]")));
        driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]")).click();

    }
}