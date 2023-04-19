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

public class ScanAndPaySteps extends Base {

    private Base base;

    public ScanAndPaySteps(Base base) {
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

    @Then("go to Scan to pay")
    public void goToScantopayDash() {
        payment
                .goToScanToPayDash();
    }

    @Then("go to SCAN TO PAY")
    public void goToScantopay() {
        payment
                .goToScanToPay();
    }

    @Then("turn on flashlight")
    public void turnFlashlight() {
        payment
                .turnFlashlight();
    }

}