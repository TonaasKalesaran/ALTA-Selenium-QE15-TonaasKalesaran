Feature: Product Test
  Scenario: Verify product saucelabs backpack and remove the product saucelabs backpack
    #When tidak perlu di define lagi karena sudah di define di LoginSteps
    When User login with valid username "standard_user" and password "secret_sauce"
    Then On the product page verify the saucelabs backpack is displayed
    And Add to cart button saucelabs backpack is displayed
    And Click Add to cart saucelabs backpack
    And Remove button on the saucelabs backpack is displayed
    # And Remove the saucelabs backpack from product list

  @tugas1
  Scenario: Add 2 items
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
    Then Click cart icon

