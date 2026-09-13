package tests.products;
import Pages.products.AddPage;
import Pages.products.SearchPage;
import Pages.products.SelectItemPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class productstest extends BaseTest {
    SearchPage searchpage;
    SelectItemPage select;
    AddPage addtoCart;


    @BeforeMethod
    public void beforeMethod(){
        searchpage = new SearchPage(driver);
        select = new SelectItemPage(driver);
        addtoCart = new AddPage(driver);
    }

    @Test
    public void productstest() throws InterruptedException {
        searchpage.searchField("car accessories");
        select.SelectItem();
        String actual=addtoCart.addItem();
        Assert.assertEquals(actual,"Added to cart");
    }
}
