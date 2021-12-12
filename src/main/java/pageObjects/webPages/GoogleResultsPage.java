package pageObjects.webPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;

import java.util.List;

public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(appiumDriver, this);
    }

    @FindBy(css = "#center_col>#topstuff+div>#rso>div[data-hveid]")
    public List<WebElement> searchResults;
}
