package com.cydeo.step_definitions;

import com.cydeo.pages.MonthsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonthsStepDefinitions {

    MonthsPage monthsPage = new MonthsPage();

    List<WebElement> listEx = new ArrayList<WebElement>();

    @Given("User goes to the cydeoPracticePage")
    public void user_goes_to_the_cydeo_practice_page() {

        Driver.getDriver().get("https://practice.cydeo.com/");
    }

    @Given("user clicks the dropdown button")
    public void user_clicks_the_dropdown_button() {
        monthsPage.dropDownButton.click();

    }

    @Given("user clicks the months button")
    public void user_clicks_the_months_button() {

        Select select = new Select(monthsPage.monthDropdownButton);

        List<WebElement> months = select.getOptions();

        listEx.addAll(months);


    }

    @Then("user should see all the months")
    public void user_should_see_all_the_months(List<String> list1) {

        List<String> listExString = new ArrayList<>();

        for (WebElement ex : listEx) {

            listExString.add(ex.getText());
        }

        Assert.assertTrue(list1.equals(listExString));

        System.out.println("list1 = " + list1);

        System.out.println("listExString = " + listExString);


    }
}


