package stepDefinitions.prelogin;

import appObjects.NavigationBar;
import appObjects.morePage.MorePage;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.preLoginObjects.ActivationObjects;
import appObjects.preLoginObjects.LoginPage;
import appObjects.preLoginObjects.PreLoginPage;
import appObjects.morePage.settingsPage.Security;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class PreLoginSteps extends Base {

    private Base base;

    public PreLoginSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        preLogin = new PreLoginPage(d);
        more = new MorePage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        login = new LoginPage(d);
        payment = new PaymentsPage(d);
        activation = new ActivationObjects(d);
        review = new ReviewPage(d);
    }


    @Then("^click on language select$")
    public void click_on_language_select(){
        preLogin
                .clickLanguageSelect();

    }

    @Given("preActivated App is open")
    public void activatedAppIsOpen() {
        preLogin
                .verifyActivatedLandingPage();
    }

    @Given("reg user landing page is open")
    public void regUserLandingPageIsOpen() {
        preLogin
                .verifyRegUserLandingPage();
    }

    @Then("change to domestic language")
    public void changeToDomesticLanguage() {
        preLogin
                .changeLangToHR();
    }

    @Then("verify language change")
    public void verifyLanguageChange() {
        preLogin
                .verifyLangChange();
    }

    @Then("verify EN language")
    public void verifyEN() {
        preLogin
                .verifyEN();
    }

    @Then("change language back to EN")
    public void changeLanguageBackToEN() {
        preLogin
                .changeLangToEN();
    }

    @Then("click on Locations")
    public void clickOnLocations() {
        preLogin
                .locations();
    }

    @Then("click on INBOX")
    public void clickOnINBOX() {
        preLogin
                .inbox();
    }

    @Then("click Products")
    public void clickProducts() {
        preLogin
                .products();
    }

    @Then("click Demo")
    public void clickDemo() {
        preLogin
                .Demo();
    }


    @Then("click Exchange List")
    public void clickExchangeList() {
        preLogin
                .exchangeList();
    }

    @Then("click Contacts")
    public void clickContacts() {
        preLogin
                .contacts();
    }

    @Then("find Branches and ATMs")
    public void findBranchesAndATMs() {
        preLogin
                .branchesAndATMs();
    }

    @Then("click More")
    public void clickMore() {
        navigate
                .gotoMore();
    }


    @Then("click LOG IN")
    public void clickLOGIN() {
        preLogin
                .clickLogin();
    }

    @Then("click USE PIN")
    public void clickUSEPIN() {
        preLogin
                .clickUsePin();
    }

    @Then("verify log in successful")
    public void verifyLogInSuccessful() {
        login
                .loginError()
                .verifyLogIn();
    }

    @Then("LOG OUT")
    public void logOUT() {
       more
               .logOut();
    }

    @Given("verify PRELOGIN screen")
    public void vreifyPreloginScrenn() {
        preLogin
                .verifyRegUserLandingPage();
    }

    @Then("click pullBarBtn")
    public void pullBarBtn() {
        security
                .pullBarBtn();
    }

    @Then("close use Biometrics")
    public void clicktocloseBiometrics() {
        security
                .clicktocloseBiometrics();
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        preLogin
                .clickLogin();

        activation
                .enterPIN();
        login
                .loginError()
                .verifyLogIn();

    }

    @Then("edit Exchange List$")
    public void editExchangeList() {
        preLogin
                .clickEditCur()
                .selectCurencies("CHF")
                .selectCurencies("EUR")
                .selectCurencies("GBP")
                .selectCurencies("USD")
                .selectCurencies("GBP")
                .selectCurencies("USD")
                .clickDoneCur();
    }

    @Then("verify Exchange list change$")
    public void verifyExchangeListChange() {
       review
               .verifyCurrencyChange("EUR")
               .verifyCurrencyChange("CHF");
        
    }

    @Then("undo Exchange List change$")
    public void undoExchangeListChange() {

        preLogin
                .clickEditCur()
                .selectCurencies("CHF")
                .selectCurencies("EUR")
                .clickDoneCur();

    }

    @Then("click on mToken")
    public void clickOnMToken() {
        preLogin
                .mToken();

    }

    @Then("generate OTP")
    public void generateOTP() {
        preLogin
                .generateOTP();
    }

    @Then("go to MDS and enter data")
    public void goToMDSAndEnterData() {
        preLogin
                .inputMDSdata();
    }

    /*@Then("enter MDSAmount")
    public void inputMDSamount() {
        preLogin
                .inputMDSamount();
    }
*/
    @Then("click close")
    public void CloseKeyBtn() {
        preLogin
                .CloseKeyBtn();
    }

    @Then("generate MDS")
    public void generateMDS() {
        preLogin
                .generateMDS();
    }

    @Then("click mBalance")
    public void clickMBalance() {
        preLogin
                .mBalance();
    }

    @Then("select show balance switcher")
    public void selectShowBalance() {
        preLogin
                .selectShowBalance("on");

    }

    @Then("deselect show balance switcher")
    public void deselectShowBalance() {
        preLogin
                .selectShowBalance("off");

    }

    @Then("enter 300 amount")
    public void inputCustomAmount() {
        preLogin
                .inputCustomAmount();
    }

    @Then("verify prelogin mBalance")
    public void verifyPreloginMBalance() {
        preLogin
                .mBalance();

    }

    @Then("click Save mCash")
    public void clickSaveMCashBtn() {
        preLogin
                .clickSaveMCashBtn();
    }

    @Then("click mCash")
    public void clickMCash() {
        preLogin
                .mCash();
    }

    @Then("click visibility of amount")
    public void clickVisiblityBtn() {
        preLogin
                .clickVisiblityBtn();
    }

    @Then("close visibility screen")
    public void closeVisiblity() {
        preLogin
                .closeVisiblity();
    }

    @Then("select custom to withdrawal")
    public void clickCustomAmountBtn() {
        preLogin
                .clickCustomAmountBtn();
    }

    @Then("swipe and click on Marketing-03")
    public void clickMarketingN03() {
        preLogin
                .clickMarketingN03();
    }

    @Then("swipe and click on Marketing-01")
    public void clickMarketingN01() {
        preLogin
                .clickMarketingN01();
    }

    @Then("verify mCash screen")
    public void verifymCashScreen() {
        preLogin
                .verifymCashScreen();
    }

    @Then("verify Marketing-03 screen")
    public void verifyMarketingN03Title() {
        preLogin
                .verifyMarketingN03Title();
    }


    @Then("verify Inbox")
    public void verifyInbox() {
        preLogin
                .verifyInbox();
    }

    @Then("go to inbox notifications")
    public void goToInboxNotifications() {
        preLogin
                .inboxNotifications();
    }

    @Then("archive message")
    public void ArchiveInboxMsg() {
        preLogin
                .ArchiveInboxMsg();
    }

    @Then("select Archive")
    public void clickArchiveMenuBtn() {
        preLogin
                .clickArchiveMenuBtn();
    }

    @Then("click menu Inbox")
    public void clickMenuInbox() {
        preLogin
                .clickMenuInbox();
    }

    @And("click on received notification and verify it")
    public void clickOnReceivedNotificationAndVerifyIt() {
        preLogin
                .receivedNotification();
    }

    @Then("go to inbox messages")
    public void goToInboxMessages() {
        preLogin
                .inboxMessages();
    }

    @And("click on received message and verify it")
    public void clickOnReceivedMessageAndVerifyIt() {
        preLogin
                .receivedMessage();
    }

    @Then("select 20 to withdraw")
    public void select20HRK() {
        preLogin
                .select20HRK();
    }

    @Then("click Generate code")
    public void clickGenerateCodeBtn() {
        preLogin
                .clickGenerateCodeBtn();
    }

    @Then("verify mCash code screen")
    public void verifymCashCodeTitle() {
        preLogin
                .verifymCashCodeTitle();
    }

    @Then("click share code")
    public void ShareCodeMCash() {
        preLogin
                .ShareCodeMCash();
    }

    @Then("click Invalidate code")
    public void clickInvalidateCodeBtn() {
        preLogin
                .clickInvalidateCodeBtn();
    }

    @Then("click Invalidate")
    public void clickInvalidateBtn() {
        preLogin
                .clickInvalidateBtn();
    }


}
