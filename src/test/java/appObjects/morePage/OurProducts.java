package appObjects.morePage;


import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.TemplatesPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;


import static appObjects.Translations.*;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static org.testng.Assert.assertTrue;

public class OurProducts extends Base {

    public OurProducts(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Accounts'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement AccountsProduct;
    public OurProducts AccountsProducts() {
        AccountsProduct.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'domestic currency'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement ProductAccounts1;
    public OurProducts clickProductAccounts1() {
        ProductAccounts1.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"See how to apply\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement SeeHowApplyBtn;
    public OurProducts clickSeeHowApplyBtn() {
        scrollElementIntoView(SeeHowApplyBtn);
        SeeHowApplyBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ask us a question\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement AskUsQuestionsBtn;
    public OurProducts clickAskUsQuestionsBtn() {
        scrollElementIntoView(AskUsQuestionsBtn);
        AskUsQuestionsBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic arrow right\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement MessageType;
    public OurProducts clickMessageType() {
        MessageType.click();
        sleep();
        return this;
    }

    public OurProducts selectMessageType(String type) {
        String Type = prop.getProperty(type);
        selector(Type);
        return this;
    }

    public OurProducts selectScreenshot(String ss) {
        String screenshot = prop.getProperty(ss);
        selector(screenshot);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Screenshot 2022-10-14 at 10.31.19, png\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement ScreenShot1;
    public OurProducts clickSS1() {
        ScreenShot1.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Message type\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement MessageTypeField;
    public OurProducts verifyMessageType(String type){
        String MessageType = prop.getProperty(type);
        wait(MessageTypeField);
        String verifyContactName = MessageTypeField.getText();
        String errorMessage = verifyContactName + " does not match with selected one";
        assertTrue(verifyContactName.contains(MessageType), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Screenshot 2022-10-14 at 10.31.19\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__btn_menu_internal_transfer+"')]")
    public WebElement ScreenshotSelected;
    public OurProducts verifyScreenshot(String ss){
        String Screenshot = prop.getProperty(ss);
        wait(ScreenshotSelected);
        String verifyScreenshotName = ScreenshotSelected.getText();
        String errorMessage = verifyScreenshotName + " does not match with selected one";
        assertTrue(verifyScreenshotName.contains(Screenshot), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Message title\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement MessageTitle;
    public OurProducts enterMessageTitle(String title)  {
        wait(MessageTitle);
        typeInProperty(MessageTitle, title);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Message\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds_code_lbl_mds_code+"']")
    public WebElement MessageContnent;
    public OurProducts enterMessageContent(String content)  {
        wait(MessageContnent);
        typeInProperty(MessageContnent, content);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ADD ATTACHMENT\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement AddAttchmentBtn;
    public OurProducts clickAddAttachment() {
        scrollElementIntoView(AddAttchmentBtn);
        AddAttchmentBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_delete\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement DeleteScreenshot;
    public OurProducts clickDeleteScreenshot() {
        DeleteScreenshot.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SEND\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement SendBtn;
    public OurProducts clickSend() {
        SendBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_toast_checked\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement ProductSuccessMsg;
    public OurProducts verifyProductSuccessMsg() {
        wait(ProductSuccessMsg);
        ProductSuccessMsg.isDisplayed();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you for your interest! We will contact you shortly\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de.core:id/optionFastBalance']")
    public WebElement InterestedInProductMsg;
    public OurProducts verifyInterestedInProductMsg() {
        wait(InterestedInProductMsg);
        verifyMessage(InterestedInProductMsg, s_product_shelf__lbl_contact_me_success);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Check out Frequently Asked Questions\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement FAQBtn;
    public OurProducts clickFAQ() {
        wait(FAQBtn);
        FAQBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_arrow_right_no_bg\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement QA1Btn;
    public OurProducts openCloseQA1() {
        QA1Btn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_arrow_right_no_bg\"])[5]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement QA5Btn;
    public OurProducts openCloseQA5() {
        QA5Btn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_arrow_right_no_bg\"])[7]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement QA7Btn;
    public OurProducts openCloseQA7() {
        scrollElementIntoView(QA7Btn);
        QA7Btn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I'M INTERESTED IN THIS PRODUCT\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement InterestedInProductBtn;
    public OurProducts clickInterestedInProduct() {
        InterestedInProductBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Cards'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement CardsProduct;
    public OurProducts CardsProducts() {
        CardsProduct.click();
        sleep();
        return this;
    }

    @HowToUseLocators(iOSXCUITAutomation = ALL_POSSIBLE)
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Visa Credit Card\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Savings']")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement Product;
    public OurProducts clickProduct() {
        Product.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Savings'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Accounts')]")
    public WebElement SavingsProduct;
    public OurProducts SavingsProducts() {
        SavingsProduct.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Loans'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Loans')]")
    public WebElement LoansProduct;
    public OurProducts LoansProducts() {
        LoansProduct.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Bank services'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Bank services')]")
    public WebElement BankServicesProduct;
    public OurProducts BankServicesProducts() {
        BankServicesProduct.click();
        sleep();
        return this;
    }
}