package pages.SearchTabPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchTabPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.SearchTabPage.SearchTabPage.class);
    public static pages.SearchTabPage.SearchTabPage instance;
    public static SearchTabPage getInstance;


    private SearchTabPage() {
    }

    public static pages.SearchTabPage.SearchTabPage getInstance() {
        if (instance == null) {
            instance = new pages.SearchTabPage.SearchTabPage();

        }
        return instance;
    }


    public static By acceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    public static By agreementBanner = By.xpath("//div[@id='onetrust-banner-sdk']");
    private By clickSearchField = By.id("chrome-search");
    private By typeInSearchTab = By.id("chrome-search");

    public void acceptAgreement() {
        LOG.info("Accepting agreement");
        if (driver.findElement(agreementBanner).isDisplayed()) {
            driver.findElement(acceptButton).click();
        }
    }

    public boolean isSearchFieldDisplayed() {
        LOG.info("Verify if the Search Tab is Displayed");
        return driver.findElement(clickSearchField).isDisplayed();
    }

    public void clickSearchTab() {
        LOG.info("Click the search tab");
        sleep(1000);
        driver.findElement(clickSearchField).click();
    }

    public void typeInSearchTab(String dresses) {
        LOG.info("Type in Search Field");
        sleep(1000);
        driver.findElement(clickSearchField).sendKeys(dresses);
    }

}
