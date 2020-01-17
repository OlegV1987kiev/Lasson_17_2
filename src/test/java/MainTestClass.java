import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class MainTestClass {
 public WebDriver driver;

 @BeforeMethod

    public void setup() {
//     driver = WebDriverFactory.getDriver(DriverType.FIREFOX);
       driver = WebDriverFactory.getDriver(DriverType.CHROME);
//     driver = WebDriverFactory.getDriver(DriverType.OPERA);
        driver.manage().window().maximize();

        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @AfterMethod

    public void cleanEnviroment() {



       driver.close();

    }

}