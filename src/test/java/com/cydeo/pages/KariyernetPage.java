package com.cydeo.pages;

import com.cydeo.step_definitions.Kariyernet;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KariyernetPage {

    public KariyernetPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(css = "#keywordas1")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='t-6 text-secondary mb-3 search-result-section']")
    public WebElement results;







}
