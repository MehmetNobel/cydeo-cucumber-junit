package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FidexioStepDefinitions {

    FidexioPage fidexioPage = new FidexioPage();


    @When("user enters the {string} and password {string}")
    public void userEntersTheAndPassword(String arg0, String arg1) {

        fidexioPage.emailInputBox.sendKeys(arg0);
        fidexioPage.passwordInputBox.sendKeys(arg1);
        fidexioPage.submitButton.click();

    }


    @Given("user is on the fidexiologin page")
    public void userIsOnTheFidexiologinPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url.fidexio"));
    }

    @Then("user is on the homepage")
    public void userIsOnTheHomepage() {

        Assert.assertTrue(fidexioPage.inBoxButton.isDisplayed());




    }



}