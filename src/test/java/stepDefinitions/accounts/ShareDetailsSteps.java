package stepDefinitions.accounts;

import appObjects.accountsPage.ShareDetailsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import testSetup.Base;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.FileInputStream;
import java.io.IOException;

public class ShareDetailsSteps extends Base {

    private Base base;

    public ShareDetailsSteps(Base base) {
        this.base = base;
    }

    @Before
    public void getData() throws IOException {
        prop.load(new FileInputStream(testData));
        config.load(new FileInputStream(configData));
        share = new ShareDetailsPage(d);
    }
}