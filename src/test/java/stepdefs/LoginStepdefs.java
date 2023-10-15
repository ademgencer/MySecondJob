package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class LoginStepdefs extends BaseClass {

    @Given("user on {string}")
    public void userOn(String url) {
        driver.get(url);
    }


    @When("User click login - sign button")
    public void userClickLoginSignButton() {
        click(lLoginSignUpLink);
    }


    @And("user login with the following credentials")
    public void userLoginWithTheFollowingCredentials(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        sendKeys(lEmailAddressLogin, map.get("username"));
        sendKeys(lPasswordLogin, map.get("password"));
        click(lLoginButton);
    }


    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        visible(lLogoutLink);
    }



    // Test Case 01:

    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        visible(lLoginSignUpLink);
    }


    @And("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        visible(lSignupButton);
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        sendKeys(lNameSignUpInput,"adem");
        sendKeys(lEmailAddressSignUpInput,"adem@adem.com");
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        click(lSignupButton);
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        visible(lENTERACCOUNTINFORMATION);
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        click(lGenderRadiobuttonMr);
        sendKeys(lPasswordSignUpInput,"1234");

        WebElement elementDaySelect = driver.findElement(lDaySelect);
        click(elementDaySelect);
        Select select = new Select(elementDaySelect);
        select.selectByValue("15");

        WebElement elementMonthSelect = driver.findElement(lMonthsSelect);
        click(elementMonthSelect);
        select = new Select(elementMonthSelect);
        select.selectByValue("3");

        WebElement elementYearSelect = driver.findElement(lYearsSelect);
        click(elementYearSelect);
        select = new Select(elementYearSelect);
        select.selectByValue("1990");

    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        click(lSignUpForOurNewsLetterLabel);
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        click(lReceiveSpecialOffersLabel);
    }

    @And("Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {
        sendKeys(xpathAddressInformation("first_name"),"adem");
        sendKeys(xpathAddressInformation("last_name"),"yasar");
        sendKeys(xpathAddressInformation("company"),"MathQA");
        sendKeys(xpathAddressInformation("address1"),"izmir");
        sendKeys(xpathAddressInformation("address2"),"turkiye");

        WebElement elementCountrySelect = driver.findElement(lCountrySelect);
        Select select = new Select(elementCountrySelect);
        List<WebElement> allSelectedOptions = select.getOptions();
        allSelectedOptions.get(0).click();

        sendKeys(xpathAddressInformation("state"),"serbest");
        sendKeys(xpathAddressInformation("city"),"Ege");
        sendKeys(xpathAddressInformation("zipcode"),"111000");
        sendKeys(xpathAddressInformation("mobile_number"),"0555588899999");

    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        click(lCreateAccountButton);
    }


    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        visible(lAccountCreatedText);
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        click(lContinueButton);
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        visible(lLogoutLink);
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        click(lDeleteAccountLink);
    }

    @And("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        visible(lAccountDeletedText);
    }
}
