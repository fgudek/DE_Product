package appObjects.morePage.settingsPage;


import appObjects.morePage.MorePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

import static appObjects.Translations.*;

public class Services extends Base {

    public Services(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings_fast_balance__title_fast_balance+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings_fast_balance__title_fast_balance+"']")
    public WebElement mBalanceBtn;
    public Services mBalance() {
        scrollElementIntoView(mBalanceBtn);
        mBalanceBtn.click();
        sleep();
        return this;
    }

}