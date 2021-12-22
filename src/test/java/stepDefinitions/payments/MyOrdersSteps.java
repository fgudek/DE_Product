package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class MyOrdersSteps extends Base {

    private Base base;

    public MyOrdersSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        payment = new PaymentsPage(d);
        review = new ReviewPage(d);
        navigate = new NavigationBar(d);
    }

    @Then("go to CANCELED orders")
    public void goToCANCELEDorders() {
        payment
                .goToCanceledOrders();
    }


    @Then("go to EXECUTED orders")
    public void goToEXECUTEDOrders() {
        payment
                .goToExecutedOrders();
    }

    @Then("go to PENDING orders")
    public void goToPENDINGOrders() {
        payment
                .goToPendingOrders();
    }

    @Then("go to REJECTED orders")
    public void goToREJECTEDOrders() {
        payment
                .goToRejectedOrders();
    }

    @Then("go to SCHEDULED orders")
    public void goToSCHEDULEDOrders() {
        payment
                .goToScheduledOrders();
    }

    @Then("go to Select bank account")
    public void goToSelectBankAccount() {
        payment
                .selectBankAccount();
    }

    @Then("^select (.*?) Account$")
    public void selectAccount(String acc) {
        payment
                .selectAccount(acc);
    }


    @Then("verify order")
    public void verifyOrder() {
        review
                .verifyCanceledOrder();
    }

    @Then("search for order")
    public void searchForOrder() {
        payment
                .searchOrder("executedOrder");
    }

    @Then("verify executed order")
    public void verifyExecutedOrder() {
        review
                .verifyExecutedOrder();
    }
}