package testSetup;

import appObjects.NavigationBar;
import appObjects.morePage.OurProducts;
import appObjects.accountsPage.*;
import appObjects.cardsPage.CardsPage;
import appObjects.cardsPage.LimitsPage;
import appObjects.morePage.AnalyticsPage;
import appObjects.morePage.MessagesPage;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.AppAndPolicies;
import appObjects.morePage.settingsPage.Security;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.paymentPage.TemplatesPage;
import appObjects.preLoginObjects.ActivationObjects;
import appObjects.preLoginObjects.LoginPage;
import appObjects.preLoginObjects.PreLoginPage;
import appObjects.preLoginObjects.mToken;
import appObjects.morePage.settingsPage.Services;
import appObjects.accountsPage.transactions.FilterObjects;
import appObjects.accountsPage.transactions.SearchObjects;
import appObjects.morePage.settingsPage.MyProfile;
import appObjects.accountsPage.transactions.TransactionsObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import testSetup.appiumSetup.DataSource;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;
import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Base {

//THIS BASE CLASS, IT IS USED FOR DECLARING DRIVER, LOCATIONS, OBJECTS, AND GLOBAL METHODS

    //DRIVER VARIABLES
    public static AppiumDriver d;
    public static AppiumDriverLocalService service;

    //EXTENT REPORT VARIABLES
    Scenario scn;
    //public static ExtentCucumberAdapter extent;
    public static String testName;
    public static String featureName;
    public static String scenarioName;
    public static String appVersion;
    public static String reportLocation = System.getProperty("user.dir") + "/test-output/";
    public static String screenshotLocation = reportLocation + getcurrentdate() + ".png";
    public static String screenshotFile = getcurrentdate() + ".png";

    //PROPERTY FILES
    protected static Properties prop = new Properties();
    protected static Properties andProp = new Properties();
    protected static Properties macProp = new Properties();
    protected static Properties config = new Properties();
    public static String testData = "src//test//resources//properties//testData.properties";
    public String andData = "src//test//resources//properties//configurations//andData.properties";
    public String macData = "src//test//resources//properties//configurations//macData.properties";
    public static String configData = "src//test//resources//properties//configurations//config.properties";

    //PAGE OBJECTS
    protected PreLoginPage preLogin;
    protected LoginPage login;
    protected ActivationObjects activation;
    protected AccountsLandingPage accounts;
    protected AccountDetailsPage accountDetails;
    protected TermDepositPage deposit;
    protected SavingsAccountPage savings;
    protected ShareDetailsPage share;
    protected SearchObjects search;
    protected FilterObjects filter;
    protected CardsPage cards;
    protected LimitsPage limits;
    protected PaymentsPage payment;
    protected ReviewPage review;
    protected TemplatesPage templates;
    protected MorePage more;
    protected Security security;
    protected MyProfile profile;
    protected Services services;
    protected AnalyticsPage analytics;
    protected NavigationBar navigate;
    protected TransactionsObjects transactions;
    protected MessagesPage messages;
    protected OurProducts products;
    protected mToken mtoken;
    protected AppAndPolicies appAndPolicies;

    public static String activationCode;



//GENERAL METHODS

        public void captureScreenshot(AppiumDriver d) throws IOException {

    //Take screenshot of failed step
        File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
        screenshotLocation = reportLocation+"//screenshots//" + getcurrentdate()+".png";
        File target = new File(screenshotLocation);
        FileUtils.copyFile(src,target);
    }

    public static boolean checkIfServerIsRunning(int port) {
        boolean isServerRunning = false;

        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();
        } catch (IOException e) {
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

    public void datePicker(String date){

        if(DataSource.getPlatform().equals("Android")){
            d.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward(100).scrollDescriptionIntoView(\"" + date + "\");"
            ));
            d.findElement(By.xpath("//android.view.View[@content-desc=\"" + date + "\"]")).click();

        }
        else{d.findElement(By.xpath("//XCUIElementTypeStaticText[@id=\""+ date + "\"]")).click(); }

    }

    public void swiper(String element, String direction){
        WebElement el1;
        if(DataSource.getPlatform().equals("Android")){
            el1 = d.findElement(By.xpath("//*[contains(@content-desc," + element + ")]"));
        }
        else{
            el1 = d.findElement(By.xpath("//*[contains(@id,"+ element + ")]"));
        }

        TouchAction swipe = new TouchAction(d);

        if(direction.equals("right")){
            int startX = el1.getLocation().getX();
            int startY = el1.getLocation().getY();
            int endX = startX + 1000;
            swipe.longPress(PointOption.point(startX, startY)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(endX, startY)).release().perform();
        }
        else if(direction.equals("left")){
            int startX = el1.getLocation().getX();
            int startY = el1.getLocation().getY();
            int startXIOS = startX + 1000;
            int endX = startX - 1000;

            if(config.getProperty("platform").equals("Android")){
                swipe.longPress(PointOption.point(startX, startY)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(endX, startY)).release().perform();
            }
            else{
                swipe.longPress(PointOption.point(startXIOS, startY)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(endX, startY)).release().perform();
            }
        }

    }

    public void switcher(WebElement element,String turn){
        switch(turn) {
            case "on" :
                if (element.getAttribute("checked").equals("false")) {
                    element.click();
                    assertEquals(element.getAttribute("checked"), "true");
                }
                break;
            case "off" :
                if (element.getAttribute("checked").equals("true")) {
                    element.click();
                    assertEquals(element.getAttribute("checked"), "false");
                }
            default:
                break;
        }
        sleep();
    }

    public void agreementSwitcher(WebElement element,String turn){
        switch(turn) {
            case "on" :
                if (element.getAttribute("checked").equals("false")) {
                    element.click();
                }
                break;
            case "off" :
                if (element.getAttribute("checked").equals("true")) {
                    element.click();
                }

            default:
                break;
        }
        sleep();
    }

    public void selector(String select) {
       try {
           stringToElementByText(select).click();
            }
           catch(NoSuchElementException e) {
           scrollTextContainsIntoViewSelect(select);
           stringToElementByText(select).click();
           }
       }

    public void searchSelector(String template) {
        try {
            WebElement selectElement;
            if (DataSource.getPlatform().equals("Android")) {
                selectElement = d.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + template + "')]"));
            } else {
                selectElement = d.findElement(By.xpath("//*[contains(@id," + template + ")]"));
            }
            selectElement.click();
        }
        catch(NoSuchElementException e) {
            scrollTextContainsIntoViewSelect(template);
                WebElement selectElement;
                if (DataSource.getPlatform().equals("Android")) {
                    selectElement = d.findElement(By.xpath("//android.widget.TextView[contains(@text,'" + template + "')]"));
                } else {
                    selectElement = d.findElement(By.xpath("//*[contains(@id," + template + ")]"));
                }
                selectElement.click();
        }

    }

    public void messageSelector(String message) {
        try {
            WebElement selectElement;
            if (DataSource.getPlatform().equals("Android")) {
                selectElement = d.findElement(By.xpath("//android.widget.TextView[@text='" + message + "']"));
            } else {
                selectElement = d.findElement(By.xpath("//*[@id," + message + "]"));
            }
            selectElement.click();
        }
        catch(NoSuchElementException e) {
            scrollTextContainsIntoViewSelect(message);
            WebElement selectElement;
            if (DataSource.getPlatform().equals("Android")) {
                selectElement = d.findElement(By.xpath("//android.widget.TextView[@text='" + message + "')]"));
            } else {
                selectElement = d.findElement(By.xpath("//*[@id," + message + "]"));
            }
            selectElement.click();
        }

    }

    public void selectorDesc(String select) {
        try{
            stringToElementByDescription(select).isDisplayed();
        }
        catch(NoSuchElementException e){
            scrollDescriptionIntoViewSelect(select);
            stringToElementByDescription(select).click();
        }
    }

    public WebElement stringToElementByText(String select){
           WebElement selectElement;
           if (DataSource.getPlatform().equals("Android")) {
               selectElement = d.findElementByXPath("//*[contains(@text,'" + select + "')]");
           } else {
               selectElement = d.findElement(By.xpath("//*[contains(@id," + select + ")]"));
           }
           return selectElement;
       }

    public WebElement stringToElementByDescription(String description){
        WebElement selectElement;
        if (DataSource.getPlatform().equals("Android")) {
            selectElement = d.findElementByXPath("//*[contains(@content-desc,'" + description + "')]");
        } else {
            selectElement = d.findElement(By.xpath("//*[contains(@id," + description + ")]"));
        }
        return selectElement;
    }

    public WebElement stringToElementById(String id){
        WebElement selectElement;
        if (DataSource.getPlatform().equals("Android")) {
            selectElement = d.findElementByXPath("//*[@resource-id='" + id + "']");
        } else {
            selectElement = d.findElement(By.xpath("//*[@id='" + id + "']"));
        }
        return selectElement;
    }

    public WebElement transactionElement(String desc, String text){
        WebElement selectElement;
        if (DataSource.getPlatform().equals("Android")) {
            selectElement = d.findElementByXPath("//*[contains(@content-desc,'" + desc + "') and contains(@text,'" + text + "')]");
        } else {
            selectElement = d.findElement(By.xpath("//*[@id='" + desc + "' and @text='" + text + "']"));
        }
        return selectElement;
    }

    public void sleep()  {
        String str = DataSource.getSleep();
        try {
            Thread.sleep(Long.parseLong(str));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void wait(WebElement element){
        String errorMessage = element.toString() + " element is not found";

        Wait<AppiumDriver> wait = new FluentWait<>(d)
                .withTimeout(Duration.ofSeconds(Long.parseLong(DataSource.getWait())))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
      try {
          wait.until(ExpectedConditions.visibilityOf(element));
      }
      catch(TimeoutException e){
          if(isElementPresent(element)==false){
              throw new Error(errorMessage);
          }
      }
    }

    public void waitTimeout(WebElement element){
        String errorMessage = element.toString() + " element is not found";

        Wait<AppiumDriver> wait = new FluentWait<>(d)
                .withTimeout(Duration.ofSeconds(65))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch(TimeoutException e){
            if(isElementPresent(element)==false){
                throw new Error(errorMessage);
            }
        }
    }

    public void verifyPage(WebElement el, String page) {
        sleep();
        String pageTitle = page.toUpperCase();
        String errorMessage = pageTitle + " page did not open";
        if(isElementPresent(el)==false){
           throw new Error(errorMessage);
        }
    }

    public void verifyMessage(WebElement el, String message) {
        sleep();
        String pageTitle = message.toUpperCase();
        String errorMessage = pageTitle + " message did not show";
        if(isElementPresent(el)==false){
            throw new Error(errorMessage);
        }
    }

    public void verifyAccountDetail(String accountDetail){
        String detail = prop.getProperty(accountDetail);
        String errorMessage = detail + " is not visible";
        if(isElementPresent(stringToElementByText(detail))==false){
            throw new Error(errorMessage);
        }

    }

    public void verifyWrongPINText(String attempt, String text) {
        sleep();
        String pageTitle = text.toUpperCase();
        String errorMessage = pageTitle + " text did not show";
        if(isElementPresent(stringToElementByText(attempt))==false){
            throw new Error(errorMessage);
        }
    }

    public void verifyElementText(WebElement el, String text) {
        sleep();
        String elementText = el.getText();
        String errorMessage = text + " text did not match with "+elementText;
        if(!elementText.contains(text)){
            throw new Error(errorMessage);
        }
    }

    protected boolean isElementPresent(WebElement el){
        try{
            el.isDisplayed();
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }

    public void dragger(String select, String direction) {

        WebElement selectElement;
        if(DataSource.getPlatform().equals("Android")){
            selectElement = d.findElementByXPath("//*[contains(@content-desc,'" + select + "')]");
        }
        else{
            selectElement = d.findElement(By.xpath("//*[contains(@id," + select + ")]"));
        }

        TouchAction drag = new TouchAction(d);

        if(direction.equals("down")){
            int startX = selectElement.getLocation().getX();
            int startY = selectElement.getLocation().getY();
            int endY = startY - 200;
            drag.longPress(PointOption.point(startX, startY)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(startX, endY)).perform().release();
        }
        else if(direction.equals("up")){
            int startX = selectElement.getLocation().getX();
            int startY = selectElement.getLocation().getY();
            int endY = startY + 200;
            drag.longPress(PointOption.point(startX, startY)).waitAction(waitOptions(ofMillis(1000))).moveTo(PointOption.point(startX, endY)).perform().release();

        }


    }

    public void verifyCopyToClip(String detail) throws IOException, UnsupportedFlavorException {
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        String errorMessage = "Copied data is wrong";
        assertTrue(myText.contains(prop.getProperty(detail)),errorMessage);
    }

    public void verifyEnabled(WebElement el, String enabled){
        switch(enabled) {
            case "on":
                assertThat(el.getAttribute("enabled").equals("true"));
                break;

            case "off":
                assertThat(el.getAttribute("enabled").equals("false"));

            default:
                break;
        }
    }

    public void verifySelected(WebElement el, String enabled){
        switch(enabled) {
            case "on":
                assertThat(el.getAttribute("selected").equals("true"));
                break;

            case "off":
                assertThat(el.getAttribute("selected").equals("false"));

            default:
                break;
        }
    }

    public String day() {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        String dayOfMonthStr = String.valueOf(dayOfMonth);

        return dayOfMonthStr;
    }

    public String month(){
        Calendar cal = Calendar.getInstance();
        String period = new SimpleDateFormat("MMMM", Locale.ENGLISH).format(cal.getTime());
        String periodUpper = period.toUpperCase();
        return periodUpper;
    }

    public String year(){
        Calendar cal = Calendar.getInstance();
        String period = new SimpleDateFormat("yyyy").format(cal.getTime());
        String periodUpper = period.toUpperCase();

        return periodUpper;
    }

    public static String getcurrentdate(){

        //Current date in integer format for screenshot and html unique name

        String str = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
            Date date = new Date();
            str = dateFormat.format(date);
            str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
        }catch(Exception e){

        }
        return str;
    }

    public void typeInProperty(WebElement field, String property) {

        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        field.click();
        field.clear();
        field.sendKeys(prop.getProperty(property));

        if (DataSource.getPlatform().equals("iOS")) {

            TouchAction tap = new TouchAction(d);

            int pressX = d.manage().window().getSize().width / 2;
            int pressY = d.manage().window().getSize().height / 10;
            tap.press(PointOption.point(pressX,pressY)).release().perform();
        }
    }

    public void typeIn(WebElement field, String string) {

        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        field.click();
        field.clear();
        field.sendKeys(string);

        if (DataSource.getPlatform().equals("iOS")) {

            TouchAction tap = new TouchAction(d);

            int pressX = d.manage().window().getSize().width / 2;
            int pressY = d.manage().window().getSize().height / 10;
            tap.press(PointOption.point(pressX,pressY)).release().perform();
        }
    }

    public void verifier(WebElement el1, String property ) {

        try {
            prop.load(new FileInputStream(testData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String element = el1.getText();
        String propertyString = prop.getProperty(property);
        String errorMessage = "Found :" + element + " but expected " + propertyString;
        assertTrue(element.contains(propertyString), errorMessage);
    }

    public void scrollMethod(int fromX, int fromY, int toX, int toY) {
        TouchAction touchAction = new TouchAction(d);
        touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
    }

    public void scroll(String direction){
        if(direction.equals("down")){
            int pressX = d.manage().window().getSize().width / 2;
            int bottomY = d.manage().window().getSize().height * 4/5;
            int topY = d.manage().window().getSize().height / 8;

            scrollMethod(pressX, bottomY, pressX, topY);
        }
        else if(direction.equals("up")){
            int pressX = d.manage().window().getSize().width / 2;
            int bottomY = d.manage().window().getSize().height * 4/5;
            int topY = d.manage().window().getSize().height / 8;

            scrollMethod(pressX, topY, pressX, bottomY);
        }
    }

    public void scroller(String direction, int step) {
        sleep();
        if(direction.equals("down")){
            int pressX = d.manage().window().getSize().width / 2;
            int bottomY = d.manage().window().getSize().height * 4/5;
            int topY = bottomY-step;

            scrollMethod(pressX, bottomY, pressX, topY);
        }

        else if(direction.equals("up")){
            int pressX = d.manage().window().getSize().width / 2;
            int topY = d.manage().window().getSize().height / 8;
            int bottomY = topY+step;

            scrollMethod(pressX, topY, pressX, bottomY);
        }

    }

    public void scrollTextIntoView(WebElement el, String str) {
        try {el.isDisplayed();
        } catch (NoSuchElementException e) {
            if (DataSource.getPlatform().equals("Android")) {
                d.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward().scrollIntoView(text(\"" + str + "\"));"));
            }
        }
    }

    public void scrollDescriptionIntoView(WebElement el,String str){
        try{el.isDisplayed();
        }
        catch(NoSuchElementException e) {
            if (DataSource.getPlatform().equals("Android")) {
                d.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward().scrollDescriptionIntoView(\"" + str + "\");"));
            }
        }
    }

    public void scrollDescriptionContainsIntoView(WebElement el,String str){
        try{el.isDisplayed();}
        catch(NoSuchElementException e) {
            if (DataSource.getPlatform().equals("Android")) {
                d.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward().scrollIntoView(descriptionContains(\"" + str + "\"));"));
            }
        }
    }

    public void scrollTextContainsIntoView(WebElement el,String str){
        try{el.isDisplayed();}
        catch(NoSuchElementException e) {
            if (DataSource.getPlatform().equals("Android")) {
                    d.findElement(MobileBy.AndroidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward().scrollIntoView(textContains(\"" + str + "\"));"));
            }
        }
    }

    public void scrollTextContainsIntoViewSelect(String str) {
        if (DataSource.getPlatform().equals("Android")) {
            try {
                stringToElementByText(str).isDisplayed();
            }
            catch(NoSuchElementException e){
                d.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward().setSwipeDeadZonePercentage(0.2).scrollIntoView(textContains(\"" + str + "\"));"));
            }

        }
    }

    public void scrollDescriptionIntoViewSelect(String desc){
        if (DataSource.getPlatform().equals("Android")) {
            try{stringToElementByDescription(desc).isDisplayed();}
            catch (NoSuchElementException e) {
                d.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward().setSwipeDeadZonePercentage(0.2).scrollDescriptionIntoView(\"" + desc + "\");"));
            }
            assertThat(stringToElementByDescription(desc).isDisplayed());
            scroller("down",300);
        }
    }

    public void swipeMethod(int fromX, int fromY, int toX, int toY)  {
        sleep();
        TouchAction touchAction = new TouchAction(d);
        touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
    }

    public void swipeElementMethod(WebElement el1, String direction) {

        TouchAction swipe = new TouchAction(d);

        if (direction.equals("right")) {
            int startX = el1.getLocation().getX();
            int startY = el1.getLocation().getY();
            int endX = startX + 1000;
            swipe.longPress(PointOption.point(startX, startY)).waitAction(waitOptions(ofMillis(500))).moveTo(PointOption.point(endX, startY)).release().perform();
        } else if (direction.equals("left")) {
            int startX = el1.getLocation().getX();
            int startY = el1.getLocation().getY();
            int startXIOS = startX + 1000;
            int endX = startX - 1000;
            if (DataSource.getPlatform().equals("Android")) {
                swipe.longPress(PointOption.point(startX, startY)).waitAction(waitOptions(ofMillis(500))).moveTo(PointOption.point(endX, startY)).release().perform();
            } else {
                swipe.longPress(PointOption.point(startXIOS, startY)).waitAction(waitOptions(ofMillis(500))).moveTo(PointOption.point(endX, startY)).release().perform();
            }
        }

    }

    protected boolean isDescriptionSelected(String text){
        try{
            return stringToElementByDescription(text).isSelected();
        }
        catch(NoSuchElementException e){
            return false;
        }
    }

    public void swipe(String direction, int speed, double percent){

        int left = d.manage().window().getSize().width / 2;
        int top = d.manage().window().getSize().height / 3;

        JavascriptExecutor j = d;
        Map<String, Object> param = new HashMap<>();
       // param.put("elementId", ((RemoteWebElement) element).getId());
        param.put("left",left);
        param.put("top",top);
        param.put("width",500);
        param.put("height",200);
        param.put("direction", direction);
        param.put("percent",percent);
        param.put("speed", speed);
        j.executeScript("mobile: swipeGesture", param);
    }

    public void swipeByElement(WebElement element, String direction, int speed, double percent){

       // int left = d.manage().window().getSize().width / 2;
      //  int top = d.manage().window().getSize().height / 3;

        JavascriptExecutor j = d;
        Map<String, Object> param = new HashMap<>();
        param.put("elementId", ((RemoteWebElement) element).getId());
        param.put("direction", direction);
        param.put("percent",percent);
        param.put("speed", speed);
        j.executeScript("mobile: swipeGesture", param);
    }

    public void swipeLeft(WebElement element, int speed, double percent){
        wait(element);
        JavascriptExecutor j = d;
        Map<String, Object> param = new HashMap<>();
        param.put("elementId", ((RemoteWebElement) element).getId());
        param.put("direction", "left");
        param.put("percent",percent);
        param.put("speed", speed);
        j.executeScript("mobile: swipeGesture", param);
    }

    public void swipeRight(WebElement element, int speed, double percent){
        wait(element);
        JavascriptExecutor j = d;
        Map<String, Object> param = new HashMap<>();
        param.put("elementId", ((RemoteWebElement) element).getId());
        param.put("direction", "right");
        param.put("percent",percent);
        param.put("speed", speed);
        j.executeScript("mobile: swipeGesture", param);
    }

    public void swipeToElementByDescription(WebElement element, String objectDescription, int swipes) {

        String platform = DataSource.getPlatform();

        switch (platform.toUpperCase()) {
            case "ANDROID":

                int attempt = 0;

                while(!isDescriptionPresent(objectDescription)){
                    swipeLeft(element,500,0.5);

                    attempt++;

                    if(isDescriptionPresent(objectDescription)){
                        break;
                    }

                    else if(!isDescriptionPresent(objectDescription) && attempt == swipes) {
                        String error = "COULD NOT FIND: " + objectDescription;
                        throw new Error(error);
                    }
                }

                break;


            case("IOS"):

                JavascriptExecutor js = d;
                Map<String, Object> params = new HashMap<>();
                params.put("direction", "left");
                params.put("velocity", 2500);
                params.put("toVisible", "true");
                params.put("element", ((RemoteWebElement) element).getId());
                js.executeScript("mobile: swipeGesture", params);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + platform.toUpperCase());
        }
    }

    public void swipeToElementByDescription2(String direction, String objectDescription, int swipes) {

        String platform = DataSource.getPlatform();

        switch (platform.toUpperCase()) {
            case "ANDROID":

                int attempt = 0;
                while(!isDescriptionSelected(objectDescription)){

                    swipe(direction,2000,0.9);
                    attempt++;

                    if(isDescriptionSelected(objectDescription)){
                        break;
                    }
                    else if(!isDescriptionSelected(objectDescription) && attempt == swipes) {
                        String error = "COULD NOT FIND: " + objectDescription;
                        throw new Error(error);
                    }
                }
                break;

            case("IOS"):

                JavascriptExecutor js = d;
                Map<String, Object> params = new HashMap<>();
                if(direction.equals("left")){
                    params.put("duration", 1.0);
                    params.put("fromX", 100);
                    params.put("fromY", 100);
                    params.put("toX", 200);
                    params.put("toY", 200);}
                else{

                }
                js.executeScript("mobile: dragFromToForDuration", params);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + platform.toUpperCase());
        }
    }


    public void swipeBackToElementByDescription(WebElement element, String objectDescription, int swipes) {

        String platform = DataSource.getPlatform();

        switch (platform.toUpperCase()) {
            case "ANDROID":

                int attempt = 0;

                while(!isDescriptionPresent(objectDescription)){
                    swipeRight(element,500,0.5);

                    attempt++;

                    if(isDescriptionPresent(objectDescription)){
                        break;
                    }

                    else if(!isTextPresent(objectDescription) && attempt == swipes) {
                        String error = "COULD NOT FIND: " + objectDescription;
                        throw new Error(error);
                    }
                }

                break;


            case("IOS"):

                JavascriptExecutor js = d;
                Map<String, Object> params = new HashMap<>();
                params.put("direction", "left");
                params.put("velocity", 2500);
                params.put("toVisible", "true");
                params.put("element", ((RemoteWebElement) element).getId());
                js.executeScript("mobile: swipeGesture", params);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + platform.toUpperCase());
        }
    }

    public void swipeToElementByText(String direction, String objectDescription, int swipes) {

        String platform = DataSource.getPlatform();

        switch (platform.toUpperCase()) {
            case "ANDROID":
                WebElement el1 = stringToElementById("hr.asseco.android.ui.demo.de:id/amount_visibility_button");
                int attempt = 0;

                while(!isTextPresent(objectDescription)){

                    swipeByElement(el1, direction,2000,1.0);
                    attempt++;

                    if(isTextPresent(objectDescription)){
                        break;
                    }

                    else if(!isTextPresent(objectDescription) && attempt == swipes) {
                        String error = "COULD NOT FIND: " + objectDescription;
                        throw new Error(error);
                    }
                }

                break;

            case("IOS"):

                JavascriptExecutor js = d;
                Map<String, Object> params = new HashMap<>();
                params.put("duration", 1.0);
                params.put("fromX", 100);
                params.put("fromY", 100);
                params.put("toX", 200);
                params.put("toY", 200);
                js.executeScript("mobile: swipeGesture", params);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + platform.toUpperCase());
        }
    }



    public void swipeBackToElementByText(WebElement element, String objectDescription, int swipes) {

        String platform = DataSource.getPlatform();

        switch (platform.toUpperCase()) {
            case "ANDROID":

                int attempt = 0;

                while(!isTextPresent(objectDescription)){

                    swipeRight(element,500,0.9);
                    attempt++;

                    if(isTextPresent(objectDescription)){
                        break;
                    }

                    else if(!isTextPresent(objectDescription) && attempt == swipes) {
                        String error = "COULD NOT FIND: " + objectDescription;
                        throw new Error(error);
                    }
                }

                break;

            case("IOS"):

                JavascriptExecutor js = d;
                Map<String, Object> params = new HashMap<>();
                params.put("direction", "right");
                params.put("velocity", 2500);
                params.put("toVisible", "true");
                params.put("element", ((RemoteWebElement) element).getId());
                js.executeScript("mobile: swipeGesture", params);

                break;

            default:

                throw new IllegalStateException("Unexpected value: " + platform.toUpperCase());
        }
    }

    protected boolean isDescriptionPresent(String text){
        try{
            stringToElementByDescription(text).isDisplayed();
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }

    protected boolean isTextPresent(String text){
        try{
            stringToElementByText(text).isDisplayed();
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }

    protected boolean isTextNOTPresent(String text){
        try{
            stringToElementByText(text).isDisplayed();
            return false;
        }
        catch(NoSuchElementException e){
            return true;
        }
    }

    //TODO:
    public byte[] extraBytes (String imageName)throws IOException{
        File imgPath = new File (imageName);
        BufferedImage buffImage = ImageIO.read(imgPath);
        return Files.readAllBytes(new File(imageName).toPath());
    }

    public byte[] extractBytes (String imageName)throws IOException{
        File imgPath = new File (imageName);
        BufferedImage buffImage = ImageIO.read(imgPath);

        WritableRaster raster = buffImage.getRaster();
        DataBufferByte data = (DataBufferByte) raster.getDataBuffer();

        return (data.getData());
    }

    public void scrollElementIntoView(WebElement el){

        boolean isPresent = isElementPresent(el);

        if(isPresent==false){
            scroll("down");
        }
    }


    public String getUser (String activationCode){

        String code1stPart = activationCode.substring(0,8);
              return code1stPart;
    }

    public String getCode (String activationCode){
                String code2ndPart = activationCode.substring(8,16);
        return code2ndPart;
    }


}