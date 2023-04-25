

package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class SignInTest extends BaseTest {
    private String newUrl = getBaseUrl();
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);
    private Object String;

    @Test

    public void signInPage() {

        LOG.info("Accept agreement");
        homepagePage.acceptAgreement();

        String email = "firudaniel00@gmail.com";
        String password = "Firu1949";

        LOG.info("Verify if Sign In Logo is Displayed");
        Assert.assertTrue(signInPage.isTheSignInLogoDisplayed());

        LOG.info("Click Sign In Logo");
        signInPage.clickTheSignInLogo();

        LOG.info("Click My Account Button");
        signInPage.clickMyAccountButton();

        //LOG.info("Verify if Sign In With Google");
       // Assert.assertTrue(signInPage.isSignInWithGoogleTabDisplayed());

       LOG.info("Click Sign In With Google Tab");
       signInPage.clickSignInWithGoogleTab();

        LOG.info("Verify if Email Address Field is displayed");
        Assert.assertTrue(signInPage.isInputEmailAddressFieldDisplayed());

        LOG.info("Type in Email Address");
        signInPage.typeInEmailAddress(email);

        LOG.info("Verify if the Next Button is Displayed");
        Assert.assertTrue(signInPage.isTheNextButtonDisplayed());

        LOG.info("Click The Next Button");
        signInPage.clickNextButton();

        LOG.info("Verify if the Password Field is Displayed");
        Assert.assertTrue(signInPage.PasswordFieldDisplayed());

        LOG.info("Type In Password");
        signInPage.typeInPassword(password);
    }
}