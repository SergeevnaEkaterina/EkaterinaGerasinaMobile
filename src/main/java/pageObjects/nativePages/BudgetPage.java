package pageObjects.nativePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

public class BudgetPage extends BasePage {

    @AndroidFindBy(id = PACKAGE + "id/action_bar")
    WebElement actionBar;

    public BudgetPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    public boolean checkBudgetActivityPresence() {
        return actionBar.isDisplayed();
    }

}
