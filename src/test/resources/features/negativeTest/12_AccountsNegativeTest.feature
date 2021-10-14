@RegressionTest
@NegativeTest
Feature: Negative testing

  Background:
    Given activated App is open
    Then user is logged in

  @AccountDetailsNegativeTest
  Scenario: Account Details Negative test
