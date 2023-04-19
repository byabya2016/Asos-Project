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
    private Object String;

    @Test

    public void signInPage() {

        LOG.info("Verify if the Title is displayed");
        Assert.assertTrue(homepagePage.isTheTitleDisplayed());

        LOG.info("Verify if Women Tab is Displayed");
        Assert.assertTrue(homepagePage.isWomenTabDisplayed());

        LOG.info("Click Women Tab");
        homepagePage.setClickWomenTab();

        LOG.info("Click the search tab");
        homepagePage.clickSearchTab();
    }





}