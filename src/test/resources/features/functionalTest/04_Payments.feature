@RegressionTest
@PaymentsPageTest
Feature: PAYMENTS PAGE TEST

  Background:
    Given user is logged in
    #Then go to PAYMENTS page

#  @PaymentsLandingPage
#  Scenario: PAYMENTS PAGE SHORTCUTS

  @DomesticPayment
  Scenario: DOMESTIC PAYMENT
    Then go to PAYMENTS page
    Then go to DOMESTIC PAYMENT
    #* click Select payment type
    #* select payment type: email
    #* click Select payment type
    #* select payment type: bank account
#    * enter ACCOUNT as beneficiary account
#    * enter BENEFICIARY_NAME as beneficiary name
    * go back to PAYMENTS page
    * cancel exiting payment
    * go back to PAYMENTS page
    * confirm exiting payment
    Then go to DOMESTIC PAYMENT
#    Then click Pay From
#    Then select currentRSDaccount as Account
#    Then verify currentRSDaccount as PAYER ACCOUNT
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
    * click SHOW LESS
    * click SHOW MORE
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
    * enter FOREIGN_ACCOUNT as beneficiary account
    * enter FOREIGN_BENEFICIARY_NAME as beneficiary name
    * go back to PAYMENTS page
    * cancel exiting payment
    * go back to PAYMENTS page
    * confirm exiting payment
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
#    * click close Keyboard button
#    * click to choose currency
    * enter AMOUNT as amount
    * select EUR as currency
#    * click close Keyboard button
    * select Fee type
    * enter FOREIGN_PAYMENT_DETAILS as payment details
    # * select .* as Purpose code
    * select Purpose code Foreign
    * select Date
    * click close Date
    # show more show less??
    * proceed to review screen
    And verify REVIEW page
    And review EUR_ACCOUNT as PAYER
    And review FOREIGN_ACCOUNT as BENEFICIARY
    And review AMOUNT as AMOUNT
    # dodati review PODATAKA BANKE
    Then click PAY
    Then enter PIN
    # Then verify SUCCESSFUL DOMESTIC PAYMENT
    Then click save Template and Beneficiary
    Then save FOREIGN_TEMPLATE as template
    Then click close Keyboard button
    Then click Save
    Then verify TEMPLATES AND BENEFICIARY success message
    Then click SHOW MORE
    Then click SHOW LESS
    Then click Done
    Then click More
    Then LOG OUT


  @OwnTransfer
  Scenario: INTERNAL TRANSFER
    Then go to PAYMENTS page
    Then go to OWN TRANSFERS & EXCHANGE
    Then verify OWN TRANSFERS page
    Then click select PAYER account
    Then select RSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select EUR_ACCOUNT as Pay to account
    Then go back to PAYMENTS page
    Then cancel exiting payment
    Then go back to PAYMENTS page
    Then confirm exiting payment
    Then go to OWN TRANSFERS & EXCHANGE
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



  @BudgetPayment
  Scenario: BUDGET PAYMENT


  @InternalFXTransfer
  Scenario: INTERNAL TRANSFER



#  @CardRepayment
#  Scenario: CARD REPAYMENT


  @CreatePaycode
  Scenario: CREATE A PAYCODE


  @ScanQRCode
  Scenario: SCAN A QR CODE
    #pitaj za QR kod koji bi mogao skenirati


  @TemplatePayment
  Scenario: TEMPLATE PAYMENTS
    Then go to Pay Someone
    Then switch to templates
    Then select More Template
    Then click Edit
    Then edit the name of the template
    Then click Save
    Then click Pay
    #Then go BACK
    #Then click Delete template
    # verify template is deleted


  @SaveTemplateAndBeneficiary
  Scenario: SAVE TEMPLATE AND BENEFICIARY
    Then go to Pay Someone
    * click Select payment type
    * select payment type: email
    * click Select payment type
    * select payment type: bank account
    * enter ACCOUNT as beneficiary account
    * enter AMOUNT as amount
    * click close Keyboard button
    * click Continue
    Then verify Domestic payment screen
    * enter PAYER_NAME as payer name
    * enter PAYER_ADDRESS as payer address
    * enter PAYER_CITY as payer city
    * select model
    * enter PAYER_REF_NUMBER as reference number
#    Then click Pay From
#    Then select RSDaccount as Account
    Then enter BENEFICIARY_NAME as beneficiary name
    Then enter BENEFICIARY_ADDRESS as address
    Then enter BENEFICIARY_CITY as city
    Then enter DescriptionBen as payment details
    Then turn on Urgent payment
    Then turn off Urgent payment
    Then click Continue
    Then verify Domestic Payment review
    Then click PAY
    Then enter PIN
    Then click save Template and Beneficiary
    Then save TEMPLATE_1 as template
    Then save BENEFICIARY_1 as beneficiary
    Then click close Keyboard button
    Then click Save
    Then click Done
#    Then sign the transfer and confirm it successful
    #Then enter PIN
    #Then verify
    #Then verify Payment result screen
    #Then click edit Template and Beneficiary
    #Then verify Saved Payments
    #Then verify Edit template and Beneficiary



  @DomesticTemplatePayment
  Scenario: DOMESTIC TEMPLATE PAYMENTS
    * go to Pay Someone
    * switch to templates
    * switch to new PAYMENTS page
    * switch to templates
    Then go BACK
    Then go to Templates and Beneficiaries shortcut
    Then select DOMESTIC_TEMPLATE as template
    Then verify Domestic payment screen
    Then verify currentRSDaccount as PAYER ACCOUNT
    Then verify BENEFICIARY_ACCOUNT as BENEFICIARY ACCOUNT
    Then verify BENEFICIARY_NAME as BENEFICIARY NAME
    Then verify AMOUNT as AMOUNT
    Then proceed to review screen
    Then verify REVIEW page
    Then review currentRSDaccount as PAYER
    Then review BENEFICIARY_ACCOUNT as BENEFICIARY
    Then review BENEFICIARY_NAME as BENEFICIARY NAME
    Then review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
    #Then verify SUCCESSFUL DOMESTIC PAYMENT
    Then click Done
    #Then delete DOMESTIC_TEMPLATE template
    #Then delete DEFAULT_TEMPLATE template
    #Then click BACK

  @InternalTemplatePayment
  Scenario: INTERNAL TEMPLATE PAYMENTS
    * go to Pay Someone
    * switch to templates
    * switch to new PAYMENTS page
    * switch to templates
    Then go BACK
    Then go to Templates and Beneficiaries shortcut
    Then select INTERNAL_TEMPLATE as template
    Then verify International Payment screen
    Then verify .* as PAYER ACCOUNT
    Then verify .* as BENEFICIARY ACCOUNT
    Then verify AMOUNT as AMOUNT
    Then proceed to review screen
    And verify REVIEW page
    And review CURRENT_ACCOUNT as PAYER
    And review AUTHORIZED_ACCOUNT as BENEFICIARY
    And review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
    #Then verify SUCCESSFUL INTERNAL TRANSFER
   # Then go to TEMPLATES shortcut
   # Then delete INTERNAL_TEMPLATE template
   # Then click BACK

  @ForeignTemplatePayment
  Scenario: FOREIGN TEMPLATE PAYMENTS
    * go to Pay Someone
    * switch to templates
    * switch to new PAYMENTS page
    * switch to templates
    Then go BACK
    Then go to Templates and Beneficiaries shortcut
    Then select FOREIGN_TEMPLATE as template
    Then verify International Payment screen
    Then verify EUR_ACCOUNT as PAYER ACCOUNT
    Then verify FOREIGN_BENEFICIARY_ACCOUNT as BENEFICIARY ACCOUNT
    Then verify FOREIGN_BANK_NAME as BENEFICIARY BANK NAME
    Then verify AMOUNT_1 as AMOUNT
    Then proceed to review screen
    Then verify REVIEW page
    Then review EUR_ACCOUNT as PAYER
    Then review FOREIGN_BENEFICIARY_ACCOUNT as BENEFICIARY
    Then review AMOUNT_1 as AMOUNT
    Then click PAY
    Then enter PIN
    #Then verify SUCCESSFUL FOREIGN PAYMENT
    #Then go to TEMPLATES shortcut
    #Then delete FOREIGN_TEMPLATE template
    #Then click BACK

  @SavedPayments
  Scenario: SAVED PAYMENTS
    Then go to PAYMENTS page
    Then go to Templates and Beneficiaries
    Then verify Templates and Beneficiaries screen
    Then click MORE button for Test template
    Then close MORE
    Then click MORE button for Test template
    Then click DELETE in options
    Then click CANCEL
    Then click MORE button for Test template
    Then click PAY in options
    Then verify Domestic payment screen
    Then go BACK
    Then click DISCARD payment
#    Then verify TEST BENEFICIARY as Beneficiary
    Then select Beneficiary
    Then verify ACCOUNT as BENEFICIARY ACCOUNT
    Then go BACK
    Then click DISCARD payment
    Then verify Templates and Beneficiaries screen

  @EditTemplate
  Scenario: EDIT TEMPLATE
    Then go to PAYMENTS page
    Then go to Templates and Beneficiaries
    Then verify Templates and Beneficiaries screen
    #Then verify INTERNATIONAL as Template
    Then click MORE button for Test template
    Then click EDIT
    Then verify Domestic payment screen
    Then turn on Urgent payment
    Then turn off Urgent payment
    Then enter .* as country
    Then click close Keyboard button
    Then click Save
    Then close ERROR
    Then click CANCEL

  @EditBeneficiary
  Scenario: EDIT BENEFICIARY
    Then go to PAYMENTS page
    Then go to Templates and Beneficiaries
    Then verify Templates and Beneficiaries screen
    #Then verify INTERNATIONAL as Template
    Then click MORE button for Test Beneficiary
    Then click EDIT
    Then verify Edit Beneficiary screen
    Then click ADD NEW BANK ACCOUNT
    Then add new ACCOUNT identifer
    Then click close Keyboard button
    Then click CANCEL
    Then click MORE button for Test Beneficiary
      #And verify new ACCOUNT identifer
      And close beneficiary modal
    Then click MORE button for Test Beneficiary
    Then click EDIT
    Then click ADD NEW BANK ACCOUNT
    Then add new ACCOUNT identifer
    Then click close Keyboard button
    Then click Save
    Then verify newly added identifier
    Then click MORE button for Test Beneficiary
    Then click EDIT
    Then delete new ACCOUNT identifier
    Then click Save
    Then verify new identifier is deleted
    Then click MORE button for Test Beneficiary
    Then click DELETE in options
    Then click CANCEL



  @ExchangeTransfer
  Scenario: ExchangeTransfer
    Then go to PAYMENTS page
    Then go to OWN TRANSFERS & EXCHANGE
    Then verify OWN TRANSFERS page
    Then go Back arrow
    Then click CANCEL
    Then go Back arrow
    Then click DISCARD payment
    Then go to OWN TRANSFERS & EXCHANGE
    Then click select PAYER account
    Then select EUR_ACCOUNT as Pay From account
    Then click select BENEFICIARY account
    Then select currentRSDaccount as Pay to account
    Then enter AMOUNT as amount
    Then click close Keyboard button
    Then click SEE OUR EXCHANGE RATE AND FEE
    Then close EXCHANGE RATE AND FEE
    Then enter Description
    Then click close Keyboard button
    Then click Continue
      And review EUR_ACCOUNT as PAYER
      And review currentRSDaccount as BENEFICIARY
      And review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
    Then click Done
    #Then verify SUCCESFUL CURRENCY EXCHANGE

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

  @BillsNSOwnTransferAndExchange
  Scenario: BILLS NEW SUBSCRIPTION OWN TRANSFER AND EXCHANGE
    Then go to PAYMENTS page
    Then go to BILLS & RECURRING PAYMENTS
    Then click NEW SUBSCRIPTION
    Then click OWN TRANSFERS & EXCHANGE as NEW SUBSCRIPTION
    Then click select PAYER account
    Then select RSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select EUR_ACCOUNT as Pay to account
    Then enter AMOUNT as amount
    Then click SEE OUR EXCHANGE RATE AND FEE
    Then close EXCHANGE RATE AND FEE
    And enter SO_NICKNAME as nickname for standing order
    Then enter SO_DESCRIPTION as standing order details
    And select START date
    And select REVOCATION date
    And open FREQUENCY page
    And select YEARLY as FREQUENCY
    And open FREQUENCY page
    And select WEEKLY as FREQUENCY
   # And verify WEEKLY as selected FREQUENCY
    And turn on I Agree with Terms and Conditions in SO
    Then proceed to Bill presentment review
    # zasada imam blocker za ova dva koraka u testu
    And verify data on Standing order review
    Then click SUBSCRIBE
    #Then verify successful Subscriptions message
    Then click Done


  @BillsNSPaySomeone
  Scenario: BILLS NEW SUBSCRIPTION PAY SOMEONE DOMESTIC
    Then go to PAYMENTS page
    Then go to BILLS & RECURRING PAYMENTS
    Then click NEW SUBSCRIPTION
    Then click PAY SOMEONE as NEW SUBSCRIPTION
    Then enter ACCOUNT as beneficiary account
#    Then enter SWIFT/BIC as swift code
    Then click close Keyboard button
    #Then select EUR as currency
    Then enter AMOUNT as amount
    Then select EUR as currency
    Then select RSD as currency
    Then click close Keyboard button
    Then proceed to STANDING ORDER page
#    Then click Pay From
#    Then select currentHRKaccount as Pay From account
    Then enter BENEFICIARY_NAME as beneficiary name
    Then click close Keyboard button
    Then verify AMOUNT as AMOUNT
    Then enter SO_NICKNAME as nickname for standing order
    Then enter SO_DESCRIPTION as standing order details
    Then enter MODEL_NUMBER as model number
    Then select START date
    Then select REVOCATION date
    Then select QUARTERLY as FREQUENCY
    Then open FREQUENCY page
    Then select MONTHLY as FREQUENCY
    Then verify MONTHLY as FREQUENCY
    Then turn on I Agree with Terms and Conditions in SO
    Then click SHOW MORE
    Then click SHOW LESS
    Then proceed to Standing order review
    #INTERNAL SERVICE ERROR
    Then verify data on Standing order review
    Then click CREATE
    #Then verify successful Subscriptions message
    Then click Done

  @BillsNSPaySomeoneInternational
  Scenario: BILLS NEW SUBSCRIPTION PAY SOMEONE INTERNATIONAL
    Then go to PAYMENTS page
    Then go to BILLS & RECURRING PAYMENTS
    Then click NEW SUBSCRIPTION
    Then click PAY SOMEONE as NEW SUBSCRIPTION
    Then enter ACCOUNT as beneficiary account
    Then enter SWIFT/BIC as swift code
    Then click close Keyboard button
    #Then select EUR as currency
    Then enter AMOUNT as amount
    Then select EUR as currency
    Then click close Keyboard button
    Then proceed to STANDING ORDER page
#    Then click Pay From
#    Then select currentHRKaccount as Pay From account
    Then enter BENEFICIARY_NAME as beneficiary name
    Then enter BENEFICIARY_ADDRESS as address
    Then enter BENEFICIARY_CITY as city
    Then select Payee country
    Then enter FOREIGN_BANK_NAME as Payee Bank name
    Then enter FOREIGN_BANK_ADDRESS as Payee Bank address
    Then enter FOREIGN_BANK_CITY as Payee Bank city
    Then click close Keyboard button
    Then select Payee bank country
    Then verify AMOUNT as AMOUNT
    Then enter SO_NICKNAME as nickname for standing order
    Then enter SO_DESCRIPTION as standing order details
    Then enter MODEL_NUMBER as model number
    Then select START date
    Then select REVOCATION date
    Then select QUARTERLY as FREQUENCY international SO
    Then select MONTHLY as FREQUENCY international SO
    Then verify MONTHLY as FREQUENCY
    Then turn on I Agree with Terms and Conditions in SO
#    Then click SHOW MORE
#    Then click SHOW LESS
    Then proceed to Standing order review
    #INTERNAL SERVICE ERROR
    Then verify data on Standing order review
    Then click CREATE
    #Then verify successful Subscriptions message
    Then click Done

    #Treba fixati problems sa Select filter screenom
  @BillsAndRecurringPaymentsFilter
  Scenario: BILLS AND RECURRING PAYMENTS FILTER
    Then go to PAYMENTS page
    Then go to BILLS & RECURRING PAYMENTS
    Then click on Filter icon
    Then verify Select filter screen
    Then click CANCEL
    Then go to BILLS & RECURRING PAYMENTS
    Then select BILL PRESENTMENT as transaction type
    Then select DIRECT DEBIT as transaction type
    Then click FILTER
    #Then verify transaction type on subscriptions screen
    Then click on Filter icon
    Then deselect BILL PRESENTMENT as transaction type
    Then deselect DIRECT DEBIT as transaction type
    Then click FILTER
    #Then verify transaction type on subscriptions screen
    Then go BACK

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




