package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.paymentPage.TemplatesPage;
import appObjects.accountsPage.transactions.SearchObjects;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class TemplatesSteps extends Base {

    private Base base;

    public TemplatesSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        payment = new PaymentsPage(d);
        review = new ReviewPage(d);
        templates = new TemplatesPage(d);
        navigate = new NavigationBar(d);
        search = new SearchObjects(d);
    }

    @Then("switch to templates")
    public void clickTemplateInPayment() {
        templates
                .clickTemplateInPayment();
    }

    @Then("go to Templates and Beneficiaries")
    public void clickTemplateAndBenInPayments() {
        templates
                .clickTemplateAndBenInPayments();
    }

    @Then("go to Templates and Beneficiaries shortcut")
    public void clickTempAndBen() {
        payment
                .clickTempAndBen();
    }

    @Then("^search for (.*?) template$")
    public void searchTemplate(String template) {
        templates
                .searchTemplate(template);
    }

    @Then("^select (.*?) as template$")
    public void select_domestic_TEMPLATE(String template){
        templates
                .selectTemplate(template);
    }

    @Then("^select (.*?) as beneficiary")
    public void select_beneficiary(String beneficiary){
        templates
                .selectBeneficiary(beneficiary);
    }

    @Then("^select more for (.*?) beneficiary$")
    public void select_more_Template(String more){
        templates
                .moreTemplateSelect(more);
    }

    @Then("verify Templates and Beneficiaries screen$")
    public void verifyPageTitleTB(){
        templates
                .verifyPageTitleTB();
    }

    @Then("click MORE button for Test template$")
    public void MoreBtnTest(){
        templates
                .MoreBtnTest();
    }

    @Then("close MORE$")
    public void closeMore(){
        templates
                .closeMore();
    }

    @Then("select test beneficiary$")
    public void selectTestBeneficiary(){
        templates
                .selectTestBeneficiary();
    }

    @Then("^select (.*?) as Account identifier$")
    public void selectAccIdentifier(String id_acc){
        templates
                .selectAccIdentifier(id_acc);
    }

    @Then("click DELETE in options$")
    public void clickDeleteTB(){
        templates
                .clickDeleteTB();
    }

    @Then("click DELETE$")
    public void clickDelete(){
        templates
                .clickDelete();
    }

    @Then("click CANCEL$")
    public void CancelDelTB(){
        templates
                .CancelDelTB();
    }

    @Then("click EDIT$")
    public void clickEditTB(){
        templates
                .clickEditTB();
    }

    @Then("close ERROR$")
    public void Error(){
        templates
                .Error();
    }

    @Then("^verify (.*?) as BENEFICIARY ACCOUNT")
    public void verifyBeneficiaryAccountNumber(String account){
        templates
                .verifyBeneficiaryAccountNumber(account);
    }

    @Then("^verify (.*?) as BENEFICIARY NAME")
    public void verifyBeneficiaryName(String name){
        templates
                .verifyBeneficiaryName(name);
    }

    @Then("^verify (.*?) as BENEFICIARY BANK NAME")
    public void verifyBeneficiaryBank(String bankname){
        templates
                .verifyBeneficiaryBank(bankname);
    }

    @Then("^verify (.*?) as AMOUNT$")
    public void verifyAmount(String amount){
        templates
                .verifyAmount(amount);
    }

    @Then("^verify (.*?) as Template")
    public void verifyIntTemplate(String int_template){
        templates
                .verifyIntTemplate(int_template);
    }

    @Then("^verify (.*?) as Beneficiary")
    public void verifyBeneficiaryTemp(String ver_ben){
        templates
                .verifyBeneficiaryTemp(ver_ben);
    }

    @Then("click MORE button for Test Beneficiary$")
    public void MoreBtnTestBenef(){
        templates
                .MoreBtnTestBenef();
    }

    @Then("verify Edit Beneficiary screen$")
    public void verifyEditB(){
        templates
                .verifyEditB();
    }

    @Then("click ADD NEW BANK ACCOUNT$")
    public void clickAddNewBankAcc(){
        templates
                .clickAddNewBankAcc();
    }

    @Then("delete new ACCOUNT identifier$")
    public void clickDeleteNewAccID(){
        templates
                .clickDeleteNewAccID();
    }

    @Then("add new ACCOUNT identifer$")
    public void enterAccID(){
        templates
                .enterAccID();
    }

    @Then("select Beneficiary$")
    public void selectBeneficiary(){
        templates
                .selectBeneficiary();
    }

    @Then("close beneficiary modal$")
    public void closeModal(){
        templates
                .closeModal();
    }

    @Then("verify TEMPLATES AND BENEFICIARY success message")
    public void verifyTemplateBeneficiarySuccessMsg(){
        templates
                .verifyTemplateBeneficiarySuccessMsg();
    }

    @Then("verify TEMPLATE success message")
    public void verifyTemplateSuccessMsg(){
        templates
                .verifyTemplateSuccessMsg();
    }

    @Then("verify newly added identifier")
    public void verifyAddedIdentifier(){
        templates
                .verifyAddedIdentifier("MULTIPLE_IDENTIFIER");
    }

    @Then("verify new identifier is deleted")
    public void verifyDeletedIdentifier(){
        templates
                .verifyDeletedIdentifier("ACCOUNT");
    }
}