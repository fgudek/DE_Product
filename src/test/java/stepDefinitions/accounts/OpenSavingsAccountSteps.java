package stepDefinitions.accounts;

import appObjects.accountsPage.SavingsAccountPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class OpenSavingsAccountSteps extends Base {

    private Base base;
    public OpenSavingsAccountSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        savings = new SavingsAccountPage(d);
    }



}
