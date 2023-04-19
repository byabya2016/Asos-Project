
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

    public void myOrderPage() {

        String email = "firudaniel00@gmail.com";
        String password = "Firu1949";
        String firstName = "Bianca";
        String lastName = "Veliscu";
        String emailAddress = "firudaniel00@gmail.com";
        String day = "10";
        String month = "5";
        String year = "1990";

        LOG.info("Verify if Sign In Logo is Displayed");
        Assert.assertTrue(myOrderPage.isTheSignInLogoDisplayed());

        LOG.info("Click Sign In Tab");
        myOrderPage.clickTheSignInTab();

        LOG.info("Check My Account Button is Displayed");
        Assert.assertTrue(myOrderPage.isMyAccountButtonDisplayed());

        LOG.info("Click My Account Button");
        myOrderPage.clickMyAccountButton();

        LOG.info("Verify if Sign In With Google");
        Assert.assertTrue(myOrderPage.isSignInWithGoogleTabDisplayed());

        LOG.info("Click Sign In With Google Tab");
        myOrderPage.clickSignInWithGoogleTab();

        LOG.info("Verify if Email Address Field is displayed");
        Assert.assertTrue(myOrderPage.isInputEmailAddressFieldDisplayed());

        LOG.info("Type in Email Address");
        myOrderPage.typeInEmailAddress(email);

        LOG.info("Verify if the Next Button is Displayed");
        Assert.assertTrue(myOrderPage.isTheNextButtonDisplayed());

        LOG.info("Click The Next Button");
        myOrderPage.clickNextButton();

        LOG.info("Verify if the Password Field is Displayed");
        Assert.assertTrue(myOrderPage.PasswordFieldDisplayed());

        LOG.info("Type In Password");
        myOrderPage.typeInPassword(password);

        LOG.info("Verify if My Orders Tab is Displayed");
        Assert.assertTrue(myOrderPage.isMyOrdersTabDisplayed());

        LOG.info("Click My Orders Tab");
        myOrderPage.clickMyOrdersTab();

        LOG.info("Verify if My Return Tab is Displayed");
        Assert.assertTrue(myOrderPage.isMyReturnTabDisplayed());

        LOG.info("Click My Return Tab");
        myOrderPage.clickMyReturnTab();

        LOG.info("Verify if My Details Tab is Displayed");
        Assert.assertTrue(myOrderPage.isMyDetailsTabDisplayed());

        LOG.info("Click My Details Tab");
        myOrderPage.ClickMyDetailsTab();

        LOG.info("Type in FirstName");
        myOrderPage.typeInFirstName(firstName);

        LOG.info("Type in LastName");
        myOrderPage.typeInLastName(lastName);

        LOG.info("Type in Email Address");
        myOrderPage.typeInEmailAddress(emailAddress);

        LOG.info("Select Date Of Birth");
        myOrderPage.setDateOfBirth(year, month, day);

        LOG.info("Click Female Gender Interested In");
        myOrderPage.clickFemaleGenderInterestedIn();

        LOG.info("Click Male Gender Interested In");
        myOrderPage.clickMaleGenderInterestedIn();

        LOG.info("Click the Save Button");
        myOrderPage.clickSaveChanges();

    }
}


