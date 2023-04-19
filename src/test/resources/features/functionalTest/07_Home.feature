#@RegressionTest
@HomePageTest
Feature: Home page test

#  Background:
#    Given user is logged in

  @HomePageSelectUser
  Scenario: HOME PAGE SELECT USER
    Then user is logged in
    Then select USER or COMPANY
    Then click search bar and type in Fran INC.
    Then select FRAN_INC as COMPANY/USER
    Then verify user has changed to Fran INC. on HOMEPAGE
    Then select USER or COMPANY
    Then click search bar and type in Fran Gudek
    Then select FRAN as COMPANY/USER
    Then verify user has changed to FG on HOMEPAGE
#    Then select USER or COMPANY
#    Then click search bar and type in MR
#    Then select USER_MR as COMPANY/USER
#    Then verify user has changed to Maryann on HOMEPAGE
#    Then click visibility of amount
    # tu je error koji se treba razrješiti
    #Then close visibility screen
    Then click on INBOX in reg app
    Then verify Inbox
    Then go BACK

  @HomePageShortcuts
  Scenario: HOME PAGE SHORTCUTS
#    Then user is logged in
    Then go to Scan to pay
    Then turn on flashlight
    Then go BACK
    #Back nemogu izvuci iz nekog razloga ovdje
    Then go to Pay Someone
    Then go BACK
    Then go to Request money
    Then go BACK
    Then go to Templates and Beneficiaries shortcut
    Then go BACK

  @HomePageAccountsList
  Scenario: HOME PAGE ACCOUNTS LIST
    Then select ACCOUNTS options page
    Then close ACCOUNTS options page
    Then go to OVERVIEW
    Then verify Accounts overview
    Then go to DETAILS page
    Then go BACK
    Then go BACK
    #Back ne radi
#    Then swipe account left
#    Then swipe account right
    Then click on SELECT ACCOUNT
    Then close SELECT ACCOUNT
    #Then click on CURRENT ACCOUNT


  @HomePageCards
  Scenario: HOME PAGE CARDS
    Then select CARD options
    Then close CARD options
    Then select expand CARDS
    #Ovdje treba options i expand lokator
    Then go to MORE page
    Then close MORE page
    Then swipe left
    Then go to DETAILS page
    Then close DETAILS page
    Then go BACK


  @HomePageSavings
  Scenario: HOME PAGE SAVINGS LANDING PAGE
    Then select SAVINGS options
    Then close SAVINGS options
#    Then go to SELECT SAVING
#    Then close SELECT SAVING
    #Ovdje treba options i expand lokator
    Then select expand SAVINGS ACCOUNTS
#    Then select OWN TRANSFER
    Then click PAY
    Then go BACK
    Then click DISCARD payment
    Then go to DETAILS page
    Then close DETAILS page
    Then go to MORE page
    Then close MORE page in SAVINGS
#    Then generate PDF file
    Then go BACK


  @SavingsAccountTransfer
  Scenario: SAVINGS ACCOUNT TRANSFER
    Then select expand SAVINGS ACCOUNTS
#    Then go to SELECT SAVING
#    Then close SELECT SAVING
    #Then swipe SAVINGS ACCOUNT left
    #Then swipe SAVINGS ACCOUNT right
    Then go to MORE page
    Then go to STATEMENTS
    Then go BACK
   # Then go to MORE page
   # Then go to REPAYMENT PLAN
   # Then go BACK
    Then go to MORE page
    Then select OWN TRANSFER
    Then verify OWN TRANSFERS page
    Then click select PAYER account
    Then select RSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select EUR_ACCOUNT as Pay to account
    Then enter AMOUNT in OWN transfer
    Then click close Keyboard button
    Then enter SAVINGS transfer DESCRIPTION
    Then click close Keyboard button
    Then click Continue
    Then verify SAVINGS internal transfer review
    Then click PAY
    Then enter PIN
    Then click Done
    Then go BACK
    #Then sign the transfer and confirm it successful

  @HomePageSavingsOptions
  Scenario: SAVINGS OPTIONS
    Then select SAVINGS options
    Then go to STATEMENTS
    Then go BACK
    Then select SAVINGS options
    Then go to ADD MONEY
    Then go BACK
    Then click DISCARD payment
    Then select SAVINGS options
    Then go to DETAILS page
    Then go BACK
    Then select SAVINGS options
    Then go to OVERVIEW
    Then go BACK


  @HomePageLoansOptions
  Scenario: LOANS OPTIONS
    Then select LOANS options
    Then go to STATEMENTS
    #Statments general error
    Then go BACK
    Then select LOANS options
    Then select OWN TRANSFER
    Then go BACK
    Then click DISCARD payment
    Then select LOANS options
    Then go to DETAILS page
    Then go BACK
    Then select LOANS options
    Then go to OVERVIEW
    Then go BACK
    Then click LOANS visiblity

  @HomePageLoans
  Scenario: LOANS LANDING PAGE
    Then select expand LOANS
    Then go to MORE page
    Then go to STATEMENTS
    Then go BACK
    Then go to MORE page
    Then go to REPAYMENT PLAN
    #Internal service error
    Then go BACK
    Then select OWN TRANSFER
    Then verify OWN TRANSFERS page
    Then click DISCARD payment
    Then go BACK
    Then go to DETAILS page
    Then go BACK
#    Then generate PDF file

  @LoansTransfer
  Scenario: LOANS TRANSFER
    Then select expand LOANS
    Then select OWN TRANSFER
    Then verify OWN TRANSFERS page
    Then click select PAYER account
    Then select RSDaccount as Pay From account
    Then click select BENEFICIARY account
    Then select EUR_ACCOUNT as Pay to account
    Then enter AMOUNT in OWN transfer
    Then click close Keyboard button
    Then enter Description
    Then click close Keyboard button
    Then click Continue
    #Then verify Internal Payment review
    Then verify Payment review
    Then click PAY
    Then enter PIN
    Then click Done
    Then go BACK
    #Then sign the transfer and confirm it successful

  @PaymentsMenu
  Scenario: PAYMENTS MENU
    Then go to PAYMENTS page
    Then go to DOMESTIC PAYMENT
    Then go BACK
    Then click DISCARD payment
    Then go to P2P PAYMENT
    Then go BACK
    Then go to SCAN TO PAY
    Then go BACK
    Then go to FOREIGN PAYMENT
    Then go BACK
    Then click DISCARD payment
    Then go to OWN TRANSFERS & EXCHANGE
    Then go BACK
    Then click DISCARD payment
#    Then go to CURRENCY EXCHANGE
#    Then go BACK
#    Then click DISCARD payment
    Then go to RECHARGE PHONE
    Then go BACK
    Then go to BUY A VOUCHER
    Then go BACK
    Then go to REQUEST MONEY & SPLIT BILLS
    Then go BACK
    Then go to BILLS & RECURRING PAYMENTS
    Then go BACK
    Then go to MY ORDERS
    Then go BACK
    Then go to Templates and Beneficiaries
    Then go BACK


  @ProductsMenu
  Scenario: PRODUCTS MENU
    Then go to PRODUCTS page
    Then go to Accounts
    Then go BACK
    Then go to Cards
    Then go BACK
    Then go to Savings
    Then go BACK
    Then go to Loans
    Then go BACK
    Then go to Bank services
    Then go BACK


  @MoreMenu
  Scenario: MORE MENU
    Then click More
    Then go to MTOKEN
    Then go BACK
    Then go to LOCATIONS
    Then go BACK
    Then go to CONTACTS
    Then go BACK
    Then go to DOCUMENTS
    Then go BACK
    Then go to SETTINGS
    Then go BACK
    Then go to Select user or company
    Then go to Select DEFAULT user or company
    Then close Select DEFAULT user or company modal
    Then go BACK












