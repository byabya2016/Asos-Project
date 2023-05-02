package pages.HomepagePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomepagePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(HomepagePage.class);
    public static HomepagePage instance;

    private HomepagePage() {
    }

    public static HomepagePage getInstance() {
        if (instance == null) {
            instance = new HomepagePage();
        }
        return instance;
    }

    public static By acceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    public static By agreementBanner = By.xpath("//div[@id='onetrust-banner-sdk']");
    private By checkTitle = By.xpath("//img[@alt='ASOS logo']");
    private By clickSearchTab = By.id("chrome-search");
    private By clickSingInLogo = By.xpath("//span[@type='accountUnfilled']");
    private By clickWishlistButton = By.xpath("//span[@type='heartUnfilled']");
    private By clickCheckOutButton = By.xpath("//span[@type='bagUnfilled']");
    private By clickWomenTab = By.xpath("//a[@class='src-GlobalBanner-Button-Button_button']");
    private By clickMenTab = By.xpath("//a[@class='src-GlobalBanner-Button-Button_button']");


    public void acceptAgreement() {
        LOG.info("Accepting agreement");
        if (driver.findElement(agreementBanner).isDisplayed()) {
            driver.findElement(acceptButton).click();
        }
    }

    public boolean isTheTitleDisplayed() {
        LOG.info("Verify if the Title is displayed");
        return driver.findElement(checkTitle).isDisplayed();
    }

    public boolean isSearchTabDisplayed(){
        LOG.info("Verify if the Search Tab is Displayed");
        return driver.findElement(clickSearchTab).isDisplayed();
    }

    public void clickSearchTab() {
        LOG.info("Click the search tab");
        driver.findElement(clickSearchTab);
    }

    public boolean isTheSignInLogoDisplayed() {
        LOG.info("Verify If The Sign In Logo is Displayed");
        return driver.findElement(clickSingInLogo).isDisplayed();
    }

    public void clickTheSignInLogo() {
        LOG.info("Click Sign In Logo Button");
        driver.findElement(clickSingInLogo).click();
    }

    public void clickWishlistButton() {
        LOG.info("Click Wishlist Button");
        driver.findElement(clickWishlistButton).click();
    }

    public void clickCheckOutButton() {
        LOG.info("Click CheckOut Button");
        driver.findElement(clickCheckOutButton).click();
    }


}


