package org.senthilstudy.stepfunctions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {

    @Given("User goes to domain {string}")
    public void userGoesToDomain(String domain) {
        System.out.println("finder");
    }

    @And("User provides email {string} and password {string}")
    public void userEnterDetails(String username, String password) {
        System.out.println("finder1");
    }

    @Given("User goes to {string}")
    public void userGoesTo(String arg0) {
    }
}
