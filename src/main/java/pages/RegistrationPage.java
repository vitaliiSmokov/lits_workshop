package pages;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class RegistrationPage {

    private static final Logger LOG = LogFactory.getLogger(RegistrationPage.class);

    @FindBy(id = "name_3_firstname")
    protected WebElement nameInput;

    @FindBy(id = "name_3_lastname")
    protected WebElement lastNameInput;

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

//    @Step("Filling name input")
    public RegistrationPage fillNameInput(String input) {
        nameInput.clear();
        nameInput.sendKeys(input);
        LOG.info("Filled name input with text: " + input);
        return this;
    }

//    @Step("Filling lastname input")
    public RegistrationPage fillLastNameInput(String input) {
        lastNameInput.clear();
        lastNameInput.sendKeys(input);
        LOG.info("Filled lastname input with text: " + input);
        return this;
    }
}
