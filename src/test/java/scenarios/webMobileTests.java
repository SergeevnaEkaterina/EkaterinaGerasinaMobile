package scenarios;

import static org.testng.Assert.assertNotEquals;

import data.ParametersDataProvider;
import model.Parameters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.webPages.GoogleResultsPage;
import pageObjects.webPages.GoogleSearchPage;
import setup.BaseTest;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, dataProviderClass = ParametersDataProvider.class, dataProvider = "paramData",
            description = "Google search by key word EPAM")
    public void searchTest(Parameters parameters) throws InterruptedException {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(getDriver());
        getDriver().get(parameters.getUrl());
        GoogleResultsPage googleResultsPage = googleSearchPage.findInfo(parameters.getKeyWord());
        new WebDriverWait(getDriver(), 100).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        assertNotEquals(googleResultsPage.searchResults.size(), 0);
    }
}
