@RegressionTest
@MorePageTest
Feature: More test

  Background:
    Given user is logged in
    Then click More

  @Messages
  Scenario: Messages


  @OurProductsTest
  Scenario: Test every product page


  @BiometricsAndChangePIN
  Scenario: BIOMETRICS AND CHANGE PIN
    Then go to Settings
    Then go to use Biometrics
    Then disable login with biometrics
    Then click X
    Then go to Change PIN
    Then enter PIN
    Then enter new PIN


