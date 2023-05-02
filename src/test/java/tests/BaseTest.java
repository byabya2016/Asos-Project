
package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.CheckOutPage.CheckOutPage;
import pages.HomepagePage.HomepagePage;
import pages.MyAccountPage.MyAccountPage;
import pages.MyOrdersPage.MyOrdersPage;
import pages.SearchTabPage.SearchTabPage;
import pages.WishlistPage.WishlistPage;

public class BaseTest {

    public MyAccountPage myAccountPage = MyAccountPage.getInstance();
    public WishlistPage wishlistPage = WishlistPage.getInstance();
    public HomepagePage homepagePage = HomepagePage.getInstance();
    public MyOrdersPage myOrdersPage = MyOrdersPage.getInstance();
    public SearchTabPage searchTabPage = SearchTabPage.getInstance();
    public CheckOutPage checkOutPage = CheckOutPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {

        BasePage.tearDown();
    }
}