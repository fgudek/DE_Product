@RegressionTest
@PaymentsPageTest
Feature: PAYMENTS PAGE TEST

  Background:
    Given user is logged in
    Then go to PAYMENTS page

#  @PaymentsLandingPage
#  Scenario: PAYMENTS PAGE SHORTCUTS

  @PaySomeoneDomestic
  Scenario: DOMESTIC PAYMENT
    Then go to Pay someone
    * click Select payment type
    * select payment type: email
    Then click Select payment type
    Then select payment type: bank account
    Then enter account number
    Then enter Amount
    Then click Continue
    Then verify Domestic payment screen
    Then enter Payee name
    Then enter address
    Then enter city
    Then enter Payment Description
    Then select Urgent payment
    Then click Continue
    Then verify Payment review
    Then sign the transfer and confirm it successful


  @BudgetPayment
  Scenario: BUDGET PAYMENT


  @InternalTransfer
  Scenario: INTERNAL TRANSFER


  @InternalFXTransfer
  Scenario: INTERNAL TRANSFER



#  @CardRepayment
#  Scenario: CARD REPAYMENT


  @CreatePaycode
  Scenario: CREATE A PAYCODE


  @ScanQRCode
  Scenario: SCAN A QR CODE


  @TemplatePayment
  Scenario: TEMPLATE PAYMENTS
