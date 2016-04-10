package com.camiloribeiro.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import webDriver.WebDriverBuilder;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:00 PM
 */
public class BasePage {
    RemoteWebDriver driver;

    public BasePage() {
        driver = WebDriverBuilder.getWebDriver();
    }
}


