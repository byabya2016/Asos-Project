package pages.MyOrdersPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyOrdersPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.MyOrdersPage.MyOrdersPage.class);
    public static pages.MyOrdersPage.MyOrdersPage instance;

    private MyOrdersPage() {
    }

    public static pages.MyOrdersPage.MyOrdersPage getInstance() {
        if (instance == null) {
            instance = new pages.MyOrdersPage.MyOrdersPage();
        }
        return instance;
    }

    public static By acceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    public static By agreementBanner = By.xpath("//div[@id='onetrust-banner-sdk']");
    private By clickSingInButton = By.xpath("//span[@type='accountUnfilled']");
    private By clickMyOrdersTab = By.xpath("//a[@data-testid='myorders-link']");

    public void acceptAgreement() {
        LOG.info("Accepting agreement");
        sleep(1000);
        if (driver.findElement(agreementBanner).isDisplayed()) {
            driver.findElement(acceptButton).click();
        }
    }

    public boolean isTheSignInLogoDisplayed() {
        LOG.info("Verify If The Sign In Logo is Displayed");
        return driver.findElement(clickSingInButton).isDisplayed();
    }

    public void clickTheSignInLogo() {
        LOG.info("Click Sign In Logo Button");
        driver.findElement(clickSingInButton).click();
    }

   public void clickMyOrdersTab(){
        LOG.info("Click My Orders Tab");
        sleep(1000);
        driver.findElement(clickMyOrdersTab).click();
   }



}