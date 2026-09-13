package tests.Home;
import Pages.products.SearchPage;
import Pages.products.SelectItemPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchpagetest extends BaseTest {

     SearchPage searchpage;
     SelectItemPage select;

    @BeforeMethod
    public void setupmethod(){
        searchpage = new SearchPage(driver);
        select = new SelectItemPage(driver);
    }

        @Test
        public void search() throws InterruptedException {
        searchpage.searchField("car accessories");
            String titlepage = driver.getTitle();
            Assert.assertEquals(titlepage,"Amazon.com : car accessories");
        }
        @Test
    public void selectitem() throws InterruptedException {

        select.SelectItem();
        }

}
