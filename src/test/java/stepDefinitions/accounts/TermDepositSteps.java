package stepDefinitions.accounts;

import appObjects.accountsPage.TermDepositPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class TermDepositSteps extends Base {

    private Base base;

    public TermDepositSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        deposit = new TermDepositPage(d);
    }
}