import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage {



    @FindBy(id="customer_firstname")

    private WebElement customerFirstNameInput;



    @FindBy(id="customer_lastname")

    private WebElement customerLastNameInput;



    @FindBy(id="passwd")

    private WebElement passwordInput;



    @FindBy(id="firstname")

    private WebElement firstNameInput;



    @FindBy(id="lastname")

    private WebElement lastNameInput;



    @FindBy(id="address1")

    private WebElement address1Input;



    @FindBy(id="city")

    private WebElement cityInput;



    @FindBy(id="postcode")

    private WebElement postcodeInput;



    @FindBy(id="phone_mobile")

    private WebElement phoneMobileInput;



    @FindBy(id = "authentication")

    private WebElement aliasAdd;



    @FindBy(id = "submitAccount")

    private WebElement submitButton;



    public RegistrationPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }



    public RegistrationPage clickSubmitButton() {

        submitButton.click();

        return this;

    }



    public RegistrationPage customerFirstName(String custFirstName) {

        customerFirstNameInput.sendKeys(custFirstName);

        return this;

    }



    public RegistrationPage customerLastName(String custLastName) {

        customerLastNameInput.sendKeys(custLastName);

        return this;

    }



    public RegistrationPage password(String passwordS) {

        passwordInput.sendKeys(passwordS);

        return this;

    }



    public RegistrationPage firstName(String FirstName) {

        firstNameInput.sendKeys(FirstName);

        return this;

    }



    public RegistrationPage lastName(String LastName) {

        lastNameInput.sendKeys(LastName);

        return this;

    }



    public RegistrationPage address(String addressI) {

        address1Input.sendKeys(addressI);

        return this;

    }



    public RegistrationPage city(String cityI) {

        cityInput.sendKeys(cityI);

        return this;

    }



    public RegistrationPage postCode(String pCode) {

        postcodeInput.sendKeys(pCode);

        return this;

    }



    public RegistrationPage phoneMobile(String phoneMob) {

        phoneMobileInput.sendKeys(phoneMob);

        return this;

    }



    public RegistrationPage aliasAddTest(String aliasTest) {

        aliasAdd.sendKeys(aliasTest);

        return this;

    }
//    public Account build() {
//
//        return new Account(gender, firstCustomerName, lastCustomerName, pass, email, day, month, year, firstName, lastName, company, address1, address2, city, state, postcode, country, phone_mobile, alias);
//
//    }


}