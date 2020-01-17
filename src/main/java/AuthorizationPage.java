import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AuthorizationPage {

    @FindBy(id = "email_create")

    private WebElement emailInput;



    @FindBy(id="SubmitCreate")

    private WebElement accountCreateButton;



    public AuthorizationPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }



    public AuthorizationPage emailInput(String emailUnique) {

        emailInput.sendKeys(emailUnique);

        return this;

    }



    public AuthorizationPage clickSubmitButton() {

        accountCreateButton.click();

        return this;

    }

}