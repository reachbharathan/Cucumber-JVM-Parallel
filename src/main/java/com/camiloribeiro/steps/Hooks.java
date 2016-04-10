package com.camiloribeiro.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import webDriver.WebDriverBuilder;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 5:04 PM
 */
public class Hooks extends BaseSteps {

    @Before
    public void setUp() {
        driver = WebDriverBuilder.getWebDriver();
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
        WebDriverBuilder.nullWebDriver();
    }

}
