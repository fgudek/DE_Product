@RegressionTest
@AnalyticsPageTest
Feature: Analytics

  Background:
    Given user is logged in
    Then go to SPENDING page

  @SpendingOverview
  Scenario:Add transaction

#  @ChangeCategory
#  Scenario: Change category


