package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionsLibrarian {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters the librarian username");

    }

    @When("user enters librarian password.")
    public void user_enters_librarian_password() {
        System.out.println("user enters the librarian password");

    }

    @Then("user should see the Dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");

    }


    @When("user enters admin password.")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");

    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");

    }

    @Given("user is on the Login page")
    public void userIsOnTheLoginPage() {
        System.out.println("user is on the log in page.");
    }
}
