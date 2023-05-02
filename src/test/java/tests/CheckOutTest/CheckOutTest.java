package tests.CheckOutTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class CheckOutTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(tests.CheckOutTest.CheckOutTest.class);

    @Test

    public void checkOutTest() {

        String size = "UK 10";

        LOG.info("Accept agreement");
        checkOutPage.acceptAgreement();

        LOG.info("Click Women Button");
        checkOutPage.clickWomenButton();

        LOG.info("Click New In Clothing Tab");
        checkOutPage.clickNewInClothingTab();

        LOG.info("Click one item");
        checkOutPage.clickBlackDress();

        LOG.info("Select size");
        checkOutPage.selectSizeButton(size);

        LOG.info("Add item to Wishlist");
        checkOutPage.clickWishlistButton();

        LOG.info("Click Add to Bag");
        checkOutPage.clickAddToBagButton();
    }
}


