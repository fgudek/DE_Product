@RegressionTest
@TransactionsTest

Feature: TRANSACTIONS PAGE TEST

#  Background:
#    Given user is logged in

  @AccountTransactionsList
  Scenario: TRANSACTION LIST
    Then verify HOMEPAGE
    Then select expand ACCOUNT
#    Then click on SELECT ACCOUNT
#    Then select EURaccount as Account to view transactions
    Then scroll DOWN
    Then scroll UP
    Then search for TRANSACTION as transaction
    # Then SHORE MORE/SHOW LESS
    Then go BACK

  @TransactionAccountDetails
  Scenario: TRANSACTION DETAILS
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select EURaccount as Account to view transactions
    Then select expand ACCOUNT
    Then scroll DOWN
    Then wait for TRANSACTIONS to load
    Then open TRANSACTION as TRANSACTION
    Then scroll DOWN
    Then scroll UP
   # Then go to VIEW RECEIPT
   # Then go BACK
    Then go to SHARE
    Then go BACK
    Then go to COPY PAYMENT
    Then go BACK
    Then click DISCARD payment
    Then go to SPLIT WITH FRIENDS
    Then go BACK
    Then click close
    Then go BACK
    # Then SHORE MORE/SHOW LESS


  @TransactionFilter
  Scenario: TRANSACTION FILTER
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account to view transactions
    Then select expand ACCOUNT
    Then scroll DOWN
    Then scroll UP
    Then click on Filter icon
    Then verify Select filter screen
    Then go BACK
    Then go BACK
    # Then SHORE MORE/SHOW LESS

  @FilterByDateRange
  Scenario: FILTER DATE BY RANGE
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account to view transactions
    Then select expand ACCOUNT
    Then click on Filter icon
    Then verify Select filter screen
    Then select LAST 30 DAYS and FILTER
    And scroll DOWN
    And click RESET FILTER
    Then click on Filter icon
    Then select LAST 3 MONTHS and FILTER
    And click RESET FILTER
    Then click on Filter icon
    Then select LAST 6 MONTHS and FILTER
    And click RESET FILTER
    Then click on Filter icon
    Then go BACK
    Then go BACK

  @FilterBySpecificDateRange
  Scenario: FILTER BY SPECIFIC DATE RANGE
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account to view transactions
    Then select expand ACCOUNT
    Then click on Filter icon
    Then verify Select filter screen
#    Then select FROM date
#    Then select TO date
    And click FILTER
    Then click RESET FILTER
    Then go BACK

  @FilterByAmount
  Scenario: FILTER BY AMOUNT
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account to view transactions
    Then select expand ACCOUNT
    Then click on Filter icon
    Then enter amount for FROM value
    Then enter amount for TO value
    #Then verify currencies
    And click FILTER
    Then click RESET FILTER
    Then go BACK

  @FilterByTransactionType
  Scenario: FILTER BY TRANSACTION TYPE
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account to view transactions
    Then select expand ACCOUNT
    Then click on Filter icon
    Then click on TRANSACTION TYPE
    Then verify Select transaction types
    Then select SELECT ALL
    Then deselect SELECT ALL
    Then check the FEE transactions
    Then check the WITHDRAWAL transactions
    Then click Done
    Then click FILTER
    Then click RESET FILTER
    Then go BACK

  @FilterByTransactionStatus
  Scenario: FILTER BY TRANSACTION STATUS
    Then verify HOMEPAGE
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account to view transactions
    Then select expand ACCOUNT
    Then click on Filter icon
    Then click on TRANSACTION STATUS
    Then select SELECT ALL
    Then deselect SELECT ALL
    Then check the EXECUTED transactions
    Then check the REJECTED transactions
    Then click Done
    Then click FILTER
    Then click RESET FILTER
    Then go BACK














