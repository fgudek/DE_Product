package appObjects.accountsPage.transactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;

public class FilterObjects extends Base {

    public FilterObjects(AppiumDriver driver) {

        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}