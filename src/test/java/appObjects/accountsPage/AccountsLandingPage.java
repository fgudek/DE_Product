package appObjects.accountsPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static appObjects.Translations.c_prelogin__btn_shortcut_request_money;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class AccountsLandingPage extends Base {

    public AccountsLandingPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "img_product_background_1")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement accountPicker;
    public AccountsLandingPage clickAccountPicker() {
        accountPicker.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Transactions")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transactions']")
    public WebElement AccOverviewTitle;
    public AccountsLandingPage VerifyAccOverview() {
        verifyPage(AccOverviewTitle, "Accounts");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "DETAILS")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement accDetailsBtn;
    public AccountsLandingPage clickAccDetailsBtn() {
        accDetailsBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Account Details")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement accDetailsTitle;
    public AccountsLandingPage verifyAccDetailsScreen() {
        verifyPage(accDetailsTitle,"Account details");
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic details\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/details_button']")
    public WebElement accOptionsBtn;
    public AccountsLandingPage clickAccOptionsBtn() {
        accOptionsBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Accounts")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement CloseOptions;
    public AccountsLandingPage closeAccOptions() {
        CloseOptions.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SELECT ACCOUNT\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SELECT ACCOUNT']")
    public WebElement SelectAccountBtn;
    @iOSXCUITFindBy(accessibility = "Select account")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select account']")
    public WebElement SelectAccountTitle;
    public AccountsLandingPage SelectAccountsHome() {
        SelectAccountBtn.click();
        sleep();
        verifyPage(SelectAccountTitle, "Select account");
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_arrow_right")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement SelectUserOrComp;
    public AccountsLandingPage CloseSelectAcc() {
        SelectUserOrComp.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_pull_bar\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    public WebElement SelectAccountPullbar;
    public AccountsLandingPage CloseSelectAccount(){
        drag(SelectAccountPullbar,500, "down");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OVERVIEW\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"OVERVIEW\"]")
    public WebElement AccOverviewOptions;
    public AccountsLandingPage clickOverview() {
        AccOverviewOptions.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CHANGE DEFAULT ACCOUNTS\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CHANGE DEFAULT ACCOUNTS']")
    public WebElement ChangeDefAccBtn;
    public AccountsLandingPage clickChangeDefAcc() {
        ChangeDefAccBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHARE\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_accounts__lbl_action_bar_share_account_info+"']")
    public WebElement ShareAccBtn;
    public AccountsLandingPage clickShareAcc() {
        ShareAccBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_product_background_1\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement Account;
    public AccountsLandingPage expandAccount() {
        Account.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"addPaymentData\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement AddPaymentDetails;
    public AccountsLandingPage selectPaymentDet() {
        AddPaymentDetails.click();
        return this;

    }

    @iOSXCUITFindBy(accessibility = "ic_payment_new")
    @AndroidFindBy(xpath = "//android.widget.Button[@text= '"+c_prelogin__btn_shortcut_request_money+"']")
    public WebElement selectPayAccount;
    public AccountsLandingPage selectPayAccount() {
        selectPayAccount.click();
        sleep();
        return this;
    }


}