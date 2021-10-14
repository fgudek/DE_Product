package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.cardsPage.CardsPage;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class PaymentsLandingPageSteps extends Base {

    private Base base;

    public PaymentsLandingPageSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        payment = new PaymentsPage(d);
        review = new ReviewPage(d);
        navigate = new NavigationBar(d);
        cards = new CardsPage(d);
    }

    @Then("^go to PAYMENTS page$")
    public void go_to_PAYMENTS_PAGE(){
        navigate
                .gotoPayments();
    }


    @Then("go to Internal Transfer")
    public void goToInternalTransfer() {
        payment
                .goToInternalTransfer();
    }


    @Then("go to Pay someone")
    public void goToPaySomeone() {
        payment
                .goToPaySomeone();
    }

    @Then("go to My Orders")
    public void goToMyOrders() {
        payment
                .goToMyOrders();
    }

    @Then("go to Recharge Phone")
    public void goToRechargePhone() {
        payment
                .goToRechargePhone();
    }

    @Then("go to RECHARGE NEW PHONE")
    public void goToRECHARGENEWPHONE() {
        navigate
                .clickButton();
    }

    @Then("^swipe to (.*?) account$")
    public void swipeToAccount(String card) {
        payment
                .swipeToCard(card);
    }

    @Then("select provider")
    public void selectProvider() {
        payment
                .selectProvider();
    }

    @Then("enter Phone Number")
    public void enterPhoneNumber() {
        payment
                .enterPhoneNumber("phoneNumber");
    }

    @Then("verify Phone Recharge payment and Pay")
    public void verifyPhoneRechargePaymentAndPay() {
        review
                .verifyReview();
              //  .verifyFROMAccount("currentHRKaccount")
               // .verifyTOAccount("phoneNumber");
               // .verifyPaymentDetails("amount");
        payment
                .clickContinue();
    }

    @Then("click Done")
    public void clickDone() {
        payment
                .clickContinue();
    }

    @Then("swipe left")
    public void swipeLeft() {
        cards
                .swipeCardLeft();
    }

    @Then("swipe to (.*?)$")
    public void swipeTo(String svajp) {
        cards
                .swipeTo(svajp);
    }
}