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

    @Given("user is on the fidexio log in page")
    public void user_is_on_the_fidexio_log_in_page() {


        Driver.getDriver().get(ConfigurationReader.getProperty("url.fidexio"));

        //2-Driver.getDriver().get("https://www.qa.fidexio.com");

    }


    @When("user enters the {string} and {string} on fidexio login  Page")
    public void userEntersTheAndOnFidexioLoginPage(String arg0, String arg1) {

        fidexioPage.emailInputBox.sendKeys(arg0);

        fidexioPage.passwordInputBox.sendKeys(arg1);

        fidexioPage.submitButton.click();

    }

    @Then("verfy that user launched the page")
    public void verfyThatUserLaunchedThePage() {

        //String expectedText = "Congratulations, your inbox is empty";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

        wait.until(ExpectedConditions.visibilityOf(fidexioPage.message));

        Assert.assertTrue(fidexioPage.message.isDisplayed());

    }

    @And("logout from the page")
    public void logoutFromThePage() {

        fidexioPage.logout1.click();
        fidexioPage.logout2.click();

        BrowserUtils.waitForVisibility(fidexioPage.signInButton,15);

    }


}
