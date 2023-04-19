package appObjects.morePage;

import appObjects.morePage.settingsPage.MyProfile;
import appObjects.paymentPage.PaymentsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static org.testng.Assert.assertTrue;

public class MorePage extends Base {

    public MorePage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @iOSXCUITFindBy(accessibility = "XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement balanceOnPreloginBtn;
    public MorePage showBalanceOnPrelogin(String turn) {
        wait(balanceOnPreloginBtn);
        agreementSwitcher(balanceOnPreloginBtn, turn);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_arrow_right")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
    public WebElement mBalanceAccountsBtn;
    public MorePage displayMBalanceAccounts() {
        wait(mBalanceAccountsBtn);
        mBalanceAccountsBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'SETTINGS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SETTINGS')]")
    public WebElement settingsBtn;
    public MorePage settings() {
        scrollElementIntoView(settingsBtn);
        settingsBtn.click();
        sleep();
        return this;
    }



    @iOSXCUITFindBy(accessibility = "ic_log_off")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']" )
    public WebElement logOutBtn;
    public MorePage logOut() {
        logOutBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'DOCUMENTS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'DOCUMENTS')]")
    public WebElement documentsBtn;
    public MorePage documents() {
        wait(documentsBtn);
        documentsBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Contracts\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Contracts')]" )
    public WebElement ContractsTab;
    public MorePage clickContractsTab() {
        ContractsTab.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(className = "android.widget.ImageView")
    @AndroidFindBy(className = "android.widget.ImageView" )
    public WebElement docSettingsBtn;
    public MorePage documentSettings() {
        docSettingsBtn.click();
        return this;
    }
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/text")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/text']")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Available amount'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Available amount')]")
    public WebElement accountsBtn;
    public MorePage accountSelection() {
        accountsBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Select delivery method")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Select delivery method']")
    public WebElement deliveryMethodBtn;
    public MorePage deliveryMethod() {
        deliveryMethodBtn.click();
        sleep();
        return this;

    }

    public MorePage selectDeliveryMethod(String delivery) {
        String deliver = prop.getProperty(delivery);
        selector(deliver);
        return this;

    }
    @iOSXCUITFindBy(accessibility = "MONTHLY")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='MONTHLY']")
    public WebElement deliveryFreq1;
    @iOSXCUITFindBy(accessibility = "QUARTERLY")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='QUARTERLY']")
    public WebElement deliveryFreq2;
    @iOSXCUITFindBy(accessibility = "YEARLY")
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='YEARLY']")
    public WebElement deliveryFreq3;
    public MorePage changeDeliveryFrequency() {
        deliveryFreq1.click();
        deliveryFreq2.click();
        deliveryFreq3.click();

        return this;
    }

    @iOSXCUITFindBy(accessibility = "Success!")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Success!']")
    public WebElement successTitle;
    @iOSXCUITFindBy(accessibility = "OK")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement okBtn;
    public MorePage verifySuccessDocChange() {
        verifyPage(successTitle, "Success!");
        okBtn.click();
        return this;

    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'MTOKEN'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'MTOKEN')]")
    public WebElement mTokenPostMore;
    public MorePage mTokenPostClick() {
        mTokenPostMore.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='"+c_mtoken__title_token+"']")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+c_mtoken__title_token+"')]")
    public WebElement mTokenTitleMore;
    public MorePage verifymTokenTitleMore() {
        verifyPage(mTokenTitleMore, c_mtoken__title_token);
        sleep();
        return this;

    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'LOCATIONS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'LOCATIONS')]")
    public WebElement LocationsPostMore;
    public MorePage LocationsPostMoreClick() {
        LocationsPostMore.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'CONTACTS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'CONTACTS')]")
    public WebElement ContactsPostMore;
    public MorePage ContactsPostMoreClick() {
        ContactsPostMore.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_contacts__title_contacts+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement ContactsTitle;
    public MorePage verifyContactsPage() {
        wait(ContactsTitle);
        verifyPage(ContactsTitle, s_contacts__title_contacts);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_telephone_domestic\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement  CallUsIcon;
    public MorePage clickCallUs() {
        wait(CallUsIcon);
        CallUsIcon.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Cancel\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement  CancelCallUs;
    public MorePage exitCallUs() {
        wait(CancelCallUs);
        CancelCallUs.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_location\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement  FindUsIcon;
    public MorePage clickFindUs() {
        wait(FindUsIcon);
        FindUsIcon.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_mail\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement  EmailIcon;
    public MorePage clickEmail() {
        wait(EmailIcon);
        EmailIcon.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_faq\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement  FAQIcon;
    public MorePage clickFAQ() {
        wait(FAQIcon);
        FAQIcon.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'OTP'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'OTP')]")
    public WebElement OTPQA;
    public MorePage openOTPQA() {
        OTPQA.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'payment confirmation'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'payment confirmation')]")
    public WebElement PaymentConfQA;
    public MorePage openPaymentConfQA() {
        PaymentConfQA.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_share\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_contacts__title_contacts+"']")
    public WebElement  TellAFriendIcon;
    public MorePage clickTellAFriend() {
        wait(TellAFriendIcon);
        TellAFriendIcon.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Close']")
    public WebElement  CloseBtnNative;
    public MorePage closeTellAFriend() {
        wait(CloseBtnNative);
        CloseBtnNative.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_le_private\"]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[1]")
    public WebElement SelectUserOrCompany;
    public MorePage SelectUserOrCompanyClick() {
        SelectUserOrCompany.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_settings\"]")
    @AndroidFindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView")
    public WebElement SelectDefaultUserOrCompany;
    public MorePage SelectDefaultUserOrCompanyClick() {
        SelectDefaultUserOrCompany.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select default user or company\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select default user or company']")
    public WebElement SelectDefaultUserOrCompanyTitle;
    public MorePage verifyDefUserModal() {
        verifyPage(SelectDefaultUserOrCompanyTitle, "Select default user or company");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public WebElement SelectDefaultUserOrCompanyPullBar;
    public MorePage closeSelectDefaultUserOrCompanyPullBar() {
        drag(SelectDefaultUserOrCompanyPullBar, 500, "down");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'INBOX'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'INBOX')]")
    public WebElement InboxMore;
    public MorePage clickInboxMore() {
        InboxMore.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NEW MESSAGE\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NEW MESSAGE']")
    public WebElement NewMessageBtn;
    public MorePage clickNewMessageBtn() {
        NewMessageBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_search_hint+"")
    @AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[@text='"+s_settings__lbl_search_hint+"']")
    public WebElement searchBarSettings;
    public MorePage SearchBarSettings() {
        searchBarSettings.click();
        typeIn(searchBarSettings, "Notifications");
        sleep();
        return this;
    }
}