package appObjects.morePage.settingsPage;

import appObjects.morePage.MorePage;
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

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/button_ok")
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

    //mbanking limits

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_mb_limits+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_mb_limits+"']")
    public WebElement mBankingLimitsBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__title_mobile_banking_limits+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__title_mobile_banking_limits+"']")
    public WebElement mBankingLimitsTitle;
    public Security mBankingLimits() {
        scrollElementIntoView(mBankingLimitsBtn);
        mBankingLimitsBtn.click();
        sleep();
        verifyPage(mBankingLimitsTitle, s_settings__title_mobile_banking_limits);
        return this;
    }

    //1
    @iOSXCUITFindBy(accessibility = "Max. individual transaction amount")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Max. individual transaction amount']")
    public WebElement limitsPerTrans;
    public Security limitsPerTransaction(String amount) {
        typeInProperty(limitsPerTrans, amount);
        return this;
    }
//2
    @iOSXCUITFindBy(accessibility = "Total transaction amount per day")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total transaction amount per day']")
    public WebElement limitsPerDay;
    public Security limitsPerDay(String amount) {
        typeInProperty(limitsPerDay, amount);
        return this;
    }
//3
    @iOSXCUITFindBy(accessibility = "Total number of transactions per day")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total number of transactions per day']")
    public WebElement numberofTransPerday;
    public Security numberofTransPerday(String amount) {
        typeInProperty(numberofTransPerday, amount);
        return this;
    }
//4
    @iOSXCUITFindBy(accessibility = "Total transaction amount per month")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total transaction amount per month']")
    public WebElement limitsPerMonth;
    public Security limitsPerMonth(String amount) {
        scrollElementIntoView(limitsPerMonth);
        typeInProperty(limitsPerMonth, amount);
        return this;
    }
//5
    @iOSXCUITFindBy(accessibility = "Total transaction amount per month")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Total number of transactions per month']")
    public WebElement limitsPerMonthTotal;
    public Security limitsPerMonthTotal(String amount) {
        scrollElementIntoView(limitsPerMonthTotal);
        typeInProperty(limitsPerMonthTotal, amount);
        return this;
    }


}