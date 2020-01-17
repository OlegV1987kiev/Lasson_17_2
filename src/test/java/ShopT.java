import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShopT extends MainTestClass {


    private MainPageShop mainPageShop;
    private PageBlouse pageBlouse;
    private CarPage carPage;

    @BeforeMethod

    public void setupMainPage() {

        mainPageShop = new MainPageShop(driver);
        pageBlouse = new PageBlouse(driver);
        carPage = new CarPage(driver);
    }


    @Test

    public void ShopAdd() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        mainPageShop.search();
//        Thread.sleep(1000);
        mainPageShop.searchButton();
        pageBlouse.list();
//        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
//        Thread.sleep(1000);
        pageBlouse.buttonAdd();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        pageBlouse.clickToCart();
        Thread.sleep(1000);
        carPage.addPluse();
        js.executeScript("window.scrollBy(0,300)");
//        Thread.sleep(2000);
        driver.navigate().refresh();

        carPage.validationTotalProducts();
        carPage.validationTotalShipping();
        carPage.validationTotal();
        carPage.validationTax();
        carPage.validationUperTotal();
        carPage.deleteProduct();
        driver.navigate().refresh();
        mainPageShop.checkMessage();
        mainPageShop.checkEntry();
    }

}