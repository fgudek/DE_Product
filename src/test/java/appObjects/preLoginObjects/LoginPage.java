package appObjects.preLoginObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends Base {

    public LoginPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

//LOGIN

    @iOSXCUITFindBy(accessibility = ""+s_common__biometric_auth_messsage+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_common__biometric_auth_messsage+"']")
    public WebElement biometricLoginTitle;
    @iOSXCUITFindBy(accessibility = "com.android.systemui:id/button2")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.systemui:id/button2']")
    public WebElement usePinBtn;
    public LoginPage clickUsePIN(){
        if(isElementPresent(biometricLoginTitle)){
            wait(usePinBtn);
            usePinBtn.click();
        }
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic pin ok enabled")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='hr.asseco.android.ui.demo.de.core:id/button_ok']")
    public WebElement OKbtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='3']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='3']")
    public WebElement pinDigit1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='9']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='9']")
    public WebElement pinDigit2;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='1']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
    public WebElement pinDigit3;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='0']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='0']")
    public WebElement pinDigit4;
    public LoginPage enterPIN() {
        clickUsePIN();
        pinDigit1.click();
        pinDigit2.click();
        pinDigit3.click();
        pinDigit4.click();
        OKbtn.click();

        return this;
    }


    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "OK")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    @iOSXCUITFindBy(accessibility = "android:id/button1")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    public WebElement errorBtn;
    public LoginPage loginError(){
        try{
            errorBtn.isDisplayed();
            errorBtn.click();}
        catch(NoSuchElementException | StaleElementReferenceException ignored) { }
        return this;
    }

    @iOSXCUITFindBy(accessibility = "" + s_dashboard__title_BANK_ACCOUNT + "")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_dashboard__title_BANK_ACCOUNT+"']")
    public WebElement accountsTitle;
    public LoginPage verifyLogIn(){
       // wait(accountsTitle);
        accountsTitle.isDisplayed();
        sleep();
        return this;
    }


}