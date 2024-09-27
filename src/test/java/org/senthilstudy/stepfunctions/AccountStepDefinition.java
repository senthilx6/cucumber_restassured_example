package org.senthilstudy.stepfunctions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountStepDefinition {

    @Given("User sends the contact details to create a account")
    public void userSendsContactDetails(DataTable contact_details){
        System.out.println("hi account");
    }

    @Then("SalesAccount should be created")
    public void contactShouldbeCreated(){
        System.out.println("hello account");
    }
}
