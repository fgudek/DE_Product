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

    @Then("^go BACK")
    public void go_BACK(){
        activation
                .goBack();

    }


    @Then("enter 8 digit code")
    public void enter_8_Digit_Code() {
        activation
                .enterUserID();
    }

    @Then("click NEXT")
    public void click_NEXT() {
        activation
                .clickNext();
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

    @Then("click START MBANKING")
    public void clickSTARTMBANKING() {
        activation
                .startMbanking();

    }

    @Then("disable login with biometrics")
    public void disableLoginWithBiometrics() {
        activation
                .disableBiometrics();
    }


}
