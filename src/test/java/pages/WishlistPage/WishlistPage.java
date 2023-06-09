package pages.WishlistPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class WishlistPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WishlistPage.class);
    public static WishlistPage instance;


    public WishlistPage() {
    }

    public static WishlistPage getInstance() {
        if (instance == null) {
            instance = new WishlistPage();

        }
        return instance;
    }

    public static By acceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    public static By agreementBanner = By.xpath("//div[@id='onetrust-banner-sdk']");
    private By clickWomenTab = By.xpath("//a[@href='/women/new-in/cat/?cid=27108&ctaref=15offnewcustomer|globalbanner|ww']");
    private By clickNewInClothingTab = By.xpath("//a[@href='/women/new-in/new-in-clothing/cat/?cid=2623&ctaref=cat_header']");
    private By clickOneItem = By.xpath("//div/section/article/a");
    private By selectSizeTab = By.xpath("//select[@data-id='sizeSelect']");
    private By clickWishlistTab = By.xpath("//div[@id='aside-below-price']//button[contains(@aria-label, 'Save for later')]");
    private By clickAddToBagButton = By.id("product-add-button");

    public void acceptAgreement() {
        LOG.info("Accepting agreement");
        if (driver.findElement(agreementBanner).isDisplayed()) {
            driver.findElement(acceptButton).click();
        }
    }

    public void clickWomenTab() {
        LOG.info("Click Women Tab");
        driver.findElement(clickWomenTab).click();
    }

    public void clickNewInClothingTab() {
        LOG.info("Click New In Clothing Tab");
        driver.findElement(clickNewInClothingTab).click();
    }

    public void setClickOneItem() {
        LOG.info("Click one item");
        sleep(1000);
        driver.findElement(clickOneItem).click();
    }

    public void selectSizeTub(String size) {
        LOG.info("Select size");
        Select sizeTab = new Select(driver.findElement(selectSizeTab));
        sizeTab.selectByVisibleText(size);
    }

    public void clickWishlistTab(){
        LOG.info("Click Wishlist Tab");
        driver.findElement(clickWishlistTab).click();
    }

    public void clickAddToBagButton(){
        LOG.info("Click Add to Bag");
        driver.findElement(clickAddToBagButton).click();
    }

}






