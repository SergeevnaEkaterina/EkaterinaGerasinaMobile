package scenarios;

import static org.testng.Assert.assertTrue;

import data.ParametersDataProvider;
import model.Parameters;
import org.testng.annotations.Test;
import pageObjects.nativePages.BudgetPage;
import pageObjects.nativePages.StartPage;
import setup.BaseTest;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, dataProviderClass = ParametersDataProvider.class, dataProvider = "paramData",
    description = "Registration and signing in")
    public void registrationTest(Parameters parameters) {
        BudgetPage budgetPage = new StartPage(getDriver())
                .goToRegistration()
                .registerNewUser(parameters)
                .login(parameters);
        assertTrue(budgetPage.checkBudgetActivityPresence());
    }



}
