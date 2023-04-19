package stepDefinitions.more;

import appObjects.morePage.settingsPage.Security;
import appObjects.morePage.settingsPage.MyProfile;
import appObjects.preLoginObjects.PreLoginPage;
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
        preLogin = new PreLoginPage(d);
    }

    @Then("select USER or COMPANY")
    public void SelectUserOrComp() {
        profile
                .SelectUserOrComp();
    }

    @Then("click search bar and type in Fran Gudek$")
    public void selectUser() {
        profile
                .SearchBarUserSelect();
    }

    @Then("click search bar and type in Fran INC.$")
    public void selectUser1() {
        profile
                .SearchBarUserSelect1();
    }

    @Then("click search bar and type in MR$")
    public void selectUser2() {
        profile
                .SearchBarUserSelect2();
    }

    @Then("select (.*?) as COMPANY/USER$")
    public void selectUser(String user) {
        profile
                .selectUser(user);
    }

    @Then("verify user has changed to FG on HOMEPAGE$")
    public void verifyUserChange() {
        profile
                .verifyUserChange();
    }

    @Then("verify user has changed to Fran INC. on HOMEPAGE$")
    public void verifyUserChange1() {
        profile
                .verifyUserChange1();
    }

    @Then("verify user has changed to Maryann on HOMEPAGE$")
    public void verifyUserChange2() {
        profile
                .verifyUserChange2();
    }

    @Then("click on INBOX in reg app")
    public void clickOnINBOXregUser() {
        profile
                .openInbox();
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

    @Then("click CHANGE PHONE NUMBER")
    public void ChangePhoneNumber() {
        profile
                .clickChangePhoneNumber();
    }

    @Then("enter (.*?) number as new mobile phone$")
    public void enterNewPhoneNumber(String phone_number) {
        profile
                .enterNewPhoneNumber(phone_number);
    }

    @Then("click CHANGE E-MAIL")
    public void ChangeEmail() {
        profile
                .clickChangeEmail();
    }

    @Then("enter (.*?) as e-mail$")
    public void enterNewEmail(String email) {
        profile
                .enterNewEmail(email);
    }

    @Then("verify E-MAIL CHANGE CONFIRMATION message$")
    public void verifyEmailChangeConfirmationMsg() {
        profile
                .verifyEmailChangeConfirmationMsg();
    }

    @Then("click CHANGE CONTACT ADDRESS")
    public void clickChangeContactAddress() {
        profile
                .clickChangeContactAddress();
    }

    @Then("change contact address data and choose (.*?) as country$")
    public void changeContactAddress(String rep) {
        profile
                .newFloorNumber("NEW_FLOOR_NUMBER")
                .clickSelectCountry();
    }

    @Then("click CLEAR ALL")
    public void clickClearAll() {
        profile
                .clickClearAll();
    }

    @Then("go to MY BRANCH OFFICE")
    public void clickBranchOffice() {
        profile
                .clickBranchOffice();
    }

    @Then("click on Branch Location")
    public void clickBranchLocation() {
        profile
                .clickBranchLocation();
    }

    @Then("click on List tab")
    public void clickBranchListView() {
        profile
                .clickBranchListView();
    }

    @Then("click on Map tab")
    public void clickBranchMapView() {
        profile
                .clickBranchMapView();
    }

    @Then("click Branch phone number")
    public void clickBranchPhone() {
        profile
                .clickBranchPhone();
    }

    @Then("close Branch phone number")
    public void closeBranchPhone() {
        profile
                .closeBranchPhone();
    }

    @Then("click Branch E-mail")
    public void clickBranchEmail() {
        profile
                .clickBranchEmail();
    }

    @Then("click DELETE DRAFT and close modal")
    public void clickDeleteDraftAndCloseModal() {
        profile
                .clickDeleteDraftAndCloseModal();
    }

    @Then("show Working hours")
    public void clickWorkingHours() {
        profile
                .clickWorkingHours();
    }

    @Then("click CANCEL E-mail")
    public void clickCancelEmail() {
        profile
                .clickCancelEmail();
    }

    @Then("click CHANGE BRANCH")
    public void clickChangeBranch() {
        profile
                .clickChangeBranch();
    }

    @Then("select (.*?) as BRANCH$")
    public void selectBranch(String branch) {
        profile
                .selectBranch(branch);
    }

    @Then("verify (.*?) as selected BRANCH$")
    public void verifyDeltaCityBranch(String selected_branch) {
        profile
                .verifyDeltaCityBranch(selected_branch);
    }

    @Then("verify (.*?) as selected default BRANCH$")
    public void verifyAirportCityBranch(String selected_branch) {
        profile
                .verifyAirportCityBranch(selected_branch);
    }

    @Then("click SET AS MAIN BRANCH$")
    public void clickSetAsMainBranch() {
        profile
                .clickSetAsMainBranch();
    }
}