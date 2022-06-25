package com.cydeo.step_definitions;

import com.cydeo.pages.KariyernetPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Kariyernet {


    KariyernetPage kariyernetPage = new KariyernetPage();


    @Given("user is on the kariyernet page")
    public void user_is_on_the_kariyernet_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url.kariyernet"));


    }

    @When("enters the job title")
    public void enters_the_job_title() {

        kariyernetPage.searchBox.sendKeys("automation test engineer"+ Keys.ENTER);
    }

    @Then("verify the job quantities")
    public void verify_the_job_quantities() {

        System.out.println("kariyernetPage.results.getText() = " + kariyernetPage.results.getText());


    }


}
