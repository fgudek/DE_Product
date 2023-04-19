package stepDefinitions.prelogin;

import appObjects.NavigationBar;
import appObjects.preLoginObjects.ActivationObjects;
import appObjects.preLoginObjects.PreLoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class ActivationSteps extends Base {
    private Base base;
    public ActivationSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        preLogin = new PreLoginPage(d);
        activation = new ActivationObjects(d);
        navigate = new NavigationBar(d);
    }

//mBANKING ACTIVATION

    @Then("^click Allow$")
    public void click_Allow(){
        activation
                .clickAllow();

    }

    @Then("^click AllowWhile$")
    public void click_AllowWhile(){
        activation
                .clickAllowWhile();

    }

    @Then("^click Decline CAS pop up$")
    public void click_Decline_CAS(){
        activation
                .clickCASpopup();

    }

    @Then("^click AllowCameraBtn$")
    public void click_AllowCameraBtn(){
        activation
                .clickCameraOk();

    }

    @Then("^click LogOutDemo$")
    public void clickLogOutDemo() {
        activation
                .clickLogoutDemo();
    }

    @Then("click Exit_demoBtn")
    public void clickExit_demoBtn() {
        activation
                .clickExit_demoBtn();
    }

    @Then("^click Understand$")
    public void clickUnderstand(){
        activation
                .clickUnderstand();

    }

    @Then("^proceed to ACTIVATION CODE screen$")
    public void clickNextUserID(){
        activation
                .clickNextUserID();

    }

    @Then("^click REGISTER$")
    public void click_REGISTER(){
        activation
                .clickRegister();

    }

    @Then("^click NEW USER")
    public void click_NEW_USER(){
        activation
                .clickNewUser();

    }

    @Then("^click Existing User and verify screen")
    public void clickExistingUser(){
        activation
                .clickExistingUser();

    }

    @Then("^enter (.*?) as USERID$")
    public void create_PIN(String inv_userid){
        activation
                .enterInvUserID(inv_userid);
    }

    @Then("^enter (.*?) as ACTIVATION CODE$")
    public void enterInvAC(){
        activation
                .enterInvAC("INVALID_ACTIVATION_CODE");
    }

    @Then("^clear USERID field$")
    public void clearUserId(){
        activation
                .clearUserId();
    }

    @Then("^verify mandatory field error message$")
    public void verifyErrorMSsgUserID(){
        activation
                .verifyErrorMSsgUserID();
    }

    @Then("^verify Set your PIN screen$")
    public void verifySetPinPage(){
        activation
                .verifySetPinPage();
    }

    @Then("^go BACK")
    public void goBack(){
        activation
                .goBack();

    }


    @Then("enter 8 digit code")
    public void enterUserID() {
        activation
                .enterUserID();
    }

    @Then("click NEXT")
    public void click_NEXT() {
        activation
                .clickNext();
    }

    @Then("verify button NEXT is disabled")
    public void verifyNextDis() {
        activation
                .verifyNextDis();
    }

    @Then("wait for timeout and click resend link")
    public void verifyResendLink() {
        activation
                .verifyResendLink();
    }

    @Then("verify PIN rules")
    public void verifyPINRules() {
        activation
                .verifyPINRules();
    }

    @Then("create invalid PIN")
    public void createInvPIN() {
        activation
                .enterPIN();
    }

    @Then("create consecutive digit PIN")
    public void consecutivePIN() {
        activation
                .consecutivePIN();
    }

    @Then("create identical digits PIN")
    public void identicalPIN() {
        activation
                .identicalPIN();
    }

    @Then("confirm invalid PIN")
    public void confirmInvPIN() {
        activation
                .confirmInvPIN();
    }

    @Then("verify not matching PIN error message")
    public void verifyPINerrorMsg() {
        activation
                .verifyPINerrorMsg();
    }

    @Then("verify consecutive digits PIN error message")
    public void verifyPINerror() {
        activation
                .verifyPINerror();
    }

    @Then("verify identical digits PIN error message")
    public void verifyPINerrorIdentical() {
        activation
                .verifyPINerror();
    }

    @Then("verify ACTIVATION CODE is invalid")
    public void verifyACisINV() {
        activation
                .verifyACisINV();
    }

    @Then("enter short ACTIVATION CODE")
    public void enterInvalidActivationCode() {
        activation
                .enterInvalidActivationCode("2345");
    }

    @Then("clear ACTIVATION CODE")
    public void clearActivationCode() {
        activation
                .clearActivationCode();
    }

    @Then("help pop up and verify screen")
    public void clickHowtogetRegCodes() {
        activation
                .clickHowtogetRegCodes();
    }

    @Then("enter one-time SMS code")
    public void enterOneTimeSMSCode() {
        activation
                .enterSMScode();
    }


    @Then("enter PIN")
    public void enterPIN() {
        activation
                .enterPIN();
    }

    @Then("repeat PIN")
    public void repeatPIN() {
        activation
                .enterPIN();
    }

    @Then("create short PIN")
    public void enterShortPIN() {
        activation
                .enterShortPIN();
    }

    @Then("click START MBANKING")
    public void clickSTARTMBANKING() {
        activation
                .startMbanking();

    }

    @Then("enable login with biometrics")
    public void enableLoginWithBiometrics() {
        activation
                .disableBiometrics();
    }
    @Then("disable login with biometrics")
    public void disableLoginWithBiometrics() {
        activation
                .disableBiometrics();
    }


}
