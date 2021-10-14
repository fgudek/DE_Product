@RegressionTest
@SettingsPageTest
  Feature: SETTINGS PAGE TEST

    Background:
      Given user is logged in
      Then click More
      Then go to Settings

    @ChangePIN
    Scenario: CHANGE PIN
      Then go to Change PIN
      Then enter PIN
      Then enter new PIN
      Then go BACK
      Then LOG OUT
      Then LOG IN with new PIN
      Then change PIN back to default
      Then go BACK

    @FastPayments
    Scenario: FAST PAYMENTS
      Then go to Fast payments
      Then turn OFF Fast payments
      Then enter PIN
      Then turn ON Fast payments
      Then enter PIN
      Then click X
      Then go BACK

