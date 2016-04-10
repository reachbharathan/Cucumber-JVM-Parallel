package com.camiloribeiro.steps;

import org.openqa.selenium.remote.RemoteWebDriver;
import webDriver.WebDriverBuilder;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 5:02 PM
 */
public class BaseSteps {
    RemoteWebDriver driver;

    public BaseSteps() {
        driver = WebDriverBuilder.getWebDriver();
    }
}
