package pages.MyAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
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

    private By clickSingInLogo = By.xpath("//span[@type='accountUnfilled']");
    private By clickMyAccountButton = By.xpath("//a[@data-testid='myaccount-link']");
    private By clickSignInTab = By.xpath("//div[@aria-current='page']");
    private By signInWithGoogleTab = By.id("signup-google");
    private By inputEmailAddressField = By.id("identifierId");
    private By clickNextButton = By.xpath("//div[@class='qhFLie']");
    private By typePassword = By.xpath("//input[@type='password']");
    private By clickMyOrdersTab = By.xpath("//a[@href='/my-account/orders']");
    private By clickMyReturnTab = By.xpath("//a[@href='/my-account/returns']");
    private By clickMyDetailsTab = By.xpath("//a[@href='/my-account/my-details']");
    private By typeInFirstName = By.id("label-firstName");
    private By typeInLastName = By.id("label-lastName");
    private By typeInEmailAddress = By.id("label-emailAddress");
    private By selectDayOfBirth = By.id("datepicker_day_select");
    private By selectMonthOfBirth = By.id("datepicker_month_select");
    private By selectYearOfBirth = By.id("datepicker_year_select");
    private By inputFemaleGenderInterestedIn = By.id("radio-gender-F");
    private By clickMaleGenderInterestedIn = By.id("radio-gender-M");
    private By clickSaveChanges = By.id("//span[@class='button-module_content__35zEt']");
    private By clickChangePasswordTab = By.xpath("//a[@href='/my-account/change-password']");
    private By clickAddressBook = By.xpath("//a[@aria-current='page']");


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
        return driver.findElement(typePassword).isDisplayed();
    }

    public void typeInPassword(String password) {
        LOG.info("Type In Password");
        driver.findElement(typePassword).sendKeys(password);
    }

    public boolean isMyOrdersTabDisplayed() {
        LOG.info("Verify if My Orders Tab is Displayed");
        return driver.findElement(clickMyOrdersTab).isDisplayed();
    }

    public void clickMyOrdersTab() {
        LOG.info("Click My Orders Tab");
        driver.findElement(clickMyOrdersTab).click();
    }

    public boolean isMyReturnTabDisplayed() {
        LOG.info("Verify if My Return Tab is Displayed");
        return driver.findElement(clickMyReturnTab).isDisplayed();
    }

    public void clickMyReturnTab() {
        LOG.info("Click My Return Tab");
        driver.findElement(clickMyReturnTab).click();
    }

    public boolean isMyDetailsTabDisplayed() {
        LOG.info("Verify if My Details Tab is Displayed");
        return driver.findElement(clickMyDetailsTab).isDisplayed();
    }

    public void ClickMyDetailsTab() {
        LOG.info("Click My Details Tab");
        driver.findElement(clickMyDetailsTab).click();
    }

    public void typeInFirstName(String firstName) {
        LOG.info("Type in FirstName");
        driver.findElement(typeInFirstName).sendKeys(firstName);
    }

    public void typeInLastName(String lastName) {
        LOG.info("Type in LastName");
        driver.findElement(typeInLastName).sendKeys(lastName);
    }

    private void setTypeInEmailAddress(String email) {
        LOG.info("Type in EmailAddress");
        driver.findElement(typeInEmailAddress).sendKeys(email);
    }

    public void setDateOfBirth(String year, String month, String day) {
        LOG.info("Select Date Of Birth");

        Select newYear = new Select(driver.findElement(selectYearOfBirth));
        newYear.selectByValue(year);

        Select newMonth = new Select(driver.findElement(selectMonthOfBirth));
        newMonth.selectByValue(month);

        Select newDay = new Select(driver.findElement(selectDayOfBirth));
        newDay.selectByValue(day);
    }

    public void clickFemaleGenderInterestedIn() {
        LOG.info("Click Female Gender Interested In");
        driver.findElement(clickMaleGenderInterestedIn).click();
    }

    public void clickMaleGenderInterestedIn() {
        LOG.info("Click Male Gender Interested In");
        driver.findElement(clickMaleGenderInterestedIn).click();
    }

    public void clickSaveChanges() {
        LOG.info("Click the Save Button");
        driver.findElement(clickSaveChanges).click();
    }

   public boolean isChangePasswordTabDisplayed(){
        LOG.info("Verify if Change Password is Displayed");
       return driver.findElement(clickChangePasswordTab).isDisplayed();
   }

    public void ClickChangePasswordTab(){
        LOG.info("Click Change Password Tab");
        driver.findElement(clickChangePasswordTab).click();
    }

    public void clickAddressBook(){
        LOG.info("Click Address Book");
        driver.findElement(clickAddressBook).click();
    }

}
