package tests.MyOrdersTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class MyOrdersTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(tests.MyOrdersTest.MyOrdersTest.class);

    @Test

    public void myOrdersPage (){

        LOG.info("Accept agreement");
        myOrdersPage.acceptAgreement();

        LOG.info("Verify if Sign In Logo is Displayed");
        Assert.assertTrue(myOrdersPage.isTheSignInLogoDisplayed());

        LOG.info("Click Sign In Logo");
        myOrdersPage.clickTheSignInLogo();

        LOG.info("Click My Orders Tab");
        myOrdersPage.clickMyOrdersTab();


    }
}
