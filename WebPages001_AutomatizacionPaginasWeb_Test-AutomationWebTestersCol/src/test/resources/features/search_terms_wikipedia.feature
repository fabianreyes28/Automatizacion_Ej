# Created by DiegoPinzon at 23/01/2022
# author: diegopip62@gmail.com

Feature: User searchs keyword in Wikipedia web page
  As a user, I wanna search in Wikipedia page by keyword

  Scenario: Search by keyword
    Given Pablo navigates to the Wikipedia page
    When searching for the word Everest
    Then should see Everest in the page title