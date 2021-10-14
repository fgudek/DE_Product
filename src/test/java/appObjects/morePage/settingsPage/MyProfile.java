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
import static appObjects.adaptiveElements.*;
import static org.testng.Assert.assertTrue;

public class MyProfile extends Base {

    public MyProfile(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_personal_details+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_personal_details+"']")
    public WebElement personalDetailsBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__title_personal_details+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__title_personal_details+"']")
    public WebElement personalDetailsTitle;
    public MyProfile personalDetails() {
        // scrollElementIntoView(mBalanceBtn);
        personalDetailsBtn.click();
        sleep();
        verifyPage(personalDetailsTitle, s_settings__title_personal_details);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_main_branch+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_main_branch+"']")
    public WebElement myBranchOfficeBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__title_my_branch+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__title_my_branch+"']")
    public WebElement myBranchOfficeTitle;
    public MyProfile myBranchOffice() {
        scrollElementIntoView(myBranchOfficeBtn);
        myBranchOfficeBtn.click();
        sleep();
        verifyPage(myBranchOfficeTitle, s_settings__title_my_branch);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__btn_personal_banker+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__btn_personal_banker+"']")
    public WebElement myPersonalBankerBtn;
    @iOSXCUITFindBy(accessibility = ""+s_settings__title_my_profile_my_banker+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+s_settings__title_my_profile_my_banker+"']")
    public WebElement myPersonalBankerTitle;
    public MyProfile myPersonalBanker() {
        scrollElementIntoView(myPersonalBankerBtn);
        myPersonalBankerBtn.click();
        sleep();
        verifyPage(myPersonalBankerTitle, s_settings__title_my_profile_my_banker);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_personal_details_user_name+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_settings__lbl_personal_details_user_name+"')]")
    public WebElement userNameField;
    public MyProfile verifyUserName(String name) {

        String acc= prop.getProperty(name);
        wait(userNameField);
        String verify = userNameField.getText();
        String errorMessage = verify + " does not match with selected one "+acc;
        assertTrue(verify.contains(acc), errorMessage);
        return this;

    }


    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_personal_details_personal_id_number+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_settings__lbl_personal_details_personal_id_number+"')]")
    public WebElement IDField;
    public MyProfile verifyIDNumber(String idNum) {
        String acc= prop.getProperty(idNum);
        wait(IDField);
        String verify = IDField.getText();
        String errorMessage = verify + " does not match with selected one "+acc;
        assertTrue(verify.contains(acc), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_personal_details_address+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_settings__lbl_personal_details_address+"')]")
    public WebElement personalAddressField;
    public MyProfile verifyPersonalAddress(String persAddress) {
        String acc= prop.getProperty(persAddress);
        wait(personalAddressField);
        String verify = personalAddressField.getText();
        String errorMessage = verify + " does not match with selected one "+acc;
        assertTrue(verify.contains(acc), errorMessage);
        return this;

    }

    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_personal_details_phone_number+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_settings__lbl_personal_details_phone_number+"')]")
    public WebElement personalPhoneNumField;
    public MyProfile verifyPhoneNum(String phonenum) {
        String acc= prop.getProperty(phonenum);
        wait(personalPhoneNumField);
        String verify = personalPhoneNumField.getText();
        String errorMessage = verify + " does not match with selected one "+acc;
        assertTrue(verify.contains(acc), errorMessage);
        return this;
    }


    @iOSXCUITFindBy(accessibility = ""+s_settings__lbl_personal_details_email+"")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'"+s_settings__lbl_personal_details_email+"')]")
    public WebElement personalEmailField;
    public MyProfile verifyEmail(String email) {
        String acc= prop.getProperty(email);
        wait(personalEmailField);
        String verify = personalEmailField.getText();
        String errorMessage = verify + " does not match with selected one "+acc;
        assertTrue(verify.contains(acc), errorMessage);
        return this;
    }
}