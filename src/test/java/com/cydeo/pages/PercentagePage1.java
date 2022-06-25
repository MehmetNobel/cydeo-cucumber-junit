package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PercentagePage1 {

    public PercentagePage1(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (css = "input[type='text']")
    public WebElement firstNumber;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement secondNumber;

    @FindBy (xpath = "(//input[@type='text'])[3]")
    public WebElement resultNumber;




}
