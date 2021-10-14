@RegressionTest
@NegativeTest
Feature: Negative testing

  Background:
    Given user is logged in
    Then go to MORE page

  @NegativeChangePIN
  Scenario: Change PIN
