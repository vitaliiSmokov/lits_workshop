import common.TestBase;
import org.testng.annotations.Test;

public class TestHomePage extends TestBase {

    @Test
    public void testHomePage() {

        homePage
                .clickRegistrationButn()
                .fillNameInput("username")
                .fillLastNameInput("lastname");
    }
}