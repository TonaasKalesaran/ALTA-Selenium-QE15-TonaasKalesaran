package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //Sauce Lab Backpack
    //judul button
    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabBackpack;

    //remove from cart button
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabBackpack;

    //add to cart button
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddToCardSauceLabsBackpack;

    @FindBy(id = "shopping_cart_container")
    private WebElement cart;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sort;

    //sort button
    @FindBy(xpath = "//option[.='Name (Z to A)']")
    private WebElement sortZA;

    // red T-shirt
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement btnAddToCardShirtRed;

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement btnRemoveShirtRed;

    @FindBy(xpath = "//a[@id='item_3_title_link']")
    private WebElement titleProductShirtRed;


    //sauce labs onesie
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement btnAddToCardOnesie;

    @FindBy(id = "remove-sauce-labs-onesie")
    private WebElement btnRemoveOnesie;

    @FindBy(xpath = "//a[@id='item_2_title_link']")
    private WebElement titleProductOnesie;

    //verify if remove button is displayed correctly
    public boolean verifyTitleProductSauceLabBackpack(){
        return isDisplayed(titleProductSauceLabBackpack);
    }

    public boolean verifyRemoveButtonDisplayedOnProductSauceLabBackpack(){
        return isDisplayed(btnRemoveSauceLabBackpack);
    }

    public void clickRemoveProductSauceLabBackpack(){
        scrollIntoView(btnRemoveSauceLabBackpack);          //biar layarnya discroll sampai buttonnya terlihat
        waitForElementClickable(btnRemoveSauceLabBackpack); //nunggu sampai buttonnya bisa di click
        click(btnRemoveSauceLabBackpack);                   //click buttonnya
    }

    public boolean verifyAddToCartSauceLabsBackpack(){
        return isDisplayed(btnAddToCardSauceLabsBackpack);
    }

    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddToCardSauceLabsBackpack);
        waitForElementClickable(btnAddToCardSauceLabsBackpack);
        click(btnAddToCardSauceLabsBackpack);
    }

    public void clickCart(){
        waitForElementClickable(cart);
        click(cart);
    }

    public void clickSortZA(){
        waitForElementClickable(sort);
        click(sort);
        click(sortZA);
    }

    //Red Shirt
    public boolean verifyTitleProductShirtRed(){
        return isDisplayed(titleProductShirtRed);
    }

    public boolean verifyRemoveButtonDisplayedOnProductShirtRed(){
        return isDisplayed(btnRemoveShirtRed);
    }

    public void clickRemoveProductShirtRed(){
        scrollIntoView(btnRemoveShirtRed);          //biar layarnya discroll sampai buttonnya terlihat
        waitForElementClickable(btnRemoveShirtRed); //nunggu sampai buttonnya bisa di click
        click(btnRemoveShirtRed);                   //click buttonnya
    }

    public boolean verifyAddToCartShirtRed(){
        return isDisplayed(btnAddToCardShirtRed);
    }

    public void clickAddToCartShirtRed(){
        scrollIntoView(btnAddToCardShirtRed);
        waitForElementClickable(btnAddToCardShirtRed);
        click(btnAddToCardShirtRed);
    }

    //Onesie
    public boolean verifyTitleProductOnesie(){
        return isDisplayed(titleProductOnesie);
    }

    public boolean verifyRemoveButtonDisplayedOnProductOnesie(){
        return isDisplayed(btnRemoveOnesie);
    }

    public void clickRemoveProductOnesie(){
        scrollIntoView(btnRemoveOnesie);          //biar layarnya discroll sampai buttonnya terlihat
        waitForElementClickable(btnRemoveOnesie); //nunggu sampai buttonnya bisa di click
        click(btnRemoveOnesie);                   //click buttonnya
    }

    public boolean verifyAddToCartOnesie(){
        return isDisplayed(btnAddToCardOnesie);
    }

    public void clickAddToCartOnesie(){
        scrollIntoView(btnAddToCardOnesie);
        waitForElementClickable(btnAddToCardOnesie);
        click(btnAddToCardOnesie);
    }



}
