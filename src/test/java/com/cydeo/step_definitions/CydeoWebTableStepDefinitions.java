package com.cydeo.step_definitions;

import com.cydeo.pages.CydeoWebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CydeoWebTableStepDefinitions {

    CydeoWebTablePage cydeoWebTablePage = new CydeoWebTablePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("user enters the username {string}")
    public void userEntersTheUsername(String string) {
        cydeoWebTablePage.userName.sendKeys(string);
    }


    @And("user enters the password {string}")
    public void userEntersThePassword(String string) {
        cydeoWebTablePage.password.sendKeys(string);
    }


    @And("user clicks the submit button")
    public void userClicksTheSubmitButton() {
        cydeoWebTablePage.submitButton.click();

    }

    @Then("user lands the homepage")
    public void user_lands_the_homepage() {
        /*String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle="orders";
        System.out.println("actualTitle = " + actualTitle);*/

        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "orders";
        Assert.assertTrue(currentUrl.contains(expectedUrl));

    }

    @And("user enters the username {string} password {string} and submit the button")
    public void userEntersTheUsernamePasswordAndSubmitTheButton(String string1, String string2) {

        cydeoWebTablePage.loginWithConfReader();

        // cydeoWebTablePage.login(string1,string2);   2. way since we have 2 parameter ; then we pass them here

        // cydeoWebTablePage.login();                  3. way hard coded way

    }


    @And("user clicks the order button")
    public void userClicksTheOrderButton() {

        cydeoWebTablePage.orderButton.click();


    }

    @And("user enters the essential data in make order page")
    public void userEntersTheEssentialDataInMakeOrderPage() {

        Faker faker = new Faker();

        cydeoWebTablePage.nameBox.sendKeys("Mehmet");

        cydeoWebTablePage.streetBox.sendKeys(faker.address().streetName());

        // cydeoWebTablePage.streetBox.sendKeys(Keys.BACK_SPACE);
        // Clears the input area or
        // cydeoWebTablePage.streetBox.clear();

        cydeoWebTablePage.cityBox.sendKeys(faker.address().cityName());

        cydeoWebTablePage.stateBox.sendKeys(faker.address().state());

        cydeoWebTablePage.zipBox.sendKeys(faker.address().zipCode());

        cydeoWebTablePage.visaRadioButton.click();

        cydeoWebTablePage.cardNoBox.sendKeys("1234567891234567");

        cydeoWebTablePage.cardExpiryDate.sendKeys("04/24");

        cydeoWebTablePage.processOrderButton.click();

    }


    @Then("user should see the order in the order list.")
    public void userShouldSeeTheOrderInTheOrderList() {

        String actualName = cydeoWebTablePage.firstEntry.getText();

        System.out.println("actualName = " + actualName);

        String expectedName = "Mehmet";

        Assert.assertEquals(expectedName, actualName);


    }

    @And("user clicks the nameBox {string}")
    public void userClicksTheNameBox(String arg0) {

        cydeoWebTablePage.nameBox.sendKeys(arg0);
    }


    @And("user clicks the streetBox {string}")
    public void userClicksTheStreetBox(String arg0) {
        cydeoWebTablePage.streetBox.sendKeys(arg0);

    }

    @And("user clicks the cityBox {string}")
    public void userClicksTheCityBox(String arg0) {

        cydeoWebTablePage.cityBox.sendKeys(arg0);
    }

    @And("user clicks the stateBox {string}")
    public void userClicksTheStateBox(String arg0) {

        cydeoWebTablePage.stateBox.sendKeys(arg0);
    }

    @And("user clicks the zipBox {string}")
    public void userClicksTheZipBox(String arg0) {

        cydeoWebTablePage.zipBox.sendKeys(arg0);
    }

    @And("user clicks the RadioButton {string}")
    public void userClicksTheRadioButton(String arg0) {

        BrowserUtils.clickRadioButton(cydeoWebTablePage.radioButtons, arg0);

    }


    @And("user clicks the cardExpiryDateBox {string}")
    public void userClicksTheCardExpiryDateBox(String arg0) {

        cydeoWebTablePage.cardExpiryDate.sendKeys(arg0);
    }


    @And("user clicks the cardNoBox {string}")
    public void userClicksTheCardNoBox(String arg0) {

        cydeoWebTablePage.cardNoBox.sendKeys(arg0);
    }

    @And("user clicks the processOrderButton;")
    public void userClicksTheProcessOrderButton() {

        cydeoWebTablePage.processOrderButton.click();
    }

    @Then("user should see the {string} order in the order list.")
    public void userShouldSeeTheOrderInTheOrderList(String arg0) {

        String actualName = cydeoWebTablePage.firstEntry.getText();

        System.out.println("actualName = " + actualName);

        Assert.assertEquals(arg0, actualName);

    }
}
