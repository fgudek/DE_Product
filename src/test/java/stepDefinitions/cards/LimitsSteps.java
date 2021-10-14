package stepDefinitions.cards;

import appObjects.cardsPage.CardsPage;
import appObjects.cardsPage.LimitsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.io.FileInputStream;
import java.io.IOException;

public class LimitsSteps extends Base {

    private Base base;

    public LimitsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        cards = new CardsPage(d);
        limits = new LimitsPage(d);
    }
}