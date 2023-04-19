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

    private By checkTitle = By.xpath("//img[@alt='ASOS logo']");
    private By clickWomenTab = By.xpath("//a[@href='/women/new-in/cat/?cid=27108&ctaref=15offnewcustomer|globalbanner|ww']");
    private By clickSearchTab = By.id("chrome-search");

    public boolean isTheTitleDisplayed() {
        LOG.info("Verify if the Title is displayed");
        return driver.findElement(checkTitle).isDisplayed();
    }

    public boolean isWomenTabDisplayed() {
        LOG.info("Verify if Women Tab is Displayed");
        return driver.findElement(clickWomenTab).isDisplayed();
    }

    public void setClickWomenTab() {
        LOG.info("Click Women Tab");
        driver.findElement(clickWomenTab).click();
    }

    public void clickSearchTab(){
        LOG.info("Click the search tab");
        driver.findElement(clickSearchTab);
    }

}


