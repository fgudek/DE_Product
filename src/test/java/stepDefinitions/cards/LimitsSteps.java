package stepDefinitions.cards;

import appObjects.cardsPage.CardsPage;
import appObjects.cardsPage.LimitsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class LimitsSteps extends Base {

    private Base base;

    public LimitsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        cards = new CardsPage(d);
        limits = new LimitsPage(d);
    }

    @Then("^set (.*?) for max POS DAILY LIMIT$")
    public void set_amount_daily_limit(String turn) {
        limits
                .set_amount_for_pos_limit(turn);
    }

    @Then("^set (.*?) for max POS MONTHLY LIMIT$")
    public void set_monthly_amount_pos_limit(String turn) {
        limits
                .set_monthly_amount_pos_limit(turn);
    }

    @Then("^set (.*?) for max POS DAILY number of transactions$")
    public void dailyPOSTransactions(String transactions){
        limits
                .dailyPOSTransactions(transactions);
    }

    @Then("^set (.*?) for max POS MONTHLY number of transactions$")
    public void monthlyPOSTransactions(String transactions){
        limits
                .monthlyPOSTransactions(transactions);
    }

    @Then("click OK$")
    public void clickOKLimits(){
        limits
                .clickOKLimits();
    }

    @Then("^set (.*?) for max ONLINE DAILY LIMIT$")
    public void set_amount_for_online_limit(String turn) {
        limits
                .set_amount_for_online_limit(turn);
    }

    @Then("^set (.*?) for max ONLINE MONTHLY LIMIT$")
    public void set_monthly_amount_online_limit(String turn) {
        limits
                .set_monthly_amount_online_limit(turn);
    }

    @Then("^set (.*?) for max ONLINE DAILY number of transactions$")
    public void dailyONLINETransactions(String transactions){
        limits
                .dailyONLINETransactions(transactions);
    }

    @Then("^set (.*?) for max ONLINE MONTHLY number of transactions$")
    public void monthlyONLINETransactions(String transactions){
        limits
                .monthlyONLINETransactions(transactions);
    }
}