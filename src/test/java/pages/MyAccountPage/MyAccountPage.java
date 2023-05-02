package pages.MyAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyAccountPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MyAccountPage.class);
    public static MyAccountPage instance;

    private MyAccountPage() {
    }

    public static MyAccountPage getInstance() {
        if (instance == null) {
            instance = new MyAccountPage();
        }
        return instance;
    }

    public static By acceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    public static By agreementBanner = By.xpath("//div[@id='onetrust-banner-sdk']");
    private By clickSingInLogo = By.xpath("//span[@type='accountUnfilled']");
    private By clickMyAccountButton = By.xpath("//a[@data-testid='myaccount-link']");
    private By clickSignInTab = By.xpath("//div[@aria-current='page']");

    public void acceptAgreement() {
        LOG.info("Accepting agreement");
        sleep(1000);
        if (driver.findElement(agreementBanner).isDisplayed()) {
            driver.findElement(acceptButton).click();
        }
    }
    public boolean isTheSignInLogoDisplayed() {
        LOG.info("Verify If The Sign In Logo is Displayed");
        return driver.findElement(clickSingInLogo).isDisplayed();
    }

    public void clickTheSignInTab() {
        LOG.info("Click Sign In Logo Button");
        driver.findElement(clickSingInLogo).click();
    }

    public boolean isMyAccountButtonDisplayed() {
        LOG.info("Verify if My Account Button is Displayed");
        sleep(1000);
        return driver.findElement(clickMyAccountButton).isDisplayed();
    }

    public void clickMyAccountButton() {
        LOG.info("Click My Account Button");
        sleep(1000);
        driver.findElement(clickMyAccountButton).click();
    }
}



