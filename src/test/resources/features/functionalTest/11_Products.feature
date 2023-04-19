@RegressionTest
@ProductsTest

Feature: Products Page Test

  Background:
    Given user is logged in
    Then go to PRODUCTS page

  @ProductsAccounts
  Scenario: PRODUCTS ACCOUNT
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

  @ProductsCards
  Scenario: PRODUCTS CARDS
    Then go to Cards
    Then click on product
    Then click See how to apply
    Then scroll DOWN
    Then click close
    Then click Ask us a question
    Then click CANCEL
    Then click Ask us a question
    Then click Message type
    Then select card payments
    Then enter MSG_TITLE as message title
    Then enter MSG as message content
    Then click ADD ATTACHMENT
    Then select one screenshot
    Then delete screenshot
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
    Then click OK
    Then go BACK
    Then go BACK

  @ProductsSavings
  Scenario: PRODUCTS SAVINGS
    Then go to Savings
    Then click on product
    Then click See how to apply
    Then scroll DOWN
    Then click close
    Then click Ask us a question
    Then click CANCEL
    Then click Ask us a question
    Then click Message type
    Then select card payments
    Then enter MSG_TITLE as message title
    Then enter MSG as message content
    Then click ADD ATTACHMENT
    Then select one screenshot
    Then delete screenshot
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
    Then click OK
    Then go BACK
    Then go BACK


#LOANS & BANK SERVICES doslovno isti testovi, mogu se napraviti kraći testovi




