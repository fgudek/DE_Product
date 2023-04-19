package appObjects.paymentPage;

import appObjects.morePage.settingsPage.MyProfile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static appObjects.Translations.s_payments__btn_pay_someone_identifier_PHONE;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TemplatesPage extends Base {

    public TemplatesPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public TemplatesPage selectTemplate(String template) {
        String temp = prop.getProperty(template);
        searchSelector(temp);
        sleep();
        return this;
    }

    public TemplatesPage selectBeneficiary(String beneficiary) {
        String benef = prop.getProperty(beneficiary);
        searchSelector(benef);
        sleep();
        return this;
    }

    public TemplatesPage selectAccIdentifier(String identifier) {
        String id_acc = prop.getProperty(identifier);
        selector(id_acc);
        sleep();
        return this;
    }

    public TemplatesPage moreTemplateSelect(String more) {
        String more_temp = prop.getProperty(more);
        moreTemplateSelector(more_temp);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "TEMPLATE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement TemplateInPayment;
    public TemplatesPage clickTemplateInPayment() {
        TemplateInPayment.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_menu_pay_favorite")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TEMPLATES & BENEFICIARIES')]")
    public WebElement TemplateAndBen;
    public TemplatesPage clickTemplateAndBenInPayments() {
        TemplateAndBen.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
    WebElement searchField;
    public TemplatesPage searchTemplate(String template) {
        wait(searchField);
        typeInProperty(searchField,template);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Templates & Beneficiaries")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
    WebElement titleTempAndBenef;
    public TemplatesPage verifyPageTitleTB() {
        wait(titleTempAndBenef);
        verifyPage(titleTempAndBenef, "Templates & Beneficiaries");
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'International' ")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Current Account in RSD')]")
    public WebElement InternationalTemplate;
    public TemplatesPage clickInternationalTemp() {
        InternationalTemplate.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='3a0c83123e6b4c51a7cb4eebe7ff15e0']//XCUIElementTypeImage[@name='ic_more']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement MoreBtnTestTemp;
    public TemplatesPage MoreBtnTest() {
        scrollElementIntoView(MoreBtnTestTemp);
        wait(MoreBtnTestTemp);
        MoreBtnTestTemp.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_more\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement MoreBtn;
    public TemplatesPage closeMore() {
        MoreBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'TEST TEMPLATE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Current Account in RSD')]")
    public WebElement TestBeneficiary;
    public TemplatesPage selectTestBeneficiary() {
        scrollToElement("down", TestBeneficiary);
        TestBeneficiary.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "DELETE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement DeleteTBBtn;
    public TemplatesPage clickDeleteTB() {
        DeleteTBBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "DELETE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement DeleteBtn;
    public TemplatesPage clickDelete() {
        DeleteBtn.click();
        sleep();
        return this;
    }

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "CANCEL")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    @iOSXCUITFindBy(accessibility = "Cancel")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement CancelDelTBBtn;
    public TemplatesPage CancelDelTB() {
        CancelDelTBBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "EDIT")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement EditTB;
    public TemplatesPage clickEditTB() {
        EditTB.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Bank account number (IBAN)*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/accountTo']")
    public WebElement beneficiaryAccountNumberField;
    public TemplatesPage verifyBeneficiaryAccountNumber(String account) {
       // scrollToElement("down",beneficiaryAccountNumberField);
        wait(beneficiaryAccountNumberField);
        verifier(beneficiaryAccountNumberField, account);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's name*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/nameTo']")
    public WebElement beneficiaryNameField;
    public TemplatesPage verifyBeneficiaryName(String name){
        //scrollToElement("down",beneficiaryNameField);
        wait(beneficiaryNameField);
        verifier(beneficiaryNameField, name);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payee's Bank name*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/accountTo']")
    public WebElement beneficiaryBank;
    public TemplatesPage verifyBeneficiaryBank(String bank) {
        // scrollToElement("down",beneficiaryAccountNumberField);
        wait(beneficiaryBank);
        verifier(beneficiaryBank, bank);
        return this;
    }

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Amount and currency\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/amount']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='payments/amount']")
    public WebElement amountField;
    public TemplatesPage verifyAmount(String amount){
        scrollToElement("down",amountField);
        wait(amountField);
        verifier(amountField, amount);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'International' ")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Current Account in RSD')]")
    public WebElement IntTemplate;
    public TemplatesPage verifyIntTemplate(String template_int) {
        scrollToElement("down", IntTemplate);
        wait(IntTemplate);
        verifier(IntTemplate, template_int);
        sleep();
        return this;
    }

    public TemplatesPage verifyBeneficiaryTemp(String test_Bene) {
        scrollToElement("down", TestBeneficiary);
        wait(TestBeneficiary);
        verifier(TestBeneficiary, test_Bene);
        sleep();
        return this;
    }

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "OK")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    @iOSXCUITFindBy(accessibility = "android:id/button1")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    public WebElement errorBtn;
    public TemplatesPage Error(){
        try{
            errorBtn.isDisplayed();
            errorBtn.click();}
        catch(NoSuchElementException | StaleElementReferenceException ignored) { }
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"5091\"]/XCUIElementTypeImage[@name=\"ic_more\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement MoreBtnTestBenef;
    public TemplatesPage MoreBtnTestBenef() {
        scrollElementIntoView(MoreBtnTestBenef);
        wait(MoreBtnTestBenef);
        MoreBtnTestBenef.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__title_edit_beneficiary+"")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
    public WebElement titleEditB;
    public TemplatesPage verifyEditB() {
        wait(titleEditB);
        verifyPage(titleEditB, "Edit Beneficiary");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__btn_edit_beneficiary_add_new_IBAN+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement AddNewAccID;
    public TemplatesPage clickAddNewBankAcc() {
        AddNewAccID.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic delete\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement DeleteNewAccID;
    public TemplatesPage clickDeleteNewAccID() {
        DeleteNewAccID.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Bank account number (IBAN)\"])[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement AccID2;
    public TemplatesPage enterAccID()  {
        //scrollToElement("down",AmountField);
        wait(AccID2);
        typeInProperty(AccID2, "ACCOUNT_BEN");
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'TEST TEMPLATE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement MRBenef;
    public TemplatesPage selectBeneficiary() {
        TestBeneficiary.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Templates']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement BeneficiariesTitle;
    public TemplatesPage closeModal() {
        BeneficiariesTitle.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__lbl_template_or_beneficiary_saved_as_template_and_beneficiary_msg+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement SavedTemplateBeneSuccessMsg;
    public TemplatesPage verifyTemplateBeneficiarySuccessMsg() {
        wait(SavedTemplateBeneSuccessMsg);
        verifyMessage(SavedTemplateBeneSuccessMsg, s_payments__lbl_template_or_beneficiary_saved_as_template_and_beneficiary_msg);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__lbl_template_or_beneficiary_saved_as_template_msg+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement SavedTemplateSuccessMsg;
    public TemplatesPage verifyTemplateSuccessMsg() {
        wait(SavedTemplateSuccessMsg);
        verifyMessage(SavedTemplateSuccessMsg, s_payments__lbl_template_or_beneficiary_saved_as_template_msg);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'TEST BENEFICIARY'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Payment description')]")
    public WebElement ChooseToPayLabel;
    public TemplatesPage verifyAddedIdentifier(String identifier) {
        String str = ChooseToPayLabel.getText();
        String str1 = prop.getProperty(identifier);
        String errorMessage = "Found " + str + " but expected " + str1;
        assertTrue(str.contains(str1), errorMessage);
        return this;
    }

    public TemplatesPage verifyDeletedIdentifier(String del_identifier) {
        String str = ChooseToPayLabel.getText();
        String str2 = prop.getProperty(del_identifier);
        String errorMessage = "Found " + str + " but expected " + str2;
        assertTrue(str.contains(str2), errorMessage);
        return this;
        }

}