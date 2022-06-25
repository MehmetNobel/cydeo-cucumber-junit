package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on the Search page")
    public void user_is_on_the_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google.")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
        Driver.closeDriver();

    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBoxArea.sendKeys("apple" + Keys.ENTER);


    }

    @Then("user sees apple in the title")
    public void userShouldSearchResultAsApple() {

        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        googleSearchPage.searchBoxArea.sendKeys(string + Keys.ENTER);
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String string) {

        String expectedTitle = string + " - Google'da Ara";

        String actual = Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.equals(actual));
    }

}
