
package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By clickSingInLogo = By.xpath("//span[@type='accountUnfilled']");
    private By clickMyAccountButton = By.xpath("//a[@data-testid='myaccount-link']");
    private By clickSignInTab = By.xpath("//div[@aria-current='page']");
    private By signInWithGoogleTab = By.id("signup-google");
    private By inputEmailAddressField = By.id("identifierId");
    private By clickNextButton = By.xpath("//div[@class='qhFLie']");
    private By typeInPassword = By.xpath("//input[@type='password']");


    public boolean isTheSignInLogoDisplayed() {
        LOG.info("Verify If The Sign In Logo is Displayed");
        return driver.findElement(clickSingInLogo).isDisplayed();
    }

    public void clickTheSignInLogo() {
        LOG.info("Click Sign In Logo Button");
        driver.findElement(clickSingInLogo).click();
    }

    public boolean isMyAccountButtonDisplayed() {
        LOG.info("Verify if My Account Button is Displayed");
        return driver.findElement(clickMyAccountButton).isDisplayed();
    }

    public void clickMyAccountButton() {
        LOG.info("Click My Account Button");
        driver.findElement(clickMyAccountButton).click();
    }

    public boolean isSignInWithGoogleTabDisplayed() {
        LOG.info("Verify if Sign In With Google Tab displayed");
        return driver.findElement(signInWithGoogleTab).isDisplayed();
    }

    public void clickSignInWithGoogleTab() {
        LOG.info("Click Sign In With Google Tab");
        driver.findElement(signInWithGoogleTab).click();
    }

    public boolean isInputEmailAddressFieldDisplayed() {
        LOG.info("Verify if Email Field is Displayed");
        return driver.findElement(inputEmailAddressField).isDisplayed();
    }

    public void typeInEmailAddress(String emailAddress) {
        LOG.info("Type In Email Address");
        driver.findElement(inputEmailAddressField).sendKeys(emailAddress);
    }

    public boolean isTheNextButtonDisplayed() {
        LOG.info("Verify if the Next Button is Displayed");
        return driver.findElement(clickNextButton).isDisplayed();
    }

    public void clickNextButton() {
        LOG.info("Click the Next Button");
        driver.findElement(clickNextButton).click();
    }

    public boolean PasswordFieldDisplayed() {
        LOG.info("Verify if the Password Field is Displayed");
        return driver.findElement(typeInPassword).isDisplayed();
    }

    public void typeInPassword(String password) {
        LOG.info("Type In Password");
        driver.findElement(typeInPassword).sendKeys(password);
    }
}


