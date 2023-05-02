
package tests.MyAccountTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class MyAccountTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(MyAccountTest.class);
    private Object String;

    @Test

    public void myAccountTest() {
        LOG.info("Accept agreement");
        myOrdersPage.acceptAgreement();

        LOG.info("Verify if Sign In Logo is Displayed");
        Assert.assertTrue(myAccountPage.isTheSignInLogoDisplayed());

        LOG.info("Click Sign In Tab");
        myAccountPage.clickTheSignInTab();

        LOG.info("Check My Account Button is Displayed");
        Assert.assertTrue(myAccountPage.isMyAccountButtonDisplayed());

        LOG.info("Click My Account Button");
        myAccountPage.clickMyAccountButton();

    }
}



