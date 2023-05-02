package pages.CheckOutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CheckOutPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.CheckOutPage.CheckOutPage.class);
    public static pages.CheckOutPage.CheckOutPage instance;

    private CheckOutPage() {
    }

    public static pages.CheckOutPage.CheckOutPage getInstance() {
        if (instance == null) {
            instance = new pages.CheckOutPage.CheckOutPage();
        }
        return instance;
    }

    public static By acceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    public static By agreementBanner = By.xpath("//div[@id='onetrust-banner-sdk']");
    private By clickWomenButton = By.xpath("//a[@href='/women/new-in/cat/?cid=27108&ctaref=15offnewcustomer|globalbanner|ww']");
    private By clickNewInClothingTab = By.xpath("//a[@href='/women/new-in/new-in-clothing/cat/?cid=2623&ctaref=cat_header']");
    private By clickBlackDress = By.xpath("//div/section/article/a");
    private By selectSizeButton = By.xpath("//select[@data-id='sizeSelect']");
    private By clickWishlistButton = By.xpath("//div[@id='aside-below-price']//button[contains(@aria-label, 'Save for later')]");
    private By clickAddToBagButton = By.id("product-add-button");


    public void acceptAgreement() {
        LOG.info("Accepting agreement");
        sleep(1000);
        if (driver.findElement(agreementBanner).isDisplayed()) {
            driver.findElement(acceptButton).click();
        }
    }

    public void clickWomenButton() {
        LOG.info("Click Women Tab");
        driver.findElement(clickWomenButton).click();
    }

    public void clickNewInClothingTab() {
        LOG.info("Click New In Clothing Tab");
        driver.findElement(clickNewInClothingTab).click();
    }

    public void clickBlackDress() {
        LOG.info("Click one item");
        sleep(1000);
        driver.findElement(clickBlackDress).click();
    }

    public void selectSizeButton(String size) {
        LOG.info("Select size");
        Select sizeTab = new Select(driver.findElement(selectSizeButton));
        sizeTab.selectByVisibleText(size);
    }

    public void clickWishlistButton() {
        LOG.info("Click Wishlist Tab");
        driver.findElement(clickWishlistButton).click();
    }

    public void clickAddToBagButton() {
        LOG.info("Click Add to Bag");
        driver.findElement(clickAddToBagButton).click();
    }

}








