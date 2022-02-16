# Created by DiegoPinzon at 02/02/2022
# author: diegopip62@gmail.com

Feature: Login SauceDemo Labs

  Rule: User login Sauce Demo Web
  As a user, I need to login Sauce Demo Web with my credentials

    Background: Navigates to testing page
      Given Pablo navigates to SwagLabs login page

    Scenario: Successful Login
      When Pablo logs in with valid credentials
      Then he should see the product catalog page

    Scenario: Unsuccessful Login
      When Pablo logs in with invalid credentials
      Then he should see message the invalid credentials


    Scenario: Locked Out User Login
      When Pablo logs in with locked out credentials
      Then he should see message the user locked out