package appObjects.cardsPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;

public class LimitsPage extends Base {

    public LimitsPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Daily Amount\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='wallet/csLimitValue']")
    public WebElement dailyLimitAmountField;
    public LimitsPage set_amount_for_pos_limit(String amount){
        wait(dailyLimitAmountField);
        typeInProperty(dailyLimitAmountField, amount);
        sleep();
        return this;
    }
    public LimitsPage set_amount_for_online_limit(String amount){
        wait(dailyLimitAmountField);
        typeInProperty(dailyLimitAmountField, amount);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Monthly Amount\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='wallet/csLimitValue']")
    public WebElement monthlyLimitAmountField;
    public LimitsPage set_monthly_amount_pos_limit(String amount){
        wait(monthlyLimitAmountField);
        typeInProperty(monthlyLimitAmountField, amount);
        sleep();
        return this;
    }
    public LimitsPage set_monthly_amount_online_limit(String amount){
        wait(monthlyLimitAmountField);
        typeInProperty(monthlyLimitAmountField, amount);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Daily number of transactions\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='wallet/csLimitValue']")
    public WebElement dailyLimitTransactionsField;
    public LimitsPage dailyPOSTransactions(String maxPosTransactions){
        wait(dailyLimitTransactionsField);
        typeInProperty(dailyLimitTransactionsField, maxPosTransactions);
        return this;
    }
    public LimitsPage dailyONLINETransactions(String maxPosTransactions){
        wait(dailyLimitTransactionsField);
        typeInProperty(dailyLimitTransactionsField, maxPosTransactions);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Monthly number of transactions\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='wallet/csLimitValue']")
    public WebElement monthlyLimitTransactionsField;
    public LimitsPage monthlyPOSTransactions(String maxPosTransactions){
        wait(monthlyLimitTransactionsField);
        typeInProperty(monthlyLimitTransactionsField, maxPosTransactions);
        return this;
    }
    public LimitsPage monthlyONLINETransactions(String maxPosTransactions){
        wait(monthlyLimitTransactionsField);
        typeInProperty(monthlyLimitTransactionsField, maxPosTransactions);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='wallet/csLimitValue']")
    public WebElement OKConfirmLimitsBtn;
    public LimitsPage clickOKLimits(){
        wait(OKConfirmLimitsBtn);
        OKConfirmLimitsBtn.click();
        return this;
    }




}