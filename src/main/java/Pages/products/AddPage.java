package Pages.products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AddPage{

    public WebDriver driver;
    private final By addToCartButton = By.id("add-to-cart-button");

    public AddPage(WebDriver driver){
        this.driver=driver;
        }

    public String addItem() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(addToCartButton).click();
        WebElement actualmessage=driver.findElement(By.xpath("//h1[normalize-space()='Added to cart']"));
        String messagevalue=actualmessage.getText();
        return messagevalue;

    }
    }

