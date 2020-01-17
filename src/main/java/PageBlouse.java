

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBlouse {
    @FindBy (id = "list")
    private WebElement list;
    @FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div/div[3]/div/div[2]/a[1]")
    private WebElement buttonAdd;
    @FindBy(xpath ="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[2]")
    private WebElement clickToCart;



    public PageBlouse (WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    public PageBlouse list() {

        list.click();

        return this;

    }

    public PageBlouse buttonAdd() {
        buttonAdd.click();
        return this;
    }

    public PageBlouse clickToCart() {
        clickToCart.click();
        return this;
    }
}
