@RegressionTest
@NegativeTest
  Feature: NEGATIVE TESTING

    Background:
      Given user is logged in
      Then go to PAYMENTS page

    @NegativeDomesticPayment
    Scenario: NEGATIVE DOMESTIC PAYMENT

      @NegativeBudgetPayment
    Scenario: NEGATIVE BUDGET PAYMENT


    @NegativeInternalPayment
    Scenario: NEGATIVE INTERNAL PAYMENT

    @NegativeInternalFXTransfer
    Scenario: NEGATIVE INTERNAL FX TRANSFER

    @NegativeCreatePaycode
    Scenario: CREATE A PAYCODE


    @NegativeCardRepayment
    Scenario: NEGATIVE CREDIT CARD REPAYMENT
