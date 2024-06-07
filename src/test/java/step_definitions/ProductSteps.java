package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CartPage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {

    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Then("On the product page verify the saucelabs backpack is displayed")
    public void onTheProductPageVerifyTheSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyTitleProductSauceLabBackpack());
        //Assert.assertEquals("expected", "actual"); untuk cek apakah nama produk sama dengan yang akan di cek
        //Assert digunakan untuk verifikasi
    }

    @And("Add to cart button saucelabs backpack is displayed")
    public void addToCartButtonSaucelabsBackpackIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartSauceLabsBackpack());
    }

    @And("Click Add to cart saucelabs backpack")
    public void addToCartSaucelabsBackpack() {
        productPage.clickAddToCartSauceLabsBackpack();
    }

    @And("Remove button on the saucelabs backpack is displayed")
    public void removeButtonOnTheSaucelabsBackpackIsDisplayed() {
        productPage.verifyRemoveButtonDisplayedOnProductSauceLabBackpack();
    }

    @And("Click sort and choose Z to A")
    public void clickSortAndChooseZToA() {
        productPage.clickSortZA();
    }

    @And("Add to cart button shirt red is displayed")
    public void addToCartButtonShirtRedIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartShirtRed());
    }

    @And("Add to cart button onesie is displayed")
    public void addToCartButtonOnesieIsDisplayed() {
        Assert.assertTrue(productPage.verifyAddToCartOnesie());
    }

    @And("Click Add to cart shirt red")
    public void clickAddToCartShirtRed() {
        productPage.clickAddToCartShirtRed();
    }

    @And("Remove button on the shirt red is displayed")
    public void removeButtonOnTheShirtRedIsDisplayed() {
        productPage.verifyRemoveButtonDisplayedOnProductShirtRed();
    }

    @And("Click Add to cart onesie")
    public void clickAddToCartOnesie() {
        productPage.clickAddToCartOnesie();
    }

    @And("Remove button on the onesie is displayed")
    public void removeButtonOnTheOnesieIsDisplayed() {
        productPage.verifyRemoveButtonDisplayedOnProductOnesie();
    }

    @And("Remove button on the cart shirt red is displayed")
    public void removeButtonOnTheCartShirtRedIsDisplayed() {
        Assert.assertTrue(cartPage.verifyCartRemoveButtonDisplayedOnProductShirtRed());
    }

    @And("Click remove button on the shirt red")
    public void clickRemoveButtonOnTheShirtRed() {
        cartPage.clickCartRemoveProductShirtRed();
    }

    @Then("Click continue shopping button")
    public void clickContinueShoppingButton() {
        cartPage.clickContinueShopping();
    }

    @And("On the product page verify the shirt red is displayed")
    public void onTheProductPageVerifyTheShirtRedIsDisplayed() {
        Assert.assertTrue(productPage.verifyTitleProductShirtRed());
    }

    @And("On the product page verify the onesie is displayed")
    public void onTheProductPageVerifyTheOnesieIsDisplayed() {
        Assert.assertTrue(productPage.verifyTitleProductOnesie());
    }



//    @And("Remove the saucelabs backpack from product list")
//    public void removeTheSaucelabsBackpackFromProductList() {
//        productPage.clickRemoveProductSauceLabBackpack();
//        Assert.assertFalse(productPage.verifyRemoveButtonDisplayedOnProductSauceLabBackpack());
//    }


}
