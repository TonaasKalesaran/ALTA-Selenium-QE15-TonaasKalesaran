package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="checkout")
    private WebElement btnCheckout;

    //remove button on cart page
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement cartRemoveShirtRed;

    //continue shopping button
    @FindBy(id = "continue-shopping")
    private WebElement btnContinueShopping;

    public void clickCheckout(){
        waitForElementClickable(btnCheckout);
        click(btnCheckout);
    }

    public boolean verifyCartRemoveButtonDisplayedOnProductShirtRed(){
        return isDisplayed(cartRemoveShirtRed);
    }

    public void clickCartRemoveProductShirtRed(){
        scrollIntoView(cartRemoveShirtRed);          //biar layarnya discroll sampai buttonnya terlihat
        waitForElementClickable(cartRemoveShirtRed); //nunggu sampai buttonnya bisa di click
        click(cartRemoveShirtRed);                   //click buttonnya
    }

    public void clickContinueShopping(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitForElementClickable(btnContinueShopping);
        click(btnContinueShopping);
    }


}
