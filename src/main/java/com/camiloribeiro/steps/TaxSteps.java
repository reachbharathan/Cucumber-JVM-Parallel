package com.camiloribeiro.steps;

import com.camiloribeiro.pages.TaxPage;
import cucumber.api.java.en.Then;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:59 PM
 */
public class TaxSteps {
    TaxPage taxPage = new TaxPage();

    @Then("^I should see taxes pgae$")
    public void I_should_see_taxes_pgae() throws Throwable {
        taxPage.verifyTaxPageTitle();
    }
}
