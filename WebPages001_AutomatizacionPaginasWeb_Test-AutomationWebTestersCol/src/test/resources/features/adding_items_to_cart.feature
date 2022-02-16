# Created by DiegoPinzon at 02/02/2022
# author: diegopip62@gmail.com

Feature: Adding items to the cart

  Rule: Items added from the catalog page should appear in the cart
  As a user, I wanna add items to my cart shop

    Background: Login SauceLabs page
      Given Colin logs in to Sauce Labs
      And Colin browsing to SwagLabs shopping page

    Scenario: Colin adds some items on the application
      When he adds the following items to the cart:
        | Sauce Labs Backpack      |
        | Sauce Labs Fleece Jacket |
        | Sauce Labs Onesie        |
      Then the shopping cart count should be 3
      And the items should appear in the cart

