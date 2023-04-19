@RegressionTest
@SettingsPageTest
  Feature: SETTINGS PAGE TEST

    Background:
      Given user is logged in
      Then click More
      Then go to SETTINGS

    @MyProfilePersonalDetails
    Scenario: PERSONAL DETAILS
      Then go to Personal details
      Then click CHANGE PHONE NUMBER
      Then enter NEW_PHONE number as new mobile phone
      Then click close Keyboard button
      #Then verify Input code from SMS page
      Then click CANCEL
      Then click CHANGE E-MAIL
      Then enter NEW_EMAIL as e-mail
      Then click close Keyboard button
      Then click Save
      Then enter PIN
      Then verify E-MAIL CHANGE CONFIRMATION message
      Then click close
      Then click CHANGE CONTACT ADDRESS
      Then click CLEAR ALL
      Then go BACK
      Then click CHANGE CONTACT ADDRESS
      Then change contact address data and choose NEW_COUNTRY as country
      Then click Save
      Then enter PIN
      Then click close
      #Then verify contact data change

    @MyProfileMyBranch
    Scenario: MY BRANCH OFFICE
      Then go to MY BRANCH OFFICE
      Then click on Branch Location
      Then click on List tab
      Then click on Map tab
      Then go BACK
      Then click Branch phone number
      Then close Branch phone number
      Then click Branch E-mail
      Then click CANCEL E-mail
      Then click DELETE DRAFT and close modal
      Then show Working hours
      Then click CHANGE BRANCH
      Then click on List tab
      Then select BRANCH_DELTA as BRANCH
      Then click SET AS MAIN BRANCH
      Then go to MY BRANCH OFFICE
      Then verify BRANCH_DELTA as selected BRANCH
      Then click CHANGE BRANCH
      Then click on List tab
      Then select BRANCH_AIRPORT as BRANCH
      Then click SET AS MAIN BRANCH
      Then go to MY BRANCH OFFICE
      Then verify BRANCH_AIRPORT as selected default BRANCH
      Then go BACK


    @ChangePIN
    Scenario: CHANGE PIN
      Then go to Change PIN
      Then enter PIN
      Then enter new PIN
      Then go BACK
      Then LOG OUT
      Then LOG IN with new PIN
      Then change PIN back to default
      Then go BACK

    @mBankingRecoveryCode
    Scenario: MBANKING RECOVERY CODE
      Then go to mBanking Recovery code
      Then verify mBanking Recovery code screen
      Then click RESET CODE
      Then enter NEW Recovery code
      Then confirm NEW Recovery code
      Then enter PIN
      Then verify successful RC change
      Then go to mBanking Recovery code
      Then click RESET CODE
      Then enter DEFAULT Recovery code
      Then confirm DEFAULT Recovery code
      Then enter PIN
      Then verify successful RC change

    @UseBiometrics
    Scenario: USE BIOMETRICS
      Then go to use Biometrics
      Then enable Biometrics Btn
      Then enter PIN
      Then verify biometrics change notification
      Then disable Biometrics Btn
      Then enter PIN
      Then verify biometrics change notification
      Then close use Biometrics

    @mBankingLimits
    Scenario: MBANKING LIMITS
      Then go to mBanking limits
      Then click EDIT
      Then change Limits per transaction
      Then change Limits per day
      Then change total number of transactions per DAY
      Then change Limits per month
      Then change total number of transactions per MONTH
      Then click close Keyboard button
      Then click Save
      Then enter PIN
      #Then verify changes
      Then click EDIT
      Then revert to default values
      Then click close Keyboard button
      Then click Save
      Then enter PIN
      #Then verify changes
      Then go BACK

    @FastPayments
    Scenario: FAST PAYMENTS
      Then go to Fast payments
      Then ENABLE FAST PAYMENT
      Then enter PIN
      Then verify FAST PAYMENT settings change
      Then go to Fast payments
      Then DISABLE FAST PAYMENT
      Then enter PIN
      Then verify FAST PAYMENT settings change

    @mBalanceSettings
    Scenario: MBALANCE SETTINGS
      Then go to mBalance
      Then select show balance switcher
      Then display available accounts
      Then select RSDaccount as Account
      Then click Save
      Then enter PIN
      Then go to mBalance
      Then deselect show balance switcher
      Then click Save
      Then enter PIN
      #Then verify Settings page

    @SelectDefaultBalance
    Scenario: SELECT DEFAULT BALANCE
      Then go to Select Default Balance
      Then close Select Default Balance modal
      Then go to Select Default Balance
      Then select ACTUAL BALANCE
      Then go to Select Default Balance
      Then select TOTAL AVAILABLE BALANCE
      Then go to Select Default Balance
      Then select ACTUAL BALANCE

    @ShowHideBalance
    Scenario: SHOW OR HIDE BALANCE
      Then go to Show or hide balance
      Then close Show or hide balance modal
      Then go to Show or hide balance
      Then click SHOW BALANCE
      Then close Show or hide balance modal
      Then go to Show or hide balance
      Then click HIDE BALANCE
      Then close Show or hide balance modal
      Then go to Show or hide balance
      Then click SHOW BALANCE
      Then close Show or hide balance modal

    @FastPayments
    Scenario: FAST PAYMENTS
      Then go to Fast payments
      Then turn off Fast payments
      Then enter PIN
      Then turn on Fast payments
      Then enter PIN
      Then click close
      Then go BACK

    @AppInfoAndMyDevice
    Scenario: APP INFO AND MY DEVICE
      Then go to About app
      Then verify About app screen
      Then go BACK
      Then go to Terms and conditions
      Then verify Terms and conditions screen
      Then go BACK
      Then go to Privacy policy
      Then verify Privacy policy screen
      Then go BACK
      Then go to About device
      Then verify About device screen
      Then click DEACTIVATE APP
      Then click CANCEL
      Then go BACK
      Then go to Deactivate app
      Then verify Deactivation message
      Then click CANCEL


    @Notifications
    Scenario: Notifications
      Then go to Notifications
      Then turn Incoming Transactions off
      Then turn Outgoing Transactions off
      Then turn Payments notifications off
      Then turn Credit card bill reminder off
      Then turn Incoming Interests off
      Then turn Upcoming maturity date off
      Then turn Upcoming loan installment off
      Then click Save
      Then go BACK
      Then go to SETTINGS
      Then go to Notifications
      Then turn Outgoing Transactions on
      Then go to account select and select account
      Then click Done
      Then turn Incoming Transactions on
      Then go to account select and select account
      Then click Done
      Then turn Payments notifications on
      Then turn Credit card bill reminder on
      Then turn Incoming Interests on
      Then turn Upcoming maturity date on
      Then turn Upcoming loan installment on
      Then click Save

