package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import appObjects.paymentPage.TemplatesPage;
import appObjects.accountsPage.transactions.SearchObjects;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class TemplatesSteps extends Base {

    private Base base;

    public TemplatesSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        payment = new PaymentsPage(d);
        review = new ReviewPage(d);
        templates = new TemplatesPage(d);
        navigate = new NavigationBar(d);
        search = new SearchObjects(d);
    }
}