@SanityTest
@SettingsPageTest
Feature: SETTINGS PAGE TEST

  Background:
    Given user is logged in
    Then click More
    Then go to SETTINGS

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
    Then change total number of transactions per DAY
    Then change Limits per month
    Then change total number of transactions per MONTH
    Then click Save
    Then go to mBanking limits
    Then revert to default values
    Then click Save

  @FastPayments
  Scenario: FAST PAYMENTS
    Then go to Fast payments
    Then turn off Fast payments
    Then enter PIN
    Then turn on Fast payments
    Then enter PIN
    Then click close
    Then go BACK

#services

  @Notifications
  Scenario: Notifications
    Then go to Notifications
    Then turn Incoming Transactions off
    Then turn Outgoing Transactions off
    Then turn Payments notifications off
    Then turn Credit card bill reminder off
    Then turn Incoming Interests off
    Then turn Upcoming maturity date off
    Then turn Upcoming loan installment off
    Then click Save
#    Then go BACK
#    Then go to Settings
    Then go to Notifications
    Then turn Outgoing Transactions on
    Then go to account select and select account
    Then click Done
    Then turn Incoming Transactions on
    Then go to account select and select account
    Then click Done
    Then turn Payments notifications on
    Then turn Credit card bill reminder on
    Then turn Incoming Interests on
    Then turn Upcoming maturity date on
    Then turn Upcoming loan installment on
    Then click Save



