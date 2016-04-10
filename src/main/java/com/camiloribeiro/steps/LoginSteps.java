package com.camiloribeiro.steps;

import com.camiloribeiro.pages.LoginPage;
import cucumber.api.java.en.Given;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:09 PM
 */
public class LoginSteps extends com.camiloribeiro.steps.BaseSteps {
    LoginPage loginPage = new LoginPage();

    @Given("^I enter credentials (.+) and (.+) in Account Demo$")
    public void I_enter_credentials_and_in_Account_Demo(String username, String password) throws Throwable {
        loginPage.login(username, password);
    }
}
