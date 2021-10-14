@SanityTest
@SettingsPageTest
Feature: SETTINGS PAGE TEST

  Background:
    Given user is logged in
    Then click More
    Then go to Settings

  @PersonalDetails
    Scenario: PERSONAL DETAILS
    Then go to Personal details
    Then verify user name
    Then verify personal ID
 #   Then verify address
    Then verify phone number
    Then verify e-mail address
 #   Then change e-mail
 #   Then revert e-mail to default


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

  @mBankingLimits
    Scenario: MBANKING LIMITS
    Then go to mBanking limits
    Then change Limits per transaction
    Then change Limits per day
    Then change Limits per month
    Then change total number of transactions
    Then click Save
    Then revert to default values

  @FastPayments
  Scenario: FAST PAYMENTS
    Then go to Fast payments
    Then turn off Fast payments
    Then enter PIN
    Then turn on Fast payments
    Then enter PIN
    Then click X
    Then go BACK
