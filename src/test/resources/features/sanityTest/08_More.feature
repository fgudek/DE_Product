@SanityTest
@MorePageTest
Feature: More test

  Background:
    Given user is logged in
    Then click More

  @Documents
   Scenario: Documents
    Then click Documents
    Then go to documents settings
    Then click on account selection
    Then select GIRO-ACCOUNT Account
    Then click on account selection
    Then select CURRENT-ACCOUNT Account
    Then click on delivery method
    Then select E-MAIL for delivery method
    Then click on delivery method
    Then select HOME-ADDRESS for delivery method
    Then change delivery frequency and return it to default
    Then click Save
    And verify success message and click OK
    Then go BACK