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

public class PaySomeoneSteps extends Base {

    private Base base;

    public PaySomeoneSteps(Base base) {
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

    @Then("click Select payment type")
    public void click_Select_payment_type() {
        payment
                .clickSelectPaymentType();
    }


    @Then("select payment type: bank account")
    public void selectPaymentTypeBankAccount() {
        payment
                .selectPaymentTypeBankAccount();
    }

    @Then("select payment type: email")
    public void selectPaymentTypeemail() {
        payment
                .selectPaymentTypeEmail();
    }


    @Then("enter (.*?) number$")
    public void enterAccountNumber(String account) {
        payment
                .enterAcountNumber(account);
    }

    @Then("verify Domestic payment screen")
    public void verifyDomesticPaymentScreen() {
        review
                .verifyDomesticPaymentScreen();

    }

    @Then("enter Payee name")
    public void enterPayeeName() {
        payment
                .enterPayeeName("PayeeName");
    }

    @Then("enter address")
    public void enterAddress() {
        payment
                .enterAddress("PayeeAddress");
    }

    @Then("enter city")
    public void enterCity() {
        payment
                .enterCity("PayeeCity");
    }

    @Then("enter Payment Description")
    public void enterPaymentDescription() {
        payment
                .enterPaymentDescription("description");
    }

    @Then("select Urgent payment")
    public void selectUrgentPayment() {
        payment
                .selectUrgentPayment("on");
    }

    @Then("enter swift code")
    public void enterSwiftcode() {
        payment
                .enterSWIFT("swift/bic");
    }

    @Then("verify International Payment screen")
    public void verifyInternationalPaymentScreen() {
        review
                .verifyInternationalPaymentScreen();
    }

    @Then("enter country")
    public void enterCountry() {
        payment
                .enterCountry("PayeeCountry");
    }

    @Then("select Fee type")
    public void selectFeeType() {
        payment
                .selectFeetype();
    }

    @Then("select Purpose code")
    public void selectPurposeCode() {
        payment
                .selectPurposeCode();
    }

    @Then("verify Domestic Payment review")
    public void verifyDomesticPaymentReview() {
        review
                .verifyReview()
                .verifyFROMAccount("CURRENT_ACCOUNT_REVIEW");
               // .verifyTOAccount("DOMESTIC_ACCOUNT");

    }

    @Then("verify Foreign Payment review")
    public void verifyForeignPaymentReview() {
        review
                .verifyReview()
                .verifyFROMAccount("CURRENT_ACCOUNT_REVIEW")
                .verifyTOAccount("FOREIGN_ACCOUNT");
    }
}