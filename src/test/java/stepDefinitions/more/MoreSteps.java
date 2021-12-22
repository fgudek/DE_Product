package stepDefinitions.more;

import appObjects.NavigationBar;
import appObjects.accountsPage.AccountDetailsPage;
import appObjects.accountsPage.transactions.TransactionsObjects;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.Security;
import appObjects.morePage.settingsPage.Services;
import appObjects.preLoginObjects.LoginPage;
import appObjects.preLoginObjects.PreLoginPage;
import appObjects.accountsPage.transactions.SearchObjects;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class MoreSteps extends Base {

    private Base base;

    public MoreSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        more = new MorePage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        search = new SearchObjects(d);
        preLogin = new PreLoginPage(d);
        login = new LoginPage(d);
        accountDetails = new AccountDetailsPage(d);
        transactions = new TransactionsObjects(d);
        services = new Services(d);
    }

    @Then("click Show balance on prelogin")
    public void clickShowBalanceOnPrelogin() {
        more
                .showBalanceOnPrelogin("on");
    }


    @Then("display available accounts")
    public void displayAvailableAccounts() {
        more
                .displayMBalanceAccounts();

    }


    @Then("click Save")
    public void clickSave() {
        navigate
                .clickButton();
    }

    @Then("go to Settings")
    public void goToSettings() {
        more
                .settings();
    }

    @Then("go to mBalance")
    public void goToMBalance() {
        services
                .mBalance();

    }

    @Then("disable Balance on Prelogin")
    public void disableBalanceOnPrelogin() {
        more
                .showBalanceOnPrelogin("off");
    }

    @Then("click Documents")
    public void clickDocuments() {
        more
                .documents();
    }

    @Then("go to documents settings")
    public void goToDocumentsSettings() {
        more
                .documentSettings();
    }

    @Then("click on account selection")
    public void clickOnAccountSelection() {
        more
                .accountSelection();
    }

    @Then("click on delivery method")
    public void clickOnDeliveryMethod() {
        more
                .deliveryMethod();
    }

    @Then("select (.*?) for delivery method$")
    public void selectForDeliveryMethod(String delivery) {
        more
                .selectDeliveryMethod(delivery);
    }

    @Then("change delivery frequency and return it to default")
    public void changeDeliveryFrequencyAndReturnItToDefault() {
        more
                .changeDeliveryFrequency();
    }

    @And("verify success message and click OK")
    public void verifySuccessMessageAndClickOK() {
        more
                .verifySuccessDocChange();
    }
}