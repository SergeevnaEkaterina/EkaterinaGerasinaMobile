package pageObjects.webPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

public class GoogleSearchPage extends BasePage {

    @FindBy(css = "input[name='q']")
    WebElement searchField;

    public GoogleSearchPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(appiumDriver, this);
    }

    public GoogleResultsPage findInfo(String keyWord) {
        searchField.sendKeys(keyWord);
        searchField.sendKeys(Keys.ENTER);
        return new GoogleResultsPage(appiumDriver);
    }
}
