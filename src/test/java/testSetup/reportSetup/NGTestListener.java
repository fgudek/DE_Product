package testSetup.reportSetup;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.testng.*;
import testSetup.Base;
import testSetup.appiumSetup.DataSource;

public class NGTestListener extends Base implements ITestListener{

    //THIS IS TESTNG LISTENER CLASS

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("STARTING TEST ");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {



        String issueSummary = "[ATT]" +
                "["+ DataSource.getCountry()+"]" +
                "["+testName+"]["+featureName+"]" +
                "["+scenarioName+"]";

        String stackTrace = result.getThrowable().getStackTrace()[3].getMethodName()+ "\n"+
                            result.getThrowable().getStackTrace()[1].getMethodName();
        String issueDescription = stackTrace+"\n"+result.getThrowable().getMessage()+"\n";
        issueDescription.concat(ExceptionUtils.getStackTrace(result.getThrowable()));

        System.out.println("TEST FAILED");

        try{
            JRC.newIssue(issueSummary,issueDescription);
            }
        catch(Exception e){
            e.printStackTrace();
            }
        }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("SKIP");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("on test success within percentage");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("TEST FINISHED");
    }
}
