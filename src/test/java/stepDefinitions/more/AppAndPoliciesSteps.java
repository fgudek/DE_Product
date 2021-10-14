package stepDefinitions.more;

import appObjects.NavigationBar;
import appObjects.morePage.MessagesPage;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.AppAndPolicies;
import appObjects.morePage.settingsPage.Security;
import appObjects.preLoginObjects.PreLoginPage;
import appObjects.accountsPage.transactions.SearchObjects;
import io.cucumber.java.Before;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class AppAndPoliciesSteps extends Base {

    private Base base;

    public AppAndPoliciesSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        more = new MorePage(d);
        preLogin = new PreLoginPage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        search = new SearchObjects(d);
        messages = new MessagesPage(d);
        appAndPolicies = new AppAndPolicies(d);
    }

}