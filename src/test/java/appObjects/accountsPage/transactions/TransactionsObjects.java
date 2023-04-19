package appObjects.accountsPage.transactions;

import appObjects.preLoginObjects.PreLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static appObjects.Translations.*;
import static org.testng.Assert.assertTrue;

public class TransactionsObjects extends Base {

    public TransactionsObjects(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public TransactionsObjects waitTransactionLoad()  {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public TransactionsObjects gotoTransaction(String transaction){
        transactionElement(transaction).click();
        sleep();
        if(DataSource.getPlatform().equals("iOS")){
            try{transactionElement(transaction).click();
                sleep();
            }catch(NoSuchElementException e){}
        }
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW RECEIPT\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement ViewReceiptBtn;
    public TransactionsObjects clickViewReceipt(){
        wait(ViewReceiptBtn);
        ViewReceiptBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COPY PAYMENT\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement CopyPaymentBtn;
    public TransactionsObjects clickCopyPayment(){
        wait(CopyPaymentBtn);
        CopyPaymentBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SPLIT WITH FRIENDS\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement SplitWithFriendsBtn;
    public TransactionsObjects clickSplitWithFriends(){
        wait(SplitWithFriendsBtn);
        SplitWithFriendsBtn.click();
        sleep();
        return this;
    }

}