@SanityTest
@HomePageTest
Feature: Home page test

  Background:
    Given user is logged in

  @Shortcuts
   Scenario: HOME PAGE SHORTCUTS TEST
    #Then click on INBOX
    #Then go BACK
    Then click on Accounts
    Then go BACK
    Then click on Scan to Pay
    Then go BACK
    Then click on Pay Someone
    Then go BACK
    Then click on Request Money
    Then go BACK
#    Then click on mCash
#    Then go BACK
    Then click on select Credit card
    Then select a credit card
    Then go BACK
    Then click on Select Saving
    Then select a savings account
    Then go BACK
    Then click on Loans
    Then go BACK



