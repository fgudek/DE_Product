@RegressionTest
@MorePageTest
Feature: More test

#  Background:
#    Given user is logged in
#    Then click More

  @ContactsAndFAQ
  Scenario: CONTACTS AND FAQ
    Then go to CONTACTS
    Then verify CONTACTS screen
    Then click Call us
    Then exit Call us modal
    Then click Find us
    Then go BACK
    Then click E-mail
    Then click CANCEL E-mail
    Then click DELETE DRAFT and close modal
    Then click FAQ
    Then open question about OTP
    Then close OTP question
    Then open question about payment confirmation
    Then close question about payment confirmation
    Then go BACK
    Then click Tell a friend about us
    Then close Tell a friend about us
    #Verify platform or version

  @Documents
  Scenario: DOCUMENTS
    Then go to DOCUMENTS
    Then go to Contracts tab
    Then go BACK

  @SelectUserOrCompany
  Scenario: SELECT USER OR COMPANY
    Then go to Select user or company
    Then click search bar and type in Fran INC.
    Then erase search
    Then click close Keyboard button
    Then go to Select DEFAULT user or company
    Then verify modal for default user
    Then close Select DEFAULT user or company modal
    Then go BACK


  @OpenCloseOptions
  Scenario: REST OF THE OPTIONS
    Then go to MTOKEN
    Then verify mToken screen
    Then go BACK
    Then go to LOCATIONS
    Then click on List tab
    Then go BACK
    Then go to INBOX
    Then click NEW MESSAGE
    Then go BACK
    Then go BACK
    Then go to SETTINGS
    Then search for Notifications
    Then erase search
    Then click close Keyboard button
    Then go BACK
    Then LOG OUT
    Then verify PRELOGIN screen





