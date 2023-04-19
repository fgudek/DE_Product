package stepDefinitions.accounts;

import appObjects.accountsPage.AccountsLandingPage;
import appObjects.NavigationBar;
import appObjects.morePage.settingsPage.MyProfile;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class AccountsSteps extends Base {

    private Base base;

    public AccountsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        accounts = new AccountsLandingPage(d);
        navigate = new NavigationBar(d);
        profile = new MyProfile(d);
    }

    @Then("^click on CURRENT ACCOUNT$")
    public void clickAccountPicker(){
        accounts
                .clickAccountPicker();

    }

    @Then("^verify Accounts overview$")
    public void VerifyAccOverview(){
        accounts
                .VerifyAccOverview();

    }

    @Then("^click AccDetails$")
    public void clickAccDetailsBtn(){
        accounts
                .clickAccDetailsBtn();

    }

    @Then("^verify AccDetails$")
    public void verifyAccDetailsScreen(){
        accounts
                .verifyAccDetailsScreen();

    }

    @Then("^select ACCOUNTS options page$")
    public void clickAccOptionsBtn(){
        accounts
                .clickAccOptionsBtn();

    }

    @Then("^close ACCOUNTS options page$")
    public void closeAccOptions(){
        accounts
                .closeAccOptions();

    }

    @Then("^click on SELECT ACCOUNT$")
    public void SelectAccountsHome(){
        accounts
                .SelectAccountsHome();

    }

    @Then("^close SELECT ACCOUNT$")
    public void CloseSelectAccount(){
        accounts
                .CloseSelectAccount();

    }

    @Then("^go to OVERVIEW$")
    public void clickOverview(){
        accounts
                .clickOverview();

    }

    @Then("^go to CHANGE DEFAULT ACCOUNT$")
    public void clickChangeDefAcc(){
        accounts
                .clickChangeDefAcc();

    }

    @Then("^go to SHARE$")
    public void clickShareAcc(){
        accounts
                .clickShareAcc();

    }

    @Then("^select expand ACCOUNT$")
    public void expandAccount(){
        accounts
                .expandAccount();

    }

    @Then("^select Payment details$")
    public void selectPaymentDet(){
        accounts
                .selectPaymentDet();
    }

    @Then("^select PAY account$")
    public void selectPayAccount(){
        accounts
                .selectPayAccount();
    }

}