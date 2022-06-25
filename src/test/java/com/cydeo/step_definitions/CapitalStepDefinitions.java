package com.cydeo.step_definitions;

import com.cydeo.pages.CapitalPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CapitalStepDefinitions {

    CapitalPage capitalPage=new CapitalPage();

    @Given("user is on the GoogleSearch page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url.google"));

    }
    @When("user types the capital of {string}")
    public void user_types_the_capital_of(String string) {

        capitalPage.searchInputArea.sendKeys("Capital of " + string+ Keys.ENTER);

        BrowserUtils.sleep(1);

    }

    @Then("user verifes the capital city as {string}")
    public void userVerifesTheCapitalCityAs(String arg0) {

        String expected =arg0;

        String actual= capitalPage.resultArea.getText();

        System.out.println("expected = " + expected);

        System.out.println("actual = " + actual);

        Assert.assertEquals(expected,actual);

    }
}
