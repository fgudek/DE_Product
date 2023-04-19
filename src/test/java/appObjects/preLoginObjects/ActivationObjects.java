package appObjects.preLoginObjects;

import appObjects.NavigationBar;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.accountSetup.ActivationService;
import testSetup.appiumSetup.DataSource;


import static appObjects.Translations.*;
//import static appObjects.Translations.a_activation__lbl_timeout;
import static appObjects.adaptiveElements.*;
//import static appObjects.adaptiveElements.ENTER_CREATE_PIN_FIELD;
import static appObjects.adaptiveElements.BACK_BUTTON;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static testSetup.accountSetup.ActivationService.codes;


public class ActivationObjects extends Base {

    public String activationCode;
    public ActivationObjects(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW_BUTTON']")
    public WebElement allowBtn;
    public ActivationObjects clickAllow(){
        if(DataSource.getPlatform().equals("iOS")) {
            try {
                allowBtn.click();
            } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException ignored) { }
        }
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow While Using App']")
    @AndroidFindBy(accessibility = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement allowWhileBtn;
    public ActivationObjects clickAllowWhile(){
        if(DataSource.getPlatform().equals("iOS")) {
            try {
                allowWhileBtn.click();
            } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException ignored) { }
        }
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"cas_popup__btn_decline\"]")
    @AndroidFindBy(accessibility = "//XCUIElementTypeButton[@name=\"cas_popup__btn_decline\"]")
    public WebElement declineCAS;
    public ActivationObjects clickCASpopup(){
        if(DataSource.getPlatform().equals("iOS")) {
            try {
                declineCAS.click();
            } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException ignored) { }
        }
        return this;
    }

    @iOSXCUITFindBy(accessibility = "I understand")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='I understand']")
    public WebElement UnderstandBtn;
    public ActivationObjects clickUnderstand(){
        if(DataSource.getPlatform().equals("iOS")) {
            try {
                UnderstandBtn.click();
            } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException ignored) { }
        }
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Logout']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Logout]")
    public WebElement LogoutDemoBtn;
    public ActivationObjects clickLogoutDemo(){
        if(DataSource.getPlatform().equals("iOS")) {
            try {
                LogoutDemoBtn.click();
            } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException ignored) { }
        }
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW_BUTTON']")
    public WebElement allowCameraBtn;
    public ActivationObjects clickCameraOk(){
        if(DataSource.getPlatform().equals("iOS")) {
            try {
                allowCameraBtn.click();
            } catch (org.openqa.selenium.NoSuchElementException | StaleElementReferenceException ignored) { }
        }
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_demo")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement Exit_demoBtn;
    public ActivationObjects clickExit_demoBtn(){
        wait(Exit_demoBtn);
        Exit_demoBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_prelogin__btn_register+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='"+c_prelogin__btn_register+"']")
    public WebElement registerBtn;
    public ActivationObjects clickRegister(){
        wait(registerBtn);
        registerBtn.click();
        sleep();
        return this;
    }


    @iOSXCUITFindBy(accessibility = "NEW USER")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_select_new_user+"']")
    public WebElement newUserBtn;
    public ActivationObjects clickNewUser() {
        wait(newUserBtn);
        newUserBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "EXISTING USER")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_select_new_user+"']")
    public WebElement existingUserBtn;
    @iOSXCUITFindBy(accessibility = "Input user ID")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_select_new_user+"']")
    public WebElement ExistingUserScreen;
    public ActivationObjects clickExistingUser() {
        wait(existingUserBtn);
        existingUserBtn.click();
        wait(ExistingUserScreen);
        verifyPage(ExistingUserScreen, "Input user ID");
        sleep();
        return this;
    }

    @HowToUseLocators (androidAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "Back")
    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Navigate up\"])[3]")
    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Navigate up\"])[2]")
    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Navigate up\"])[1]")
    @AndroidFindBy(className = ""+BACK_BUTTON+"")
    public WebElement backBtn;
    public ActivationObjects goBack() {
        wait(backBtn);
        backBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de:id/identificationCode']")
    public WebElement userField;
    public ActivationObjects enterUserID(){
        String userID = DataSource.getUserID();
        String SMAP = DataSource.getSMAP();
        activationCode = ActivationService.getInstance().getActivationCode(userID,SMAP);
        String userActivation = getUser(activationCode);

        wait(userField);
        userField.click();
        typeIn(userField, userActivation);
           //userField.click();
           //userField.sendKeys(userActivation);
        return this;
    }

    public ActivationObjects clearUserId(){
        wait(userField);
        userField.clear();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.ios.ae.AEDemo.de:id/identificationCode']")
    public WebElement userFieldInv;
    public ActivationObjects enterInvUserID(String inv_userid){
        wait(userFieldInv);
        userFieldInv.click();
        typeInProperty(userFieldInv, inv_userid);
        //userField.click();
        //userField.sendKeys(userActivation);
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.ios.ae.AEDemo.de:id/identificationCode']")
    public WebElement ACFieldInv;
    public ActivationObjects enterInvAC(String inv_ac){
        wait(ACFieldInv);
        ACFieldInv.click();
        typeInProperty(ACFieldInv, inv_ac);
        //userField.click();
        //userField.sendKeys(userActivation);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_registration__title_define_pin+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/nextButton']")
    public WebElement setYourPinPage;
    public ActivationObjects verifySetPinPage() {
        wait(setYourPinPage);
        verifyPage(setYourPinPage, "Set your PIN");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Invalid registration code.")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/nextButton']")
    public WebElement errorMsgUserID;
    public ActivationObjects verifyErrorMSsgUserID() {
        wait(errorMsgUserID);
        verifyElementText(errorMsgUserID, "Invalid registration code.");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HOW TO GET REGISTRATION CODES?\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/nextButton']")
    public WebElement HowtogetRegCodes;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How to get registration codes?\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/nextButton']")
    public WebElement HowtogetRegCodesTitle;
    public ActivationObjects clickHowtogetRegCodes() {
        wait(HowtogetRegCodes);
        HowtogetRegCodes.click();
        verifyPage(HowtogetRegCodesTitle, "How to get registration codes?");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_common__btn_next+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de:id/nextButton']")
    public WebElement nextBtn;
    public ActivationObjects clickNext() {
        wait(nextBtn);
        nextBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_common__btn_next+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='"+c_common__btn_next+"']")
    public WebElement nextUserCodeBtn;
    public ActivationObjects clickNextUserID(){
        wait(nextUserCodeBtn);
        nextUserCodeBtn.click();
        sleep();
        return this;
    }

    public ActivationObjects verifyNextDis() {
        wait(nextBtn);
        verifyEnabled(nextBtn, "off");
        sleep();
        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='hr.asseco.android.ui.demo.de:id/keyInput']")
    public WebElement smsCode;
    public ActivationObjects enterSMScode() {
        wait(smsCode);
        String userActivation = getCode(activationCode);
        nextBtn.click();
        typeIn(smsCode, userActivation);
        sleep();
        return this;
    }

    /*@iOSXCUITFindBy(accessibility = ""+i_activation__title_timeout+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+a_activation__title_timeout+"']")
    public WebElement timeoutTitle; */
    @iOSXCUITFindBy(accessibility = ""+c_registration__lbl_second_step_resend_sms_link+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_second_step_resend_sms_link+"']")
    public WebElement resendLink;
    public ActivationObjects verifyResendLink(){
        waitTimeout(resendLink);
        resendLink.click();
        //verifyMessage(timeoutMessage,"Activation process could not be completed. Please, restart the token activation.");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_registration__lbl_define_pin_rules_msg+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_define_pin_rules_msg+"']")
    public WebElement pinRulesLabel;
    public ActivationObjects verifyPINRules(){
        waitTimeout(pinRulesLabel);
        verifyElementText(pinRulesLabel, "For security reasons you should set a 4 to 8 digits long PIN number. Avoid using repeated numbers (1111) and numbers in a row (1234).");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_registration__lbl_confirm_pin_error_msg+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/nextButton']")
    public WebElement InvPINerrorMsg;
    public ActivationObjects verifyPINerrorMsg() {
        wait(InvPINerrorMsg);
        verifyElementText(InvPINerrorMsg, "PINs do not match. Please try again");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_registration__lbl_define_pin_repeated_numbers_error_msg+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_registration__lbl_define_pin_repeated_numbers_error_msg+"']")
    public WebElement ConPINErrorMsg;
    public ActivationObjects verifyPINerror(){
        waitTimeout(ConPINErrorMsg);
        verifyElementText(ConPINErrorMsg, "PIN digits cannot be repeated (1111) or in a row (1234). Please define a different PIN.");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+c_common__lbl_general_client_error+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_common__lbl_general_client_error+"']")
    public WebElement GeneralError;
    public ActivationObjects verifyACisINV(){
        waitTimeout(GeneralError);
        verifyElementText(GeneralError, "General error occurred");
        return this;
    }

    public ActivationObjects enterInvalidActivationCode(String actCode){
        wait(smsCode);
        typeIn(smsCode, actCode);
        return this;
    }

    public ActivationObjects clearActivationCode(){
        wait(smsCode);
        smsCode.clear();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic pin ok enabled")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='11']")
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
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='2']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='2']")
    public WebElement pinDigit5;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='4']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='4']")
    public WebElement pinDigit6;
    public ActivationObjects enterPIN() {
        pinDigit1.click();
        pinDigit2.click();
        pinDigit3.click();
        pinDigit4.click();
        OKbtn.click();
        sleep();

        return this;
    }
    public ActivationObjects enterShortPIN() {
        pinDigit3.click();
        pinDigit5.click();
        pinDigit1.click();
        sleep();

        return this;
    }
    public ActivationObjects confirmInvPIN() {
        pinDigit5.click();
        pinDigit2.click();
        pinDigit3.click();
        pinDigit4.click();
        sleep();

        return this;
    }
    public ActivationObjects consecutivePIN() {
        pinDigit3.click();
        pinDigit5.click();
        pinDigit1.click();
        pinDigit6.click();
        sleep();

        return this;
    }public ActivationObjects identicalPIN() {
        pinDigit5.click();
        pinDigit5.click();
        pinDigit5.click();
        pinDigit5.click();
        sleep();

        return this;
    }


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='START mBANKING']" )
    @AndroidFindBy(xpath = "//android.widget.Button[@text='START MBANKING']")
    public WebElement startMbanking;
    public ActivationObjects startMbanking() {
        wait(startMbanking);
        startMbanking.click();
        sleep();
        return this;
    }

    @HowToUseLocators (androidAutomation = ALL_POSSIBLE, iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(accessibility = "USE BIOMETRICS FOR LOGIN & PAYMENTS")
    @AndroidFindBy(xpath = "//android.widget.Switch[@text='USE BIOMETRICS FOR LOGIN & PAYMENTS']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@value='0']")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/biometric_switch']")
    public WebElement biometricsSlider;
    public ActivationObjects disableBiometrics() {
        wait(biometricsSlider);
        // agreementSwitcher(biometricsSlider, turn); pogledaj fast payment u security fileu
        biometricsSlider.click();
        return this;
    }

}
