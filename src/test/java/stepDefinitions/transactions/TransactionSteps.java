package stepDefinitions.transactions;

import appObjects.accountsPage.AccountDetailsPage;
import appObjects.accountsPage.AccountsLandingPage;
import appObjects.NavigationBar;
import appObjects.accountsPage.transactions.TransactionsObjects;
import appObjects.accountsPage.transactions.FilterObjects;
import appObjects.accountsPage.transactions.SearchObjects;
import appObjects.paymentPage.PaymentsPage;
import appObjects.preLoginObjects.PreLoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class TransactionSteps extends Base {

    private Base base;

    public TransactionSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        accounts = new AccountsLandingPage(d);
        accountDetails = new AccountDetailsPage(d);
        search = new SearchObjects(d);
        navigate = new NavigationBar(d);
        filter = new FilterObjects(d);
        transactions = new TransactionsObjects(d);
        payment = new PaymentsPage(d);

    }

    @Then("select (.*?) as Account to view transactions$")
    public void selectAccount(String acc) {
        payment
                .selectAccount(acc);
    }

    @Then("scroll DOWN")
    public void scroll_down(){
        scroller("down", 300);
    }

    @Then("scroll UP")
    public void scroll_up(){
        scroller("up", 300);
    }

    @Then("search for (.*?) as transaction$")
    public void searchProperty(String transaction) {
        search
                .searchProperty(transaction);
    }

    @Then("open (.*?) as TRANSACTION$")
    public void gotoTransaction(String transaction) {
        transactions
                .gotoTransaction(transaction);
    }

    @Then("wait for TRANSACTIONS to load$")
    public void wait_for_TRANSACTIONS_load(){
        transactions
                .waitTransactionLoad();
    }

    @Then("go to VIEW RECEIPT$")
    public void clickViewReceipt(){
        transactions
                .clickViewReceipt();
    }

    @Then("go to COPY PAYMENT$")
    public void clickCopyPayment(){
        transactions
                .clickCopyPayment();
    }

    @Then("go to SPLIT WITH FRIENDS$")
    public void clickSplitWithFriends(){
        transactions
                .clickSplitWithFriends();
    }

    @Then("click on Filter icon$")
    public void clickFilterIcon(){
        filter
                .clickFilterIcon();
    }

    @Then("verify Select filter screen$")
    public void verifySelectFilter(){
        filter
                .verifySelectFilter();
    }

    @Then("select LAST 30 DAYS and FILTER$")
    public void select_last30days_and_filter(){
        filter
                .selectTimePeriod("LAST 30 DAYS")
                .clickFilter();
    }

    @Then("select LAST 3 MONTHS and FILTER$")
    public void select_last3months_and_filter(){
        filter
                .selectTimePeriod("LAST 3 MONTHS")
                .clickFilter();
    }

    @Then("select LAST 6 MONTHS and FILTER$")
    public void select_last6months_and_filter(){
        filter
                .selectTimePeriod("LAST 6 MONTHS")
                .clickFilter();
    }

    @Then("click RESET FILTER$")
    public void clickResetFilter(){
        filter
                .clickResetFilter();
    }

    @Then("^select FROM date$")
    public void select_from_date(){
        filter
                .enterFromDate();
    }

    @Then("^select TO date$")
    public void select_to_date(){
        filter
                .enterToDate();
    }

    @Then("^click FILTER$")
    public void clickFilter(){
        filter
                .clickFilter();
    }

    @Then("^enter amount for FROM value$")
    public void enter_amount_for_from_value(){
        filter
                .enterFromAmount();
    }

    @Then("^enter amount for TO value$")
    public void enter_amount_for_TO_value(){
        filter
                .enterToAmount();
    }
}