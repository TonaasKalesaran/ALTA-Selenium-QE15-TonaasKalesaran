Feature: Cart Test
  @tugas2
  Scenario: Remove item from cart then continue shopping
    When User login with valid username "standard_user" and password "secret_sauce"
    And Click Add to cart onesie
    And Click Add to cart shirt red
    And Click cart icon
    And Remove button on the cart shirt red is displayed
    And Click remove button on the shirt red
    #And Verify item is deleted
    And Click continue shopping button
    Then User should be directed to the dashboard page
