package pages;

import org.openqa.selenium.By;

public interface Locators {

    By lLoginSignUpLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    By lEmailAddressLogin = By.xpath("//input[@data-qa='login-email']");
    By lPasswordLogin = By.xpath("//input[@placeholder='Password']");
    By lLoginButton = By.xpath("//button[normalize-space()='Login']");
    By lLogoutLink = By.xpath("//a[normalize-space()='Logout']");

    By lNameSignUpInput = By.xpath("//input[@placeholder='Name']");
    By lEmailAddressSignUpInput = By.xpath("//input[@data-qa='signup-email']");
    By lSignupButton = By.xpath("//button[text()='Signup']");
    By lENTERACCOUNTINFORMATION = By.xpath("//b[contains(.,'Enter Account Information')]");

    By lGenderRadiobuttonMr = By.xpath("//label[@for='id_gender1']");
    By lPasswordSignUpInput = By.xpath("//input[@id='password']");
    By lDaySelect = By.xpath("//select[@id='days']");
    By lMonthsSelect = By.xpath("//select[@id='months']");
    By lYearsSelect = By.xpath("//select[@id='years']");

    By lSignUpForOurNewsLetterLabel = By.xpath("//label[@for='newsletter']");
    By lReceiveSpecialOffersLabel = By.xpath("//label[@for='optin']");
    //By lAddressInformation = By.xpath("//input[@id=' " + text + "']");

    By lCreateAccountButton = By.xpath("//button[contains(.,'Create Account')]");
    By lCountrySelect = By.xpath("//select[@id='country']");
    By lAccountCreatedText = By.xpath("//b[text()='Account Created!']");
    By lContinueButton = By.xpath("//a[@class='btn btn-primary']");
    By lDeleteAccountLink = By.xpath("//a[contains(.,'Delete Account')]");
    By lAccountDeletedText = By.xpath("//b[text()='Account Deleted!']");





}
