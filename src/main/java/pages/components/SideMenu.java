package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.RegistrationPage;

public class SideMenu extends TopMenu{

    @FindBy(id = "menu-item-374")
    WebElement registrationButn;

    WebDriver driver;

    public SideMenu(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegistrationPage clickRegistrationButn(){
        registrationButn.click();
        return PageFactory.initElements(driver, RegistrationPage.class);
    }
}
