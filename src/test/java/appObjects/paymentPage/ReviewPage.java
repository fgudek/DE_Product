package appObjects.paymentPage;

import appObjects.preLoginObjects.ActivationObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import java.io.FileInputStream;
import java.io.IOException;
import static appObjects.Translations.*;
import static org.testng.Assert.assertTrue;

public class ReviewPage extends Base {

    public ReviewPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSXCUITFindBy(accessibility = "" + s_payments__title_payment_review + "")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='" + s_payments__title_payment_review + "']")
    public WebElement reviewDataTitle;

    public ReviewPage verifyReview() {
        verifyPage(reviewDataTitle, s_payments__title_payment_review);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '" + s_payments__lbl_pay_from + "'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '"+ s_payments__lbl_pay_from +"')]")
    public WebElement fromAccountNumber;
    public ReviewPage verifyFROMAccount(String property) {
        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = fromAccountNumber.getText();
       // System.out.println("test za output sadrzaj:");
       // System.out.println(str);
        String accountNumber = prop.getProperty(property);
        String errorMessage = "Found " + str + " but expected " + accountNumber;
        assertTrue(str.contains(accountNumber), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '" + s_payments__lbl_pay_to + "'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_payments__lbl_pay_to+"')]")
    public WebElement toAccountNumber;
    public ReviewPage verifyTOAccount(String property) {
        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = toAccountNumber.getText();
        String accountNumber = prop.getProperty(property);
        String errorMessage = "Found " + str + " but expected " + accountNumber;
        assertTrue(str.contains(accountNumber), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de:id/label")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='hr.asseco.android.ui.demo.de:id/label')]")
    public WebElement details;
    public ReviewPage verifyPaymentDetails(String property) {
        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = details.getText();
        String accountNumber = prop.getProperty(property);
        String errorMessage = "Found " + str + " but expected " + accountNumber;
        assertTrue(str.contains(accountNumber), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_payments__btn_pay+"")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='"+s_payments__btn_pay+"']")
    public WebElement payBtn;
    public ReviewPage clickPay() {
        scrollElementIntoView(payBtn);
        wait(payBtn);
        payBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de:id/button")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de:id/button']")
    public WebElement doneBtn;
    public ReviewPage clickDone() {
        doneBtn.click();
        sleep();
        return this;
    }
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_internal_transfer_result_executed+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_internal_transfer_result_executed+"']")
    public WebElement successfullInternalTransferTitle;
    public ReviewPage verifySuccessfulInternalTransfer() {
        verifyPage(successfullInternalTransferTitle,s_payments__title_internal_transfer_result_executed);
        clickDone();
        sleep();
        return this;
    }


    public ReviewPage verifyCurrencyChange(String currency) {
        String acc = prop.getProperty(currency);
        isTextNOTPresent(acc);
        return this;
    }
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone_domestic+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_someone_domestic+"']")
    public WebElement DomesticPaymentTitle;
    public ReviewPage verifyDomesticPaymentScreen() {
        verifyPage(DomesticPaymentTitle, s_payments__title_pay_someone_domestic);
        return this;
    }
    @iOSXCUITFindBy(accessibility = ""+s_payments__title_pay_someone_swift+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_payments__title_pay_someone_swift+"']")
    public WebElement InternationalPaymentTitle;
    public ReviewPage verifyInternationalPaymentScreen() {
        verifyPage(InternationalPaymentTitle, s_payments__title_pay_someone_swift);
        return this;
    }



}