package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefinitionsStudent {

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println( "user_enters_student_username");
    }

    @When("user enters student password.")
    public void user_enters_student_password() {

        System.out.println("student enters the password");
    }

    @Then("user should see the Dashboard.")
    public void user_should_see_the_dashboard() {

        System.out.println("student see the dashboard");
    }




}
