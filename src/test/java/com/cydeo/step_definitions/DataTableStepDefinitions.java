package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {

    @Then("user should see the fruits I like")
    public void user_should_see_the_fruits_ı_like(List<String> fruits) {

        System.out.println(fruits);

    }






}
