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

    @Given("activated app is open")
    public void activatedAppIsOpen() {
        preLogin
                .verifyActivatedLandingPage();
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

    @Then("edit Exchange List")
    public void editExchangeList() {
        navigate
                .clickButton();
        preLogin
                .selectCurencies("CHF")
                .selectCurencies("EUR");
        navigate
                .clickButton();

        
    }

    @Then("verify Exchange list change")
    public void verifyExchangeListChange() {
       review
               .verifyCurrencyChange("CHF")
               .verifyCurrencyChange("EUR");
        
    }

    @Then("undo Exchange List change")
    public void undoExchangeListChange() {
        navigate
                .clickButton();
        preLogin
                .selectCurencies("CHF")
                .selectCurencies("EUR");
        navigate
                .clickButton();

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


    @Then("verify prelogin mBalance")
    public void verifyPreloginMBalance() {
        preLogin
                .mBalance();

    }

    @Then("click X")
    public void clickX() {
        preLogin
                .clickX();
    }

    @Then("click mCash")
    public void clickMCash() {
        preLogin
                .mCash();
    }
}