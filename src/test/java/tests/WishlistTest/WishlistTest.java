package tests.WishlistTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WishlistPage.WishlistPage;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class WishlistTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(WishlistTest.class);
    private Object String;

    @Test
    public void wishlistPage() {

        String size = "UK 10";

        LOG.info("Accept agreement");
        homepagePage.acceptAgreement();

        LOG.info("Click Women Tab");
        wishlistPage.clickWomenTab();

        LOG.info("Click New In Clothing Tab");
        wishlistPage.clickNewInClothingTab();

        LOG.info("Click one item");
        wishlistPage.setClickOneItem();

        LOG.info("Select size");
        wishlistPage.selectSizeTub(size);

        LOG.info("Add item to Wishlist");
        wishlistPage.clickWishlistTab();

        LOG.info("Click Add to Bag");
        wishlistPage.clickAddToBagButton();
    }
}