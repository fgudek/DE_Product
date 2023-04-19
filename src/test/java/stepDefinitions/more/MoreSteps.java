package stepDefinitions.more;

import appObjects.NavigationBar;
import appObjects.accountsPage.AccountDetailsPage;
import appObjects.accountsPage.transactions.TransactionsObjects;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.Security;
import appObjects.morePage.settingsPage.Services;
import appObjects.preLoginObjects.LoginPage;
import appObjects.preLoginObjects.PreLoginPage;
import appObjects.accountsPage.transactions.SearchObjects;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class MoreSteps extends Base {

    private Base base;

    public MoreSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        more = new MorePage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        search = new SearchObjects(d);
        preLogin = new PreLoginPage(d);
        login = new LoginPage(d);
        accountDetails = new AccountDetailsPage(d);
        transactions = new TransactionsObjects(d);
        services = new Services(d);
    }

    @Then("click Show balance on prelogin")
    public void clickShowBalanceOnPrelogin() {
        more
                .showBalanceOnPrelogin("on");
    }


    @Then("display available accounts")
    public void displayAvailableAccounts() {
        more
                .displayMBalanceAccounts();

    }


    @Then("go to SETTINGS")
    public void goToSettings() {
        more
                .settings();
    }

    @Then("go to mBalance")
    public void goToMBalance() {
        services
                .mBalance();

    }

    @Then("disable Balance on Prelogin")
    public void disableBalanceOnPrelogin() {
        more
                .showBalanceOnPrelogin("off");
    }

    @Then("go to DOCUMENTS")
    public void clickDocuments() {
        more
                .documents();
    }

    @Then("go to Contracts tab")
    public void clickContractsTab() {
        more
                .clickContractsTab();
    }

    @Then("go to documents settings")
    public void goToDocumentsSettings() {
        more
                .documentSettings();
    }

    @Then("click on account selection")
    public void clickOnAccountSelection() {
        more
                .accountSelection();
    }

    @Then("click on delivery method")
    public void clickOnDeliveryMethod() {
        more
                .deliveryMethod();
    }

    @Then("select (.*?) for delivery method$")
    public void selectForDeliveryMethod(String delivery) {
        more
                .selectDeliveryMethod(delivery);
    }

    @Then("change delivery frequency and return it to default")
    public void changeDeliveryFrequencyAndReturnItToDefault() {
        more
                .changeDeliveryFrequency();
    }

    @And("verify success message and click OK")
    public void verifySuccessMessageAndClickOK() {
        more
                .verifySuccessDocChange();
    }

    @Then("go to MTOKEN")
    public void mTokenPostClick() {
        more
                .mTokenPostClick();
    }

    @Then("verify mToken screen")
    public void verifymTokenTitleMore() {
        more
                .verifymTokenTitleMore();
    }

    @Then("go to LOCATIONS")
    public void LocationsPostMoreClick() {
        more
                .LocationsPostMoreClick();
    }

    @Then("go to CONTACTS")
    public void ContactsPostMoreClick() {
        more
                .ContactsPostMoreClick();
    }

    @Then("verify CONTACTS screen")
    public void verifyContactsPage() {
        more
                .verifyContactsPage();
    }

    @Then("click Call us")
    public void clickCallUs() {
        more
                .clickCallUs();
    }

    @Then("exit Call us modal")
    public void exitCallUs() {
        more
                .exitCallUs();
    }

    @Then("click Find us")
    public void clickFindUs() {
        more
                .clickFindUs();
    }

    @Then("click E-mail")
    public void clickEmail() {
        more
                .clickEmail();
    }

    @Then("click FAQ")
    public void clickFAQ() {
        more
                .clickFAQ();
    }

    @Then("open question about OTP")
    public void openOTPQA() {
        more
                .openOTPQA();
    }

    @Then("close OTP question")
    public void closeOTPQA() {
        more
                .openOTPQA();
    }

    @Then("open question about payment confirmation")
    public void openPaymentInformationQA() {
        more
                .openPaymentConfQA();
    }

    @Then("close question about payment confirmation")
    public void closePaymentInformationQA() {
        more
                .openPaymentConfQA();
    }

    @Then("click Tell a friend about us")
    public void clickTellAFriend() {
        more
                .clickTellAFriend();
    }

    @Then("close Tell a friend about us")
    public void closeTellAFriend() {
        more
                .closeTellAFriend();
    }

    @Then("go to Select user or company")
    public void SelectUserOrCompanyClick() {
        more
                .SelectUserOrCompanyClick();
    }

    @Then("go to Select DEFAULT user or company")
    public void SelectDefaultUserOrCompanyClick() {
        more
                .SelectDefaultUserOrCompanyClick();
    }

    @Then("verify modal for default user")
    public void verifyDefUserModal() {
        more
                .verifyDefUserModal();
    }

    @Then("close Select DEFAULT user or company modal")
    public void closeSelectDefaultUserOrCompanyPullBar() {
        more
                .closeSelectDefaultUserOrCompanyPullBar();
    }

    @Then("go to INBOX")
    public void clickInboxMore() {
        more
                .clickInboxMore();
    }

    @Then("click NEW MESSAGE")
    public void clickNewMessageBtn() {
        more
                .clickNewMessageBtn();
    }

    @Then("search for Notifications")
    public void clickSearchBarSettings() {
        more
                .SearchBarSettings();
    }
}