package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapitalPage {


    public CapitalPage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy (css = "input[name='q']")
    public WebElement searchInputArea;

    @FindBy (css = "a[class='FLP8od']")
    public WebElement resultArea;


}
