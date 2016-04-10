package com.camiloribeiro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 6:59 PM
 */
public class LoginPage extends BasePage {

    private WebElement username_field() {
        return By.id("user_email").findElement(driver);
    }

    private WebElement password_field() {
        return By.id("user_password").findElement(driver);
    }

    private WebElement login() {
        return driver.findElement(By.name("commit"));
    }

    public void login(String userName, String password) throws InterruptedException {
        username_field().sendKeys(userName);
        password_field().sendKeys(password);
        login().submit();
        Thread.sleep(5000);
    }
}
