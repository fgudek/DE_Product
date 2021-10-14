package stepDefinitions.more;

import appObjects.NavigationBar;
import appObjects.morePage.MorePage;
import appObjects.morePage.settingsPage.Security;
import appObjects.morePage.settingsPage.Services;
import io.cucumber.java.Before;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class ServicesSteps extends Base {

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        more = new MorePage(d);
        security = new Security(d);
        navigate = new NavigationBar(d);
        services = new Services(d);
    }
}