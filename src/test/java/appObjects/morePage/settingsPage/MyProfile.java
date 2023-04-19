package appObjects.morePage.settingsPage;

import appObjects.accountsPage.AccountsLandingPage;
import appObjects.cardsPage.CardsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.paymentPage.TemplatesPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

import java.io.FileInputStream;
import java.io.IOException;

import static appObjects.Translations.*;
import static org.testng.Assert.assertTrue;

public class MyProfile extends Base {

    public MyProfile(AppiumDriver driver) {
        this.d = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public MyProfile selectUser(String userprofile) {
        String user = prop.getProperty(userprofile);
        if(DataSource.getPlatform().equals("Android")){
            selector(user);
        }else{
            stringToElementByText(user).click();
            //stringToElementByText(acc).click();
        }

        return this;
    }

    public MyProfile selectBranch(String branch) {
        String office = prop.getProperty(branch);
        if(DataSource.getPlatform().equals("Android")){
            selector(office);
        }else{
            stringToElementByText(office).click();
            //stringToElementByText(acc).click();
        }

        return this;
    }

    @iOSXCUITFindBy(accessibility = "Private individual\nFran Gudek")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Corporate\nApple']")
    public WebElement FGUser;
    public MyProfile verifyUserChange() {
        verifyElementText(FGUser, "Private individual\nFran Gudek");
        assertTrue(true, "Element postoji na stranici");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Corporate\nFran INC.")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Corporate\nBmw']")
    public WebElement FranINCUser;
    public MyProfile verifyUserChange1() {
        verifyElementText(FranINCUser, "Corporate\nFran INC.");
        assertTrue(true, "Element postoji na stranici");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "Private individual\nMaryann Nicka Royster")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Private individual\nMaryann Nicka Royster']")
    public WebElement MRUser;
    public MyProfile verifyUserChange2() {
        verifyElementText(MRUser, "Private individual\nMaryann Nicka Royster");
        assertTrue(true, "Element postoji na stranici");
        sleep();
        return this;
    }


    @iOSXCUITFindBy(accessibility = "Search user or company")
    @AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[@text='Search user or company']")
    public WebElement searchBarUser;
    public MyProfile SearchBarUserSelect() {
        searchBarUser.click();
        typeIn(searchBarUser, "fran gudek");
        sleep();
        return this;
    }

    public MyProfile SearchBarUserSelect1() {
        searchBarUser.click();
        typeIn(searchBarUser, "Fran inc.");
        sleep();
        return this;
    }
    public MyProfile SearchBarUserSelect2() {
        searchBarUser.click();
        typeIn(searchBarUser, "maryann Royster");
        sleep();
        return this;
    }

    @iOSXCUITFindBy(accessibility = "ic_message")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='"+c_prelogin__btn_messages+"']")
    public WebElement regUserInbox;
    public MyProfile openInbox() {
        regUserInbox.click();
        sleep();
        return this;
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

    @iOSXCUITFindBy(accessibility = "ic_arrow_right")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='hr.asseco.android.ui.demo.de:id/arrow']")
    public WebElement SelectUserOrCompany;
    public MyProfile SelectUserOrComp() {
        SelectUserOrCompany.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_edit\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement ChangePhoneNumberBtn;
    public MyProfile clickChangePhoneNumber() {
        ChangePhoneNumberBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"New mobile phone number\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement NewPhoneNumberField;
    public MyProfile enterNewPhoneNumber(String phone) {
        wait(NewPhoneNumberField);
        typeInProperty(NewPhoneNumberField, phone);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_edit\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement ChangeEmailBtn;
    public MyProfile clickChangeEmail() {
        ChangeEmailBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"New e-mail address\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement NewEmailField;
    public MyProfile enterNewEmail(String email) {
        wait(NewEmailField);
        typeInProperty(NewEmailField, email);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name=\"E-mail confirmation required!\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='hr.asseco.android.ui.demo.de.core:id/switchView']")
    public WebElement EmailChangeConfirmationMsg;
    public MyProfile verifyEmailChangeConfirmationMsg(){
        wait(EmailChangeConfirmationMsg);
        verifyMessage(EmailChangeConfirmationMsg, "E-mail confirmation required!");
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"ic_edit\"])[3]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='hr.asseco.android.ui.demo.de.core.core:id/button']")
    public WebElement ChangeContactAddressBtn;
    public MyProfile clickChangeContactAddress() {
        ChangeContactAddressBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Floor number\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement FloorNumberField;
    public MyProfile newFloorNumber(String floor) {
        wait(FloorNumberField);
        typeInProperty(FloorNumberField, floor);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic arrow right\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement selectCountryBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Croatia\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement CroatiaBtn;
    public MyProfile clickSelectCountry() {
        wait(selectCountryBtn);
        selectCountryBtn.click();
        scrollTextContainsIntoView(CroatiaBtn, "Croatia");
        wait(CroatiaBtn);
        CroatiaBtn.click();
        sleep();
        return this;
    }

    /*
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Croatia\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement CroatiaBtn;
    public MyProfile selectCroatia() {
        scrollElementIntoView();
        return this;
    } */



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CLEAR ALL\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement ClearAllBtn;
    public MyProfile clickClearAll() {
        wait(ClearAllBtn);
        ClearAllBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My branch office\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MyBranchOfficeBtn;
    public MyProfile clickBranchOffice() {
        wait(MyBranchOfficeBtn);
        MyBranchOfficeBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_location\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MyBranchLocationBtn;
    public MyProfile clickBranchLocation() {
        wait(MyBranchLocationBtn);
        MyBranchLocationBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"List\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement BranchListBtn;
    public MyProfile clickBranchListView() {
        wait(BranchListBtn);
        BranchListBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Map\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement BranchMapBtn;
    public MyProfile clickBranchMapView() {
        wait(BranchMapBtn);
        BranchMapBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_telephone_domestic\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MyBranchPhoneBtn;
    public MyProfile clickBranchPhone() {
        wait(MyBranchPhoneBtn);
        MyBranchPhoneBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Cancel\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement closeMyBranchPhoneBtn;
    public MyProfile closeBranchPhone() {
        wait(closeMyBranchPhoneBtn);
        closeMyBranchPhoneBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_mail\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement MyBranchEmailBtn;
    public MyProfile clickBranchEmail() {
        wait(MyBranchEmailBtn);
        MyBranchEmailBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Mail.cancelSendButton\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement CancelEmailBtn;
    public MyProfile clickCancelEmail() {
        wait(CancelEmailBtn);
        CancelEmailBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Draft\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement DeleteDraftEmailBtn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"New Message\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement NewMsgBar;
    public MyProfile clickDeleteDraftAndCloseModal() {
        wait(DeleteDraftEmailBtn);
        DeleteDraftEmailBtn.click();
        wait(NewMsgBar);
        drag(NewMsgBar, 500, "down");
        //swipeMethod(16,96,0, 634);
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_lbs_working_time\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement ShowWorkingHoursBtn;
    public MyProfile clickWorkingHours() {
        wait(ShowWorkingHoursBtn);
        ShowWorkingHoursBtn.click();
        sleep();
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CHANGE BRANCH\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement ChangeBranchBtn;
    public MyProfile clickChangeBranch() {
        wait(ChangeBranchBtn);
        ChangeBranchBtn.click();
        sleep();
        return this;
    }

    /*
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Delta City'")
    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'')]")
    public WebElement DeltaCityBranch;
    public MyProfile verifyDeltaCityBranch(String branch) {
        verifyElementText(DeltaCityBranch, branch);
        return this;
    } */

    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Delta City'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'')]")
    public WebElement DeltaCityBranch;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Airport City'")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'')]")
    public WebElement AirportCityBranch;
    public MyProfile verifyDeltaCityBranch(String branch) {
        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = DeltaCityBranch.getText();
        String branchName = prop.getProperty(branch);
        String errorMessage = "Found "+str + " but expected " + branchName;
        assertTrue(str.contains(branchName), errorMessage);
        return this;
    }
    public MyProfile verifyAirportCityBranch(String branch) {
        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = AirportCityBranch.getText();
        String branchName = prop.getProperty(branch);
        String errorMessage = "Found "+str + " but expected " + branchName;
        assertTrue(str.contains(branchName), errorMessage);
        return this;
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SET AS MAIN BRANCH\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+c_mtoken_mds__lbl_mds_input_2_title+"']")
    public WebElement SetAsMainBranchBtn;
    public MyProfile clickSetAsMainBranch() {
        wait(SetAsMainBranchBtn);
        SetAsMainBranchBtn.click();
        sleep();
        return this;
    }
}