@SanityTest
@TransactionsTest
Feature: Transactions test

  Background:
    Given user is logged in

#  @TransactionsList     problems with encoding
  Scenario: TRANSACTION LIST

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
