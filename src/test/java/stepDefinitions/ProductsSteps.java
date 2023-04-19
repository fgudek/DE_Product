package stepDefinitions;

import appObjects.NavigationBar;
import appObjects.accountsPage.AccountDetailsPage;
import appObjects.accountsPage.AccountsLandingPage;
import appObjects.accountsPage.transactions.FilterObjects;
import appObjects.accountsPage.transactions.SearchObjects;
import appObjects.accountsPage.transactions.TransactionsObjects;
import appObjects.cardsPage.LimitsPage;
import appObjects.morePage.OurProducts;
import appObjects.paymentPage.PaymentsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class ProductsSteps extends Base {

    private Base base;

    public ProductsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        products = new OurProducts(d);
        accounts = new AccountsLandingPage(d);
        accountDetails = new AccountDetailsPage(d);
        search = new SearchObjects(d);
        navigate = new NavigationBar(d);
        filter = new FilterObjects(d);
        transactions = new TransactionsObjects(d);
        payment = new PaymentsPage(d);
        limits = new LimitsPage(d);

    }

    @Then("^go to Accounts$")
    public void AccountsProducts(){
        products
                .AccountsProducts();
    }

    @Then("^click on 1st product$")
    public void clickProductAccounts1(){
        products
                .clickProductAccounts1();
    }

    @Then("^click See how to apply$")
    public void clickSeeHowApplyBtn(){
        products
                .clickSeeHowApplyBtn();
    }

    @Then("^click Ask us a question$")
    public void clickAskUsQuestionsBtn(){
        products
                .clickAskUsQuestionsBtn();
    }

    @Then("^click Message type$")
    public void clickMessageType(){
        products
                .clickMessageType();
    }

    @Then("^select card payments$")
    public void selectMessageType(){
        products
                .selectMessageType("card_payments");
    }

    @Then("^verify Message type selected$")
    public void verifyMessageType(){
        products
                .verifyMessageType("card_payments");
    }

    @Then("^enter (.*?) as message title$")
    public void enterMessageTitle(String title){
        products
                .enterMessageTitle(title);
    }

    @Then("^enter (.*?) as message content$")
    public void enterMessageContent(String content){
        products
                .enterMessageContent(content);
    }

    @Then("^click ADD ATTACHMENT$")
    public void clickAddAttachment(){
        products
                .clickAddAttachment();
    }

    @Then("^select one screenshot$")
    public void selectScreenshot(){
        products
//                .selectScreenshot("SS");
                .clickSS1();
    }

    @Then("^verify screenshot selected$")
    public void verifyScreenshot(){
        products
                .verifyScreenshot("SS");
    }


    @Then("^delete screenshot")
    public void clickDeleteScreenshot(){
        products
                .clickDeleteScreenshot();
    }

    @Then("^click SEND$")
    public void clickSend(){
        products
                .clickSend();
    }

    @Then("^verify success message$")
    public void verifyProductSuccessMsg(){
        products
                .verifyProductSuccessMsg();
    }

    @Then("^click Check out FAQ$")
    public void clickFAQ(){
        products
                .clickFAQ();
    }

    @Then("^open QA-1$")
    public void OpenQA1(){
        products
                .openCloseQA1();
    }

    @Then("^open QA-5$")
    public void OpenQA5(){
        products
                .openCloseQA5();
    }

    @Then("^open QA-7$")
    public void OpenQA7(){
        products
                .openCloseQA7();
    }

    @Then("^close QA-1$")
    public void CloseQA1(){
        products
                .openCloseQA1();
    }

    @Then("^close QA-5$")
    public void CloseQA5(){
        products
                .openCloseQA5();
    }

    @Then("^close QA-7$")
    public void CloseQA7(){
        products
                .openCloseQA7();
    }

    @Then("^click I'M INTERESTED IN THIS PRODUCT$")
    public void clickInterestedInProduct(){
        products
                .clickInterestedInProduct();
    }

    @Then("^verify interested in product message$")
    public void verifyInterestedInProductMsg(){
        products
                .verifyInterestedInProductMsg();
        limits
                .clickOKLimits();
    }

    @Then("^go to Cards$")
    public void CardsProducts(){
        products
                .CardsProducts();
    }

    @Then("^click on product$")
    public void clickVisaCardProduct(){
        products
                .clickProduct();
    }

    @Then("^go to Savings$")
    public void SavingsProducts(){
        products
                .SavingsProducts();
    }

    @Then("^go to Loans$")
    public void LoansProducts(){
        products
                .LoansProducts();
    }

    @Then("^go to Bank services$")
    public void BankServicesProducts(){
        products
                .BankServicesProducts();
    }

}