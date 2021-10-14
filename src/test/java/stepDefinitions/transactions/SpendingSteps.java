package stepDefinitions.transactions;

import appObjects.morePage.MorePage;
import appObjects.accountsPage.transactions.SearchObjects;
import appObjects.NavigationBar;
import appObjects.morePage.AnalyticsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class SpendingSteps extends Base {

    private Base base;

    public SpendingSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        search = new SearchObjects(d);
        more = new MorePage(d);
        analytics = new AnalyticsPage(d);
        navigate = new NavigationBar(d);


    }
}