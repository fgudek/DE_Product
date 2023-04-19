package appObjects.accountsPage.transactions;

import appObjects.preLoginObjects.ActivationObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import java.util.logging.Filter;
import static appObjects.Translations.*;


public class FilterObjects extends Base {

    public FilterObjects(AppiumDriver driver) {

        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic filter bg unselected\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core:id/m_banking_button']")
    public WebElement FilterIconBtn;
    public FilterObjects clickFilterIcon(){
        wait(FilterIconBtn);
        FilterIconBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_filters__title_filter+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_filters__title_filter+"']")
    public WebElement SelectFilterTitle;
    public FilterObjects verifySelectFilter(){
        sleep();
        verifyPage(SelectFilterTitle,"Select filters");
        return this;
    }

    public FilterObjects selectTimePeriod(String timePeriod){
        selector(timePeriod);
        return this;
    }

    public FilterObjects selectDate(String date){
        datePicker(date);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FILTER\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
    public WebElement FilterBtn;
    public FilterObjects clickFilter(){
        wait(FilterBtn);
        FilterBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"RESET FILTER\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
    public WebElement ResetFilterBtn;
    public FilterObjects clickResetFilter(){
        //wait(ResetFilterBtn);
        scrollToElement("down",ResetFilterBtn);
        ResetFilterBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"ic calendar\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='filter/timeFrom']")
    public WebElement fromDateBtn;
    public FilterObjects enterFromDate(){
        //scroller("down",300);
        scrollToElement("down",fromDateBtn);
        fromDateBtn.click();
        selectDate("neki_datum");
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"To\"])[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='filter/timeTo']")
    public WebElement toDateBtn;
    public FilterObjects enterToDate(){
        //scroller("down",300);
        //scrollDescriptionIntoViewSelect("filter/timeTo");
        scrollToElement("down",toDateBtn);
        toDateBtn.click();
        selectDate(day()+ " "+ month()+" "+year());
        return this;
    }

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'OK'")
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'OK')]")
    public WebElement okBtn;
    public FilterObjects clickOk(){
        wait(okBtn);
        okBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"From\"])[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='filter/amountFrom']")
    public WebElement fromAmountField;
    public FilterObjects enterFromAmount(){
        //scroller("down",300);
        scrollToElement("down",fromAmountField);
        wait(fromAmountField);
        typeInProperty(fromAmountField,"fromAmount");
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"To\"])[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='filter/amountTo']")
    public WebElement toAmountField;
    public FilterObjects enterToAmount(){
        //scroller("down",300);
        scrollToElement("down",toAmountField);
        wait(toAmountField);
        typeInProperty(toAmountField,"toAmount");
        return this;
    }
}
