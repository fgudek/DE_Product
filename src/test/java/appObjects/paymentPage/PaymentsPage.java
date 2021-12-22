package appObjects.paymentPage;

import appObjects.Translations;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static org.testng.Assert.assertTrue;

public class PaymentsPage extends Base {

    public PaymentsPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_internal_transfer+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_internal_transfer+"']")
    public WebElement transferMoneyBetweenAccountsTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_internal_transfer+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement internalTransferBtn;
    public PaymentsPage goToInternalTransfer(){
        wait(internalTransferBtn);
        internalTransferBtn.click();
        sleep();
        verifyPage(transferMoneyBetweenAccountsTitle,"Internal Transfer");
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Current Account in RSD' ")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Current Account in RSD')]")
    public WebElement payFromField;
    public PaymentsPage payFrom() {
        payFromField.click();
        sleep();

        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Current account'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Demand deposit')]")
    public WebElement payToField;
    public PaymentsPage payTo() {
        payToField.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/inputAmount")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de.core:id/inputAmount']")
    public WebElement amountField;
    public PaymentsPage enterAmount(String amount)  {
        scrollElementIntoView(amountField);
        wait(amountField);
        typeInProperty(amountField, amount);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/input")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de.core:id/input']")
    public WebElement descriptionField;
    public PaymentsPage enterDescription(String desc)  {
        scrollElementIntoView(descriptionField);
        wait(descriptionField);
        typeInProperty(descriptionField, desc);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/button")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement continueBtn;
    public PaymentsPage clickContinue() {
        continueBtn.click();
        sleep();
        return this;
    }



    public PaymentsPage selectFROMaccount(String account) {
        String acc = prop.getProperty(account);
        selector(acc);
        return this;
        }

    public PaymentsPage selectToAccount(String account) {
        String acc = prop.getProperty(account);
        selector(acc);
        return this;
    }

    public PaymentsPage selectAccount(String account) {
        String acc = prop.getProperty(account);
        selector(acc);
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_someone+"']")
    public WebElement paySomeoneTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_pay_someone+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_pay_someone+"')]")
    public WebElement paySomeoneBtn;
    public PaymentsPage goToPaySomeone() {
        wait(paySomeoneBtn);
        paySomeoneBtn.click();
        sleep();
        verifyPage(paySomeoneTitle,s_payments__title_pay_someone);
        return this;
    }


    @iOSXCUITFindBy(accessibility = "Select payment type")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Select payment type')]")
    public WebElement paymentTypeBtn;
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone_select_payment_type+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_payments__title_pay_someone_select_payment_type+"']")
    public WebElement paymentTypeTitle;
    public PaymentsPage clickSelectPaymentType() {
        wait(paymentTypeBtn);
        paymentTypeBtn.click();
        sleep();
        verifyElementText(paymentTypeTitle, s_payments__title_pay_someone_select_payment_type );
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__btn_pay_someone_identifier_IBAN+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_payments__btn_pay_someone_identifier_IBAN+"']")
    public WebElement paymentTypeBankAccount;
    public PaymentsPage selectPaymentTypeBankAccount() {
        wait(paymentTypeBankAccount);
        paymentTypeBankAccount.click();

        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__btn_pay_someone_identifier_EMAIL+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_payments__btn_pay_someone_identifier_EMAIL+"']")
    public WebElement paymentTypeEmail;
    public PaymentsPage selectPaymentTypeEmail() {
        wait(paymentTypeEmail);
        paymentTypeEmail.click();

        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__btn_pay_someone_identifier_PHONE+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_payments__btn_pay_someone_identifier_PHONE+"']")
    public WebElement paymentTypePhoneNumber;
    public PaymentsPage selectPaymentPhoneNumber() {
        wait(paymentTypePhoneNumber);
        paymentTypePhoneNumber.click();

        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__lbl_pay_someone_new_IBAN+"")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text= '"+s_payments__lbl_pay_someone_new_IBAN+"']")
    public WebElement bankAccNumber;
    public PaymentsPage enterAcountNumber(String account) {
        typeInProperty(bankAccNumber,account);


        return this;
    }
    @iOSXCUITFindBy(accessibility = "Payee name*")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee name*']")
    public WebElement payeeName;
    public PaymentsPage enterPayeeName(String name) {
        wait(payeeName);
        typeInProperty(payeeName, name);
        return this;
    }
    @iOSXCUITFindBy(accessibility = "Payee address*")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee address*']")
    public WebElement payeeAddress;
    public PaymentsPage enterAddress(String adresa) {
        wait(payeeAddress);
        typeInProperty(payeeAddress, adresa);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Payee city*")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee city*']")
    public WebElement payeeCity;
    public PaymentsPage enterCity(String city) {
       // wait(payeeCity);
        scrollElementIntoView(payeeCity);
        typeInProperty(payeeCity, city);
        return this;
    }
    @iOSXCUITFindBy(accessibility = "Description*")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Description*']")
    public WebElement descriptionn;
    public PaymentsPage enterPaymentDescription(String desc) {
        scrollElementIntoView(descriptionn);
        typeInProperty(descriptionn, desc);
        return this;
    }
    @iOSXCUITFindBy(accessibility = "Description*")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement urgentPaymentSwitch;
    public PaymentsPage selectUrgentPayment(String turn) {
        scrollElementIntoView(urgentPaymentSwitch);
        agreementSwitcher(urgentPaymentSwitch, turn);
        return this;
    }
    @iOSXCUITFindBy(accessibility = "SWIFT/BIC")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement swiftCode;
    public PaymentsPage enterSWIFT(String s) {
        wait(swiftCode);
        typeInProperty(swiftCode, s);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Payee's country*")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee's country*']")
    public WebElement Payeecountry;
    public PaymentsPage enterCountry(String country) {
        scrollElementIntoView(Payeecountry);
        typeInProperty(Payeecountry, country);
        return this;
    }
    @iOSXCUITFindBy(accessibility = "Fee type")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Fee type']")
    public WebElement feeTypeDropdown;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'SHA'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'SHA')]")
    public WebElement feeType;
    public PaymentsPage selectFeetype() {
        scrollElementIntoView(feeTypeDropdown);
        feeTypeDropdown.click();
        sleep();
        feeType.click();
        return this;
    }
    @iOSXCUITFindBy(accessibility = "Purpose code")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Purpose code']")
    public WebElement purposeCodeDropdown;
    @iOSXCUITFindBy(accessibility = "100 Dummy")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement purposeCodeType;
    public PaymentsPage selectPurposeCode() {
        scrollElementIntoView(purposeCodeDropdown);
        purposeCodeDropdown.click();
        sleep();
        purposeCodeType.click();
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_payments__title_my_orders+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_my_orders+"']")
    public WebElement myOrdersTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_my_orders+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_my_orders+"')]")
    public WebElement myOrdersBtn;
    public PaymentsPage goToMyOrders() {
        wait(myOrdersBtn);
        myOrdersBtn.click();
        sleep();
        verifyPage(myOrdersTitle,s_payments__title_pay_someone);
        return this;
    }


    @iOSXCUITFindBy(accessibility = "Cancelled Orders")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Canceled Orders']")
    public WebElement canceledOrdersTitle;
    @iOSXCUITFindBy(accessibility = "CANCELED")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CANCELED']")
    public WebElement canceledOrdersBtn;
    public PaymentsPage goToCanceledOrders() {
        wait(canceledOrdersBtn);
        canceledOrdersBtn.click();
        sleep();
        verifyElementText(canceledOrdersTitle, "Canceled Orders");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Executed Orders")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Executed Orders']")
    public WebElement executedOrdersTitle;
    @iOSXCUITFindBy(accessibility = "CANCELLED")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='EXECUTED']")
    public WebElement executedOrdersBtn;
    public PaymentsPage goToExecutedOrders() {
        wait(executedOrdersBtn);
        executedOrdersBtn.click();
        sleep();
        verifyElementText(executedOrdersTitle, "Executed Orders");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Pending Orders")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pending Orders']")
    public WebElement pendingOrdersTitle;
    @iOSXCUITFindBy(accessibility = "PENDING")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='PENDING']")
    public WebElement pendingOrdersBtn;
    public PaymentsPage goToPendingOrders() {
        wait(pendingOrdersBtn);
        pendingOrdersBtn.click();
        sleep();
        verifyPage(pendingOrdersTitle, "Pending Orders");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Rejected Orders")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rejected Orders']")
    public WebElement rejectedOrdersTitle;
    @iOSXCUITFindBy(accessibility = "REJECTED")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='REJECTED']")
    public WebElement rejectedOrdersBtn;
    public PaymentsPage goToRejectedOrders() {
        wait(rejectedOrdersBtn);
        rejectedOrdersBtn.click();
        sleep();
        verifyPage(rejectedOrdersTitle, "Rejected Orders");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Scheduled Orders")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Scheduled Orders']")
    public WebElement scheduledOrdersTitle;
    @iOSXCUITFindBy(accessibility = "SCHEDULED")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SCHEDULED']")
    public WebElement scheduledOrdersBtn;
    public PaymentsPage goToScheduledOrders() {
        wait(scheduledOrdersBtn);
        scheduledOrdersBtn.click();
        sleep();
        verifyPage(scheduledOrdersTitle, "Scheduled Orders");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_accounts__picker_dialog_title_BANK_ACCOUNT+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_accounts__picker_dialog_title_BANK_ACCOUNT+"']")
    public WebElement selectBankAccTitle;
    @iOSXCUITFindBy(accessibility = "Select Bank Account")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Bank Account']")
    public WebElement selectBankAccBtn;
    public PaymentsPage selectBankAccount() {
        wait(selectBankAccBtn);
        selectBankAccBtn.click();
        sleep();
        verifyPage(selectBankAccTitle, s_accounts__picker_dialog_title_BANK_ACCOUNT);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__title_scan_to_pay+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_scan_to_pay+"']")
    public WebElement scanToPayTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_scan_to_pay+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_scan_to_pay+"')]")
    public WebElement scanToPayBtn;
    public PaymentsPage goToScanToPay() {
        wait(scanToPayBtn);
        scanToPayBtn.click();
        sleep();
        verifyPage(scanToPayTitle, s_payments__title_scan_to_pay);
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_recharge_recent__title+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_recharge_recent__title+"']")
    public WebElement rechargePhoneTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_recharge_phone+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_recharge_phone+"')]")
    public WebElement rechargePhoneBtn;
    public PaymentsPage goToRechargePhone() {
        wait(rechargePhoneBtn);
        rechargePhoneBtn.click();
        sleep();
        verifyPage(rechargePhoneTitle,s_recharge_recent__title);
        return this;
    }

    public PaymentsPage swipeToCard(String card) {
        String crd = prop.getProperty(card);
        swipeToElementByText("left",crd,3);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/arrow")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/arrow']")
    public WebElement providerBtn;
    @iOSXCUITFindBy(accessibility = ""+s_recharge__provider_dialog_title+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_recharge__provider_dialog_title+"']")
    public WebElement providerTitle;
    @iOSXCUITFindBy(accessibility = "Tomato")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tomato']")
    public WebElement provider;
    public PaymentsPage selectProvider() {
        providerBtn.click();
        wait(providerTitle);
        verifyPage(providerTitle, s_recharge__provider_dialog_title );
        provider.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Mobile phone number")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Mobile phone number']")
    public WebElement phoneNumberBtn;
    public PaymentsPage enterPhoneNumber(String phoneNum) {
        typeInProperty(phoneNumberBtn, phoneNum);
        return this;

    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/search_src_text")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/search_src_text']")
    public WebElement searchBar;
    public PaymentsPage searchOrder(String order) {
       sleep();
       sleep();
        wait(searchBar);
        typeInProperty(searchBar, order);

        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__title_request_or_share_request_money+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement requestMoneyTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_request_money+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement requestMoneyBtn;
    public PaymentsPage gotoRequestMoney() {
        wait(requestMoneyBtn);
        requestMoneyBtn.click();
        sleep();
        verifyPage(requestMoneyTitle, s_payments__title_request_or_share_request_money);
        return this;
    }


    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/switchView")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement paymentDetailsSwitch;
    public PaymentsPage paymentDetailsSwitch(String turn) {
        agreementSwitcher(paymentDetailsSwitch, turn);
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_payments__title_request_or_share_money_share_code+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_payments__title_request_or_share_money_share_code+"']")
    public WebElement showCodeTitle;
    @iOSXCUITFindBy(accessibility = "SHOW CODE")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= 'SHOW CODE']")
    public WebElement showCodeBtn;
    public PaymentsPage showCode() {

        showCodeBtn.click();
        sleep();
        verifyPage(showCodeTitle, s_payments__title_request_or_share_money_share_code);
        return this;
    }
}