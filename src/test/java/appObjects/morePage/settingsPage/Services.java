package appObjects.morePage.settingsPage;


import appObjects.morePage.MorePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;

public class Services extends Base {

    public Services(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings_fast_balance__title_fast_balance+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings_fast_balance__title_fast_balance+"']")
    public WebElement mBalanceBtn;
    public Services mBalance() {
        scrollElementIntoView(mBalanceBtn);
        mBalanceBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_notifications+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_notifications+"']")
    public WebElement notificationsBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__title_notifications+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__title_notifications+"']")
    public WebElement notificationsTitle;
    public Services notifications() {
        scrollElementIntoView(notificationsBtn);
        notificationsBtn.click();
        verifyPage(notificationsTitle, s_settings__title_notifications);

        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_ACCOUNT_INCOMING_NOTIFICATIONS+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_ACCOUNT_INCOMING_NOTIFICATIONS+"')]")
    public WebElement incomingTransactionsSwitch;
    public Services incomingTransactionsSwitch(String turn) {
        wait(incomingTransactionsSwitch);
        agreementSwitcher(incomingTransactionsSwitch, turn);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_ACCOUNT_OUTGOING_NOTIFICATIONS+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_ACCOUNT_OUTGOING_NOTIFICATIONS+"')]")
    public WebElement outgoingTransactionsSwitch;
    public Services outgoingTransactionsswitch(String turn) {
        wait(outgoingTransactionsSwitch);
        agreementSwitcher(outgoingTransactionsSwitch, turn);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_PAYMENTS_NOTIFICATIONS+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_PAYMENTS_NOTIFICATIONS+"')]")
    public WebElement paymentsNotificationsSwitch;
    public Services paymentsNotifications(String turn) {
        wait(paymentsNotificationsSwitch);
        agreementSwitcher(paymentsNotificationsSwitch, turn);
        return this;

    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_CARDS_NOTIFICATIONS+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_CARDS_NOTIFICATIONS+"')]")
    public WebElement creditCardBillReminderSwitch;
    public Services creditCardBillReminder(String turn) {
        scrollElementIntoView(creditCardBillReminderSwitch);
       // wait(creditCardBillReminderSwitch);
        agreementSwitcher(creditCardBillReminderSwitch, turn);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_SAVINGS_INTERESTS_NOTIFICATIONS+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_SAVINGS_INTERESTS_NOTIFICATIONS+"')]")
    public WebElement incomingInterestsSwitch;
    public Services incomingInterests(String turn) {
        scroll("down");
        scrollElementIntoView(incomingInterestsSwitch);
      //  wait(incomingInterestsSwitch);
        agreementSwitcher(incomingInterestsSwitch, turn);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_SAVINGS_MATURITY_DATE_NOTIFICATIONS+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_SAVINGS_MATURITY_DATE_NOTIFICATIONS+"')]")
    public WebElement upcomingMaturityDateSwitch;
    public Services upcomingMaturityDate(String turn) {
        scroll("down");
        scrollElementIntoView(upcomingMaturityDateSwitch);
      //  wait(upcomingMaturityDateSwitch);
        agreementSwitcher(upcomingMaturityDateSwitch, turn);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '"+s_settings__lbl_notifications_LOAN_UPCOMING_INSTALLMENT+"'")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@text, '"+s_settings__lbl_notifications_LOAN_UPCOMING_INSTALLMENT+"')]")
    public WebElement upcomingLoanInstallmentSwitch;
    public Services upcomingLoanInstallment(String turn) {
        scroll("down");
        scrollElementIntoView(upcomingLoanInstallmentSwitch);
       // wait(upcomingLoanInstallmentSwitch);
        agreementSwitcher(upcomingLoanInstallmentSwitch, turn);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Notify me about these accounts'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Notify me about these accounts')]")
    public WebElement accSelectBtn;
    public Services AccSelect() {
        accSelectBtn.click();
        sleep();
        accBtn1.click();
        accBtn2.click();
        accBtn3.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "CURRENT ACCOUNT (HRK)")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CURRENT ACCOUNT (HRK)']")
    public WebElement accBtn1;
    @iOSXCUITFindBy(accessibility = "GIRO ACCOUNT (EUR)")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GIRO ACCOUNT (EUR)']")
    public WebElement accBtn2;
    @iOSXCUITFindBy(accessibility = "BLOCKED BANK ACCOUNT (HRK)")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='BLOCKED BANK ACCOUNT (HRK)']")
    public WebElement accBtn3;



}