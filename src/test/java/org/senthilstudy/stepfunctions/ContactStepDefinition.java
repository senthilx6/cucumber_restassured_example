package org.senthilstudy.stepfunctions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDefinition {

    @Given("User sends the contact details to create a contact")
    public void userSendsContactDetails(DataTable contact_details){
        System.out.println("hi");
    }

    @When("User clicks on save")
    public void userClicksSave(){
        System.out.println("hello");
    }

    @Then("Contact should be created")
    public void contactShouldbeCreated(){
        System.out.println("hello");
    }
}
