package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CydeoWebTablePage {

    public CydeoWebTablePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[type='text']")
    public WebElement userName;

    @FindBy(css = "input[type='password']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipBox;

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNoBox;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardExpiryDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processOrderButton;

    @FindBy(xpath = "//tr//td")
    public WebElement firstEntry;

    @FindBy(xpath = "//input[@name='card']")
    public List<WebElement> radioButtons;



    //we can write or do not write this keyword.

    public void login() {

        userName.sendKeys("Test");
        password.sendKeys("Tester");
        submitButton.click();

    }

    public void login(String username, String password) {

        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        this.submitButton.click();

    }

    public void loginWithConfReader() {
        userName.sendKeys(ConfigurationReader.getProperty("user.name"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();

    }


}
