package stepDefinitions.prelogin;

import appObjects.NavigationBar;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.Security;
import appObjects.paymentPage.PaymentsPage;
import appObjects.preLoginObjects.ActivationObjects;
import appObjects.preLoginObjects.LoginPage;
import appObjects.preLoginObjects.PreLoginPage;
import appObjects.preLoginObjects.mToken;
import io.cucumber.java.Before;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class mTokenSteps extends Base {

    private Base base;

    public mTokenSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        preLogin = new PreLoginPage(d);
        more = new MorePage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        login = new LoginPage(d);
        payment = new PaymentsPage(d);
        activation = new ActivationObjects(d);
        mtoken = new mToken(d);
    }
}