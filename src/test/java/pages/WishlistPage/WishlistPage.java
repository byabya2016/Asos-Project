package pages.WishlistPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class WishlistPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WishlistPage.class);
    public static WishlistPage instance;


    private WishlistPage() {
    }

    public static WishlistPage getInstance() {
        if (instance == null) {
            instance = new WishlistPage();

        }
        return instance;
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms)
            ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private By clickWomenTab = By.xpath("//a[@href='/women/new-in/cat/?cid=27108&ctaref=15offnewcustomer|globalbanner|ww']");
    private By clickNewInClothingTab = By.xpath("//a[@href='/women/new-in/new-in-clothing/cat/?cid=2623&ctaref=cat_header']");
    private By clickOneItem = By.xpath("//html[@data-gender='women']");
    private By selectSizeTab = By.xpath("//select[@data-id='sizeSelect']");
    private By clickWishlistTab = By.xpath("//button[@class='PHcSE kFfQP']");
    private By clickAddToBagButton = By.id("product-add-button");


    public void clickWomenTab() {
        LOG.info("Click Women Tab");
        sleep(5000);
        driver.findElement(clickWomenTab).click();
    }

    public void clickNewInClothingTab() {
        LOG.info("Click New In Clothing Tab");
        sleep(5000);
        driver.findElement(clickNewInClothingTab).click();
    }

    public void setClickOneItem() {
        LOG.info("Click one item");
        sleep(5000);
        driver.findElement(clickOneItem);
    }

    public void selectSizeTub(String size) {
        LOG.info("Select size");
        driver.findElement(selectSizeTab).click();
        driver.findElements(By.xpath(String.format(size, selectSizeTab)));
    }

    public void clickAddToBagButton(){
        LOG.info("Click Add to Bag");
        driver.findElement(clickAddToBagButton);
    }










    }






