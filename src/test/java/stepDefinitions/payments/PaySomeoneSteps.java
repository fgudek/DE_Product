package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.paymentPage.TemplatesPage;
import appObjects.preLoginObjects.PreLoginPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
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
        preLogin = new PreLoginPage(d);
        templates = new TemplatesPage(d);

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
    public void selectPaymentTypeEmail() {
        payment
                .selectPaymentTypeEmail();
    }

    @Then("select payment type: phone number")
    public void selectPaymentTypePhoneNumber() {
        payment
                .selectPaymentPhoneNumber();
    }


    @Then("enter (.*) as beneficiary account$")
    public void enterBeneficiaryAccount(String paymentaccount) {
        payment
                .enterBeneficiaryAccount(paymentaccount);

    }

    @Then("click close Keyboard button$")
    public void CloseKeyBtn() {
        payment
                .CloseKeyBtn();

    }

   /* @Then("^enter AMOUNT as amount$")
    public void enterAmountPay() {
        payment
                .enterAmountPay("AMOUNT");
    } */


    @Then("verify Domestic payment screen")
    public void verifyDomesticPaymentScreen() {
        review
                .verifyDomesticPaymentScreen();

    }

    @Then("click Pay From")
    public void PayFrom() {
        payment
                .PayFrom();
    }

    @Then("switch to new PAYMENTS page")
    public void switchtoPayment() {
        payment
                .switchtoPayment();
    }

    @Then("click PAY")
    public void Pay() {
        payment
                .Pay();
    }

    @Then("enter (.*) as payer name$")
    public void enterPayerName(String payerName) {
        payment
                .enterPayerName(payerName);
    }

    @Then("enter (.*) as payer address$")
    public void enterPayerAddress(String payeraddress) {
        payment
                .enterPayerAddress(payeraddress);
    }

    @Then("enter (.*) as payer city$")
    public void enterPayerCity(String payercity) {
        payment
                .enterPayerCity(payercity);
    }

    @Then("select model$")
    public void openSelectModel() {
        payment
                .openSelectModel();
    }

    @Then("enter (.*) as reference number$")
    public void enterReferenceNumber(String rnumber) {
        payment
                .enterReferenceNumber(rnumber);
    }

    @Then("enter (.*) as beneficiary name$")
    public void enterBeneficiaryName(String beneficiaryName) {
        payment
                .enterBeneficiaryName(beneficiaryName);
    }

    @Then("enter (.*) as address$")
    public void enterAddress(String address) {
        payment
                .enterAddress(address);
    }

    @Then("enter (.*) as city$")
    public void enterCity(String city) {
        payment
                .enterCity(city);
    }

    @Then("select Payee country$")
    public void selectPayeeCountry() {
        payment
                .selectPayeeCountry();
    }

    @Then("select Payee bank country$")
    public void selectPayeeBankCountry() {
        payment
                .selectPayeeBankCountry();
    }

    @Then("enter (.*) as payment details$")
    public void enterPaymentDescription(String paymentdetails) {
        payment
                .enterPaymentDescription(paymentdetails);
    }

    @Then("enter (.*) as standing order details$")
    public void enterSODescription(String paymentdetails) {
        payment
                .enterSODetails(paymentdetails);
    }

    @Then("turn on Urgent payment$")
    public void selectUrgentPayment() {
        payment
                .selectUrgentPayment();
    }

    @Then("turn off Urgent payment$")
    public void deselectUrgentPayment() {
        payment
                .selectUrgentPayment();
    }

    @Then("select Date")
    public void selectDate() {
        payment
                .selectDate();
    }

    @Then("click close Date")
    public void CloseDate() {
        preLogin
                .CloseKeyBtn();
    }

    @Then("select Template and Beneficiary")
    public void selectSaveTemp() {
        payment
                .selectSaveTemp("on")
                .selectSaveBen("on");

    }

    @Then("^save (.*?) as template$")
    public void SaveTemp(String template){
        payment
                .saveTemplate(template);
    }

    @Then("^save (.*?) as beneficiary$")
    public void SaveBeneficiary(String beneficiary){
        payment
                .saveBeneficiary(beneficiary);
    }


    @Then("^save (.*?) as Internal template$")
    public void enterTemplateName(String template){
        payment
                .enterSaveTemplateName(template);
    }

    @Then("click Save")
    public void clickSave() {
        payment
                .clickSave();
    }

    @Then("enter (.*?) as swift code$")
    public void enterSwiftcode(String swift) {
        payment
                .enterSWIFT(swift);
    }

    @Then("click to choose currency$")
    public void clickCurrencySelect() {
        payment
                .clickCurrencySelect();

    }

    @Then("select RSD as currency$")
    public void selectCurrency() {
        payment
                .selectCurrencyRSD()
                .verifyCurrency("RSD");

    }

    @Then("select EUR as currency$")
    public void selectCurrencyHRK() {
        payment
                .selectCurrencyEUR()
                .verifyCurrency("EUR");

    }

    @Then("verify International Payment screen")
    public void verifyInternationalPaymentScreen() {
        review
                .verifyInternationalPaymentScreen();
    }

    @Then("select Fee type")
    public void selectFeeType() {
        payment
                .selectFeetype();
    }

    @Then("enter (.*?) as country$")
    public void enterCountryForeign(String country) {
        payment
                .enterCountry(country);
    }

    @Then("enter (.*?) as Payee Bank name$")
    public void enterPayeeBankName(String Bname) {
        payment
                .enterPayeeBankName(Bname);
    }

    @Then("enter (.*?) Payee name$")
    public void enterPayeeName(String Pname) {
        payment
                .enterPayeeName(Pname);
    }

    @Then("enter (.*?) as Payee Bank address$")
    public void enterPayeeBankAddress(String Baddress) {
        payment
                .enterPayeeBankAddress(Baddress);
    }

    @Then("enter (.*?) as Payee Bank city$")
    public void enterPayeeBankCity(String Bcity) {
        payment
                .enterPayeeBankCity(Bcity);
    }

    @Then("enter (.*?) as Payee Bank country$")
    public void enterPayeeBankCountry(String Bcountry) {
        payment
                .enterPayeeBankCountry(Bcountry);
    }

    @Then("click save Template and Beneficiary")
    public void saveTempAndBen() {
        payment
                .saveTempAndBen();
    }


    @Then("select Purpose code$")
    public void selectPurposeCode() {
        payment
                .openSelectPurposeCode();
    }

    @Then("select Purpose code Foreign$")
    public void selectPurposeCodeForeign() {
        payment
                .openSelectPurposeCodeForeign();
    }

    @Then("click SHOW MORE")
    public void ShowMore() {
        payment
                .ShowMore();
    }

    @Then("click SHOW LESS")
    public void ShowLess() {
        payment
                .ShowLess();
    }

    @Then("verify Domestic Payment review")
    public void verifyDomesticPaymentReview() {
        review
                .verifyReview()
                .verifyFROMAccount("currentRSDaccount")
                .verifyTOAccount("ACCOUNT");
    }

    @Then("verify Foreign Payment review")
    public void verifyForeignPaymentReview() {
        review
                .verifyReview()
                .verifyFROMAccount("EUR_ACCOUNT")
                .verifyTOAccount("ACCOUNT");
    }

    @Then("verify SAVINGS internal transfer review")
    public void verifySavingsPayReview() {
        review
                .verifyReview()
                .verifyFROMAccountSavings("currentRSDaccount")
                .verifyTOAccountSavings("EUR_ACCOUNT");
    }

    @Then("go Back arrow")
    public void clickBackArw() {
        payment
                .clickBackArw();
    }

    @Then("go back to PAYMENTS page")
    public void goBackToPayemnts() {
        payment
                .clickBackArw();
    }

    @Then("click DISCARD payment")
    public void clickDiscard() {
        payment
                .clickDiscard();
    }

    @Then("confirm exiting payment")
    public void confirmExitingPayment() {
        payment
                .clickDiscard();
    }

    @Then("cancel exiting payment$")
    public void cancelExitingPayment(){
        templates
                .CancelDelTB();
    }

    @Then("close MORE page in SAVINGS")
    public void closeSavingsMoreMenu() {
        payment
                .closeSavingsMoreMenu();
    }

    @Then("click select PAYER account")
    public void selectPayerOwnTransfer() {
        payment
                .selectPayerOwnTransfer();
    }

    @Then("click select BENEFICIARY account")
    public void selectBenefOwnTransfer() {
        payment
                .selectBenefOwnTransfer();
    }
}