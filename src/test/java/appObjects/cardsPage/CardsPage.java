package appObjects.cardsPage;

import appObjects.morePage.settingsPage.MyProfile;
import appObjects.preLoginObjects.PreLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import static appObjects.Translations.*;
import static appObjects.Translations.s_payments__title_request_or_share_request_money;

public class CardsPage extends Base {

    public CardsPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public CardsPage selectBlockageReason(String blockage) {
        String reason = prop.getProperty(blockage);
        if(DataSource.getPlatform().equals("Android")){
            selector(reason);
        }else{
            stringToElementByText(reason).click();
            //stringToElementByText(acc).click();
        }

        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Street number*\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='"+s_mcash__lbl_insert_amount+"']")
    public WebElement StreetNameField;
    public CardsPage inputStreetNumber() {
        typeIn(StreetNameField, "10");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_product_background_2\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='hr.asseco.android.ui.demo.de:id/page_container']")
    public WebElement card;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_product_background_2\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement card1;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Available amount'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Available amount')]")
    public WebElement cardsTitle;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_card_background_2\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Available amount')]")
    public WebElement cardsOverview;


    public CardsPage swipeCardLeft(){

        swipeLeft(cardsOverview, 2000, 1.0);
        sleep();
        return this;
    }

    public CardsPage swipeTo(String svajp) {
        String crd = prop.getProperty(svajp);
       // WebElement el1 = stringToElementById("hr.asseco.android.ui.demo.de.core:id/page_container");
        swipeToElementByDescription3("left", crd,5);
        sleep();
       // cardsTitle.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic details\"])[3]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/details_button']")
    public WebElement cardOptions;
    public CardsPage selectCardOptions(){
        scrollElementIntoView(card);
        wait(cardOptions);
        cardOptions.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic details\"])[4]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/details_button']")
    public WebElement cardOptions1;
    public CardsPage selectCardOptions1(){
//        scrollElementIntoView(card);
        wait(cardOptions1);
        cardOptions1.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic details\"])[5]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement card3Options;
    public CardsPage selectCard3Options(){
        scrollElementIntoView(card);
        wait(card3Options);
        card3Options.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='ic_pull_bar']")
    @AndroidFindBy(className = "android.widget.ImageView")
    public WebElement cardOptionsPB;
    @iOSXCUITFindBy(accessibility = "ic_bank_logo_dashboard")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement clickLogo;
    public CardsPage closeCardOptions(){
        drag(cardOptionsPB, 500,"down");
        sleep();
        return this;
    }
    public CardsPage expandCards(){
        //swipeDown(cardOptionsPB, 500, 1.0);
        wait(card);
        card.click();
        sleep();
        return this;
    }

    public CardsPage expandCards1(){
        //swipeDown(cardOptionsPB, 500, 1.0);
        wait(card1);
        card1.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "DETAILS")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DETAILS']")
    public WebElement cardDetails;
    public CardsPage gotoDetails(){
        cardDetails.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card Details\"]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement cardDetailsTitle;
    public CardsPage verifyCardDetailsScreen(){
        verifyPage(cardDetailsTitle, "Card Details");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_edit\"]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement changeCardNameBtn;
    public CardsPage clickCardChange(){
        changeCardNameBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Card name\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement cardNameField;
    public CardsPage newCardName(String newname){
        typeInProperty(cardNameField, newname);
        sleep();
        return this;
    }

    public CardsPage closeCardsMoreMenu(){
        //swipeDown(cardOptionsPB, 500, 1.0);
        swipeMethod(171,267, 0,603);
        //clickLogo.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "MORE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MORE']")
    public WebElement cardMore;
    public CardsPage gotoMoreCards(){
        cardMore.click();
        sleep();
        return this;
    }

    public CardsPage swipeCardL() {
        scrollElementIntoView(card);
        swipeLeft(card, 2000, 1.0);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"img_card_background_2\"])[2]")
    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Navigate up\"])[3]")
    public WebElement CardOverview1;
    public CardsPage swipeCardR() {
//        scrollElementIntoView(card1);
        swipeRight(CardOverview1, 2000, 1.0);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Back")
    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Navigate up\"])[3]")
    public WebElement backBtnDetails;
    public CardsPage closeDetails() {
        wait(backBtnDetails);
        backBtnDetails.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SECURITY SETTINGS\"]")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement SecuritySettings;
    public CardsPage selectSecuritySettings(){
        SecuritySettings.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'POS PAYMENTS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement POSPayments;
    public CardsPage selectPOSPayments(){
        POSPayments.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"card/limitSwitch\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement turnPOSPayments;
    public CardsPage turnPOSPayments(){
        wait(turnPOSPayments);
        turnPOSPayments.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_cards_settings_limit_msg_disabled_POS+"")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement POSPaymentsInfoMSg;
    public CardsPage verifyPOSInfoMsg(){
        wait(POSPaymentsInfoMSg);
        verifyMessage(POSPaymentsInfoMSg, "You will not be able to make any purchases in stores until you enable POS payments again!\nIf you misplaced your card, you can use the FREEZE option instead.\n\nIf your card has been lost or stolen, it's best you report this to us.");
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'INTERNET PAYMENTS'")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_request_or_share_request_money+"']")
    public WebElement INTERNETPayments;
    public CardsPage selectINTERNETPayments(){
        INTERNETPayments.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"card/limitSwitch\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement turnINTERNETPayments;
    public CardsPage turnINTERNETPayments(){
        wait(turnINTERNETPayments);
        turnINTERNETPayments.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_cards_settings_limit_msg_disabled_ONLINE+"")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de.core:id/background_image']")
    public WebElement INTERNETPaymentsInfoMSg;
    public CardsPage verifyINTERNETInfoMsg(){
        wait(INTERNETPaymentsInfoMSg);
        verifyMessage(INTERNETPaymentsInfoMSg, s_cards_settings_limit_msg_disabled_ONLINE);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"REPORT LOST/STOLEN\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement LOSTorSTOLENBtn;
    public CardsPage selectLOSTOrSTOLEN(){
        wait(LOSTorSTOLENBtn);
        LOSTorSTOLENBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TEMPORARILY FREEZE CARD\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement TempFREEZEBtn;
    public CardsPage selectTempFREEZEBtn(){
        wait(TempFREEZEBtn);
        TempFREEZEBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"FREEZE\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement FREEZEBtn;
    public CardsPage clickFREEZE(){
        wait(FREEZEBtn);
        FREEZEBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_alert_frozen_no_bg\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement CardFrozenIcon;
    public CardsPage verifyCardFrozen(){
        wait(CardFrozenIcon);
        isElementPresent(CardFrozenIcon);
        return this;
    }

    public CardsPage verifyCardUnfrozen(){
        wait(cardOptions);
        cardOptions.click();
        closeCardOptions();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"BLOCK & REPLACE CARD\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement BLOCKandREPLACEBtn;
    public CardsPage selectBLOCKandREPLACE(){
        wait(BLOCKandREPLACEBtn);
        BLOCKandREPLACEBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic arrow right\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement openBlockageReasonList;
    public CardsPage selectBlockageReasonList(){
        wait(openBlockageReasonList);
        openBlockageReasonList.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MCASH\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement MCASHBtn;
    public CardsPage selectMCASHOnCards(){
        wait(MCASHBtn);
        MCASHBtn.click();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_dashboard__title_CREDIT_CARD+"")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement CardsTitleDashboard;
    public CardsPage verifyHomepage(){
        wait(CardsTitleDashboard);
        verifyElementText(CardsTitleDashboard, "Cards");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Insert amount\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement CustomAmountFieldMCASH;
    public CardsPage inputCustomAmountMCASH() {
        CustomAmountFieldMCASH.click();
        sleep();
        typeIn(CustomAmountFieldMCASH, "400,00");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CHANGE PIN\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement ChangeCardPin;
    public CardsPage selectCHANGE_CARD_PIN(){
        wait(ChangeCardPin);
        ChangeCardPin.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Change card PIN\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement ChangeCardPinTitle;
    public CardsPage verifyChangeCardPinScreen(){
        wait(ChangeCardPinTitle);
        verifyElementText(ChangeCardPinTitle, "Change card PIN");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"termsAndConditionsSwitch\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement turnTermsAndConditions;
    public CardsPage turnTermsAndConditions(){
        wait(turnTermsAndConditions);
        turnTermsAndConditions.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement NewCardPinField1;
    public CardsPage enterNewCardPin(String new_pin) {
        wait(NewCardPinField1);
        typeInProperty(NewCardPinField1, new_pin);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement NewCardPinField2;
    public CardsPage repeatNewCardPin(String new_pin) {
        wait(NewCardPinField2);
        typeInProperty(NewCardPinField2, new_pin);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CHANGE CARD PIN\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement ChangeCardPinBtn;
    public CardsPage clickChangeCardPin(){
        wait(ChangeCardPinBtn);
        ChangeCardPinBtn.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PIN change initiated\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement PINChangeInitiatedTitle;
    public CardsPage verifyPINChangeInitiated(){
        wait(PINChangeInitiatedTitle);
        verifyPage(PINChangeInitiatedTitle, "PIN change initiated");
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNFREEZE\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement UnfreezeOption;
    public CardsPage selectUnfreeze(){
        wait(UnfreezeOption);
        UnfreezeOption.click();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UNFREEZE\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement UnfreezeBtn;
    public CardsPage clickUnfreezeBtn(){
        wait(UnfreezeBtn);
        UnfreezeBtn.click();
        return this;
    }

}