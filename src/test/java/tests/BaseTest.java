
package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomepagePage.HomepagePage;
import pages.MyAccountPage.MyAccountPage;
import pages.SignInPage.SignInPage;
import pages.BasePage;
import pages.WishlistPage.WishlistPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public MyAccountPage myOrderPage = MyAccountPage.getInstance();
    public WishlistPage wishlistPage = WishlistPage.getInstance();
    public HomepagePage homepagePage = HomepagePage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {

        BasePage.tearDown();
    }


}