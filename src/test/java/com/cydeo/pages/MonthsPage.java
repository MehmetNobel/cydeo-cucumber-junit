package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthsPage {

    public MonthsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[.='Dropdown']")
    public WebElement dropDownButton;

    @FindBy (css = "#month")
    public WebElement monthDropdownButton;






}
