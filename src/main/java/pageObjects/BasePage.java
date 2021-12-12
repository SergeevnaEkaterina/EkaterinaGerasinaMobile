package pageObjects;

import io.appium.java_client.AppiumDriver;

public class BasePage {
    protected static final String PACKAGE = "platkovsky.alexey.epamtestapp:";
    protected AppiumDriver appiumDriver;

    public BasePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
}
