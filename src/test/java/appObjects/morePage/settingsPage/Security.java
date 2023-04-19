package appObjects.morePage.settingsPage;

import appObjects.morePage.MorePage;
import appObjects.paymentPage.PaymentsPage;
import appObjects.preLoginObjects.ActivationObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class Security extends Base {

    public Security(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // change PIN

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic pin ok enabled\"]")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='hr.asseco.android.ui.demo.de.core:id/button_ok']")
    public WebElement OKbtn;
    @iOSXCUITFindBy(accessibility = "1")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
    public WebElement pinDigit1;
    @iOSXCUITFindBy(accessibility = "4")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='4']")
    public WebElement pinDigit2;
    @iOSXCUITFindBy(accessibility = "3")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='3']")
    public WebElement pinDigit3;
    @iOSXCUITFindBy(accessibility = "7")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='7']")
    public WebElement pinDigit4;
    @iOSXCUITFindBy(accessibility = "2")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='2']")
    public WebElement pinDigit5;
    @iOSXCUITFindBy(accessibility = "5")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='5']")
    public WebElement pinDigit6;
    @iOSXCUITFindBy(accessibility = "6")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='6']")
    public WebElement pinDigit7;
    @iOSXCUITFindBy(accessibility = "8")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='8']")
    public WebElement pinDigit8;
    @iOSXCUITFindBy(accessibility = "9")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='9']")
    public WebElement pinDigit9;
    @iOSXCUITFindBy(accessibility = "0")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='0']")
    public WebElement pinDigit0;
    public Security enterNewPIN() {
        pinDigit1.click();
        pinDigit2.click();
        pinDigit3.click();
        pinDigit4.click();
        OKbtn.click();
        sleep();

        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_change_pin+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_change_pin+"']")
    public WebElement changePinBtn;
    public Security changePin() {
        scrollElementIntoView(changePinBtn);
        changePinBtn.click();
        sleep();
        // verifyPage(myPersonalBankerTitle, s_settings__title_my_profile_my_banker);
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_manage_biometrics+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_manage_biometrics+"']")
    public WebElement useBiometricsBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_biometrics_use_biometrics+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__lbl_biometrics_use_biometrics+"']")
    public WebElement useBiometricsTitle;
    public Security useBiometrics() {
        scrollElementIntoView(useBiometricsBtn);
        useBiometricsBtn.click();
        sleep();
        verifyPage(useBiometricsTitle, s_settings__lbl_biometrics_use_biometrics);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='ENABLE BIOMETRICS']" )
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ENABLE BIOMETRICS']")
    public WebElement enableBiometricsBtn;
    public Security enableBiometricsBtn() {
        wait(enableBiometricsBtn);
        enableBiometricsBtn.click();
        sleep();

        return this;
    }


    @iOSXCUITFindBy(accessibility = "Biometrics settings successfully changed!")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Biometrics settings successfully changed!']")
    public WebElement biometricsChangeNoti;
    public Security biometricsChangeNoti() {
        verifyElementText(biometricsChangeNoti,  "Biometrics settings successfully changed!");
        sleep();
        return this;

    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DISABLE BIOMETRICS']" )
    @AndroidFindBy(xpath = "//android.widget.Button[@text='DISABLE BIOMETRICS']")
    public WebElement disableBiometricsBtn;
    public Security disableBiometricsBtn() {
        wait(disableBiometricsBtn);
        disableBiometricsBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='ic_pull_bar']" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement pullBarBtn;
    public Security pullBarBtn() {
        wait(pullBarBtn);
        pullBarBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Default legal entity']" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement DefaulLE;
    public Security clicktocloseBiometrics() {
        wait(DefaulLE);
        DefaulLE.click();

        sleep();
        return this;
    }


    // fast payment

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_fast_payments+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_fast_payments+"']")
    public WebElement fastPaymentsBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_fast_payments+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_fast_payments+"']")
    public WebElement fastPaymentsTitle;
    public Security fastPayments() {
        scrollElementIntoView(fastPaymentsBtn);
        fastPaymentsBtn.click();
        verifyPage(fastPaymentsTitle, s_settings__btn_fast_payments);

        return this;
    }



    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/switchView")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement fastPaymentsturn;
    public Security turnFastPayment(String turn){
        wait(fastPaymentsturn);
        agreementSwitcher(fastPaymentsturn, turn);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ENABLE FAST PAYMENTS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_fast_payments+"']")
    public WebElement EnableFastPaymentBtn;
    public Security EnableFastPayment() {
        EnableFastPaymentBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DISABLE FAST PAYMENTS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_fast_payments+"']")
    public WebElement DisableFastPaymentBtn;
    public Security DisableFastPayment() {
        DisableFastPaymentBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Fast payments settings successfully changed!\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement FPsuccessMsg;
    public Security verifyFPsettingschange() {
        verifyMessage(FPsuccessMsg, "Fast payments settings successfully changed!");
        sleep();
        return this;
    }


    //mbanking limits

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Online Banking limits\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_mb_limits+"']")
    public WebElement OnlineBankingLimitsBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Online Banking limits\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__title_mobile_banking_limits+"']")
    public WebElement OnlineBankingLimitsTitle;
    public Security mBankingLimits() {
        scrollElementIntoView(OnlineBankingLimitsBtn);
        OnlineBankingLimitsBtn.click();
        sleep();
        verifyPage(OnlineBankingLimitsTitle, "Online Banking limits");
        return this;
    }

    //1
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Max. individual transaction amount\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Max. individual transaction amount']")
    public WebElement limitsPerTrans;
    public Security limitsPerTransaction(String amount) {
        typeInProperty(limitsPerTrans, amount);
        return this;
    }
//2
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Total transaction amount per day\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total transaction amount per day']")
    public WebElement limitsPerDay;
    public Security limitsPerDay(String amount) {
        typeInProperty(limitsPerDay, amount);
        return this;
    }
//3
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Total number of transactions per day\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total number of transactions per day']")
    public WebElement numberofTransPerday;
    public Security numberofTransPerday(String amount) {
        typeInProperty(numberofTransPerday, amount);
        return this;
    }
//4
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Total transaction amount per month\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total transaction amount per month']")
    public WebElement limitsPerMonth;
    public Security limitsPerMonth(String amount) {
        scrollElementIntoView(limitsPerMonth);
        typeInProperty(limitsPerMonth, amount);
        return this;
    }
//5
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Total number of transactions per month\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total number of transactions per month']")
    public WebElement numberofTransPermonth;
    public Security numberofTransPermonth(String amount) {
        scrollElementIntoView(numberofTransPermonth);
        typeInProperty(numberofTransPermonth, amount);
        return this;
    }

//Mbaking recovery

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"mBanking recovery code\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement mBankingRecoveryBtn;
    public Security clickmBankingRecovery() {
        wait(mBankingRecoveryBtn);
        mBankingRecoveryBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_recovery_code+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_recovery_code+"']")
    public WebElement mBankingRecoveryCodeTitle;
    public Security verifyMbankingRecoveryCodeScreen() {
        verifyPage(mBankingRecoveryCodeTitle, s_settings__btn_recovery_code);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"RESET CODE\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement ResetCodeBtn;
    public Security clickmResetCodeBtn() {
        wait(ResetCodeBtn);
        ResetCodeBtn.click();
        sleep();
        return this;
    }

    public Security enterNewRC() {
        pinDigit5.click();
        pinDigit2.click();
        pinDigit0.click();
        pinDigit7.click();
        pinDigit5.click();
        pinDigit2.click();
        pinDigit0.click();
        pinDigit7.click();
        OKbtn.click();
        sleep();

        return this;
    }

    public Security enterDefaultRC() {
        pinDigit3.click();
        pinDigit9.click();
        pinDigit1.click();
        pinDigit0.click();
        pinDigit3.click();
        pinDigit9.click();
        pinDigit1.click();
        pinDigit0.click();
        OKbtn.click();
        sleep();

        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Recovery code successfully reset\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement RCsuccessMsg;
    public Security verifyRCsuccessMsg() {
        verifyMessage(RCsuccessMsg, c_settings__lbl_reset_recovery_code_success_msg);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Select default balance\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement SelectDefaultBalanceBtn;
    public Security clickSelectDefaultBalance() {
        scrollElementIntoView(SelectDefaultBalanceBtn);
        SelectDefaultBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'ACTUAL BALANCE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement ActualBalanceBtn;
    public Security selectActualBalance() {
        ActualBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'TOTAL AVAILABLE BALANCE'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement TotalAvailableBalanceBtn;
    public Security selectTotalAvailableBalance() {
        TotalAvailableBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"App customizations\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement AppCustomizationTitle;
    public Security closeSelectBalance() {
        AppCustomizationTitle.click();
        sleep();
        return this;
    }
    public Security closeBalanceOnHomeScreen() {
        fastPaymentsBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Show or hide balance\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement ShowHideBalanceBtn;
    public Security clickShowHideBalance() {
        scrollElementIntoView(ShowHideBalanceBtn);
        ShowHideBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"SHOW BALANCE\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement ShowBalanceBtn;
    public Security clickShowBalance() {
        ShowBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"HIDE BALANCE\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement HideBalanceBtn;
    public Security clickHideBalance() {
        HideBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"About app\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement AboutAppBtn;
    public Security clickAboutApp() {
        scrollElementIntoView(AboutAppBtn);
        AboutAppBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UPDATE APPLICATION\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement UpdateAppBtn;
    public Security verifyDeveloperLbl() {
        verifyElementText(UpdateAppBtn, "UPDATE APPLICATION");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Terms and conditions\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement TermsAndConBtn;
    public Security clickTermsAndConditions() {
        //scrollElementIntoView(AboutAppBtn);
        TermsAndConBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility =""+s_settings__title_terms_and_conditions+"" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement TermsAndConLbl;
    public Security verifyTermsAndConditions() {
        verifyPage(TermsAndConLbl, s_settings__title_terms_and_conditions);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Privacy policy\"]" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement PrivacyPolicyBtn;
    public Security clickPrivacyPolicy() {
        //scrollElementIntoView(AboutAppBtn);
        PrivacyPolicyBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility =""+s_settings__btn_privacy_policy+"" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement PrivacyPolicyLbl;
    public Security verifyPrivacyPolicy() {
        verifyPage(PrivacyPolicyLbl, s_settings__btn_privacy_policy);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"About device\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement AboutDeviceBtn;
    public Security clickAboutDevice() {
        scrollElementIntoView(AboutDeviceBtn);
        wait(AboutDeviceBtn);
        AboutDeviceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility =""+s_settings__btn_about_device+"" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement AboutDeviceLbl;
    public Security verifyAboutDevice() {
        verifyPage(AboutDeviceLbl, s_settings__btn_about_device);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"DEACTIVATE APP\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement DeactivateBtn;
    public Security clickDeactivate() {
        //scrollElementIntoView(AboutAppBtn);
        DeactivateBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Deactivate app\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement DeactivateAppBtn;
    public Security clickDeactivateApp() {
        //scrollElementIntoView(AboutAppBtn);
        DeactivateAppBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility =""+s_settings__lbl_notifications_dialog_description+"" )
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement DeacticateMsg;
    public Security verifyDeactivateApp() {
        verifyMessage(DeacticateMsg, s_settings__lbl_notifications_dialog_description);
        sleep();
        return this;
    }



}