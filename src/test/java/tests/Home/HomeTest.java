package tests.Home;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test
    public void checkdealspage(){
        String pageurl = driver.getCurrentUrl();
        Assert.assertEquals(pageurl,"https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
    }
}
