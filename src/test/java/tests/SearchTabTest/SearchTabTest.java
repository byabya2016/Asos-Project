package tests.SearchTabTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchTabPage.SearchTabPage;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class SearchTabTest extends BaseTest {
    public static SearchTabPage getInstance;
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(tests.SearchTabTest.SearchTabTest.class);


    @Test
    public void searchTabTest () {
        String dresses = "red dress";

        LOG.info("Accept agreement");
        myOrdersPage.acceptAgreement();

        LOG.info("Click the search tab");
        searchTabPage.clickSearchTab();

        LOG.info("Type in The Search Field");
        searchTabPage.typeInSearchTab(dresses);



    }
}