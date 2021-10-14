package appObjects.morePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static org.testng.Assert.assertTrue;

public class MorePage extends Base {

    public MorePage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de:id/switchView")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de:id/switchView']")
    public WebElement balanceOnPreloginBtn;
    public MorePage showBalanceOnPrelogin(String turn) {
        wait(balanceOnPreloginBtn);
        agreementSwitcher(balanceOnPreloginBtn, turn);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de:id/arrow")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/arrow']")
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
}