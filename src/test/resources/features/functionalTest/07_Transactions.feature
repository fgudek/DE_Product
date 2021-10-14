@RegressionTest
@TransactionsTest
Feature: Transactions test

  Background:
    Given user is logged in

#  @TransactionsList  working on encoding problem
#  Scenario: TRANSACTION LIST
#    Then search for DOMESTIC TRANSACTION
#    Then open a DOMESTIC TRANSACTION
#    Then click SHOW MORE
#    Then verify TRANSACTION DETAILS
#    Then click SHOW LESS


  @FilterByDateRange
  Scenario: FILTER BY DATE RANGE


  @FilterBySpecificDateRange
  Scenario: FILTER BY SPECIFIC DATE RANGE


  @FilterByCategory
  Scenario: FILTER BY CATEGORY


  @FilterByAmount
  Scenario: FILTER BY AMOUNT


  @FilterByTransactionStatus
  Scenario: FILTER BY TRANSACTION STATUS

