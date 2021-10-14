@RegressionTest
@mTokenPageTest
  Feature: Mobile Token Page Test

    Background:
      Given user is logged in into mToken

   @GenerateToken
      Scenario: Generate Token keys
        Then select ESIGN
        Then verify EISGN subtitle and enter code
        Then click generate
        Then select EBANKIN LOGIN
        Then verify EBANKING subtitle
        Then click generate

   @mTokenLanguageChange
   Scenario: mToken Language Change
     Then go to mToken SETTINGS page
     * go to LANGUAGE page
     * go back
     Then go to LANGUAGE page
     Then select BA
     Then confirm language change
     Then go to LANGUAGE page
     Then select ENGLISH language
     Then set language


  @mTokenPINChange
  Scenario: mToken PIN Change
    * go to mToken SETTINGS page
    * go back
    Then go to mToken SETTINGS page
    * go to CHANGE PIN page
    * go back
    Then go to CHANGE PIN page
    Then enter current PIN
    Then enter new PIN
    Then confirm new PIN
    Then confirm token PIN change
    Then logut of the mToken app
    Then change back to old PIN
