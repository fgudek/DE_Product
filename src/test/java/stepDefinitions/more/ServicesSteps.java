package stepDefinitions.more;

import appObjects.NavigationBar;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.Security;
import appObjects.morePage.settingsPage.Services;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class ServicesSteps extends Base {

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        more = new MorePage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        services = new Services(d);
    }

    @Then("go to Notifications")
    public void goToNotifications() {
        services
                .notifications();

    }


    @Then("turn Incoming Transactions (.*?)$")
    public void disableIncomingTransactions(String turn) {
        services
                .incomingTransactionsSwitch(turn);
    }

    @Then("turn Outgoing Transactions (.*?)$")
    public void turnOutgoingTransactions(String turn) {
        services
                .outgoingTransactionsswitch(turn);
    }

    @Then("turn Payments notifications (.*?)$")
    public void turnPaymentsNotifications(String turn) {
        services
                .paymentsNotifications(turn);
    }

    @Then("turn Credit card bill reminder (.*?)$")
    public void turnCreditCardBillReminder(String turn) {
        services
                .creditCardBillReminder(turn);
    }

    @Then("turn Incoming Interests (.*?)$")
    public void turnIncomingInterests(String turn) {
        services
                .incomingInterests(turn);
    }

    @Then("turn Upcoming maturity date (.*?)$")
    public void turnUpcomingMaturityDate(String turn) {
        services
                .upcomingMaturityDate(turn);
    }

    @Then("turn Upcoming loan installment (.*?)$")
    public void turnUpcomingLoanInstallment(String turn) {
        services
                .upcomingLoanInstallment(turn);
    }

    @Then("go to account select and select account")
    public void goToAccountSelect() {
        services
                .AccSelect();
    }
}