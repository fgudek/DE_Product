
Feature: PRE LOGIN PAGE TEST

  #@NonActivated
  @NonActivatedPreLoginElements
  Scenario: NON ACTIVATED PRELOGIN ELEMENTS
    Then click Allow
    Then click on Locations
    Then click AllowWhile
    Then go BACK
    Then click on INBOX
    Then go BACK
    Then click Products
    Then go BACK
    Then click Exchange List
    Then go BACK
    Then click Contacts
    Then find Branches and ATMs
    Then go BACK
    Then go BACK


  #@NonActivated
  @ActivationAndLogin
  Scenario: ACTIVATION WITH USER ID AND CODE AND LOGIN
    Then click REGISTER
    Then click NEW USER
    Then enter 8 digit code
    Then click NEXT
    Then enter one-time SMS code
    Then click NEXT
    Then enter PIN
    Then repeat PIN
    Then disable login with biometrics
    Then click START MBANKING
    Then verify log in successful


  @ActivatedPreLoginElement
  Scenario: LOGIN TEST
    Then click LOG IN
    Then click USE PIN
    Then enter PIN
    Then verify log in successful
    Then click More
    Then go to SETTINGS
    Then go to use Biometrics
    Then disable login with biometrics
    Then click close



  @ChangeLanguage
  Scenario: CHANGE LANGUAGE
    Given activated app is open
    Then click on language select
    Then change to domestic language
    Then verify language change
    Then change language back to EN


  @ActivatedPreLoginElements
  Scenario: ACTIVATED PRE LOGIN ELEMENTS
    Given activated app is open
    Then click on Locations
    Then go BACK
    Then click More
    Then click Products
    Then go BACK
    Then click More
    Then click Exchange List
    Then edit Exchange List
    Then verify Exchange list change
    Then undo Exchange List change
    Then go BACK
    Then click More
    Then click Contacts
    Then find Branches and ATMs
    Then click on mToken
    Then generate OTP
    Then go BACK
    Then go to MDS and enter data
    Then generate MDS
    Then go BACK

    @SanityTest
    @Inbox
      Scenario: Inbox
      Given reg user landing page is open
      Then click on INBOX
      Then enter PIN
      Then verify Inbox
      #Then go to inbox notifications
      #And click on received notification and verify it
      Then archive message
      Then click menu Inbox
      Then select Archive
      Then go BACK
      Then verify Inbox



