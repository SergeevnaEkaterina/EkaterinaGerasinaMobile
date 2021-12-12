package pageObjects.nativePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import model.Parameters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

public class RegistrationPage extends BasePage {

    @AndroidFindBy(id = PACKAGE + "id/registration_email")
    WebElement registerEmail;

    @AndroidFindBy(id = PACKAGE + "id/registration_username")
    WebElement registerUsername;

    @AndroidFindBy(id = PACKAGE + "id/registration_password")
    WebElement registerPassword;

    @AndroidFindBy(id = PACKAGE + "id/registration_confirm_password")
    WebElement confirmPassword;

    @AndroidFindBy(id = PACKAGE + "id/register_new_account_button")
    WebElement registerNewAccBtn;

    public RegistrationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    public StartPage registerNewUser(Parameters parameters) {
    registerEmail.sendKeys(parameters.getEmail());
    registerUsername.sendKeys(parameters.getUserName());
    registerPassword.sendKeys(parameters.getPassword());
    confirmPassword.sendKeys(parameters.getPassword());
    registerNewAccBtn.click();
    return new StartPage(appiumDriver);
    }

}
