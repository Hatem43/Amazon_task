package Pages.cart;
import Pages.products.AddPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class CartPage extends AddPage {

    public CartPage(WebDriver driver){

        super(driver);
    }

    private final By cartIcon = By.id("nav-cart-count-container");


    public String goToCartPage(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(cartIcon).click();
        String title=driver.getTitle();
        return title;

    }

    public void removeFromCart() throws InterruptedException {
        WebElement deleteButton = driver.findElement(By.xpath("//span[@class='a-icon a-icon-small-trash']"));
        deleteButton.click();
    }

    public void gotocheckout(){
        WebElement checkoutbutton=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
        checkoutbutton.click();
    }
}
