package appObjects.preLoginObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import static appObjects.adaptiveElements.*;
import static appObjects.Translations.*;

public class PreLoginPage extends Base {

    public PreLoginPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSNsPredicate = "Welcome back")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome back']")
    public WebElement activatedLandingPage;
    public PreLoginPage verifyActivatedLandingPage(){
        wait(activatedLandingPage);
        verifyPage(activatedLandingPage,"Welcome back");
        return this;
    }


    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/language_button")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/language_button']")
    public WebElement langSelect;
    public PreLoginPage clickLanguageSelect() {
        wait(langSelect);
        langSelect.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "HRVATSKI")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='HRVATSKI']")
    public WebElement langHR;
    public PreLoginPage changeLangToHR() {
        wait(langHR);
        langHR.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "HR")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HR']")
    public WebElement langBTN;
    public PreLoginPage verifyLangChange() {
        wait(langBTN);
        verifyElementText(langBTN, "HR");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ENGLISH")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='ENGLISH']")
    public WebElement langEN;
    public PreLoginPage changeLangToEN() {
        wait(langSelect);
        langSelect.click();
        wait(langEN);
        langEN.click();

        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionLocator")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionLocator']")
    public WebElement locationsBTN;
    public PreLoginPage locations() {
        wait(locationsBTN);
        locationsBTN.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionInbox")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionInbox']")
    public WebElement inboxBtn;
    public PreLoginPage inbox() {
        wait(inboxBtn);
        inboxBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionProducts")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionProducts']")
    public WebElement productsBtn;
    @iOSXCUITFindBy(accessibility = "Products")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Products']")
    public WebElement productsTitle;
    public PreLoginPage products() {
        wait(productsBtn);
        productsBtn.click();
        wait(productsTitle);
        verifyPage(productsTitle, "Products");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionExchange")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionExchange']")
    public WebElement exchangeListBtn;
    public PreLoginPage exchangeList() {
        wait(exchangeListBtn);
        exchangeListBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionContacts")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionContacts']")
    public WebElement contactsBtn;
    public PreLoginPage contacts() {
        wait(contactsBtn);
        contactsBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_lbs__title_lbs+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_lbs__title_lbs+"']")
    public WebElement branchesAndATMsBtn;
    public PreLoginPage branchesAndATMs() {
        wait(branchesAndATMsBtn);
        branchesAndATMsBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionMore")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionMore']")
    public WebElement moreBtn;
    public PreLoginPage preLoginMore() {
        wait(moreBtn);
        moreBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/m_banking_button")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement loginBtn;
    public PreLoginPage clickLogin(){
        wait(loginBtn);
        loginBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "com.android.systemui:id/button2")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.systemui:id/button2']")
    public WebElement usePinBtn;
    public PreLoginPage clickUsePin(){
        wait(usePinBtn);
        usePinBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/label")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/label']")
    public WebElement accountsTitle;
    public PreLoginPage verifyLogIn(){
        wait(accountsTitle);
        accountsTitle.isDisplayed();
        sleep();
        return this;
    }


    public PreLoginPage selectCurencies(String currency) {
        String acc = prop.getProperty(currency);
        selector(acc);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionToken")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionToken']")
    public WebElement mTokenBtn;
    @iOSXCUITFindBy(accessibility = ""+c_mtoken__title_token+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken__title_token+"']")
    public WebElement mTokenTitle;
    public PreLoginPage mToken() {
        mTokenBtn.click();
        sleep();
        verifyPage(mTokenTitle, c_mtoken__title_token);

        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/qr_code")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/qr_code']")
    public WebElement OTPBtn;
    @iOSXCUITFindBy(accessibility = ""+c_mtoken__lbl_OTP+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken__lbl_OTP+"']")
    public WebElement otpCodeTitle;
    public PreLoginPage generateOTP() {
        OTPBtn.click();
        sleep();
        verifyPage(otpCodeTitle, c_mtoken__lbl_OTP);

        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/mds_code")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/mds_code']")
    public WebElement MDSBtn;
    @iOSXCUITFindBy(accessibility = ""+c_mtoken_mds__lbl_mds_input_1_title+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_1_title+"']")
    public WebElement MDSbenefAcc;
    @iOSXCUITFindBy(accessibility = ""+c_mtoken_mds__lbl_mds_input_2_title+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MDSbamount;

    public PreLoginPage inputMDSdata() {
        MDSBtn.click();
        sleep();
        typeInProperty(MDSbenefAcc, "MDSbenefAcc");
        typeInProperty(MDSbamount, "MDSamount");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/btn_generate_mds")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/btn_generate_mds']")
    public WebElement MDSgenerateBtn;
    @iOSXCUITFindBy(accessibility = ""+c_mtoken_mds_code_lbl_mds_code+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement mdsCodeTitle;
    public PreLoginPage generateMDS() {
        MDSgenerateBtn.click();
        sleep();
        verifyElementText(mdsCodeTitle, c_mtoken_mds_code_lbl_mds_code);

        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionFastBalance")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement mBalanceBtn;
    public PreLoginPage mBalance() {
        mBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/titleAction")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/titleAction']")
    public WebElement XBtn;
    public PreLoginPage clickX() {
        XBtn.click();
       // sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/optionMcash")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionMcash']")
    public WebElement mCashBtn;
    @iOSXCUITFindBy(accessibility = ""+s_mcash__title_mcash+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_mcash__title_mcash+"']")
    public WebElement mCashTitle;
    public PreLoginPage mCash() {
        mCashBtn.click();
        sleep();
        verifyPage(mCashTitle, s_mcash__title_mcash);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Inbox")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Inbox']")
    public WebElement inboxTitle;
    public PreLoginPage verifyInbox() {
        wait(inboxTitle);
        verifyPage(inboxTitle, "Inbox");
        return this;

    }

    @iOSXCUITFindBy(accessibility = ""+s_inbox__title_notifications+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_inbox__title_notifications+"']")
    public WebElement inboxNotifications;
    public PreLoginPage inboxNotifications() {
        inboxNotifications.click();

        return this;
        
    }

    @iOSXCUITFindBy(accessibility = "Inbox")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Streamlined')]")
    public WebElement receivedNotification;
    public PreLoginPage receivedNotification() {
        scrollElementIntoView(receivedNotification);
        receivedNotification.click();
        sleep();
        verifyPage(receivedNotification, "Streamlined");

        return this;
    }

    @iOSXCUITFindBy(accessibility = "Messages")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Messages')]")
    public WebElement inboxMessages;
    public PreLoginPage inboxMessages() {
               inboxMessages.click();

        return this;
    }

    @iOSXCUITFindBy(accessibility = "process improvement")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'process improvement')]")
    public WebElement receivedMessage;
    public PreLoginPage receivedMessage() {
        scrollElementIntoView(receivedMessage);
        receivedMessage.click();
        sleep();
        verifyPage(receivedMessage, "process improvement");

        return this;
    }
}