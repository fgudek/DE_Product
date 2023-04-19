@SanityTest
@PaymentsPageTest
Feature: PAYMENTS PAGE TEST

  Background:
    Given user is logged in
    Then go to PAYMENTS page


  @OwnTransfer
  Scenario: INTERNAL TRANSFER
    Then go to PAYMENTS page
    Then go to OWN TRANSFERS & EXCHANGE
    Then verify OWN TRANSFERS page
    Then click select PAYER account
    Then select RSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select EUR_ACCOUNT as Pay to account
    Then click select PAYER account
    Then select RSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select EUR_ACCOUNT as Pay to account
    Then enter AMOUNT as AMOUNT in OWN transfer
    Then click close Keyboard button
    Then click SEE OUR EXCHANGE RATE AND FEE
    Then close EXCHANGE RATE AND FEE
    Then enter Description
    Then click close Keyboard button
    Then proceed to review screen
    And verify REVIEW page
    And review RSDaccount as PAYER
    And review EUR_ACCOUNT as BENEFICIARY
    And review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
    Then click save TEMPLATE
    Then save INTERNAL_TEMPLATE as Internal template
    Then click close Keyboard button
    Then click Save
    Then verify TEMPLATE success message
    Then click Done
    Then click More
    Then LOG OUT

  @DomesticPayment
  Scenario: DOMESTIC PAYMENT
    Then go to PAYMENTS page
    Then go to DOMESTIC PAYMENT
    * enter PAYER_NAME as payer name
    * enter PAYER_ADDRESS as payer address
    * enter PAYER_CITY as payer city
    * select model
    * enter PAYER_REF_NUMBER as reference number
    * enter ACCOUNT as beneficiary account
    * enter BENEFICIARY_NAME as beneficiary name
    * enter BENEFICIARY_ADDRESS as address
    * enter BENEFICIARY_CITY as city
    * select model
    * enter PAYER_REF_NUMBER as reference number
    * enter AMOUNT as amount
    * click close Keyboard button
    * enter PAYMENT_DETAILS as payment details
    * click close Keyboard button
    * turn on Urgent payment
    * turn off Urgent payment
#    * select Purpose code
    * select Date
    * click close Date
    * proceed to review screen
    And verify REVIEW page
    And review currentRSDaccount as PAYER
    And review ACCOUNT as BENEFICIARY
    And review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
#    Then verify SUCCESSFUL DOMESTIC PAYMENT
    Then click save Template and Beneficiary
    Then save DOMESTIC_TEMPLATE as template
    Then save DOMESTIC_BENEFICIARY as beneficiary
    Then click close Keyboard button
    Then click Save
    Then verify TEMPLATES AND BENEFICIARY success message
#    Then click SHOW MORE
#    Then click SHOW LESS
    Then click Done
    Then click More
    Then LOG OUT
    #Then verify successful DOMESTIC TRANSFER

  @ForeignPayment
  Scenario: FOREIGN PAYMENT
    Then go to PAYMENTS page
    Then go to FOREIGN PAYMENT
    Then verify EUR_ACCOUNT as PAYER ACCOUNT
    * enter FOREIGN_ACCOUNT as beneficiary account
    * enter FOREIGN_BENEFICIARY_NAME as beneficiary name
    * enter FOREIGN_BENEFICIARY_ADDRESS as address
    * enter FOREIGN_BENEFICIARY_CITY as city
    * select Payee country
#    * enter FOREIGN_BENEFICIARY_COUNTRY as country
    * enter SWIFT as swift code
    * enter FOREIGN_BANK_NAME as Payee Bank name
    * enter FOREIGN_BANK_ADDRESS as Payee Bank address
    * enter FOREIGN_BANK_CITY as Payee Bank city
    * select Payee bank country
    * enter AMOUNT as amount
    * select EUR as currency
    * select Fee type
    * enter FOREIGN_PAYMENT_DETAILS as payment details
    * select Purpose code Foreign
    * select Date
    * click close Date
    * proceed to review screen
    And verify REVIEW page
    And review EUR_ACCOUNT as PAYER
    And review FOREIGN_ACCOUNT as BENEFICIARY
    And review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
    Then click save Template and Beneficiary
    Then save FOREIGN_TEMPLATE as template
    Then click close Keyboard button
    Then click Save
    Then verify TEMPLATES AND BENEFICIARY success message
    Then click Done
    Then click More
    Then LOG OUT

  @P2PPayment
  Scenario: P2P PAYMENT
    Then go to PAYMENTS page
    Then go to P2P PAYMENT
    Then click Select payment type
    Then select payment type: email
    Then click Select payment type
    Then select payment type: phone number
    Then open Address book
    Then select CONTACT from Address book
    Then choose CONTACT_PHONE as phone number
    Then verify CONTACT as CONTACT name
    #Then enter Payee name as name
    Then enter AMOUNT as amount
    Then click close Keyboard button
    Then enter MESSAGE for a friend
    Then click close Keyboard button
    Then proceed to review screen
    Then verify P2P Payment review
    Then click PAY
    Then enter PIN
    #Then verify Payment status
    Then click Done

  @RechargePhone
  Scenario: RECHARGE PHONE
    Then go to RECHARGE PHONE
    Then go to RECHARGE NEW PHONE
#    Then swipe to currentHRKaccount
#    Then swipe left
#    Then swipe left
    Then select provider
    Then enter Phone Number
    Then enter AMOUNT as amount
    Then click Continue
    Then verify Phone Recharge payment and Pay
    Then click USE PIN
    Then enter PIN
    Then click Done

    #Blocker

  @RequestMoney
  Scenario: REQUEST MONEY
    Then go to PAYMENTS page
    Then go to REQUEST MONEY & SPLIT BILLS
    Then open options for 1st request
    Then click request DETAILS
    Then open options for creditor
    Then click SEND REMINDER
    Then click MARK AS PAID
    Then scroll DOWN
    Then click close
    Then click NEW REQUEST
    Then click Pay From
    Then select RSDaccount as Account
    Then enter REQUESTED_AMOUNT as requested Amount
    Then enter Description
    Then click SHOW QR CODE
#    Then review data
#    Then click SHARE
    Then close SHOW QR CODE modal
    Then click on Select Transaction icon
    Then go BACK
    Then click SPLIT WITH FRIENDS
#Trebat ce izmjene kad se stvore rjese blockeri

  @BuyAVoucher
  Scenario: BUY A VOUCHER
    Then go to PAYMENTS page
    Then go to BUY A VOUCHER
    Then click OPTIONS for 1st voucher
    Then click SHARE VOUCHER in options
    Then close SHARE VOUCHER
    Then click OPTIONS for 1st voucher
#    Then click VIEW RECEIPT in options
#    Then go BACK
    Then click REPEAT PAYMENT in options
    Then go BACK
#    Then click OPTIONS for 1st voucher
#    Then click DETAILS in options
#    Then go BACK
    Then click BUY A NEW VOUCHER
    Then verify Select provider modal
    Then select provider VOUCHER
    Then go BACK
    Then click BUY A NEW VOUCHER
    Then verify Select provider modal
    Then select provider VOUCHER
#    Then click on SELECT ACCOUNT
#    Then select currentHRKaccount as Account
    Then select Voucher amount
    Then click Continue
    Then verify Payment review
    ## Moras napraviti select dinamički za amount i providera da bi mogao imati review
    Then click PAY
    Then enter PIN
    #Then verify successful voucher payment
    Then click Done

  @BillsNSUtilityBills
  Scenario: BILLS NEW SUBSCRIPTION UTILITY BILLS
    Then go to PAYMENTS page
    Then go to BILLS & RECURRING PAYMENTS
    Then switch to OBLIGATIONS
    Then switch to SUBSCRIPTIONS
    Then click NEW SUBSCRIPTION
    And click UTILITY BILLS as NEW SUBSCRIPTION
    Then go to SCAN TO PAY
    Then go BACK
    Then select EPS as standing order
    Then click NEW BILL PRESENTMENT
    Then verify Bill issuer details screen
    And click Bill identifier info
    And click close
    And enter BILL_IDENTIFIER as BILL IDENTIFIER
    And click close Keyboard button
#    And select Date
#    And open Terms and conditions
#    And close Terms and conditions
    And turn on I Agree with Terms and Conditions
    And click SHOW MORE
    And click SHOW LESS
    Then proceed to Bill presentment review
    And review EPS as BILL ISSUER
    And review BILL_IDENTIFIER as BILL IDENTIFIER
    Then click SUBSCRIBE
    Then enter PIN
    Then click Done

  @MyOrdersDraft
  Scenario: MY ORDERS DRAFT
    Then go to MY ORDERS
    Then go to DRAFT orders
    Then go to Select bank account - ORDERS
    Then select currentHRKaccount as Account
    Then click options for 1st order
    Then click DELETE in options
    Then click CANCEL
    Then click options for 1st order
    Then click COPY in options
    Then go BACK
    Then click DISCARD payment
    Then click options for 1st order
    Then click PAY in options
    Then verify REVIEW page
    Then click PAY
    Then enter PIN
    Then click Done
    Then go BACK
    # Then click SELECT ORDERS & PAY
    Then go BACK

  @MyOrdersExecuted
  Scenario: MY ORDERS EXECUTED
    Then go to MY ORDERS
    Then go to EXECUTED orders
    Then go to Select bank account - ORDERS
    Then select SAVINGS_ACCOUNT as Account
    Then search for order
    Then verify executed order
    #dodati dinamičke varijable i filter nakon bugfixa
    Then erase search
    Then click close Keyboard button
#    Then click on Filter icon
#    Then select LAST 3 MONTHS and FILTER
#    Then click RESET FILTER
    Then click options for 1st order
    Then click COPY in options
    Then go BACK
    Then click DISCARD payment
    Then click options for 1st order
    Then click SHARE in options
    Then close SHARE in options
    Then click options for 1st order
    Then click SAVE AS TEMPLATE OR BENEFICIARY in options
    Then go BACK
    Then click options for 1st order
    Then click VIEW RECEIPT in options
    Then go BACK
    Then click options for 1st order
    Then click DETAILS in options
    Then scroll DOWN
    Then click Copy to clipboard
    Then click close
    Then go BACK

  @MyOrdersPending
  Scenario: MY ORDERS PENDING
    Then go to MY ORDERS
    Then go to PENDING orders
    Then click options for 1st order
    Then click DELETE in options
    Then click CANCEL
    Then click options for 1st order
    Then click COPY in options
    Then go BACK
    Then click DISCARD payment
    Then click options for 1st order
    Then click VIEW RECEIPT in options
    Then go BACK
    Then click options for 1st order
    Then click DETAILS in options
    Then scroll DOWN
    Then click Copy to clipboard
    Then click close
    Then go BACK

  @MyOrdersUnknown
  Scenario: MY ORDERS UNKNOWN
    Then go to MY ORDERS
    Then go to UNKNOWN orders
    Then click options for 1st order
    Then click DELETE in options
    Then click CANCEL
    Then click options for 1st order
    Then click COPY in options
    Then go BACK
    Then click DISCARD payment
    Then click options for 1st order
    Then click VIEW RECEIPT in options
    Then go BACK
    Then click options for 1st order
    Then click DETAILS in options
    Then scroll DOWN
    Then click Copy to clipboard
    Then click close
    Then go BACK

  @MyOrdersCurrentlyEmpty
  Scenario: MY ORDERS CURRENTLY EMPTY
    Then go to MY ORDERS
    Then go to CANCELED orders
    Then verify empty state
    Then go BACK
    Then go to REJECTED orders
    Then verify empty state
    Then go BACK
    Then go to SCHEDULED orders
    Then verify empty state
    Then go BACK

  @ScanToPay
  Scenario: SCAN A QR CODE
    Then go to Scan to pay
    Then verify Scan To Pay page
    Then go BACK


