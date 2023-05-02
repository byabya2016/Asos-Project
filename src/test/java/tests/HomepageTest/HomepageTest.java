package tests.HomepageTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class  HomepageTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(HomepageTest.class);

    @Test

    public void homepagePage() {
        LOG.info("Accept agreement");
        myOrdersPage.acceptAgreement();

        LOG.info("Verify if the Title is displayed");
        Assert.assertTrue(homepagePage.isTheTitleDisplayed());

        LOG.info("Click the search tab");
        Assert.assertTrue(homepagePage.isSearchTabDisplayed());

        LOG.info("Click the search tab");
        homepagePage.clickSearchTab();

        LOG.info("Verify if Sign In Logo is Displayed");
        Assert.assertTrue(homepagePage.isTheSignInLogoDisplayed());

        LOG.info("Click Sign In Logo");
        homepagePage.clickTheSignInLogo();

        LOG.info("Click Wishlist Button");
        homepagePage.clickWishlistButton();

        LOG.info("Click CheckOut Button");
        homepagePage.clickCheckOutButton();

    }
}