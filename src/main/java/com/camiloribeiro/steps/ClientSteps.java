package com.camiloribeiro.steps;

import com.camiloribeiro.pages.ClientPage;
import cucumber.api.java.en.Then;

/**
 * Created by Bharathan on 10/04/16.
 * Created on 10/04/16 7:57 PM
 */
public class ClientSteps extends BaseSteps {

    ClientPage clientPage = new ClientPage();

    @Then("^I should see clients pgae$")
    public void I_should_see_clients_pgae() throws Throwable {
        // Express the Regexp above with the code you wish you had
        clientPage.verifyClientPageTitle();
    }
}
