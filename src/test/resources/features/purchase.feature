
@purchase
Feature: purchase product

  Scenario: Customer can purchase
    Given the customer is on the homePage
    When the customer  navigates to "Laptops" "Sony vaio i5"
    And the customer  clicks on "Add to cart" and accept pop up
    And the customer  clicks on "Home"
    When the customer  navigates to "Laptops" "Dell i7 8gb"
    And the customer  clicks on "Add to cart" and accept pop up
    And the customer  clicks on "Cart"
    And the customer  deletes "Dell i7 8gb"
    And the customer  clicks on "Place Order" button
    And the customer  fills "name" field "Nese"
    And the customer  fills "country" field "Turkey"
    And the customer  fills "city" field "Istanbul"
    And the customer  fills "card" field "1235447"
    And the customer  fills "month" field "3"
    And the customer  fills "year" field "2023"
    And the customer  clicks on "Purchase" button
    And the customer  captures and logs purchase Id and Amount
    Then purchase amount equals expected
    And the customer  clicks on "OK" button

