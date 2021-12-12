package pageObjects.nativePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import model.Parameters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

public class StartPage extends BasePage {

    @AndroidFindBy(id = PACKAGE + "id/login_email")
    WebElement signInUsernameField;

    @AndroidFindBy(id = PACKAGE + "id/login_pwd")
    WebElement signInPasswordField;

    @AndroidFindBy(id = PACKAGE + "id/email_sign_in_button")
    WebElement signInBtn;

    @AndroidFindBy(id = PACKAGE + "id/register_button")
    WebElement registerBtn;

    public StartPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    public RegistrationPage goToRegistration() {
        registerBtn.click();
        return new RegistrationPage(appiumDriver);
    }

    public BudgetPage login(Parameters parameters) {
        signInUsernameField.sendKeys(parameters.getEmail());
        signInPasswordField.sendKeys(parameters.getPassword());
        signInBtn.click();
        return new BudgetPage(appiumDriver);
    }

}
