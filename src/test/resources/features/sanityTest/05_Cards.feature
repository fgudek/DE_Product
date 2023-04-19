@CardsPageTest
Feature: Cards test

  Background:
    Given user is logged in

  @CardDetails
  Scenario: Card Details
    Then swipe CARD left
    Then select expand CARDS
    Then go to DETAILS page
    Then verify card DETAILS screen
    Then click change CARD NAME
    Then change CARD NAME into CARD_NEW as CARD NAME
    Then click Save
    Then click change CARD NAME
    Then change CARD NAME into CARD_OLD as CARD NAME
    Then click Save
    Then go BACK

      #Security settings ne postoje ni na jednoj kartici
  @CardCardPOSLimits
  Scenario: Card Card POS Limits
    Then swipe CARD left
    Then swipe CARD left
    Then select CARD3 options
    Then select SECURITY SETTINGS
    Then select POS PAYMENTS
    Then turn off POS PAYMENTS
    Then verify INFO message - POS
    Then turn on POS PAYMENTS
    Then set DAILY_AMOUNT for max POS DAILY LIMIT
    Then set DAILY_TRANSACTIONS for max POS DAILY number of transactions
    Then set MONTHLY_AMOUNT for max POS MONTHLY LIMIT
    Then set MONTHLY_TRANSACTIONS for max POS MONTHLY number of transactions
    Then click close Keyboard button
    Then click OK
    Then go BACK

  @CardCardONLINELimits
  Scenario: ONLINE LIMITS
    Then swipe CARD left
    Then swipe CARD left
    Then select CARD3 options
    Then select SECURITY SETTINGS
    Then select INTERNET PAYMENTS
    Then turn off INTERNET PAYMENTS
    Then verify INFO message - ONLINE
    Then turn on INTERNET PAYMENTS
    Then set DAILY_AMOUNT for max ONLINE DAILY LIMIT
    Then set DAILY_TRANSACTIONS for max ONLINE DAILY number of transactions
    Then set MONTHLY_AMOUNT for max ONLINE MONTHLY LIMIT
    Then set MONTHLY_TRANSACTIONS for max ONLINE MONTHLY number of transactions
    Then click close Keyboard button
    Then click OK
    Then go BACK

  @BlockDebitCard
  Scenario: Block Debit Card
    Then select CARD options
    Then select REPORT LOST & STOLEN
    Then click TEMPORARILY FREEZE CARD
    Then click close
    Then click TEMPORARILY FREEZE CARD
    Then click FREEZE
    Then enter PIN
    Then go BACK
    Then verify card is frozen
    Then swipe CARD left
    Then select expand CARDS 1
    Then swipe CARD right
    Then go to MORE page
    Then select UNFREEZE
    Then click UNFREEZE card
    Then enter PIN
    Then go BACK
    Then verify card is unfrozen
    Then select CARD options
    Then select REPORT LOST & STOLEN
    Then click BLOCK & REPLACE CARD
    Then open SELECT BLOCKAGE REASON list
    Then select CARD_STOLEN reason
    Then enter Street number
    Then click Continue
    Then click CANCEL
    Then click Continue
    Then click CANCEL
    Then go BACK
    Then go BACK
    Then verify HOMEPAGE
      #Then enter street number
#      Then click BLOCK CARD
      #Then verify card is BLOCKED

  @CardsmCashPage
  Scenario: MCASH CARDS PAGE
    Then select CARD options
    Then select MCASH
    Then verify mCash screen
    Then select 20 to withdraw
    Then click Generate code
    Then verify mCash code screen
    Then click share code
    Then click close
    Then click Invalidate code
    Then click CANCEL
    Then click Invalidate code
    Then click Invalidate
    Then verify HOMEPAGE

  @CardsmCash
  Scenario: MCASH CARDS PAGE - SPECIFIC AMOUNT
    Then select CARD options
    Then select MCASH
    Then verify mCash screen
    Then select custom to withdrawal
    Then enter 400 amount
    Then click close Keyboard button
    Then click Generate code
    Then verify mCash code screen
    Then click share code
    Then click close
    Then click Invalidate code
    Then click CANCEL
    Then click Invalidate code
    Then click Invalidate
    Then verify HOMEPAGE

  @ChangeCardPIN
  Scenario: ChangeCardPIN
    Then select CARD options
    Then select CHANGE PIN
    Then verify Change card PIN screen
    Then turn on Terms and Conditions
    Then click Continue
    Then enter NEW_CARD_PIN as NEW PIN
    Then repeat NEW_CARD_PIN as NEW PIN
    Then click close Keyboard button
    Then click CHANGE CARD PIN
    Then enter PIN
    Then verify PIN change initiated screen
    Then click Done


