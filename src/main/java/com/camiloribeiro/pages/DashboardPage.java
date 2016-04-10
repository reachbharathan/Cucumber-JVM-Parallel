package com.camiloribeiro.pages;

import junitx.framework.StringAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:10 PM
 */
public class DashboardPage extends BasePage {
    private WebElement header() {
        return driver.findElement(By.cssSelector("div.header h1"));
    }

    private WebElement clientLink() {
        return driver.findElement(By.cssSelector("a[href='/clients']"));
    }

    private WebElement taxLink() {
        return driver.findElement(By.cssSelector("a[href='/taxes/index']"));
    }

    public void verifyDashboardPageTitle() {
        StringAssert.assertContains("Dashboard", header().getText());
    }

    public void clickClientLink(){
        clientLink().click();
    }

    public void clickTaxLink() {
        taxLink().click();
    }
}
