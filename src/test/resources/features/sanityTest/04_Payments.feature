@SanityTest
@PaymentsPageTest
Feature: PAYMENTS PAGE TEST

  Background:
    Given user is logged in
    Then go to PAYMENTS page


  @InternalTransfer
  Scenario: INTERNAL TRANSFER
    Then go to Internal Transfer
    Then go to Pay From
    Then select Internal Transfer FROM account
    Then go to Pay To
    Then select Internal Transfer TO account
    Then enter Amount
    Then enter Description
    Then proceed to review screen
    Then verify Internal Payment review
    Then sign the transfer and confirm it successful

  @PaySomeoneDomestic
  Scenario: DOMESTIC PAYMENT
    Then go to Pay someone
    Then click Select payment type
    Then select payment type: bank account
    Then enter DOMESTIC_ACCOUNT number
    Then enter Amount
    Then click Continue
    Then verify Domestic payment screen
    Then enter Payee name
    Then enter address
    Then enter city
    Then enter Payment Description
    Then select Urgent payment
    Then click Continue
    Then verify Domestic Payment review
    Then sign the transfer and confirm it successful

  @PaySomeoneForeign
  Scenario: FOREIGN PAYMENT
    Then go to Pay someone
    Then click Select payment type
    Then select payment type: bank account
    Then enter FOREIGN_ACCOUNT number
    Then enter swift code
    Then verify International Payment screen
    Then enter Payee name
    Then enter address
    Then enter city
    Then enter country
    Then select Fee type
    Then select Purpose code
    Then click Continue
    Then verify Foreign Payment review
    Then sign the transfer and confirm it successful


  @MyOrders
  Scenario:MY ORDERS
    Then go to My Orders
    Then go to CANCELED orders
    Then go to Select bank account
    Then select currentRSDaccountLong Account
    Then verify order
    Then go to Select bank account
    Then select CURRENT_ACCOUNT Account
    Then go BACK
    And go to My Orders
    Then go to EXECUTED orders
    Then search for order
    Then verify executed order
    Then go BACK
    And go to My Orders
    Then go to PENDING orders
    Then go to Select bank account
    Then select currentRSDaccountLong Account
    Then verify order
    Then go BACK
    And go to My Orders
    Then go to REJECTED orders
    Then go BACK
    And go to My Orders
    Then go to SCHEDULED orders
    Then go BACK


  @ScanToPay
  Scenario: SCAN A QR CODE
    Then go to Scan to pay
    Then verify Scan To Pay page
    Then go BACK

  @RequestMoney
    Scenario: Request Money
    Then go to Request money
    Then click on account selection
    Then select GIRO-ACCOUNT Account
    Then click add payment details
    Then enter Amount
    Then enter Description
    Then click Show Code
    And verify payment details
    Then click share


  @RechargePhone
  Scenario: RECHARGE PHONE
    Then go to Recharge Phone
    Then go to RECHARGE NEW PHONE
  #  Then swipe to currentHRKaccount
    Then swipe left
    Then swipe left
    Then select provider
    Then enter Phone Number
    Then enter Amount
    Then click Continue
    Then verify Phone Recharge payment and Pay
    Then click USE PIN
    Then enter PIN
    Then click Done
