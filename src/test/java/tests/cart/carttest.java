package tests.cart;

import Pages.cart.CartPage;
import Pages.products.AddPage;
import Pages.products.SearchPage;
import Pages.products.SelectItemPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class carttest extends BaseTest {

    SearchPage search;
    SelectItemPage select;
    AddPage addToCart;
    CartPage cart;

    @BeforeMethod
    public void beforeMethod(){
        search = new SearchPage(driver);
        select = new SelectItemPage(driver);
        addToCart = new AddPage(driver);
        cart = new CartPage(driver);
    }

    @Test
    public void CartTest() throws InterruptedException {
      search.searchField("car accessories");
      select.SelectItem();
      String actual=addToCart.addItem();
      String actaultitle=cart.goToCartPage();
      Assert.assertEquals(actaultitle,"Amazon.com Shopping Cart");
      Assert.assertEquals(actual,"Added to cart");
      cart.removeFromCart();
    }
}