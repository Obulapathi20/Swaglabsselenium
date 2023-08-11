Feature: To Checkout Feature

  Scenario: Validate checkout feature
    Given user open the application "https:www.saucedemo.com"
    When user enter username and password as "standard_user" and "secret_sauce"
    And user click on login button
    Then user select the item in the available items
    Then user get namd and price of selected item
    And user click on add to cart btn
    And user navigate to cart
    And user continue to checkout the item
    And user fill the details for delivery
    Then user verfiy the confirmation message
    Then user click on back to home button