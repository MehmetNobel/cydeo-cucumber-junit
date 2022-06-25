package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RestaurantSearchResultPage extends RestaurantHomePage{

    @FindBy(xpath = "//a[@data-testid='itemDescription']")
    public List<WebElement> resultList;

    @FindBy(xpath = "//input[@data-testid='itemAddCart']")
    public List<WebElement> inStockItems;

    @FindBy(xpath = "(//input[@data-testid='itemAddCart'])[56]")
    public List<WebElement> inStockItemslastElement;

    @FindBy(xpath = "//button[@class='close p-2 mr-2 top-1']")
    public WebElement closeAlert;

    @FindBy(xpath = "(//span[.='Cart'])[2]")
    public WebElement cart;

    @FindBy(id ="cartItemCountSpan")
    public WebElement countOfItems;

    @FindBy(xpath = "//button[.='Empty Cart']")
    public WebElement emptyCart;

    @FindBy(xpath = "(//button[.='Empty Cart'])[2]")
    public WebElement emptyCartAgain;

    @FindBy(xpath = "//p[@class='header-1']")
    public WebElement emptyMessage;


}
