package com.camiloribeiro.steps;

import com.camiloribeiro.pages.DashboardPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:17 PM
 */
public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("^I should see dashboard page$")
    public void I_should_see_dashboard_page() throws Throwable {
        dashboardPage.verifyDashboardPageTitle();
    }

    @When("^I click clients link in the navigation bar$")
    public void I_click_clients_link_in_the_navigation_bar() throws Throwable {
        dashboardPage.clickClientLink();
    }

    @When("^I click taxes link in the navigation bar$")
    public void I_click_taxes_link_in_the_navigation_bar() throws Throwable {
        dashboardPage.clickTaxLink();
    }
}
