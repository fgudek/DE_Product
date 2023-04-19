package stepDefinitions.cards;

import appObjects.accountsPage.transactions.SearchObjects;
import appObjects.cardsPage.CardsPage;
import appObjects.NavigationBar;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class CardsSteps extends Base {

    private Base base;

    public CardsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        cards = new CardsPage(d);
        search = new SearchObjects(d);
        navigate = new NavigationBar(d);

    }

    @Then("select CARD options")
    public void selectCardOptions() {
        cards
                .selectCardOptions();
    }

    @Then("select CARD1 options")
    public void selectCardOptions1() {
        cards
                .selectCardOptions1();
    }

    @Then("select CARD3 options")
    public void selectCard3Options() {
        cards
                .selectCard3Options();
    }

    @Then("close CARD options")
    public void closeCardOptions() {
        cards
                .closeCardOptions();
    }

    @Then("select expand CARDS")
    public void expandCards() {
        cards
                .expandCards();
    }

    @Then("select expand CARDS 1")
    public void expandCards1() {
        cards
                .expandCards1();
    }

    @Then("go to DETAILS page")
    public void gotoDetails() {
        cards
                .gotoDetails();
    }

    @Then("close DETAILS page")
    public void closeDetails() {
        cards
                .closeDetails();
    }

    @Then("verify card DETAILS screen")
    public void verifyCardDetailsScreen() {
        cards
                .verifyCardDetailsScreen();
    }

    @Then("click change CARD NAME")
    public void clickCardChange() {
        cards
                .clickCardChange();
    }

    @Then("change CARD NAME into (.*?) as CARD NAME$")
    public void newCardName(String newname) {
        cards
                .newCardName(newname);
    }

    @Then("close MORE page")
    public void closeCardsMoreMenu() {
        cards
                .closeCardOptions();
    }

    @Then("go to MORE page")
    public void gotoMoreCards() {
        cards
                .gotoMoreCards();
    }

    @Then("swipe CARD left")
    public void swipeCardL() {
        cards
                .swipeCardL();
    }

    @Then("swipe CARD right")
    public void swipeCardR() {
        cards
                .swipeCardR();
    }

    @Then("select SECURITY SETTINGS")
    public void selectSecuritySettings() {
        cards
                .selectSecuritySettings();
    }

    @Then("select POS PAYMENTS")
    public void selectPOSPayments() {
        cards
                .selectPOSPayments();
    }

    @Then("turn on POS PAYMENTS")
    public void turnOnPOSPayments() {
        cards
                .turnPOSPayments();
    }

    @Then("turn off POS PAYMENTS$")
    public void turnOffPOSPayments() {
        cards
                .turnPOSPayments();
    }

    @Then("verify INFO message - POS")
    public void verifyPOSInfoMsg() {
        cards
                .verifyPOSInfoMsg();
    }

    @Then("select INTERNET PAYMENTS")
    public void selectINTERNETPayments() {
        cards
                .selectINTERNETPayments();
    }

    @Then("turn off INTERNET PAYMENTS$")
    public void turnOffINTERNETPayments() {
        cards
                .turnINTERNETPayments();
    }

    @Then("turn on INTERNET PAYMENTS$")
    public void turnOnINTERNETPayments() {
        cards
                .turnINTERNETPayments();
    }

    @Then("verify INFO message - ONLINE")
    public void verifyINTERNETInfoMsg() {
        cards
                .verifyINTERNETInfoMsg();
    }

    @Then("select REPORT LOST & STOLEN")
    public void selectLOSTOrSTOLEN() {
        cards
                .selectLOSTOrSTOLEN();
    }

    @Then("click TEMPORARILY FREEZE CARD")
    public void selectTempFREEZEBtn() {
        cards
                .selectTempFREEZEBtn();
    }

    @Then("click FREEZE")
    public void clickFREEZE() {
        cards
                .clickFREEZE();
    }

    @Then("verify card is frozen")
    public void verifyCardFrozen() {
        cards
                .verifyCardFrozen();
    }

    @Then("verify card is unfrozen")
    public void verifyCardUnfrozen() {
        cards
                .verifyCardUnfrozen();
    }

    @Then("click BLOCK & REPLACE CARD")
    public void selectBLOCKandREPLACE() {
        cards
                .selectBLOCKandREPLACE();
    }

    @Then("open SELECT BLOCKAGE REASON list")
    public void selectBlockageReasonList() {
        cards
                .selectBlockageReasonList();
    }

    @Then("select (.*?) reason$")
    public void selectBlockageReason(String reason) {
        cards
                .selectBlockageReason(reason);
    }

    @Then("enter Street number$")
    public void inputStreetNumber() {
        cards
                .inputStreetNumber();
    }

    @Then("select MCASH")
    public void selectMCASHOnCards() {
        cards
                .selectMCASHOnCards();
    }

    @Then("verify HOMEPAGE")
    public void verifyHomepage() {
        cards
                .verifyHomepage();
    }

    @Then("enter 400 amount")
    public void inputCustomAmountMCASH() {
        cards
                .inputCustomAmountMCASH();
    }

    @Then("select CHANGE PIN$")
    public void selectCHANGE_CARD_PIN() {
        cards
                .selectCHANGE_CARD_PIN();
    }

    @Then("verify Change card PIN screen$")
    public void verifyChangeCardPinScreen() {
        cards
                .verifyChangeCardPinScreen();
    }

    @Then("turn on Terms and Conditions$")
    public void turnTermsAndConditions() {
        cards
                .turnTermsAndConditions();
    }

    @Then("enter (.*?) as NEW PIN$")
    public void enterNewCardPin(String pin) {
        cards
                .enterNewCardPin(pin);
    }

    @Then("repeat (.*?) as NEW PIN$")
    public void repeatNewCardPin(String pin) {
        cards
                .repeatNewCardPin(pin);
    }

    @Then("click CHANGE CARD PIN$")
    public void clickChangeCardPin() {
        cards
                .clickChangeCardPin();
    }

    @Then("verify PIN change initiated screen$")
    public void verifyPINChangeInitiated() {
        cards
                .verifyPINChangeInitiated();
    }


    @Then("select UNFREEZE")
    public void selectUnfreeze() {
        cards
                .selectUnfreeze();
    }

    @Then("click UNFREEZE card")
    public void clickUnfreezeBtn() {
        cards
                .clickUnfreezeBtn();
    }

}