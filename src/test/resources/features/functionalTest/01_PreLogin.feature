#@RegressionTest
#@PreLoginTest

Feature: PRE LOGIN PAGE TEST


  @NonActivated
  @NonActivatedPreLoginElements
  Scenario: NON ACTIVATED PRELOGIN ELEMENTS
    Then click Allow
    Then click on Locations
    Then click AllowWhile
    Then go BACK
    #Then click Demo
      #Then click on INBOX - zamijeni sa DEMO # Then go BACK
    #Then click Understand
    #Then click Exit_demoBtn
    #Then click LogOutDemo
    Then click Products
    Then go BACK
#    Then click Exchange List
#    Then go BACK
    Then click Contacts
    Then find Branches and ATMs
    Then go BACK
    Then go BACK

#Dovršiti kada proradi SMAP aktivacija
  @NonActivated
  @ActivationAndLogin
  Scenario: ACTIVATION WITH USER ID AND CODE AND LOGIN
    Then click Allow
    * click REGISTER
    * click NEW USER
    Then click AllowCameraBtn
    * go BACK
    Then click REGISTER
    Then click NEW USER
    Then enter 8 digit code
    Then click NEXT
    Then enter one-time SMS code
    Then click NEXT
    Then enter PIN
    Then repeat PIN
    Then enable login with biometrics
    Then disable login with biometrics
    Then click START MBANKING
    Then verify log in successful

#cas pop up treba nekako potvrditi
  @Login
  Scenario: LOGIN TESTS
    * click LOG IN
#    * click USE PIN
    * go BACK
    Then click LOG IN
#    Then click USE PIN
    Then enter PIN
    Then verify log in successful
    Then click Decline CAS pop up
    Then click More
    Then go to SETTINGS
    Then go to use Biometrics
    Then enable Biometrics Btn
    Then enter PIN
    Then verify biometrics change notification
    Then go to use Biometrics
    Then disable Biometrics Btn
    Then verify biometrics change notification
   # Then close use Biometrics -- potrebno za iOS provjeri ??
    Then go BACK
    Then LOG OUT


  @ChangeLanguage
  Scenario: CHANGE LANGUAGE
    Given reg user landing page is open
    Then click on language select
    Then change to domestic language
    Then verify language change
    Then change language back to EN


  @mBalance
  Scenario: MBALANCE ON PRELOGIN
    Given reg user landing page is open
    Then click mBalance
    Then enter PIN
    Then select show balance switcher
    #uspio sam prilagoditi metodu da gleda checkable atribut koji se mijenja na  switcherima
    Then display available accounts
    Then select RSDaccount as Account
    Then click Save
    Then enter PIN
    Then verify prelogin mBalance
#     Then click X
    Then click LOG IN
    Then enter PIN
    Then verify log in successful
    Then click More
    Then go to SETTINGS
    Then go to mBalance
    Then select show balance switcher
    Then click Save
    Then enter PIN


  @mCash
  Scenario: MCASH ON PRELOGIN
    Given reg user landing page is open
    Then click mCash
    Then enter PIN
    Then go BACK
    Then click mCash
    Then enter PIN
    Then verify mCash screen
    #Then click visibility of amount
    Then select 20 to withdraw
    # ovaj element treba objediniti viewom koji ih spaja i dati neki unique text ili drugi atribut
    Then select custom to withdrawal
    Then enter 300 amount
    Then click close Keyboard button
    #razlika sa ios - nemogu do tipkovnice
    Then click Generate code
    Then verify mCash code screen
    Then click share code
    Then click close
    #stavio sam click na title za android, pogledaj oce radit
    Then click Invalidate code
    Then click Invalidate


  @ActivatedPreLoginElements
  Scenario: ACTIVATED PRE LOGIN ELEMENTS
    Given reg user landing page is open
    Then click on Locations
    Then click AllowWhile
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
    Then go BACK
    Then go BACK
    Then click on mToken
    Then enter PIN
    Then generate OTP
    Then go BACK
    Then go to MDS and enter data
    #Then go to MDS and Ben. Account
    #Then click close keyboard
    #Then enter MDSAmount
    Then click close
    #vidi sta sa close keyboard kako rjesiti tu razliku izmedu iosa i androida
    Then generate MDS
    Then go BACK
    Then go BACK

  @ActivatedPreLoginElements
  Scenario: MARKETING MESSAGES
    Given reg user landing page is open
    Then swipe and click on Marketing-03
    Then swipe and click on Marketing-01

    #trenutno nema marketing messages na preloginu da se postave android lokatori





# Given when landing page is open
  # Then swipe and click on Marketing







