package com.cydeo.step_definitions;

import com.cydeo.pages.RestaurantHomePage;
import com.cydeo.pages.RestaurantSearchResultPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RestaurantStepDefinitions {

    @Given("user is on the restaurant home page")
    public void user_is_on_the_restaurant_home_page() {

        Driver.getDriver().get("https://www.webstaurantstore.com/");

    }

    @When("user searches for the stainless steel table")
    public void user_searches_for_the_stainless_steel_table() {

        RestaurantSearchResultPage page = new RestaurantSearchResultPage();

        page.searchBox.sendKeys("Stainless Work Table" + Keys.ENTER);

        List<WebElement> resultList = page.resultList;   // gives all the stainless tables to us

        /*for (WebElement eachElement : resultList) {
            Assert.assertTrue(eachElement.getText().toLowerCase().contains("table"));
        }*/

        System.out.println("resultList.size() = " + resultList.size());

        List<WebElement> inStockItems = page.inStockItems;

        Actions actions = new Actions(Driver.getDriver());

        System.out.println("inStockItems.size() = " + inStockItems.size());

        actions.moveToElement(page.inStockItemslastElement.get(56)).perform();


        /*inStockItems.get(inStockItems.size() - 1).click();

// .ElementClickInterceptedException: element click intercepted:  WE need to handle the HTML Alert
        actions.moveToElement(page.cart).perform();

        page.closeAlert.click();

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
//        wait.until(ExpectedConditions.invisibilityOf(page.closeAlert));
        BrowserUtils.sleep(1);

        // verification of added and deleted item count
        int actualValue = Integer.parseInt(page.countOfItems.getText());
        Assert.assertTrue(actualValue == 1);

        page.cart.click();

        page.emptyCart.click();
        page.emptyCartAgain.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(page.emptyMessage));

        actualValue = Integer.parseInt(page.countOfItems.getText());
        Assert.assertTrue(actualValue == 0);

         */


    }


}
