package stepDefinitions.payments;

import appObjects.NavigationBar;
import appObjects.cardsPage.CardsPage;
import appObjects.paymentPage.PaymentsPage;
import appObjects.paymentPage.ReviewPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class CardRepaymentSteps extends Base {

    private Base base;

    public CardRepaymentSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        cards = new CardsPage(d);
        payment = new PaymentsPage(d);
        navigate = new NavigationBar(d);
        review = new ReviewPage(d);
    }
}