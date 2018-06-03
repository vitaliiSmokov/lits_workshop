import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrowser extends TestBase {

    @Test
    public void testBrowser() {
        driver.get("https://google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com"));
    }
}
