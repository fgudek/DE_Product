package appObjects;

import appObjects.paymentPage.PaymentsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import static appObjects.Translations.*;


public class NavigationBar extends Base {

    public NavigationBar(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de.core:id/button")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement genericBtn;
    public NavigationBar clickButton() {
        genericBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_dashboard__btn_more+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_dashboard__btn_more+"']")
    public WebElement morePageBtn;
    @iOSXCUITFindBy(accessibility = ""+s_more__title_more+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_more__title_more+"']")
    public WebElement morePageTitle;
    public NavigationBar gotoMore() {
        wait(morePageBtn);
        morePageBtn.click();
        sleep();
        //verifyPage(morePageTitle, s_more__title_more);
        return this;
        }

    @iOSXCUITFindBy(accessibility = ""+s_menu__lbl_payments+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_menu__lbl_payments+"']")
    public WebElement paymentsTitle;
    @iOSXCUITFindBy(accessibility = ""+s_dashboard__btn_payments+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_dashboard__btn_payments+"']")
    public WebElement paymentsBtn;
    public NavigationBar gotoPayments(){
        wait(paymentsBtn);
        paymentsBtn.click();
        sleep();
        verifyPage(paymentsTitle,"Payments");
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_dashboard__btn_products+"")
    @AndroidFindBy(accessibility = ""+s_dashboard__btn_products+"")
    public WebElement productsTitle;
    @iOSXCUITFindBy(accessibility = ""+s_dashboard__btn_products+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_dashboard__btn_products+"']")
    public WebElement productsBtn;
    public NavigationBar gotoProducts(){
        wait(productsBtn);
        productsBtn.click();
        sleep();
        verifyPage(productsTitle,"Products");
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_menu__lbl_dashboard+"")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='0']")
    public WebElement HomeBtn;
    public NavigationBar gotoHome(){
        wait(HomeBtn);
        HomeBtn.click();
        sleep();
        return this;
    }

}