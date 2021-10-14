package stepDefinitions.accounts;

import appObjects.accountsPage.AccountsLandingPage;
import appObjects.NavigationBar;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class AccountsSteps extends Base {

    private Base base;

    public AccountsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        accounts = new AccountsLandingPage(d);
        navigate = new NavigationBar(d);
    }

}