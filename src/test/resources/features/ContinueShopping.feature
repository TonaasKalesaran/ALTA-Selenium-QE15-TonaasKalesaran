Feature: Continue Shopping Test
  @continueShopping
  Scenario: Sort product saucelabs backpack and add 2 products saucelabs backpack
    When User login with valid username "standard_user" and password "secret_sauce"
    And Click sort and choose Z to A
    And On the product page verify the shirt red is displayed
    And On the product page verify the onesie is displayed
    And Add to cart button onesie is displayed
    And Add to cart button shirt red is displayed
    And Click Add to cart onesie
    And Click Add to cart shirt red
    And Remove button on the shirt red is displayed
    And Remove button on the onesie is displayed
    And Click cart icon
    And Remove button on the cart shirt red is displayed
    And Click remove button on the shirt red
    Then Click continue shopping button