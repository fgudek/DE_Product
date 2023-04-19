package appObjects.preLoginObjects;

import appObjects.cardsPage.CardsPage;
import appObjects.paymentPage.PaymentsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import static appObjects.adaptiveElements.*;
import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class PreLoginPage extends Base {

    public PreLoginPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "\t\n" + "Welcome, Guest!")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome, Guest!']")
    public WebElement activatedLandingPage;
    public PreLoginPage verifyActivatedLandingPage(){
        //wait(activatedLandingPage);
        verifyPage(activatedLandingPage, "Welcome, Guest!" );
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='LOG IN']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOG IN']")
    public WebElement RegUserLandingPage;
    public PreLoginPage verifyRegUserLandingPage(){
        wait(RegUserLandingPage);
        isElementPresent(RegUserLandingPage);
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='EN']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='EN']")
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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='HR']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HR']")
    public WebElement langBTN;
    public PreLoginPage verifyLangChange() {
        wait(langBTN);
        verifyElementText(langBTN, "HR");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='EN']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='EN']")
    public WebElement ENlangBtn;
    public PreLoginPage verifyEN() {
        wait(ENlangBtn);
        verifyElementText(ENlangBtn, "EN");
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ENGLISH']")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='ENGLISH']")
    public WebElement langEN;
    public PreLoginPage changeLangToEN() {
        wait(langBTN);
        langBTN.click();
        wait(langEN);
        langEN.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_prelogin_location")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Locations']")
    public WebElement locationsBTN;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+c_lbs__title_lbs_map+"']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_lbs__title_lbs_map+"']")
    public WebElement locationsTitle;
    public PreLoginPage locations() {
        wait(locationsBTN);
        locationsBTN.click();
        //verifyPage(locationsTitle, c_lbs__title_lbs_map);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_prelogin_messages")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionInbox']")
    public WebElement inboxBtn;
    public PreLoginPage inbox() {
        wait(inboxBtn);
        inboxBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_prelogin_products")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de:id/optionProducts']")
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

    @iOSXCUITFindBy(accessibility = "ic_prelogin_exchange")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Exchange list']")
    public WebElement exchangeListBtn;
    public PreLoginPage exchangeList() {
        wait(exchangeListBtn);
        exchangeListBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_prelogin_contacts")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contacts']")
    public WebElement contactsBtn;
    public PreLoginPage contacts() {
        wait(contactsBtn);
        contactsBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Demo")
    @AndroidFindBy(accessibility = "hr.asseco.android.ui.demo.de:id/optionDemo")
    public WebElement DemoBtn;
    public PreLoginPage Demo() {
        wait(DemoBtn);
        DemoBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Branches and ATMs")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_lbs__title_lbs+"']")
    public WebElement branchesAndATMsBtn;
    public PreLoginPage branchesAndATMs() {
        wait(branchesAndATMsBtn);
        branchesAndATMsBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_prelogin_more")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionMore']")
    public WebElement moreBtn;
    public PreLoginPage preLoginMore() {
        wait(moreBtn);
        moreBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='LOG IN']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOG IN']")
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

    @iOSXCUITFindBy(accessibility = "Accounts") //defined in loginPage
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/label']")
    public WebElement accountsTitle;
    public PreLoginPage verifyLogIn(){
        wait(accountsTitle);
        accountsTitle.isDisplayed();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Select currencies")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select currencies']")
    public WebElement editCurrencyTitle;
    public PreLoginPage selectCurencies(String currency) {
        wait(editCurrencyTitle);
        selector(currency);
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='EDIT CURRENCY LIST']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='EDIT CURRENCY LIST']")
    public WebElement EditCurBtn;
    public PreLoginPage clickEditCur(){
        wait(EditCurBtn);
        EditCurBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_common__btn_done+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='"+c_common__btn_done+"']")
    public WebElement DoneCurBtn;
    public PreLoginPage clickDoneCur(){
        wait(DoneCurBtn);
        DoneCurBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_prelogin_token")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_prelogin__btn_mobile_token+"']")
    public WebElement mTokenBtn;
    @iOSXCUITFindBy(accessibility = "mToken")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken__title_token+"']")
    public WebElement mTokenTitle;
    public PreLoginPage mToken() {
        mTokenBtn.click();
        sleep();
        //verifyPage(mTokenTitle, c_mtoken__title_token);

        return this;
    }

    @iOSXCUITFindBy(accessibility = "OTP")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken__btn_otp+"']")
    public WebElement OTPBtn;
    @iOSXCUITFindBy(accessibility = "YOUR OTP CODE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken__lbl_OTP+"']")
    public WebElement otpCodeTitle;
    public PreLoginPage generateOTP() {
        OTPBtn.click();
        sleep();
        verifyElementText(otpCodeTitle, c_mtoken__lbl_OTP);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "MDS")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken__btn_mds+"']")
    public WebElement MDSBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='"+c_mtoken_mds__lbl_mds_input_1_title+"']")
    public WebElement MDSbenefAcc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"MPB - DE\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MDSbamount;
    public PreLoginPage inputMDSdata() {
        MDSBtn.click();
        sleep();
        typeInProperty(MDSbenefAcc, "MDSbenefAcc");
        typeInProperty(MDSbamount, "MDSbamount");
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "CLOSE")
    @iOSXCUITFindBy(accessibility = "Close")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_mcash__title_mcash_code+"')]")
    public WebElement CloseKeyBtn;
    public PreLoginPage CloseKeyBtn() {
        CloseKeyBtn.click();
        sleep();
        return this;
    }

/*
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"MPB - DE\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MDSbamount;
    public PreLoginPage inputMDSamount() {
        sleep();
        typeInProperty(MDSbamount, "MDSbamount");
        return this;
    }
    */


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='"+c_mtoken_mds__btn_generate_mds+"']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='"+c_mtoken_mds__btn_generate_mds+"']")
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

    @iOSXCUITFindBy(accessibility = "ic_prelogin_mbalance")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='mBalance']")
    public WebElement mBalanceBtn;
    public PreLoginPage mBalance() {
        mBalanceBtn.click();
        sleep();
        return this;
    }



    @iOSXCUITFindBy(accessibility = "ic_prelogin_mcash")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_prelogin__btn_mcash+"']")
    public WebElement mCashBtn;
    public PreLoginPage mCash() {
        mCashBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_mcash__title_mcash+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_mcash__title_mcash+"']")
    public WebElement mCashTitle;
    public PreLoginPage verifymCashScreen() {
        verifyPage(mCashTitle, s_mcash__title_mcash);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NEW MESSAGE']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='NEW MESSAGE']")
    public WebElement inboxNewMessage;
    public PreLoginPage verifyInbox() {
        wait(inboxNewMessage);
        verifyElementText(inboxNewMessage, "NEW MESSAGE");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_inbox__title_notifications+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_inbox__title_notifications+"']")
    public WebElement inboxNotifications;
    public PreLoginPage inboxNotifications() {
        inboxNotifications.click();

        return this;
        
    }

    @iOSXCUITFindBy(accessibility = "Inbox")   ///??? notifications inside inbox?
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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name=\"switch-M_BALANCE\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de:id/switchView']")
    public WebElement ShowBalanceSwitch;
    public PreLoginPage selectShowBalance(String turn) {
        wait(ShowBalanceSwitch);
        agreementSwitcher(ShowBalanceSwitch, turn);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "20")
    @AndroidFindBy(xpath ="//android.widget.LinearLayout[@index='2']")
    public WebElement mCash20HRKBtn;
    public PreLoginPage select20HRK() {
        wait(mCash20HRKBtn);
        mCash20HRKBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic visibility off\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/amount_visibility_button']")
    public WebElement visiblityBtn;
    public PreLoginPage clickVisiblityBtn() {
        wait(visiblityBtn);
        visiblityBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement pullDownVisibility;
    public PreLoginPage closeVisiblity() {
        //swipeDown(cardOptionsPB, 500, 1.0);
        swipeMethod(171,279, 0,587);
        //clickLogo.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(accessibility = "Custom")
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Custom']")
    public WebElement CustomAmountBtn;
    public PreLoginPage clickCustomAmountBtn() {
        wait(CustomAmountBtn);
        swipeElementMethod(CustomAmountBtn, "right");
        CustomAmountBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Amount\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='"+s_mcash__lbl_insert_amount+"']")
    public WebElement CustomAmountField;
    public PreLoginPage inputCustomAmount() {
        typeIn(CustomAmountField, "300,00");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_mcash__btn_generate_code+"")
    @AndroidFindBy(xpath ="//android.widget.Button[@text='"+s_mcash__btn_generate_code+"']")
    public WebElement GenerateCodeBtn;
    public PreLoginPage clickGenerateCodeBtn() {
        wait(GenerateCodeBtn);
        GenerateCodeBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_mcash__title_mcash_code+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_mcash__title_mcash_code+"')]")
    public WebElement mCashCodeTitle;
    public PreLoginPage verifymCashCodeTitle() {
        verifyPage(mCashCodeTitle, s_mcash__title_mcash_code);

        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_mcash__btn_share_code+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_mcash__btn_share_code+"')]")
    public WebElement shareCode;
    public PreLoginPage ShareCodeMCash() {
        scrollElementIntoView(shareCode);
        shareCode.click();
        sleep();

        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+s_mcash__btn_invalidate_code+"']")
    @AndroidFindBy(xpath ="//android.widget.Button[@text='"+s_mcash__btn_invalidate_code+"']")
    public WebElement InvalidateCodeBtn;
    public PreLoginPage clickInvalidateCodeBtn() {
        InvalidateCodeBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Invalidate")
    @AndroidFindBy(xpath ="//android.widget.Button[@text='INVALIDATE']")
    public WebElement InvalidateBtn;
    public PreLoginPage clickInvalidateBtn() {
        InvalidateBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SAVE']")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement SaveMCashBtn;
    public PreLoginPage clickSaveMCashBtn() {
        wait(SaveMCashBtn);
        verifyElementText(SaveMCashBtn, "SAVE");
        SaveMCashBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "[TEST] Marketing Campaign - prelogin 003")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement MarketingN03;
    public PreLoginPage clickMarketingN03() {
        swipeElementMethod(MarketingN03, "right");
        verifyElementText(MarketingN03, "[TEST] Marketing Campaign - prelogin 003");
        MarketingN03.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "[TEST] Marketing Campaign - prelogin 001")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement MarketingN01;
    public PreLoginPage clickMarketingN01() {
        swipeElementMethod(MarketingN01, "left");
        verifyElementText(MarketingN01, "[TEST] Marketing Campaign - prelogin 001");
        MarketingN01.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ASEE Newsletter")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement MarketingN03Title;
    public PreLoginPage verifyMarketingN03Title() {
        wait(MarketingN03Title);
        verifyElementText(MarketingN03Title, "ASEE Newsletter");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_arrow_down_no_bg")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement MenuInbox;
    public PreLoginPage clickMenuInbox() {
        wait(MenuInbox);
        MenuInbox.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_message_read\"])[1]")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement InboxMsg;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Archive\"]")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement ArchiveBtn;
    public PreLoginPage ArchiveInboxMsg() {
        swipeElementMethod(InboxMsg, "left");
        wait(ArchiveBtn);
        ArchiveBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "ARCHIVE")
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc='50 RON']")
    public WebElement ArchiveMenuBtn;
    public PreLoginPage clickArchiveMenuBtn() {
        wait(ArchiveMenuBtn);
        ArchiveMenuBtn.click();
        sleep();
        return this;
    }




}


