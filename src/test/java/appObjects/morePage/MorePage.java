package appObjects.morePage;

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



    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/switchView")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement balanceOnPreloginBtn;
    public MorePage showBalanceOnPrelogin(String turn) {
        wait(balanceOnPreloginBtn);
        agreementSwitcher(balanceOnPreloginBtn, turn);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/arrow")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/arrow']")
    public WebElement mBalanceAccountsBtn;
    public MorePage displayMBalanceAccounts() {
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



    @iOSXCUITFindBy(className = "android.widget.ImageView")
    @AndroidFindBy(className = "android.widget.ImageView" )
    public WebElement logOutBtn;
    public MorePage logOut() {
        logOutBtn.click();
        sleep();
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
}