package stepDefinitions.more;

import appObjects.morePage.settingsPage.Security;
import appObjects.morePage.settingsPage.MyProfile;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class MyProfileSteps extends Base {

    private Base base;

    public MyProfileSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        profile = new MyProfile(d);
        security = new Security(d);
    }

    @Then("go to Personal details")
    public void goToPersonalDetails() {
        profile
                .personalDetails();
    }

    @Then("verify user name")
    public void verifyUserName() {
        profile
                .verifyUserName("PERSONAL_DETAILS_USER_NAME");
    }

    @Then("verify personal ID")
    public void verifyPersonalID() {
        profile
                .verifyIDNumber("USER_DETAILS_ID_NUM");
    }

    @Then("verify address")
    public void verifyAddress() {
        profile
                .verifyPersonalAddress("USER_DETAILS_ADDRESS");
    }

    @Then("verify phone number")
    public void verifyPhoneNumber() {
        profile
                .verifyPhoneNum("USER_DETAILS_PHONE_NUM");
    }

    @Then("verify e-mail address")
    public void verifyEMailAddress() {
        profile
                .verifyEmail("USER_DETAILS_EMAIL");
    }
}