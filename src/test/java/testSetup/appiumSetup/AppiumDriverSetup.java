package testSetup.appiumSetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import testSetup.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppiumDriverSetup extends Base {

    //THIS IS APPIUM SETUP CLASS, IT IS USED FOR DECLARING CAPABILITIES FOR BOTH IOS AND ANDROID

    public static int implicitWait = Integer.parseInt(DataSource.getImplicitWait());
    public static int timeout = Integer.parseInt(DataSource.getTimeout());
    public static long idleTimeout = 2000;


    public static void androidSetup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, timeout);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, andProp.getProperty("deviceName"));
        cap.setCapability("udid", DataSource.getUDID());
        cap.setCapability("platformVersion", DataSource.getOSVersion());
        cap.setCapability("platformName", DataSource.getPlatform());
        cap.setCapability("automationName", andProp.getProperty("automation"));
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        cap.setCapability("noReset", true);
        cap.setCapability("fullReset", false);
        cap.setCapability("appWaitForLaunch", false);
        cap.setCapability("appWaitPackage", andProp.getProperty("package"));
       cap.setCapability("appWaitActivity", andProp.getProperty("launchActivity"));
        cap.setCapability("settings[shouldUseCompactResponses]",true);
        cap.setCapability("settings[waitForIdleTimeout]",idleTimeout);
        File f = new File(config.getProperty("androidLocation"));
        File fs = new File(f, config.getProperty("androidFileName"));
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        d = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        d.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        d.launchApp();
    }

    public static void androidNonActivatedSetup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, timeout);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, andProp.getProperty("deviceName"));
        cap.setCapability("udid", DataSource.getUDID());
        cap.setCapability("platformVersion", DataSource.getOSVersion());
        cap.setCapability("platformName", DataSource.getPlatform());
        cap.setCapability("automationName", andProp.getProperty("automation"));
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        cap.setCapability("appWaitForLaunch", false);
        cap.setCapability("appPackage", andProp.getProperty("package"));
        cap.setCapability("appWaitActivity", andProp.getProperty("launchActivity")); // tu je bio appAcitivty umjesto launchActivty - to je uzrokovalo problem
        cap.setCapability("settings[shouldUseCompactResponses]",true);
        cap.setCapability("settings[waitForIdleTimeout]",idleTimeout);
        File f = new File(config.getProperty("androidLocation"));
        File fs = new File(f, config.getProperty("androidFileName"));
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        d = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        d.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        d.launchApp();
    }

    //IOS SETUP
    public static void iosNonActivatedSetup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, timeout);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, macProp.getProperty("deviceName"));
        cap.setCapability("appInstallStrategy","parallel");
        cap.setCapability("platformVersion", DataSource.getOSVersion());
        cap.setCapability("platformName", DataSource.getPlatform());
        cap.setCapability("automationName", macProp.getProperty("automation"));
        //cap.setCapability("autoAcceptAlerts",true);
        cap.setCapability("updatedWDABundleId", macProp.getProperty("bundleWDA"));
        cap.setCapability("udid", DataSource.getUDID());
//        cap.setCapability("udid", macProp.getProperty("UDID"));
        cap.setCapability("xcodeSigningId", macProp.getProperty("xcodeSigningId"));
        cap.setCapability("bundleId", macProp.getProperty("bundleId"));
        cap.setCapability("xcodeOrgId", macProp.getProperty("xcodeOrgId"));
        File f = new File(config.getProperty("iosLocation"));
        File fs = new File(f,config.getProperty("iosFileName"));
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        d = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        d.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        d.launchApp();
    }

    public static void iosSetup() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, timeout);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, macProp.getProperty("deviceName"));
        cap.setCapability("platformVersion", DataSource.getOSVersion());
        cap.setCapability("platformName", DataSource.getPlatform());
        cap.setCapability("automationName", macProp.getProperty("automation"));
        //cap.setCapability("autoAcceptAlerts",true);
        cap.setCapability("updatedWDABundleId", macProp.getProperty("bundleWDA"));
        cap.setCapability("udid", DataSource.getUDID());
//        cap.setCapability("udid", macProp.getProperty("UDID"));
        cap.setCapability("xcodeSigningId", macProp.getProperty("xcodeSigningId"));
        cap.setCapability("bundleId", macProp.getProperty("bundleId"));
        cap.setCapability("xcodeOrgId", macProp.getProperty("xcodeOrgId"));
        cap.setCapability("noReset", true);
        cap.setCapability("fullReset", false);
        File f = new File(config.getProperty("iosLocation"));
        File fs = new File(f,config.getProperty("iosFileName"));
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

         d = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
         d.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
         d.launchApp();
        }

}

