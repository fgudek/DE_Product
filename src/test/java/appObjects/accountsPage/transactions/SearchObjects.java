package appObjects.accountsPage.transactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SearchObjects extends Base {

    public SearchObjects(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search transactions\"]")
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'search_src_text')]")
    public WebElement searchField;
    public SearchObjects searchProperty(String searchString){
        if(DataSource.getPlatform().equals("iOS")){
            wait(searchField);
            scrollToElement("down",searchField);
            typeInProperty(searchField,searchString);

        }
        sleep();
        return this;
    }
}