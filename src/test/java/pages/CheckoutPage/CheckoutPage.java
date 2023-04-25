package pages.CheckoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;

public class CheckoutPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(CheckoutPage.class);
    public static CheckoutPage instance;

    private CheckoutPage() {
    }

    public static CheckoutPage getInstance() {
        if (instance == null) {
            instance = new CheckoutPage();
        }
        return instance;
    }

   







}