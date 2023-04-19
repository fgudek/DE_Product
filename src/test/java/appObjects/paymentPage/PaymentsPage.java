package appObjects.paymentPage;

import appObjects.cardsPage.CardsPage;
import appObjects.preLoginObjects.PreLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static org.testng.Assert.assertTrue;

public class PaymentsPage extends Base {

    public PaymentsPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSXCUITFindBy(accessibility = "Own transfers & Exchange")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_internal_transfer+"']")
    public WebElement transferMoneyBetweenAccountsTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'OWN TRANSFERS & EXCHANGE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement internalTransferBtn;
    public PaymentsPage goToInternalTransfer(){
        wait(internalTransferBtn);
        internalTransferBtn.click();
        sleep();
        verifyPage(transferMoneyBetweenAccountsTitle,"Own transfers & Exchange");
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'CURRENCY EXCHANGE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement ExchangeBtn;
    public PaymentsPage goToCurrencyExchange(){
        wait(ExchangeBtn);
        ExchangeBtn.click();
        sleep();
        verifyPage(transferMoneyBetweenAccountsTitle,"Own transfers & Exchange");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SEE OUR EXCHANGE RATE AND FEE']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement ExchangeRateAndFeeBtn;
    public PaymentsPage openExchangeRateAndFee() {
        wait(ExchangeRateAndFeeBtn);
        ExchangeRateAndFeeBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_flag_hrk\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement AmountTitleIT;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement pullBarExchangeRate;
    public PaymentsPage closeExchangeRateAndFee() {
        //swipeMethod(171, 358, 0, 667);
        drag(pullBarExchangeRate, 500, "down");
        sleep();
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

//    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Amount and currency\"]/XCUIElementTypeTextField")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='"+s_payments__lbl_payment_amount_and_currency+"']/XCUIElementTypeTextField")
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='"+s_payments__lbl_payment_amount_and_currency+"']")
    public WebElement AmountField;
    public PaymentsPage enterAmount(String amount)  {
//        scrollToElement("down",AmountField);
        wait(AmountField);
        typeInProperty(AmountField, amount);
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[15]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement AmountFieldPayment;
    public PaymentsPage enterPaymentAmount(String amount)  {
        scrollToElement("down",AmountFieldPayment);
        wait(AmountFieldPayment);
        typeInProperty(AmountFieldPayment, amount);
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Description\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de:id/input']")
    public WebElement descriptionField;
    public PaymentsPage enterDescription(String desc)  {
        scrollElementIntoView(descriptionField);
        wait(descriptionField);
        typeInProperty(descriptionField, desc);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CONTINUE']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
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

    /* public PaymentsPage selectAccount(String account) {
        String acc = prop.getProperty(account);
        selector(acc);
        return this;
    } */

    public PaymentsPage selectAccount(String account) {
        String acc = prop.getProperty(account);
        if(DataSource.getPlatform().equals("Android")){
            selector(acc);
        }else{
            stringToElementByText(acc).click();
            //stringToElementByText(acc).click();
        }
        return this;

    }

    public PaymentsPage selectPurposeCode(String code) {
        String purpose = prop.getProperty(code);
        selector(purpose);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic arrow right\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Payee name*']")
    public WebElement openFrequencyPage;
    public PaymentsPage selectFrequency(String frequency) {
        openFrequencyPage.click();
        String freq = prop.getProperty(frequency);
        selector(freq);
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[3]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Payee name*']")
    public WebElement openFrequencyPageInt;
    public PaymentsPage selectFrequencyInternational(String frequencyInt) {
        openFrequencyPageInt.click();
        String freq = prop.getProperty(frequencyInt);
        selector(freq);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '1612805756118'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'1612805756118')]")
    public WebElement EUR_Account;
    public PaymentsPage scrollToEurAccount() {
        scrollElementIntoView(EUR_Account);
        return this;
    }

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_someone+"']")
    public WebElement PaySomeoneTitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+s_dashboard__lbl_shortcuts_pay_someone+"']")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    public WebElement PaySomeoneBtn;
    public PaymentsPage goToPaySomeone() {
        wait(PaySomeoneBtn);
        PaySomeoneBtn.click();
        sleep();
        verifyPage(PaySomeoneTitle,s_payments__title_pay_someone);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone_domestic+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_someone_domestic+"']")
    public WebElement DomesticPaymentTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'DOMESTIC PAYMENT'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_pay_someone+"')]")
    public WebElement DomesticPaymentBtn;
    public PaymentsPage goToDomesticPayment() {
        wait(DomesticPaymentBtn);
        DomesticPaymentBtn.click();
        sleep();
        verifyPage(DomesticPaymentTitle,s_payments__title_pay_someone_domestic);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone_swift+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_transactions__lbl_transaction_type_INTERNATIONAL_PAYMENT+"']")
    public WebElement ForeignPaymentTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'FOREIGN CURRENCY PAYMENT'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_pay_someone+"')]")
    public WebElement ForeignPaymentBtn;
    public PaymentsPage goToForeignPayment() {
        wait(ForeignPaymentBtn);
        ForeignPaymentBtn.click();
        sleep();
        verifyPage(ForeignPaymentTitle, s_payments__title_pay_someone_swift);
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "ic_arrow_right")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Select payment type')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='ic_arrow_right'])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Select payment type')]")
    public WebElement selectTypeBtn;
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone_select_payment_type+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_payments__title_pay_someone_select_payment_type+"']")
    public WebElement paymentTypeTitle;
    public PaymentsPage clickSelectPaymentType() {
        wait(selectTypeBtn);
        selectTypeBtn.click();
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

//    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bank account number (IBAN)\"]/XCUIElementTypeTextField")
//    @AndroidFindBy(xpath = "//android.widget.EditText[@text= '"+s_payments__lbl_pay_someone_new_IBAN+"']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bank account number (IBAN)*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text= '"+s_payments__lbl_pay_someone_new_IBAN+"']")
    public WebElement bankAccNumber;
    public PaymentsPage enterBeneficiaryAccount(String account) {
        typeInProperty(bankAccNumber, account);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "NEW")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text= '"+s_payments__lbl_pay_someone_new_IBAN+"']")
    public WebElement NewPayment;
    public PaymentsPage switchtoPayment() {
        NewPayment.click();

        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='PAY FROM']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement PayFromBtn;
    public PaymentsPage PayFrom() {
        PayFromBtn.click();
        sleep();
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='PAY']")
    @iOSXCUITFindBy(accessibility = "PAY")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='"+s_payments__btn_pay+"']")
    public WebElement PayBtn;
    public PaymentsPage Pay() {
        wait(PayBtn);
        PayBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "SAVE TEMPLATE OR BENEFICIARY")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement SaveTempAndBenBtn;
    public PaymentsPage saveTempAndBen() {
        scrollElementIntoView(SaveTempAndBenBtn);
        wait(SaveTempAndBenBtn);
        SaveTempAndBenBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "SAVE TEMPLATE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement SaveTempBtn;
    public PaymentsPage saveTemp() {
        scrollElementIntoView(SaveTempBtn);
        SaveTempBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Save Template or Beneficiary'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'SHA')]")
    public WebElement SaveTempPayment;
    public PaymentsPage SaveTempPayment() {
        scrollElementIntoView(SaveTempPayment);
        SaveTempPayment.click();

        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Close']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement CloseKeyBtn;
    public PaymentsPage CloseKeyBtn() {
        CloseKeyBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payer name*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payer name*']")
    public WebElement payerName;
    public PaymentsPage enterPayerName(String Payername) {
//        scrollElementIntoView(payerName);
        typeInProperty(payerName, Payername);
        closeIOSKeyboard();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payer address*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payer address*']")
    public WebElement payerAddress;
    public PaymentsPage enterPayerAddress(String adress) {
//        scrollElementIntoView(payerAddress);
        typeInProperty(payerAddress, adress);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payer city*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee city*']")
    public WebElement payerCity;
    public PaymentsPage enterPayerCity(String payercity) {
        // wait(payeeCity);
//        scrollElementIntoView(payerCity);
        typeInProperty(payerCity, payercity);
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Purpose code']")
    public WebElement ModelDropdown;
    @iOSXCUITFindBy(accessibility = "00")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement model00;
    @iOSXCUITFindBy(accessibility = "11")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement model11;
    @iOSXCUITFindBy(accessibility = "97")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement model97;
    public PaymentsPage openSelectModel() {
//        scrollElementIntoView(purposeCodeDropdown);
        ModelDropdown.click();
        wait(model00);
        model00.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Reference number\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Reference number']")
    public WebElement referenceNumber;
    public PaymentsPage enterReferenceNumber(String refnumber) {
        scrollElementIntoView(referenceNumber);
        typeInProperty(referenceNumber, refnumber);
        return this;
    }

//    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Beneficiary name*\"]/XCUIElementTypeTextField")
//    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee name*']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's name*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee name*']")
    public WebElement payeeName;
    public PaymentsPage enterBeneficiaryName(String name) {
//        scrollElementIntoView(payeeName);
        typeInProperty(payeeName, name);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's address*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee address*']")
    public WebElement payeeAddress;
    public PaymentsPage enterAddress(String adresa) {
//        scrollElementIntoView(payeeAddress);
        typeInProperty(payeeAddress, adresa);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's city*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Payee city*']")
    public WebElement payeeCity;
    public PaymentsPage enterCity(String city) {
       // wait(payeeCity);
//        scrollElementIntoView(payeeCity);
        typeInProperty(payeeCity, city);
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Fee type']")
    public WebElement countryDropdown;
    @iOSXCUITFindBy(accessibility = "ALGERIA\nAlgeria")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'SHA')]")
    public WebElement countryAlgeria;
    public PaymentsPage selectPayeeCountry() {
//        scrollElementIntoView(feeTypeDropdown);
        countryDropdown.click();
        wait(countryAlgeria);
        countryAlgeria.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Fee type']")
    public WebElement BankCountryDropdown;
    public PaymentsPage selectPayeeBankCountry() {
//        scrollElementIntoView(feeTypeDropdown);
        BankCountryDropdown.click();
        countryAlgeria.click();
        sleep();
        return this;
    }

//    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payment description\"]/XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Description*\"]/XCUIElementTypeTextField")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Description\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Description']")
    public WebElement descriptionn;
    public PaymentsPage enterPaymentDescription(String desc) {
//        scrollElementIntoView(descriptionn);
        typeInProperty(descriptionn, desc);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "payment/urgency")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement urgentPaymentSwitch;
    public PaymentsPage selectUrgentPayment() {
        scrollElementIntoView(urgentPaymentSwitch);
        wait(urgentPaymentSwitch);
        urgentPaymentSwitch.click();
        sleep();
        return this;

    }

    @iOSXCUITFindBy(accessibility = "ic calendar")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement selectDate;
    public PaymentsPage selectDate() {
        scrollElementIntoView(selectDate);
        selectDate.click();
        sleep();
        return this;

    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSwitch")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement SaveTempSwitch;
    public PaymentsPage selectSaveTemp(String turn) {
        wait(SaveTempSwitch);
        agreementSwitcher(SaveTempSwitch, turn);
        return this;

    }

    @iOSXCUITFindBy(accessibility = "payment/saveTemplate")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement SaveTemp;
    public PaymentsPage clickSaveTemp() {
        wait(SaveTemp);
        SaveTemp.click();
        return this;

    }

    @iOSXCUITFindBy(accessibility = "payment/saveBeneficiary")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement SaveBeneficiary;
    public PaymentsPage clickSaveBeneficiary() {
        wait(SaveBeneficiary);
        SaveBeneficiary.click();
        return this;

    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Template name\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/templateName']")
    public WebElement templateNameField;
    public PaymentsPage enterSaveTemplateName(String templateName){
        //scrollToElement("down",templateNameField);
        wait(templateNameField);
        typeInProperty(templateNameField,templateName);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Beneficiary name\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/templateName']")
    public WebElement beneficiaryNameField;
    public PaymentsPage enterSaveBenefName(String beneficiaryName){
        //scrollToElement("down",templateNameField);
        wait(beneficiaryNameField);
        typeInProperty(beneficiaryNameField,beneficiaryName);
        return this;
    }

    public PaymentsPage saveTemplate(String templateName) {
        //scrollToElement("down",saveTemplateBtn);
        clickSaveTemp();
        enterSaveTemplateName(templateName);
        return this;
    }

    public PaymentsPage saveBeneficiary(String beneficiaryName) {
        //scrollToElement("down",saveTemplateBtn);
        clickSaveBeneficiary();
        enterSaveBenefName(beneficiaryName);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement SaveBenSwitch;
    public PaymentsPage selectSaveBen(String turn) {
        wait(SaveBenSwitch);
        agreementSwitcher(SaveBenSwitch, turn);
        return this;

    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SAVE']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public WebElement SaveBtn;
    public PaymentsPage clickSave() {
        wait(SaveBtn);
        SaveBtn.click();
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's Bank's BIC/SWIFT code*\"]/XCUIElementTypeTextField")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bank's BIC (SWIFT) code\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement swiftCode;
    public PaymentsPage enterSWIFT(String s) {
        scrollElementIntoView(swiftCode);
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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's name\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement PayeeName;
    public PaymentsPage enterPayeeName(String Pname) {
        scrollElementIntoView(PayeeName);
        typeInProperty(PayeeName, Pname);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's Bank name*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement PayeeBankName;
    public PaymentsPage enterPayeeBankName(String Bname) {
        scrollElementIntoView(PayeeBankName);
        typeInProperty(PayeeBankName, Bname);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's Bank address*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement PayeeBankAddress;
    public PaymentsPage enterPayeeBankAddress(String Baddress) {
        scrollElementIntoView(PayeeBankAddress);
        typeInProperty(PayeeBankAddress, Baddress);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's Bank city*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement PayeeBankCity;
    public PaymentsPage enterPayeeBankCity(String Bcity) {
        scrollElementIntoView(PayeeBankCity);
        typeInProperty(PayeeBankCity, Bcity);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's Bank country\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'SWIFT/BIC']")
    public WebElement PayeeBankCountry;
    public PaymentsPage enterPayeeBankCountry(String Bcountry) {
        scrollElementIntoView(PayeeBankCountry);
        typeInProperty(PayeeBankCountry, Bcountry);
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[3]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Fee type']")
    public WebElement feeTypeDropdown;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'OUR'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'SHA')]")
    public WebElement feeType;
    public PaymentsPage selectFeetype() {
        scrollElementIntoView(feeTypeDropdown);
        feeTypeDropdown.click();
        sleep();
        feeType.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Purpose code']")
    public WebElement purposeCodeDropdown;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '221'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement purposeCodeTransportType;
    public PaymentsPage openSelectPurposeCode() {
        scrollElementIntoView(purposeCodeDropdown);
        purposeCodeDropdown.click();
        wait(purposeCodeTransportType);
        purposeCodeTransportType.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic arrow right\"])[4]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Select payment type')]")
    public WebElement openSelectPurpose;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '303'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement RandDType;
    public PaymentsPage openSelectPurposeCodeForeign() {
        scrollElementIntoView(openSelectPurpose);
        openSelectPurpose.click();
        wait(RandDType);
        RandDType.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOW MORE\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement ShowMoreBtn;
    public PaymentsPage ShowMore() {
        ShowMoreBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOW LESS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '100 Dummy']")
    public WebElement ShowLessBtn;
    public PaymentsPage ShowLess() {
        ShowLessBtn.click();
        sleep();
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


    @iOSXCUITFindBy(accessibility = "Canceled Orders")
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
    @iOSXCUITFindBy(accessibility = "EXECUTED")
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

    @iOSXCUITFindBy(accessibility = "Unknown Orders")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Scheduled Orders']")
    public WebElement unknownOrdersTitle;
    @iOSXCUITFindBy(accessibility = "UNKNOWN")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SCHEDULED']")
    public WebElement unknownOrdersBtn;
    public PaymentsPage goToUnknownOrders() {
        wait(unknownOrdersBtn);
        unknownOrdersBtn.click();
        sleep();
        verifyPage(unknownOrdersTitle, "Unknown Orders");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_accounts__picker_dialog_title_BANK_ACCOUNT+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_accounts__picker_dialog_title_BANK_ACCOUNT+"']")
    public WebElement selectBankAccTitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SELECT ACCOUNT\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Bank Account']")
    public WebElement selectBankAccBtn;
    public PaymentsPage selectBankAccount() {
        wait(selectBankAccBtn);
        selectBankAccBtn.click();
        sleep();
        verifyPage(selectBankAccTitle, s_accounts__picker_dialog_title_BANK_ACCOUNT);
        return this;
    }


    public PaymentsPage selectBankAccountInOrders() {
        wait(selectBankAccBtn);
        selectBankAccBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_menu_payment_scan\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_scan_to_pay+"')]")
    public WebElement scanToPayBtn;
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_scan_to_pay+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_scan_to_pay+"']")
    public WebElement scanToPayTitle;
    public PaymentsPage goToScanToPay() {
        wait(scanToPayBtn);
        scanToPayBtn.click();
        sleep();
        verifyPage(scanToPayTitle, s_payments__title_scan_to_pay);
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "Scan to pay")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView")
    public WebElement scanToPayDashBtn;
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_scan_to_pay+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_scan_to_pay+"']")
    public WebElement scanToPayDashTitle;
    public PaymentsPage goToScanToPayDash() {
        wait(scanToPayDashBtn);
        scanToPayDashBtn.click();
        verifyPage(scanToPayDashTitle, s_payments__title_scan_to_pay);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Request money\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text='"+s_dashboard__lbl_shortcuts_request_money+"')]")
    public WebElement RequestMoneyBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"New request\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New request']")
    public WebElement RequestMoneyTitle;
    public PaymentsPage goToRequestDashobard() {
        wait(RequestMoneyBtn);
        RequestMoneyBtn.click();
        sleep();
        verifyPage(RequestMoneyTitle, "New request");
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
        swipeToElementByText("left" ,crd,5);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Available amount'")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/accountTo']")
    public WebElement beneficiaryAccountNumberField;
    public PaymentsPage verifyPayerAccount(String account) {
        String acc = prop.getProperty(account);
        wait(beneficiaryAccountNumberField);
        String verifyAccount = beneficiaryAccountNumberField.getText();
        String errorMessage = verifyAccount + " does not match with selected one "+acc;
        assertTrue(verifyAccount.contains(acc), errorMessage);
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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search transactions\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/search_src_text']")
    public WebElement searchBar;
    public PaymentsPage searchOrder(String order) {
       sleep();
       sleep();
        wait(searchBar);
        typeInProperty(searchBar, order);

        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear text\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement eraseSearchBtn;
    public PaymentsPage eraseSearch() {
        wait(eraseSearchBtn);
        eraseSearchBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Sent requests'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement requestMoneyTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'REQUEST MONEY & SPLIT BILLS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement requestMoneyBtn;
    public PaymentsPage gotoRequestMoney() {
        wait(requestMoneyBtn);
        scrollElementIntoView(requestMoneyBtn);
        requestMoneyBtn.click();
        sleep();
        verifyPage(requestMoneyTitle, "Sent requests");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"79cd206e192049d4a6064ec30863c471\"]/XCUIElementTypeImage[@name=\"ic_more]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement requestOptionsBtn;
    public PaymentsPage openOptionsRequest() {
        wait(requestOptionsBtn);
        requestOptionsBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DETAILS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement requestDetails;
    public PaymentsPage openRequestDetails() {
        requestDetails.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_more\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement CreditorDetails;
    public PaymentsPage openCreditorDetails() {
        CreditorDetails.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SEND REMINDER\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement SendReminderBtn;
    public PaymentsPage clickSendReminderBtn() {
        SendReminderBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MARK AS PAID\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement MarkAsPaidBtn;
    public PaymentsPage clickMarkAsPaidBtn() {
        MarkAsPaidBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NEW REQUEST\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement NewRequestBtn;
    public PaymentsPage clickNewRequestBtn() {
        NewRequestBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Requested amount\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de.core:id/input']")
    public WebElement RequestedAmountField;
    public PaymentsPage enterRequestedAmount(String desc)  {
        wait(RequestedAmountField);
        typeInProperty(RequestedAmountField, desc);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOW QR CODE\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement ShowQRCodeBtn;
    public PaymentsPage clickShowQRCodeBtn() {
        ShowQRCodeBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement ShowQRCodeModalPullBar;
    public PaymentsPage closeShowQRCode() {
        drag(ShowQRCodeModalPullBar, 500, "down");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_select_transaction\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement SelectTransactionReqIcon;
    public PaymentsPage SelectTransactionRequest() {
        SelectTransactionReqIcon.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SPLIT WITH FRIENDS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_request_money+"')]")
    public WebElement SplitWithFriendsBtn;
    public PaymentsPage clickSplitWithFriendsBtn() {
        SplitWithFriendsBtn.click();
        sleep();
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

    @iOSXCUITFindBy(accessibility = "ic light unselected")
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='hr.asseco.android.ui.demo.de:id/flash_button']")
    public WebElement Flashlight;
    public PaymentsPage turnFlashlight() {
        Flashlight.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Templates & Beneficiaries']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Templates & Beneficiaries']")
    public WebElement TemplateAndBenBtn;
    public PaymentsPage clickTempAndBen() {
        TemplateAndBenBtn.click();
        verifyPage(TemplateAndBenBtn, "Templates & Beneficiaries");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic details\"])[5]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement SavingsOptionsBtn;
    @iOSXCUITFindBy(accessibility = "Saving options")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement SavingsOptionsTitle;
    public PaymentsPage clickSavingsOption() {
        scrollToElement("down", SavingsOptionsBtn);
        SavingsOptionsBtn.click();
        sleep();
        verifyPage(SavingsOptionsTitle, "Saving options");
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_product_background_1\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement Account1Background;
    public PaymentsPage swipeACCleft() {
        swipeLeft(Account1Background, 2000, 1.0);
        sleep();
        return this;
    }
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_product_background_1\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement AccountsBackground1;
    public PaymentsPage swipeACCright() {
        swipeRight(AccountsBackground1, 2000, 1.0);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(className = "android.widget.ImageView")
    public WebElement SavingsOptionsPullbar;
    public PaymentsPage closeSavingOptions() {
        drag(SavingsOptionsPullbar, 500, "down");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(className = "android.widget.ImageView")
    public WebElement SelectSavingPullbar;
    public PaymentsPage closeSelectSaving() {
        drag(SelectSavingPullbar, 500, "down");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SELECT SAVING\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_accounts__picker_title_SAVING_ACCOUNT+"']")
    public WebElement selectSavingBtn;
    public PaymentsPage selectSaving() {
        scrollToElement("down",selectSavingBtn);
        selectSavingBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"img_product_background_3\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Savings acc')]")
    public WebElement selectSaving;
    public PaymentsPage selectExpandSaving() {
        wait(selectSaving);
        selectSaving.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "OWN TRANSFER")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OWN TRANSFER']")
    public WebElement selectOTSaving;
    public PaymentsPage selectOTSavings() {
        selectOTSaving.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+s_accounts__lbl_action_bar_statements+"']" )
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_accounts__lbl_action_bar_statements+"']")
    public WebElement StatementsBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+s_documents__title_statements+"']" )
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_documents__title_statements+"']")
    public WebElement StatementsPageTitle;
    public PaymentsPage clickStatements() {
        StatementsBtn.click();
        wait(StatementsPageTitle);
        verifyPage(StatementsPageTitle, "Statements");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='REPAYMENT PLAN']" )
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='REPAYMENT PLAN']")
    public WebElement RepaymentBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+s_documents__title_statements+"']" )
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+s_documents__title_statements+"']")
    public WebElement RepaymentPageTitle;
    public PaymentsPage clickRepaymentPlan() {
        RepaymentBtn.click();
        //wait(StatementsPageTitle);
        //verifyPage(StatementsPageTitle, "Statements");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_download_pdf" )
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='hr.asseco.android.ui.demo.de:id/search_container']/android.widget.ImageView[@index='2']")
    public WebElement PDFbtn;
    public PaymentsPage generatePDF() {
        PDFbtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ADD MONEY" )
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= '"+s_accounts__lbl_action_bar_internal_transfer_credit+"']")
    public WebElement addMoneybtn;
    public PaymentsPage addMoney() {
        addMoneybtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Own transfers & Exchange']" )
    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Own transfers & Exchange']")
    public WebElement OwnTransferTitle;
    public PaymentsPage verifyOwnTransfer() {
        wait(OwnTransferTitle);
        verifyPage(OwnTransferTitle, "Own transfers & Exchange");
        sleep();
        return this;
    }


    public PaymentsPage enterAmountInSavings()  {
        //scrollToElement("down",amountField);
        wait(AmountField);
        typeInProperty(AmountField, "AMOUNT");
        return this;
    }

    public PaymentsPage enterAmountInInternalTransfer(String amount)  {
        //scrollToElement("down",amountField);
        wait(AmountField);
        typeInProperty(AmountField, amount);
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic details\"])[9]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement LoanOptionsBtn;
    @iOSXCUITFindBy(accessibility = "Loan options")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement LoanOptionsTitle;
    public PaymentsPage clickLoansOption() {
        scrollToElement("down", LoanOptionsBtn);
        LoanOptionsBtn.click();
        sleep();
        verifyPage(LoanOptionsTitle, "Loan options");
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic visibility off\"])[7]")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement visiblityLoansBtn;
    public PaymentsPage clickVisiblityLoans() {
        wait(visiblityLoansBtn);
        visiblityLoansBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"img_product_background_4\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='hr.asseco.android.ui.demo.de:id/page_container'] and contains(@text,'Credit Facility')]']")
    public WebElement selectLoans;
    public PaymentsPage selectExpandLoans() {
        scrollElementIntoView(selectLoans);
        selectLoans.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_back")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement BugBack;
    public PaymentsPage clickBackArw() {
        BugBack.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "DISCARD")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='DISCARD']")
    public WebElement Discard;
    public PaymentsPage clickDiscard() {
        wait(Discard);
        Discard.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='ic_pull_bar']")
    @AndroidFindBy(className = "android.widget.ImageView")
    public WebElement savingsMorePB;
    public PaymentsPage closeSavingsMoreMenu(){
        drag(savingsMorePB, 500,"down");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_arrow_right\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]")
    public WebElement selectPayerOwn;
    public PaymentsPage selectPayerOwnTransfer() {
        selectPayerOwn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_arrow_right\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]")
    public WebElement selectBeneficiaryOwn;
    public PaymentsPage selectBenefOwnTransfer() {
        selectBeneficiaryOwn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility=  "DONE")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_common__btn_done+"']")
    public WebElement DoneBtn;
    public PaymentsPage clickDone() {
        DoneBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='ic_currency_button_arrow_down']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement selectCurrencyBtn;
    public PaymentsPage clickCurrencySelect() {
        selectCurrencyBtn.click();
        sleep();
        return this;
    }



    @iOSXCUITFindBy(accessibility = "Select currency")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement selectCurrencyTitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_currency_button_arrow_down\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement SelectCurrencyBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='EUR']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement selectEUR;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='RSD']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose currency']")
    public WebElement selectRSD;
    public PaymentsPage selectCurrencyRSD() {
        SelectCurrencyBtn.click();
        wait(selectCurrencyTitle);
        selectRSD.click();
        sleep();
        return this;

    }

    public PaymentsPage selectCurrencyEUR() {
        SelectCurrencyBtn.click();
        wait(selectCurrencyTitle);
        selectEUR.click();
        sleep();
        return this;

    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"RSD\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='CURRENCY']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EUR\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='CURRENCY']")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HRK\"]")
//    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='CURRENCY']")
    public WebElement selectedCurrency;
    public PaymentsPage verifyCurrency(String currency){
        wait(selectedCurrency);
        String verifyCurrency = selectedCurrency.getText();
        String errorMessage = verifyCurrency + " does not match with selected one";
        assertTrue(verifyCurrency.contains(currency), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'P2P PAYMENT'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement P2PBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"P2P Payment\"]")
    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"P2P Payment\"]")
    public WebElement P2PTitle;
    public PaymentsPage goToP2PPayment(){
        wait(P2PBtn);
        P2PBtn.click();
        sleep();
        verifyPage(P2PTitle,"P2P Payment");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic addressbook\"]")
    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"P2P Payment\"]")
    public WebElement Adressbook;
    public PaymentsPage openAddressbook(){
        wait(Adressbook);
        Adressbook.click();
        sleep();
        verifyPage(P2PTitle,"P2P Payment");
        return this;
    }

    public PaymentsPage selectContact(String contact) {
        String Contact = prop.getProperty(contact);
        selector(Contact);
        return this;
    }

    public PaymentsPage selectContactPhoneNumber(String pn) {
        String PhoneNumber = prop.getProperty(pn);
        selector(PhoneNumber);
        return this;
    }

    public PaymentsPage selectStandingOrder(String order) {
        String sn = prop.getProperty(order);
        selector(sn);
        return this;
    }

//    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Test Contact A'")
//    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
//    public WebElement BeneficiaryPhoneNumber;
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"mobile\"]")
//    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
//    public WebElement PhoneNumber;
//    public PaymentsPage selectBeneficiaryPhoneNumber(){
//        wait(PhoneNumber);
//        PhoneNumber.click();
//        return this;
//    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's name\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement payeenameContact;
    public PaymentsPage verifyContactName(String contactname){
            String cn = prop.getProperty(contactname);
            wait(payeenameContact);
            String verifyContactName = payeenameContact.getText();
            String errorMessage = verifyContactName + " does not match with selected one";
            assertTrue(verifyContactName.contains(cn), errorMessage);
            return this;
        }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Message for friend\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement MessageFFField;
    public PaymentsPage enterMessageFF(String message)  {
        wait(MessageFFField);
        typeInProperty(MessageFFField, message);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'BILLS & RECURRING PAYMENTS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'BILLS & RECURRING PAYMENTS')]")
    public WebElement BillsAndRecurringPaymentsBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bills & Recuring payments']")
    public WebElement BillsAndRecurringTitle;
    public PaymentsPage goToBillsAndRecurringPayments(){
        wait(BillsAndRecurringPaymentsBtn);
        BillsAndRecurringPaymentsBtn.click();
        sleep();
        //verifyPage(BillsAndRecurringTitle,"Bills & Recurring payments");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OBLIGATIONS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement ObligationsTab;
    public PaymentsPage switchToObligations()  {
        wait(ObligationsTab);
        ObligationsTab.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SUBSCRIPTIONS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement SubscriptionsTab;
    public PaymentsPage switchToSubscriptions()  {
        wait(SubscriptionsTab);
        SubscriptionsTab.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NEW SUBSCRIPTION\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement NewSubscriptionBtn;
    public PaymentsPage clickNewSubscription()  {
        wait(NewSubscriptionBtn);
        NewSubscriptionBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Find bill issuer\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_internal_transfer+"']")
    public WebElement FindBillIssuerTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'UTILITY BILLS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement UtitlityBillsSub;
    public PaymentsPage selectUtitlityBillsSub(){
        wait(UtitlityBillsSub);
        UtitlityBillsSub.click();
        sleep();
        verifyPage(FindBillIssuerTitle,"Find bill issuer");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Electrical Power Supply JP\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_internal_transfer+"']")
    public WebElement NewBillPresentmentEPSTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'NEW BILL PRESENTMENT'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement NewBillPresentmentBtn;
    public PaymentsPage selectNewBillPresentment(){
        wait(NewBillPresentmentBtn);
        NewBillPresentmentBtn.click();
        sleep();
        verifyElementText(NewBillPresentmentEPSTitle,"Electrical Power Supply JP");
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Bill issuer name'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement BillIssuerName;
    public PaymentsPage verifyEPS(){
        String eps = prop.getProperty("EPS");
        wait(BillIssuerName);
        String verifyBillIssuer = BillIssuerName.getText();
        String errorMessage = verifyBillIssuer + " does not match with selected one";
        assertTrue(verifyBillIssuer.contains(eps), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic info\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement BillIdentifierInfo;
    public PaymentsPage clickBillIdentifierInfo()  {
        wait(BillIdentifierInfo);
        BillIdentifierInfo.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bill identifier\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement BillIdentifierField;
    public PaymentsPage enterBillIdentifier(String bill_identifier)  {
        scrollToElement("down",BillIdentifierField);
        wait(BillIdentifierField);
        typeInProperty(BillIdentifierField, bill_identifier);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'DE Staging'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement closeTC;
    public PaymentsPage clickcloseTC(){
        wait(closeTC);
        closeTC.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SUBSCRIBE\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement SubscribeBtn;
    public PaymentsPage clickSubscribe() {
        SubscribeBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"billPresentment/inputTnc\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement turnIAgreeTC;
    public PaymentsPage turnIAgreeTC(){
        scrollElementIntoView(turnIAgreeTC);
        wait(turnIAgreeTC);
        turnIAgreeTC.click();
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"standingOrderInternalTNC\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"STANDING_ORDER_TNC_INPUT_SWITCH\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement turnIAgreeTCSO;
    public PaymentsPage turnIAgreeTCSO(){
//        scrollElementIntoView(turnIAgreeTCSO);
        wait(turnIAgreeTCSO);
        turnIAgreeTCSO.click();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'OWN TRANSFERS & EXCHANGE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement OwnTransfersAndExchangeSub;
    public PaymentsPage selectOwnTransfersAndExchangeSub(){
        wait(OwnTransfersAndExchangeSub);
        OwnTransfersAndExchangeSub.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Nickname*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement NicknameSOField;
    public PaymentsPage enterNicknameStandingOrder(String so_nickname){
        scrollElementIntoView(NicknameSOField);
        typeInProperty(NicknameSOField, "SO_NICKNAME");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Description*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Description*']")
    public WebElement SODetails;
    public PaymentsPage enterSODetails(String dets) {
        scrollElementIntoView(SODetails);
        typeInProperty(SODetails, dets);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic calendar\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Description*']")
    public WebElement StartDate;
    public PaymentsPage openStartDate() {
        scrollElementIntoView(StartDate);
        StartDate.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic calendar\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Description*']")
    public WebElement RevocationDate;
    public PaymentsPage openRevocationDate() {
        scrollElementIntoView(RevocationDate);
        RevocationDate.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic arrow right\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Description*']")
    public WebElement FrequencyModal;
    public PaymentsPage openFrequencyModal() {
        scrollElementIntoView(FrequencyModal);
        FrequencyModal.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'weekly'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement weeklyFrequency;
    public PaymentsPage WeeklyFrequency(){
        wait(weeklyFrequency);
        weeklyFrequency.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'yearly'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement yearlyFrequency;
    public PaymentsPage YearlyFrequency(){
        wait(yearlyFrequency);
        yearlyFrequency.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'PAY SOMEONE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement PaySomeoneSub;
    public PaymentsPage selectPaySomeoneSub(){
        wait(PaySomeoneSub);
        PaySomeoneSub.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Model and reference number\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc= 'Description*']")
    public WebElement ModelField;
    public PaymentsPage enterModelNumber(String model) {
        scrollElementIntoView(ModelField);
        typeInProperty(ModelField, model);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Frequency\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[contains(@content-desc,'test')]//android.widget.EditText")
    public WebElement verifyFrequencyBtn;
    public PaymentsPage verifyFrequency(String frequency){
        wait(verifyFrequencyBtn);
        String verifyFrequency = verifyFrequencyBtn.getText();
        String errorMessage = verifyFrequency + " does not match with selected one "+frequency;
        assertTrue(verifyFrequency.contains(frequency), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CREATE\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement CreateBtn;
    public PaymentsPage clickCreate() {
        CreateBtn.click();
        sleep();
        return this;
    }

    //MYORDERS

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DRAFTS\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement DraftOrdersBtn;
    public PaymentsPage clickDraftOrders() {
        DraftOrdersBtn.click();
        sleep();
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"b6fbc105676e4f5b9c1d818685b3b805\"]/XCUIElementTypeImage[@name=\"ic_more\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"a5266068e460422196387531a39da265\"]/XCUIElementTypeImage[@name=\"ic_more\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"41cd452b01ca4af8af437cb21b2e5c79\"]/XCUIElementTypeImage[@name=\"ic_more\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsBtnFirstOrder;
    public PaymentsPage clickOptionsBtnFirstOrder() {
        OptionsBtnFirstOrder.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COPY\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsCopyBtn;
    public PaymentsPage clickOptionsCopyBtn() {
        OptionsCopyBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PAY\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsPayBtn;
    public PaymentsPage clickOptionsPayBtn() {
        OptionsPayBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHARE\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsShareBtn;
    public PaymentsPage clickShareInOptions() {
        OptionsShareBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement CloseOptionsShareBtn;
    public PaymentsPage closeShareInOptions() {
        CloseOptionsShareBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SAVE AS TEMPLATE OR BENEFICIARY\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement SaveAsTBBtn;
    public PaymentsPage clickSaveTBInOptions() {
        SaveAsTBBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW RECEIPT\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsViewReceiptBtn;
    public PaymentsPage clickViewReceiptInOptions() {
        OptionsViewReceiptBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DETAILS\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsDetailsBtn;
    public PaymentsPage clickDetailsInOptions() {
        OptionsDetailsBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_copy\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement CopyClipboardInOptions;
    public PaymentsPage CopyClipboardBtn() {
        CopyClipboardInOptions.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"img_transactions_empty_state\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'eee')]")
    public WebElement EmptyStatePicture;
    public PaymentsPage verifyEmptyState() {
        EmptyStatePicture.isDisplayed();
        sleep();
        return this;

    }

    @iOSXCUITFindBy(accessibility = ""+s_vouchers_list__title+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_vouchers_list__title+"']")
    public WebElement BuyAVoucherTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_payments__btn_menu_buy_voucher+"'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_buy_voucher+"')]")
    public WebElement BuyAVoucherBtn;
    public PaymentsPage gotoBuyAVoucher() {
        scrollElementIntoView(BuyAVoucherBtn);
        BuyAVoucherBtn.click();
        wait(BuyAVoucherTitle);
        verifyPage(BuyAVoucherTitle, s_vouchers_list__title);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_more\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsBtnFirstVoucher;
    public PaymentsPage clickOptionsBtnFirstVoucher() {
        OptionsBtnFirstVoucher.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHARE VOUCHER\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsShareVoucher;
    public PaymentsPage clickShareVoucher() {
        OptionsShareVoucher.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"REPEAT PAYMENT\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement OptionsRepeatPayment;
    public PaymentsPage clickRepeatPayment() {
        OptionsRepeatPayment.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"BUY NEW VOUCHER\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/button']")
    public WebElement BuyNewVoucherBtn;
    public PaymentsPage clickBuyNewVoucher() {
        BuyNewVoucherBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Select provider\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='" + s_recharge__lbl_select_provider + "']")
    public WebElement ProviderTitle;
    public PaymentsPage verifyProviderTitle() {
        verifyPage(ProviderTitle, s_recharge__lbl_select_provider);
        return this;
    }


    @iOSXCUITFindBy(accessibility = "Telekom")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tomato']")
    public WebElement providerTelekom;
    public PaymentsPage selectProviderVoucher() {
        providerTelekom.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"TLNRMTU1000\"]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tomato']")
    public WebElement VoucherAmount;
    public PaymentsPage selectVoucherAmount() {
        VoucherAmount.click();
        sleep();
        return this;
    }
}