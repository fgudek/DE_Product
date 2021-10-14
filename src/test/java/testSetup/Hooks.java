package testSetup;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.*;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import testSetup.appiumSetup.AppiumDriverSetup;
import testSetup.appiumSetup.DataSource;

import java.io.FileInputStream;
import java.io.IOException;


public class Hooks extends Base{

    //THIS IS HOOKS CLASS, IT IS USED FOR ACTIONS BEFORE AND AFTER TEST, IT IS USED FOR INITIALIZING DRIVER AND REPORTS
    //ALSO IT IS USED FOR CLOSING REPORT AND DRIVERS

    private Base base;
    public Hooks (Base base) {
        this.base = base;
    }

    @Before(order=0)
    public void beforeMethodSetup(Scenario s){
        this.scn = s;
        scenarioName=scn.getName();

        String tags=String.valueOf(scn.getSourceTagNames());
        String tagName=tags.replaceAll("@", "").replaceAll("\\p{P}", "").replaceAll("([^_])([A-Z])", "$1 $2");
        String[] tests = tagName.split("\\s+");

        testName=tests[0]+""+tests[1];

        Object[] paramNames = Reporter.getCurrentTestResult().getParameters();
        featureName = paramNames[1].toString().replaceAll("^\"+|\"+$", "");
    }

    @Before(value="not @NonActivated", order=1)
    public void startActivatedApp() throws  IOException {

        andProp.load(new FileInputStream(andData));
        macProp.load(new FileInputStream(macData));
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));

//ANDROID SETUP
        if(DataSource.getPlatform().contains("Android")) {
                AppiumDriverSetup.androidSetup();
            }
//ANDROID SETUP
        else{
                AppiumDriverSetup.iosSetup();
            }
        }

    @Before(value="@NonActivated",order=1)
    public void startNonActivated() throws  IOException {

        andProp.load(new FileInputStream(andData));
        macProp.load(new FileInputStream(macData));
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));

//ANDROID SETUP
        if(DataSource.getPlatform().contains("Android")) {
            AppiumDriverSetup.androidNonActivatedSetup();
        }
//ANDROID SETUP
        else{
            AppiumDriverSetup.iosNonActivatedSetup();
        }
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario){
        if(scenario.isFailed()){
            try{
                //screenshot for jira
                captureScreenshot(d);
                //ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotLocation);
                //screenshot report
                TakesScreenshot ts = (TakesScreenshot) d;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png",screenshotLocation);
                System.out.println("Break line: "+ scenario.getLine());
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    @After
    public void tearDown() {
        d.closeApp();
        d.quit();
    }
}
