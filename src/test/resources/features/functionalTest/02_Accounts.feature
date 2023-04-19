#@RegressionTest
#@AccountsPageTest
Feature: ACCOUNTS PAGE TEST

#  Background:
#    Given user is logged in

  @HomepageAccounts
  Scenario: ACCOUNT OPTIONS
    Then user is logged in
    Then select ACCOUNTS options page
    Then go to CHANGE DEFAULT ACCOUNT
    Then go BACK
    Then click DISCARD payment
    Then select ACCOUNTS options page
    Then go to STATEMENTS
    Then go BACK
    Then select ACCOUNTS options page
    Then go to SHARE
    Then go BACK
    Then select ACCOUNTS options page
    Then click PAY
    Then go BACK
    Then click DISCARD payment
    Then select ACCOUNTS options page
    Then go to DETAILS page
    Then go BACK
    Then select ACCOUNTS options page
    Then go to OVERVIEW
    Then go BACK

  @HomepageAccounts
  Scenario: ACCOUNT LANDING PAGE
    Then select expand ACCOUNT
    Then go to MORE page
    Then select PAY account
    Then go BACK
    Then go to MORE page
    Then go to STATEMENTS
    Then go BACK
    Then go to MORE page
    Then go to SHARE
    Then select Payment details
    Then enter 300 amount
    Then click close Keyboard button
    Then enter payment description
    Then click close Keyboard button
#    Then click Show Code
#    Then close Show Code
    Then go to SHARE
    Then click close
    Then go BACK
    Then go BACK

  @HomepageAccounts
  Scenario: ACCOUNT INTERNAL TRANSFER
    Then select expand ACCOUNT
    Then go to MORE page
    Then select OWN TRANSFER
    Then verify OWN TRANSFERS page
    Then click select PAYER account
    Then select currentRSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select currentHRKaccount as Pay to account
    Then enter AMOUNT as amount
    Then click close Keyboard button
    Then enter Description
    Then click close Keyboard button
    Then click Continue
    Then verify Internal Payment review


