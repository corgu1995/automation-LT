Feature: User is able to buy products
  Description: The purpose of this feature is to test the checkout process.

  @CheckoutTest
  Scenario Outline: Checkout of products
    Given User login into saucedemo with <username> and <password>
    When User adds a product to the cart
    And Fill the required form with <firstName>, <lastName> and <postalCode>
    Then Is able to finish the checkout process
#It's recommended to extract passwords in a different way
    Examples:
      | username | password | firstName | lastName | postalCode |
      | standard_user | secret_sauce | Santiago | Parra | 055450 |