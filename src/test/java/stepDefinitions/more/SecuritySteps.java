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

    @Then("ENABLE FAST PAYMENT")
    public void EnableFastPayment() {
        security
                .EnableFastPayment();
    }

    @Then("DISABLE FAST PAYMENT")
    public void DisableFastPayment() {
        security
                .DisableFastPayment();
    }

    @Then("verify FAST PAYMENT settings change")
    public void verifyFPsettingschange() {
        security
                .verifyFPsettingschange();
    }

    @Then("enable Biometrics Btn")
    public void enableBiometricsBtn() {
        security
                .enableBiometricsBtn();
    }

    @Then("disable Biometrics Btn")
    public void disableBiometricsBtn() {
        security
                .disableBiometricsBtn();
    }

    @Then("verify biometrics change notification")
    public void biometricsChangeNoti() {
        security
                .biometricsChangeNoti();
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
                .numberofTransPermonth("TotalNumOfTransPerMonthNew");
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
                .numberofTransPermonth("TotalNumOfTransPerMonthDefault");
    }

    @Then("go to mBanking Recovery code")
    public void clickmBankingRecovery() {
        security
                .clickmBankingRecovery();
    }

    @Then("verify mBanking Recovery code screen")
    public void verifyMbankingRecoveryCodeScreen() {
        security
                .verifyMbankingRecoveryCodeScreen();
    }

    @Then("click RESET CODE")
    public void clickmResetCodeBtn() {
        security
                .clickmResetCodeBtn();
    }

    @Then("enter NEW Recovery code")
    public void enterNewRC() {
        security
                .enterNewRC();
    }

    @Then("confirm NEW Recovery code")
    public void confirmNewRC() {
        security
                .enterNewRC();
    }

    @Then("enter DEFAULT Recovery code")
    public void enterDefaultRC() {
        security
                .enterDefaultRC();
    }

    @Then("confirm DEFAULT Recovery code")
    public void confirmDefaultRC() {
        security
                .enterDefaultRC();
    }

    @Then("verify successful RC change")
    public void verifyRCsuccessMsg() {
        security
                .verifyRCsuccessMsg();
    }

    @Then("go to Select Default Balance")
    public void clickSelectDefaultBalance() {
        security
                .clickSelectDefaultBalance();
    }

    @Then("select ACTUAL BALANCE")
    public void selectActualBalance() {
        security
                .selectActualBalance();
    }

    @Then("select TOTAL AVAILABLE BALANCE")
    public void selectTotalAvailableBalance() {
        security
                .selectTotalAvailableBalance();
    }

    @Then("close Select Default Balance modal")
    public void closeSelectBalance() {
        security
                .closeSelectBalance();
    }

    @Then("go to Show or hide balance")
    public void clickShowHideBalance() {
        security
                .clickShowHideBalance();
    }

    @Then("close Show or hide balance modal")
    public void closeShowOrHideBalance() {
        security
                .closeBalanceOnHomeScreen();
    }

    @Then("click SHOW BALANCE")
    public void clickShowBalance() {
        security
                .clickShowBalance();
    }

    @Then("click HIDE BALANCE")
    public void clickHideBalance() {
        security
                .clickHideBalance();
    }

    @Then("go to About app")
    public void clickAboutApp() {
        security
                .clickAboutApp();
    }

    @Then("verify About app screen")
    public void verifyAboutApp() {
        security
                .verifyDeveloperLbl();
    }

    @Then("go to Terms and conditions")
    public void clickTermsAndConditions() {
        security
                .clickTermsAndConditions();
    }

    @Then("verify Terms and conditions screen")
    public void verifyTermsAndConditions() {
        security
                .verifyTermsAndConditions();
    }

    @Then("go to Privacy policy")
    public void clickPrivacyPolicy() {
        security
                .clickPrivacyPolicy();
    }

    @Then("verify Privacy policy screen")
    public void verifyPrivacyPolicy() {
        security
                .verifyPrivacyPolicy();
    }

    @Then("go to About device")
    public void clickAboutDevice() {
        security
                .clickAboutDevice();
    }

    @Then("verify About device screen")
    public void verifyAboutDevice() {
        security
                .verifyAboutDevice();
    }

    @Then("click DEACTIVATE APP")
    public void clickDeactivate() {
        security
                .clickDeactivate();
    }

    @Then("go to Deactivate app")
    public void clickDeactivateApp() {
        security
                .clickDeactivateApp();
    }

    @Then("verify Deactivation message")
    public void verifyDeactivateApp() {
        security
                .verifyDeactivateApp();
    }

}