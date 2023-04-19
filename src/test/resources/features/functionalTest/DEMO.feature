@RegressionTest
@DemoTest

Feature: DEMO TEST


  @DemoWorkflow
  Scenario: DEMO FLOW
    Then user is logged in
    Then go to PAYMENTS page
    Then go to DOMESTIC PAYMENT
    Then select DEMO_ACCOUNT as Account
    * enter ACCOUNT as beneficiary account
    * enter BENEFICIARY_NAME as beneficiary name
    * enter BENEFICIARY_ADDRESS as address
    * enter BENEFICIARY_CITY as city
    * enter amount as amount
    #* click close Keyboard button
    * enter PAYMENT_DETAILS as payment details
    * turn on Urgent payment
    * turn off Urgent payment
    * select Purpose code
    * proceed to review screen
    And verify REVIEW page
    And review currentRSDaccount as PAYER
    And review ACCOUNT as BENEFICIARY
    And review AMOUNT as AMOUNT
    Then click PAY
    Then enter PIN
    Then click Done
    Then go to HOME page
    Then swipe CARD left



    Then go to Accounts
    Then click on 1st product
    Then click See how to apply
    Then scroll DOWN
    Then click close
    Then click Ask us a question
    Then click CANCEL
    Then click Ask us a question
    Then click Message type
    Then select card payments
    Then verify Message type selected
    Then enter MSG_TITLE as message title
    Then enter MSG as message content
    Then click close Keyboard button
    Then click ADD ATTACHMENT
    Then select one screenshot
    Then verify screenshot selected
    Then delete screenshot
    Then click ADD ATTACHMENT
    Then select one screenshot
    Then click SEND
    Then verify success message
    Then click Check out FAQ
    Then open QA-1
    Then open QA-5
    Then open QA-7
    Then close QA-1
    Then close QA-5
    Then close QA-7
    Then go BACK
    Then click I'M INTERESTED IN THIS PRODUCT
    Then enter PIN
    Then verify interested in product message
    Then go BACK
    Then go BACK






