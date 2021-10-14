package appObjects.cardsPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.touch.offset.PointOption;
import org.eclipse.persistence.annotations.ReturnUpdate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;
import static appObjects.Translations.*;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class CardsPage extends Base {

    public CardsPage(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSXCUITFindBy(accessibility = "hr.asseco.android.ui.demo.de:id/background_image")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/background_image']")
    public WebElement card;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Available amount'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Available amount')]")
    public WebElement cardsTitle;


    public CardsPage swipeCardLeft(){

      //  wait(card);
        WebElement el1 = stringToElementById("hr.asseco.android.ui.demo.de:id/page_container");
        swipeLeft(el1, 2000, 1.0);

        return this;
    }

    public CardsPage swipeTo(String svajp) {
        String crd = prop.getProperty(svajp);
       // WebElement el1 = stringToElementById("hr.asseco.android.ui.demo.de:id/page_container");
        swipeToElementByText("left",crd,5);
        sleep();
       // cardsTitle.click();
        return this;
    }
}