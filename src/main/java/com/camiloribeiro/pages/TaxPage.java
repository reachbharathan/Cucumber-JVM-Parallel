package com.camiloribeiro.pages;

import junitx.framework.StringAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:10 PM
 */
public class TaxPage extends BasePage {
    private WebElement header() {
        return driver.findElement(By.cssSelector("div.header h1"));
    }

    public void verifyTaxPageTitle() throws InterruptedException {
        StringAssert.assertContains("Taxes", header().getText());
        Thread.sleep(7000);
    }
}
