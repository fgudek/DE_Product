package testRunners;

import com.aventstack.extentreports.service.ExtentService;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.*;
import testSetup.appiumSetup.CreateTranslations;
import testSetup.appiumSetup.DataSource;
import testSetup.appiumSetup.ReloadClass;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static testSetup.Base.checkIfServerIsRunning;
import static testSetup.Base.service;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"stepDefinitions","testSetup"},
        tags={"@SanityTest", "@ActivationAndLogin"},
        monochrome = true,
        strict = true,
        dryRun = false,
        plugin= {
                "pretty",
                "json:test-output/json_output/cucumber_report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }

)
@Test
public class SanityTestRunner extends AbstractTestNGCucumberTests {

    @BeforeTest
    public AppiumDriverLocalService startServer() throws IOException, ClassNotFoundException {

        CreateTranslations.main();
        ReloadClass.main();
        DataSource.getAPK();

        boolean flag = checkIfServerIsRunning(4723);

        Properties config = new Properties();
        String configData = "src//test//resources//properties//configurations//config.properties";
        config.load(new FileInputStream(configData));

        if(!flag){
            if(config.getProperty("platform").equals("IOS")) {
                service = AppiumDriverLocalService.buildDefaultService()
                        .buildService(new AppiumServiceBuilder()
                                .usingDriverExecutable(new File("/usr/local/bin/node"))
                                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                                .withIPAddress("127.0.0.1")
                                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                                .withArgument(GeneralServerFlag.LOG_LEVEL,"warn"));}

            else{
                service = AppiumDriverLocalService.buildDefaultService()
                        .buildService(new AppiumServiceBuilder()
                                .withArgument(GeneralServerFlag.LOG_LEVEL,"warn"));
            }
            service.start();
        }
        return service;
    }

    @AfterTest
    public void stopServer() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.stop();
    }

    @AfterClass
    public void setReportInfo() {
        ExtentService.getInstance().setSystemInfo("App", DataSource.getVersion());
        ExtentService.getInstance().setSystemInfo("Platform", DataSource.getPlatform() + " " + DataSource.getOSVersion());
        ExtentService.getInstance().setSystemInfo("Environment", DataSource.getEnvironment());
        ExtentService.getInstance().setSystemInfo("Tester", DataSource.getTester());
    }

    @AfterSuite
    public void openReport(){
        File htmlFile = new File("test-output\\HtmlReport\\ExtentHtml.html");
        try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}