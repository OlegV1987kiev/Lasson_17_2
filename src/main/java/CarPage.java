import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarPage {
    @FindBy(id = "cart_quantity_up_2_7_0_0")
    private WebElement addPluse;

    @FindBy(id ="total_product_price_2_7_0")
    private WebElement validationTotalProducts;

    @FindBy(id ="total_shipping")
    private WebElement validationTotalShipping;

    @FindBy(id ="total_price_without_tax")
    private WebElement validationTotal;

    @FindBy(id ="total_tax")
    private WebElement validationTax;

    @FindBy(id ="total_price_container")
    private WebElement validationUperTotal;

    @FindBy(id ="2_7_0_0")
    private WebElement deleteProduct;
    static String totalProducts = "$54.00";

    static String totalShipping = "$2.00";
    static String total = "$56.00";
    static String tax = "$0.00";
    static String uperTotal = "$56.00";



    public CarPage (WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    public CarPage addPluse() {

        addPluse.click();

        return this;

    }

    public CarPage validationTotalProducts() {
        String b = validationTotalProducts.getText();
        System.out.println(totalProducts.equals(b));
        System.out.println("Amount "+b);
        return this;
    }

    public CarPage validationTotalShipping() {
        String c = validationTotalShipping.getText();
        System.out.println(totalShipping.equals(c));
        System.out.println("Amount "+c);
        return this;
    }
    public CarPage validationTotal() {
        String a = validationTotal.getText();
        System.out.println(total.equals(a));
        System.out.println("Amount "+a);
        return this;
    }
    public CarPage validationTax() {
        String d = validationTax.getText();
        System.out.println(tax.equals(d));
        System.out.println("Amount "+d);
        return this;
    }
    public CarPage validationUperTotal() {
        String e = validationUperTotal.getText();
        System.out.println(uperTotal.equals(e));
        System.out.println("Amount "+e);
        return this;
    }
    public CarPage deleteProduct() {
        deleteProduct.click();
        return this;
    }
}
