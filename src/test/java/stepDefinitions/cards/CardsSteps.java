package stepDefinitions.cards;

import appObjects.accountsPage.transactions.SearchObjects;
import appObjects.cardsPage.CardsPage;
import appObjects.NavigationBar;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class CardsSteps extends Base {

    private Base base;

    public CardsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        cards = new CardsPage(d);
        search = new SearchObjects(d);
        navigate = new NavigationBar(d);
    }
}