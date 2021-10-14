package testSetup.appiumSetup;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import testSetup.Base;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DataSource extends Base {

    //THIS  CLASS IS FOR ADDING DATA FROM JENKINS

    public static Properties config;

    public static String getImplicitWait() {

        String iw = System.getProperty("implicitWait");

        if (iw == null) {
            return config.getProperty("implicitWait");
        }
        else{
            return System.getProperty("implicitWait");
        }
    }

    public static String getWait() {

        String w = System.getProperty("waitElement");

        if (w == null) {
            return config.getProperty("waitElement");
        } else {
            return System.getProperty("waitElement");
        }
    }

    public static String getTimeout() {
        String to = System.getProperty("timeout");

        if (to == null) {
            return config.getProperty("timeout");
        }
        else{
            return System.getProperty("timeout");
        }
    }

    public static String getSleep() {
        String to = System.getProperty("sleep");

        if (to == null) {
            return config.getProperty("sleep");
        }
        else{
            return System.getProperty("sleep");
        }
    }

    public static String getPortal(){

        String pl = System.getProperty("mportal");
        if (pl== null){
            return config.getProperty("mportal");
        }
        else{return System.getProperty("mportal");}
    }

    public static String getPlatform(){

        String pl = System.getProperty("platform");
        String os = System.getProperty("os.name");

        if (pl== null){
            if(os.contains("Windows")){
                return "Android";
            }
            else{
                return "iOS";
            }
        }
        else{return System.getProperty("platform");}
    }

    public static String getOSVersion(){

        String pl = System.getProperty("osVersion");
        if (pl== null){
            return config.getProperty("osVersion");
        }
        else{return System.getProperty("osVersion");}
    }

    public static String getJiraUri(){

        String pl = System.getProperty("jiraUri");
        if (pl== null){
            return config.getProperty("jiraUri");
        }
        else{return System.getProperty("jiraUri");}
    }

    public static String getJiraProject(){

        String pl = System.getProperty("jiraProject");
        if (pl== null){
            return config.getProperty("jiraProject");
        }
        else{return System.getProperty("jiraProject");}
    }

    public static String getJiraUser(){

        String pl = System.getProperty("jiraUser");
        if (pl== null){
            return config.getProperty("jiraUser");
        }
        else{return System.getProperty("jiraUser");}
    }

    public static String getJiraPassword(){

        String pl = System.getProperty("jiraPassword");
        if (pl== null){
            return config.getProperty("jiraPassword");
        }
        else{return System.getProperty("jjiraPassword");}
    }

    public static String getEpicLink(){
        String ui = System.getProperty("epicLink");
        if (ui== null){
            return config.getProperty("epicLink");
        }
        else{return System.getProperty("epicLink");}
    }

    public static String getEnvironment(){

        String pl = System.getProperty("environment");
        if (pl== null){
            return config.getProperty("environment");
        }
        else{return System.getProperty("environment");}
    }

    public static String getUserID(){
        String ui = System.getProperty("userId");
        if (ui== null){
            return config.getProperty("userId");
        }
        else{return System.getProperty("userId");}
    }

    public static String getTimestamp(){

        //Current date in integer format for screenshot and html unique name

        String str = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
            Date date = new Date();
            str = dateFormat.format(date);
            str = str.replace(" ", "").replaceAll("/", "");
        }catch(Exception ignored){ }

        return str;
    }

    public static String getCountry(){
        String country = System.getProperty("country");

        if (country == null) {
            return config.getProperty("country");
        }
        else{
            return System.getProperty("country");
        }
    }

    public static String getTester(){

        String pl = System.getProperty("tester");
        if (pl== null){
            return config.getProperty("tester");
        }
        else{return System.getProperty("tester");}
    }

    public static String getVersion(){

        String pl = System.getProperty("appVersion");
        if (pl== null){
            return config.getProperty("appVersion");
        }
        else{return System.getProperty("appVersion");}
    }

    public static void getAPK() throws IOException {

        //Turning off HTML warnings
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);

        FirefoxDriver cd = new FirefoxDriver(); //- In case HTMLUnitDriver does not work
        //System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        // HtmlUnitDriver cd = new HtmlUnitDriver(BrowserVersion.CHROME);
        //cd.setJavascriptEnabled(true);
        cd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        cd.manage().window().maximize();
        cd.get(DataSource.getPortal());

        prop.load(new FileInputStream(testData));
        String linkToFile=null;
        String toFile = prop.getProperty("androidLocation") + prop.getProperty("androidFileName");
        String fileVersion = null;

        if(getVersion().isEmpty()) {
            linkToFile = cd.findElementByXPath("//div[@class='download-wrapper']//div[2]//a[1]").getAttribute("href");
            String latestVersion = cd.findElementByXPath("//div[@class='download-wrapper']//div[2]//a[1]").getAttribute("text").trim();
            String[] versions = latestVersion.split("-");
            fileVersion = versions[0];
        }

        else if(!getVersion().isEmpty()) {
            cd.findElementByXPath("//div[@class='download-button']//div[@class='oldAndroidBtn'][contains(text(),'Older versions')]").click();
            linkToFile = cd.findElementByXPath("//a[contains(text(),\"" + getVersion() + "\")]").getAttribute("href");
            fileVersion = getVersion();
        }

        try {
            URL website = new URL(linkToFile);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(toFile);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        cd.manage().deleteAllCookies();
        cd.quit();

        appVersion = fileVersion;

        System.out.println("Downloaded application version: "+appVersion);
    }

    public static String getServiceId(){
        return config.getProperty("serviceId");
    }

    public static String getSMAP(){
        return config.getProperty("smap");
    }

    public static void getLog(){
        Reporter.log("<Thread-id: " + Thread.currentThread().getId() + ">", true);
    }

    static {
        System.out.println("loading config.properties..");
        config = new Properties();
        File f1 = new File("src//test//resources//properties//configurations//config.properties");
        try {
            FileInputStream file = new FileInputStream(f1);
            config.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Implicit wait is : " + getImplicitWait());
        System.out.println("Wait is : " + getWait());
        System.out.println("Sleep time is : " + getSleep());
        System.out.println("Timeout is : " + getTimeout());
        System.out.println("Platform is : " + getPlatform() + " " + getOSVersion());
        System.out.println("App version is : " + getVersion());
        System.out.println("User ID is : " + getUserID());

    }
}