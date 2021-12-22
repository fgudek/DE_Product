package appObjects.preLoginObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.accountSetup.ActivationService;
import testSetup.appiumSetup.DataSource;


import static appObjects.Translations.*;
import static appObjects.adaptiveElements.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static testSetup.accountSetup.ActivationService.codes;


public class ActivationObjects extends Base {

    public String activationCode;
    public ActivationObjects(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/m_banking_button")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement registerBtn;
    public ActivationObjects clickRegister(){
        wait(registerBtn);
        registerBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+c_registration__lbl_select_new_user+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_select_new_user+"']")
    public WebElement newUserBtn;
    public ActivationObjects clickNewUser() {
        wait(newUserBtn);
        newUserBtn.click();
        sleep();
        return this;
    }
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "Navigate up")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc='Navigate up'])[2]")
    public WebElement backBtn;
    public ActivationObjects goBack() {
        wait(backBtn);
        backBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/identificationCode")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de.core:id/identificationCode']")
    public WebElement userField;
    public ActivationObjects enterUserID(){
        String userID = DataSource.getUserID();
        String smap = DataSource.getSMAP();
        activationCode = ActivationService.getInstance().getActivationCode(userID,smap);
        String userActivation = getUser(activationCode);

        wait(userField);
        userField.click();
        typeIn(userField, userActivation);
        //  userField.click();
        //  userField.sendKeys(userActivation);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/keyInput")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/nextButton']")
    public WebElement nextBtn;
    public ActivationObjects clickNext() {
        wait(nextBtn);
        nextBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/keyInput")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de.core:id/keyInput']")
    public WebElement smsCode;
    public ActivationObjects enterSMScode() {
        wait(smsCode);
        String userActivation = getCode(activationCode);
        nextBtn.click();
        typeIn(smsCode, userActivation);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/button_ok")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='hr.asseco.android.ui.demo.de.core:id/button_ok']")
    public WebElement OKbtn;
    @iOSXCUITFindBy(accessibility = "1")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
    public WebElement pinDigit1;
    @iOSXCUITFindBy(accessibility = "1")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='3']")
    public WebElement pinDigit2;
    @iOSXCUITFindBy(accessibility = "1")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='6']")
    public WebElement pinDigit3;
    @iOSXCUITFindBy(accessibility = "1")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='8']")
    public WebElement pinDigit4;
    public ActivationObjects enterPIN() {
        pinDigit1.click();
        pinDigit2.click();
        pinDigit3.click();
        pinDigit4.click();
        OKbtn.click();
        sleep();

        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/start_button")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/start_button']")
    public WebElement startMbanking;
    public ActivationObjects startMbanking() {
        wait(startMbanking);
        startMbanking.click();
        sleep();
        return this;
    }

    @HowToUseLocators (androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/switchView")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/biometric_switch")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/biometric_switch']")
    public WebElement biometricsSlider;
    public ActivationObjects disableBiometrics() {
        wait(biometricsSlider);
       // switcher(biometricsSlider, turn);
        biometricsSlider.click();
        return this;
    }

}
