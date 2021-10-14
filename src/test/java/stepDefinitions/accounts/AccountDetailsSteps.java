package stepDefinitions.accounts;

import appObjects.accountsPage.AccountDetailsPage;
import appObjects.accountsPage.AccountsLandingPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class AccountDetailsSteps extends Base {

    private Base base;

    public AccountDetailsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        accounts = new AccountsLandingPage(d);
        accountDetails = new AccountDetailsPage(d);
    }
}