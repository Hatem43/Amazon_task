package Pages.products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class SearchPage extends AddPage {

    public SearchPage(WebDriver driver){
        super(driver);
    }

    private final By item = By.xpath("//input[@id='twotabsearchtextbox']");

    private final By searchbutton = By.id("nav-search-submit-button");


    public void searchField(String itemname) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains("Today's Deals"));

       driver.findElement(item).sendKeys(itemname);
       driver.findElement(searchbutton).click();

    }

}
