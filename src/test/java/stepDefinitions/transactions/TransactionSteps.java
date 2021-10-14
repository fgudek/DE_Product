package stepDefinitions.transactions;

import appObjects.accountsPage.AccountDetailsPage;
import appObjects.accountsPage.AccountsLandingPage;
import appObjects.NavigationBar;
import appObjects.accountsPage.transactions.TransactionsObjects;
import appObjects.accountsPage.transactions.FilterObjects;
import appObjects.accountsPage.transactions.SearchObjects;
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
    }
}