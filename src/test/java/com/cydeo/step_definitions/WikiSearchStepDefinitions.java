package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WikiSearchStepDefinitions {

    WikiSearchPage wikiSearchPage=new WikiSearchPage();

    @Given("user is on the Wiki page")
    public void user_is_on_the_wiki_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");

    }

    @When("user is searches for Steve Jobs")
    public void user_is_searches_for_steve_jobs() {

        wikiSearchPage.searchBox.sendKeys("steve jobs"+ Keys.ENTER);
    }

    @Then("user should see title contains Steve Jobs")
    public void user_should_see_title_contains_steve_jobs() {

        String expectedTitle="Steve";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }


    @When("user is searches for {string}")
    public void userIsSearchesFor(String string) {

        wikiSearchPage.searchBox.sendKeys(string+ Keys.ENTER);

    }


    @Then("user should see title contains {string}")
    public void userShouldSeeTitleContains(String string) {

        String expectedTitle=string;
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("user should see the header text as Steve Jobs")
    public void userShouldSeeTheHeaderTextAsSteveJobs() {

        String actualText = wikiSearchPage.headerText.getText();

        String expectedText="Steve Jobs";

        Assert.assertTrue(actualText.contains(expectedText));

    }


    @Then("user should see the pictureHeader text as Steve Jobs")

    public void userShouldSeeThePictureHeaderTextAsSteveJobs() {

        String actualText = wikiSearchPage.pictureText.getText();

        String expectedText="Steven Paul Jobs";

        Assert.assertTrue(actualText.contains(expectedText));

    }

    @Then("user should see the pictureHeader text as {string}")
    public void userShouldSeeThePictureHeaderTextAs(String string) {

        String actualText = wikiSearchPage.pictureText.getText();

        String expectedText=string;

        Assert.assertTrue(actualText.contains(expectedText));

    }


    @And("user waits for {int} seconds")
    public void userWaitsForSeconds(int seconds) {

        BrowserUtils.sleep(2);
    }
}
