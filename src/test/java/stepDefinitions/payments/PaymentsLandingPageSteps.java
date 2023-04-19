package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.cardsPage.CardsPage;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.preLoginObjects.PreLoginPage;
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
        preLogin = new PreLoginPage(d);
    }

    @Then("^go to PAYMENTS page$")
    public void go_to_PAYMENTS_PAGE(){
        navigate
                .gotoPayments();
    }

    @Then("^go to HOME page$")
    public void go_to_HOME_PAGE(){
        navigate
                .gotoHome();
    }

    @Then("^go to PRODUCTS page$")
    public void go_to_PRODUCTS_PAGE(){
        navigate
                .gotoProducts();
    }

    @Then("go to OWN TRANSFERS & EXCHANGE")
    public void goToInternalTransfer() {
        payment
                .goToInternalTransfer();
    }

    @Then("go to CURRENCY EXCHANGE")
    public void goToCurrencyExchange() {
        payment
                .goToCurrencyExchange();
    }

    @Then("go to P2P PAYMENT")
    public void goToP2PPayment() {
        payment
                .goToP2PPayment();
    }

    @Then("open Address book")
    public void openAddressbook() {
        payment
                .openAddressbook();
    }

    @Then("select (.*?) from Address book$")
    public void selectContact(String contact) {
        payment
                .selectContact(contact);

    }

    @Then("choose (.*?) as phone number$")
    public void selectContactPhoneNumber(String pn) {
        payment
                .selectContactPhoneNumber(pn);

    }

    @Then("select (.*?) as standing order$")
    public void selectStandingOrder(String pn) {
        payment
                .selectStandingOrder(pn);

    }

    @Then("verify (.*?) as CONTACT name$")
    public void verifyContactName(String contactname) {
        payment
                .verifyContactName(contactname);
    }

    @Then("enter (.*) for a friend$")
    public void enterMessageFF(String message) {
        payment
                .enterMessageFF(message);
    }

    @Then("click SEE OUR EXCHANGE RATE AND FEE")
    public void openExchangeRateAndFee() {
        payment
                .openExchangeRateAndFee();
    }

    @Then("close EXCHANGE RATE AND FEE")
    public void closeExchangeRateAndFee() {
        payment
                .closeExchangeRateAndFee();
    }

    @Then("go to Pay Someone")
    public void goToPaySomeone() {
        payment
                .goToPaySomeone();
    }

    @Then("go to DOMESTIC PAYMENT")
    public void goToDomesticPayment() {
        payment
                .goToDomesticPayment();
    }

    @Then("go to FOREIGN PAYMENT")
    public void goToForeignPayment() {
        payment
                .goToForeignPayment();
    }

    @Then("go to MY ORDERS")
    public void goToMyOrders() {
        payment
                .goToMyOrders();
    }

    @Then("go to RECHARGE PHONE")
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
                .clickDone();
    }

    @Then("swipe left")
    public void swipeLeft() {
        cards
                .swipeCardLeft();
    }

    @Then("swipe to (.*?) card$")
    public void swipeTo(String svajp) {
        cards
                .swipeTo(svajp);
    }

    @Then("verify (.*?) as PAYER ACCOUNT$")
    public void verifyPayerAccunt(String payeraccount) {
        payment
                .verifyPayerAccount(payeraccount);
    }

    @Then("go to REQUEST MONEY & SPLIT BILLS")
    public void goToRequestMoney() {
        payment
                .gotoRequestMoney();
    }

    @Then("open options for 1st request")
    public void openOptionsRequest() {
        payment
                .openOptionsRequest();
    }

    @Then("click request DETAILS")
    public void openRequestDetails() {
        payment
                .openRequestDetails();
    }

    @Then("open options for creditor")
    public void openCreditorDetails() {
        payment
                .openCreditorDetails();
    }

    @Then("click SEND REMINDER")
    public void clickSendReminderBtn() {
        payment
                .clickSendReminderBtn();
    }

    @Then("click MARK AS PAID")
    public void clickMarkAsPaidBtn() {
        payment
                .clickMarkAsPaidBtn();
    }

    @Then("click NEW REQUEST")
    public void clickNewRequestBtn() {
        payment
                .clickNewRequestBtn();
    }

    @Then("enter (.*?) as requested Amount$")
    public void enterRequestedAmount(String requested) {
        payment
                .enterRequestedAmount(requested);
    }

    @Then("click SHOW QR CODE")
    public void clickShowQRCodeBtn() {
        payment
                .clickShowQRCodeBtn();
    }

    @Then("close SHOW QR CODE modal")
    public void closeShowQRCode() {
        payment
                .closeShowQRCode();
    }

    @Then("click on Select Transaction icon")
    public void SelectTransactionRequest() {
        payment
                .SelectTransactionRequest();
    }

    @Then("click SPLIT WITH FRIENDS")
    public void clickSplitWithFriendsBtn() {
        payment
                .clickSplitWithFriendsBtn();
    }

    @Then("click add payment details")
    public void clickAddPaymentDetails() {
        payment
                .paymentDetailsSwitch("on");
    }

    @Then("click Show Code")
    public void clickShowCode() {
        payment
                .showCode();
    }

    @And("verify payment details")
    public void verifyPaymentDetails() {
        review
                .verifyAmount("amount")
                .verifyDescription("description");

    }

    @Then("select SAVINGS options")
    public void clickSavingsOptionAndVerify() {
        payment
                .clickSavingsOption();
    }

    @Then("close SAVINGS options")
    public void closeSAVINGoptions() {
        payment
                .closeSavingOptions();
    }

    @Then("close SELECT SAVING")
    public void closeSelectSaving() {
        payment
                .closeSelectSaving();
    }

    @Then("go to SELECT SAVING")
    public void selectSaving() {
        payment
                .selectSaving();
    }

    @Then("select expand SAVINGS ACCOUNTS")
    public void selectExpandSaving() {
        payment
                .selectExpandSaving();
    }

    @Then("select OWN TRANSFER")
    public void selectOTSavings() {
        payment
                .selectOTSavings();
    }

    @Then("go to STATEMENTS")
    public void clickStatements() {
        payment
                .clickStatements();
    }

    @Then("go to REPAYMENT PLAN")
    public void clickRepaymentPlan() {
        payment
                .clickRepaymentPlan();
    }

    @Then("verify OWN TRANSFERS page")
    public void verifyOwnTransfer() {
        payment
                .verifyOwnTransfer();
    }

    @Then("enter AMOUNT in OWN transfer")
    public void enterAmountInSavings() {
        payment
                .enterAmountInSavings();
    }

    @Then("enter (.*?) as AMOUNT in OWN transfer$")
    public void enterAmountInInternalTransfer(String amount) {
        payment
                .enterAmountInInternalTransfer(amount);
    }

    @Then("enter SAVINGS transfer DESCRIPTION")
    public void enterSavingDescription() {
        payment
                .enterPaymentDescription("description");
    }

    @Then("enter payment description")
    public void enterPaymentDescription() {
        payment
                .enterPaymentDescription("description");
    }

    @Then("select (.*?) as Pay From account$")
    public void selectAccountFrom(String account) {
        payment
                .selectAccount(account);
    }

    @Then("select (.*?) as Pay to account$")
    public void selectAccountTo(String account) {
        payment
                .selectAccount(account);
    }

    @Then("generate PDF file$")
    public void generatePDF() {
        payment
                .generatePDF();
    }

    @Then("swipe account left$")
    public void swipeACCleft() {
        payment
                .swipeACCleft();
    }

    @Then("swipe account right$")
    public void swipeACCright() {
        payment
                .swipeACCright();
    }

    @Then("go to ADD MONEY$")
    public void addMoney() {
        payment
                .addMoney();
    }

    @Then("select LOANS options$")
    public void clickLoansOption() {
        payment
                .clickLoansOption();
    }

    @Then("click LOANS visiblity$")
    public void clickVisiblityLoans() {
        payment
                .clickVisiblityLoans();
    }

    @Then("select expand LOANS")
    public void selectExpandLoans() {
        payment
                .selectExpandLoans();
    }

    //Bills and recurring payments

    @Then("go to BILLS & RECURRING PAYMENTS")
    public void goToBillsAndRecurringPayments() {
        payment
                .goToBillsAndRecurringPayments();
    }

    @Then("switch to OBLIGATIONS")
    public void switchToObligations() {
        payment
                .switchToObligations();
    }

    @Then("switch to SUBSCRIPTIONS")
    public void switchToSubscriptions() {
        payment
                .switchToSubscriptions();
    }

    @Then("click NEW SUBSCRIPTION")
    public void clickNewSubscription() {
        payment
                .clickNewSubscription();
    }

    @Then("click UTILITY BILLS as NEW SUBSCRIPTION")
    public void selectUtitlityBillsSub() {
        payment
                .selectUtitlityBillsSub();
    }

    @Then("click NEW BILL PRESENTMENT")
    public void selectNewBillPresentment() {
        payment
                .selectNewBillPresentment();
    }

    @Then("verify Bill issuer details screen")
    public void verifyEPS() {
        payment
                .verifyEPS();
    }

    @Then("click Bill identifier info")
    public void clickBillIdentifierInfo() {
        payment
                .clickBillIdentifierInfo();
    }

    @Then("enter (.*?) as BILL IDENTIFIER$")
    public void enterBillIdentifier(String bill_identifier) {
        payment
                .enterBillIdentifier(bill_identifier);
    }

    @Then("close Terms and conditions")
    public void clickcloseTC() {
        payment
                .clickcloseTC();
    }

    @Then("proceed to Bill presentment review")
    public void proceedtoBillPresentmentReview() {
        payment
                .clickContinue();
    }

    @Then("review (.*?) as BILL ISSUER$")
    public void verifyBillIssuerName(String bi_name) {
        review
                .verifyBillIssuerName(bi_name);
    }

    @Then("review (.*?) as BILL IDENTIFIER$")
    public void verifyBillIdentifier(String bill_identifier) {
        review
                .verifyBillIdentifier(bill_identifier);
    }

    @Then("click SUBSCRIBE$")
    public void clickSubscribe() {
        payment
                .clickSubscribe();
    }

    @Then("turn on I Agree with Terms and Conditions")
    public void turnIAgreeTC() {
        payment
                .turnIAgreeTC();
    }

    @Then("turn on I Agree with Terms and Conditions in SO")
    public void turnIAgreeTCSO() {
        payment
                .turnIAgreeTCSO();
    }

    @Then("click OWN TRANSFERS & EXCHANGE as NEW SUBSCRIPTION")
    public void selectOwnTransfersAndExchangeSub() {
        payment
                .selectOwnTransfersAndExchangeSub();
    }

    @Then("enter (.*?) as nickname for standing order$")
    public void enterNicknameStandingOrder(String so_nickname) {
        payment
                .enterNicknameStandingOrder(so_nickname);
    }

    @Then("enter (.*?) as description for standing order$")
    public void enterSODetails(String dets) {
        payment
                .enterSODetails(dets);
    }

    @Then("select START date")
    public void openStartDate() {
        payment
                .openStartDate();
        preLogin
                .CloseKeyBtn();
    }

    @Then("select REVOCATION date")
    public void openRevocationDate() {
        payment
                .openRevocationDate();
        preLogin
                .CloseKeyBtn();
    }

    @Then("open FREQUENCY page")
    public void openFrequencyModal() {
        payment
                .openFrequencyModal();
    }

    @Then("select weekly as FREQUENCY")
    public void WeeklyFrequency() {
        payment
                .WeeklyFrequency();
    }

    @Then("select yearly as FREQUENCY")
    public void YearlyFrequency() {
        payment
                .YearlyFrequency();
    }

    @Then("verify WEEKLY as selected FREQUENCY")
    public void verifyWeeklyFrequency() {
                // napisati kad se rjesi blocker
    }

    @Then("click PAY SOMEONE as NEW SUBSCRIPTION")
    public void selectPaySomeoneSub() {
        payment
                .selectPaySomeoneSub();
    }

    @Then("proceed to STANDING ORDER page")
    public void proceedtoStandingOrderPage() {
        payment
                .clickContinue();
    }

    @Then("enter (.*?) as model number$")
    public void enterModelNumber(String model) {
        payment
                .enterModelNumber(model);
    }

    @Then("select (.*?) as FREQUENCY$")
    public void selectFrequency(String freq) {
        payment

                .selectFrequency(freq);
    }

    @Then("select (.*?) as FREQUENCY international SO$")
    public void selectFrequencyInternational(String frequency) {
        payment

                .selectFrequencyInternational(frequency);
    }

    @Then("^verify (.*?) as FREQUENCY$")
    public void verify_FREQUENCY(String frequency){
        payment
                .verifyFrequency(frequency);
    }

    @Then("proceed to Standing order review")
    public void proceedtoStandingOrderReview() {
        payment
                .clickContinue();
    }

    @Then("verify data on Standing order review")
    public void verifyStandingOrderData() {
        review
                .verifyTOAccount("ACCOUNT")
                .verifyTOAccount("BENEFICIARY_NAME")
                .verifyAmount("AMOUNT")
                .verifyNicknameSO("SO_NICKNAME");
    }

    @Then("click CREATE$")
    public void clickCreate() {
        payment
                .clickCreate();
    }

    //MYORDERS

    @Then("go to DRAFT orders$")
    public void clickDraftOrders() {
        payment
                .clickDraftOrders();
    }

    @Then("click options for 1st order$")
    public void clickOptionsBtnFirstOrder() {
        payment
                .clickOptionsBtnFirstOrder();
    }

    @Then("click COPY in options$")
    public void clickOptionsCopyBtn() {
        payment
                .clickOptionsCopyBtn();
    }

    @Then("click PAY in options$")
    public void clickOptionsPayBtn() {
        payment
                .clickOptionsPayBtn();
    }

    @Then("click SHARE in options$")
    public void clickShareInOptions() {
        payment
                .clickShareInOptions();
    }

    @Then("close SHARE in options$")
    public void closeShareInOptions() {
        payment
                .closeShareInOptions();
    }

    @Then("click SAVE AS TEMPLATE OR BENEFICIARY in options$")
    public void clickSaveTBInOptions() {
        payment
                .clickSaveTBInOptions();
    }

    @Then("click VIEW RECEIPT in options$")
    public void clickViewReceiptInOptions() {
        payment
                .clickViewReceiptInOptions();
    }

    @Then("click DETAILS in options$")
    public void clickDetailsInOptions() {
        payment
                .clickDetailsInOptions();
    }

    @Then("click Copy to clipboard$")
    public void CopyClipboardBtn() {
        payment
                .CopyClipboardBtn();
    }

    @Then("verify empty state$")
    public void verifyEmptyState() {
        payment
                .verifyEmptyState();
    }

    @Then("go to Request money")
    public void goToRequestDashobard() {
        payment
                .goToRequestDashobard();
    }

    @Then("go to BUY A VOUCHER")
    public void gotoBuyAVoucher() {
        payment
                .gotoBuyAVoucher();
    }

    @Then("click OPTIONS for 1st voucher")
    public void clickOptionsBtnFirstVoucher() {
        payment
                .clickOptionsBtnFirstVoucher();
    }

    @Then("click SHARE VOUCHER in options")
    public void clickShareVoucher() {
        payment
                .clickShareVoucher();
    }

    @Then("close SHARE VOUCHER$")
    public void closeShareVoucher() {
        payment
                .closeShareInOptions();
    }

    @Then("click REPEAT PAYMENT in options$")
    public void clickRepeatPayment() {
        payment
                .clickRepeatPayment();
    }

    @Then("click BUY A NEW VOUCHER$")
    public void clickBuyNewVoucher() {
        payment
                .clickBuyNewVoucher();
    }

    @Then("verify Select provider modal$")
    public void verifyProviderTitle() {
        payment
                .verifyProviderTitle();
    }

    @Then("select provider VOUCHER")
    public void selectProviderVoucher() {
        payment
                .selectProviderVoucher();
    }

    @Then("select Voucher amount")
    public void selectVoucherAmount() {
        payment
                .selectVoucherAmount();
    }

}