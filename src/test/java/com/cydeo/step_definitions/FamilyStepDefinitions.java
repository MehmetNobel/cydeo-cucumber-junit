package com.cydeo.step_definitions;

import io.cucumber.java.en.When;

import java.util.Map;

public class FamilyStepDefinitions {

    @When("enters the url")
    public void enters_the_url() {
        System.out.println("going to the url");
    }
    @When("see the populer games")
    public void see_the_populer_games(Map<String, String> map1) {
        System.out.println(map1);

    }




}
