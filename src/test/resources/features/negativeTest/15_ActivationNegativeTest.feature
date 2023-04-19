#@RegressionTest
#@NegativeTest
  Feature: Activation Negative Test

    @NonActivated
    @NegativeMobileBankingActivation
    Scenario: NEGATIVE MOBILE BANKING ACTIVATION
      Then click Allow
      Then preActivated App is open
      Then click on language select
      Then change language back to EN
      Then verify EN language
      Then click REGISTER
      * click Existing User and verify screen
      * go BACK
      Then click REGISTER
      * click NEW USER
      Then enter WRONG_USERID as USERID
      Then click NEXT
        And verify mandatory field error message
      Then clear USERID field
      Then enter SHORT_USERID as USERID
      And verify button NEXT is disabled
      Then click close Keyboard button
      Then help pop up and verify screen
      Then click close
      Then clear USERID field
      Then enter 8 digit code
      Then proceed to ACTIVATION CODE screen
        And wait for timeout and click resend link
      Then enter short ACTIVATION CODE
      Then verify button NEXT is disabled
      Then clear ACTIVATION CODE
      And verify mandatory field error message
      Then enter INVALID_ACTIVATION_CODE as ACTIVATION CODE
      Then click NEXT
      Then verify Set your PIN screen
      Then create short PIN
      Then verify button NEXT is disabled
      Then verify PIN rules
      Then create invalid PIN
      Then confirm invalid PIN
      And verify not matching PIN error message
      Then create consecutive digit PIN
        And verify consecutive digits PIN error message
      Then create identical digits PIN
      And verify identical digits PIN error message
      Then enter PIN
      Then repeat PIN
      Then click NEXT
        And verify ACTIVATION CODE is invalid


      Then proceed to next screen
      And verify ACTIVATION CODE is invalid
      And click RESTART ACTIVATION


    @NegativeMobileTokenActivation
    Scenario: Mobile Token activation
