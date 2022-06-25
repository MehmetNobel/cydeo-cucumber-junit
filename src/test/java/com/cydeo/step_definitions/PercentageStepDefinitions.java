package com.cydeo.step_definitions;

import com.cydeo.pages.PercentagePage1;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class PercentageStepDefinitions {

    PercentagePage1 percentagePage1=new PercentagePage1();

    @Given("user is on the percentage page")
    public void user_is_on_the_percentage_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url.percentage"));
    }
    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String string, String string2) {
        percentagePage1.firstNumber.sendKeys(string);
        percentagePage1.secondNumber.sendKeys(string2+ Keys.ENTER);

    }
    @And("Verify that the result is {string}")
    public void verifyThatTheResultIs(String arg0) {

        Assert.assertTrue(percentagePage1.resultNumber.getAttribute("value").equals(arg0));


    }
}
