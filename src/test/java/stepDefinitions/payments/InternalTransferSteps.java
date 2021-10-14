package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.preLoginObjects.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class InternalTransferSteps extends Base {

    private Base base;

    public InternalTransferSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        payment = new PaymentsPage(d);
        review = new ReviewPage(d);
        navigate = new NavigationBar(d);
        login = new LoginPage(d);
    }


    @Then("go to Pay From")
    public void goToPayFrom() {
        payment
                .payFrom();
    }

    @Then("go to Pay To")
    public void goToPayTo() {
        payment
                .payTo();
    }

    @Then("enter Amount")
    public void enterAmount() {
        payment
                .enterAmount("amount");
    }

    @Then("enter Description")
    public void enterDescription() {
        payment
                .enterDescription("description");
    }

    @Then("click Continue")
    public void clickContinue() {
        payment
                .clickContinue();
    }

    @Then("select Internal Transfer FROM account")
    public void selectInternalTransferFROMAccount() {
        payment
                .selectFROMaccount("currentRSDaccount");
    }

    @Then("select Internal Transfer TO account")
    public void selectInternalTransferTOAccount() {
        payment
                .selectToAccount("currentHRKaccount");
    }

    @Then("proceed to review screen")
    public void proceedToReviewScreen() {
        payment
                .clickContinue();
    }

    @Then("verify Internal Payment review")
    public void verifyInternalPaymentReview() {
        review
                .verifyReview()
     //           .verifyAmount("amount")
                .verifyFROMAccount("currentRSDaccount")
                .verifyTOAccount("currentHRKaccount");
    }

    @Then("sign the transfer and confirm it successful")
    public void signtheTransferAndConfirmItSuccessful() {
        review
                .clickPay();
        login
                .enterPIN();
        review
                .verifySuccessfulInternalTransfer();
    }
}