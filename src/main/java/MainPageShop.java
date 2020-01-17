import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageShop {

    @FindBy(id = "search_query_top")
    private WebElement search;
    @FindBy(name = "submit_search")
    private WebElement searchButton;
    @FindBy(id = "center_column")
    private WebElement checkMessage;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[5]")
    private WebElement checkEntry;
    static String message = "(empty)";

    public MainPageShop(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    public MainPageShop search() {

        search.sendKeys("Blouse");

        return this;

    }

    public MainPageShop searchButton() {
        searchButton.submit();
        return this;
    }

    public MainPageShop checkMessage() {

        return this;
    }

    public MainPageShop checkEntry() {
        System.out.println("Is  basket empty? " + message.equals(checkEntry.getText()));

        System.out.print(checkMessage.getText());
        return this;
    }
}

