@RegressionTest
@NegativeTest
  Feature: Login Negative test

  @NegativeLogin
  Scenario: DEACTIVATE APP
    Then go to LOGIN
    Then enter invalid PIN
    And confirm LOGIN
    Then verify message for first try
    Then enter invalid PIN
    And confirm LOGIN
    Then verify message for second try
    Then enter invalid PIN
    And confirm LOGIN
    Then verify message for third try
    And verify app is deactivated
