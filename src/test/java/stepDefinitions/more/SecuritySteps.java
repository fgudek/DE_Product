package stepDefinitions.more;

import appObjects.morePage.OurProducts;
import appObjects.morePage.settingsPage.Security;
import appObjects.preLoginObjects.ActivationObjects;
import appObjects.preLoginObjects.LoginPage;
import io.cucumber.java.en.Then;
import appObjects.NavigationBar;
import appObjects.morePage.MorePage;
import appObjects.preLoginObjects.PreLoginPage;
import io.cucumber.java.Before;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;


public class SecuritySteps extends Base {

    private Base base;

    public SecuritySteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        more = new MorePage(d);
        preLogin = new PreLoginPage(d);
        navigate = new NavigationBar(d);
        security = new Security(d);
        activation = new ActivationObjects(d);
        login = new LoginPage(d);

    }


    @Then("enter new PIN")
    public void enterNewPIN() {
        security
                .enterNewPIN()
                .enterNewPIN();
    }


    @Then("go to use Biometrics")
    public void goToUseBiometrics() {
       security
               .useBiometrics();
    }

    @Then("go to Change PIN")
    public void goToChangePIN() {
        security
                .changePin();
    }

    @Then("LOG IN with new PIN")
    public void logINWithNewPIN() {
        preLogin
                .clickLogin();
        security
                .enterNewPIN();
        login
                .loginError()
                .verifyLogIn();
    }

    @Then("change PIN back to default")
    public void changePINBackToDefault() {
        navigate
                .gotoMore();
        more
                .settings();
        security
                .changePin()
                .enterNewPIN();
        activation
                .enterPIN()
                .enterPIN();
    }

    @Then("go to Fast payments")
    public void goToFastPayments() {
        security
                .fastPayments();
    }

    @Then("turn (.*?) Fast payments$")
    public void turnFastPayments(String turn) {
        security
                .turnFastPayment(turn);
    }


    @Then("go to mBanking limits")
    public void goToMBankingLimits() {
        security
                .mBankingLimits();
    }

    @Then("change Limits per transaction")
    public void changeLimitsPerTransaction() {
        security
                .limitsPerTransaction("LimitPerTransactionNew");
    }

    @Then("change Limits per day")
    public void changeLimitsPerDay() {
        security
                .limitsPerDay("LimitPerDayNew");
    }

    @Then("change Limits per month")
    public void changeLimitsPerMonth() {
        security
                .limitsPerMonth("LimitsPerMonthNew");
    }

    @Then("change total number of transactions per MONTH")
    public void changeTotalNumberOfTransactionsPerMONTH() {
        security
                .limitsPerMonthTotal("TotalNumOfTransPerMonthNew");
    }

    @Then("change total number of transactions per DAY")
    public void changeTotalNumberOfTransactionsPerDAY() {
        security
                .numberofTransPerday("TotalNumOfTransPerDayNew");
    }

    @Then("revert to default values")
    public void revertToDefaultValues() {
        security
                .limitsPerTransaction("LimitPerTransactiondDefault")
                .limitsPerDay("LimitPerDayDefault")
                .numberofTransPerday("TotalNumOfTransPerDayDefault")
                .limitsPerMonth("LimitsPerMonthDefault")
                .limitsPerMonthTotal("TotalNumOfTransPerMonthDefault");
    }


}