import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTestLogic extends MainTestClass {



    private MainPageRegistration mainPage;

    private AuthorizationPage authPage;

    private RegistrationPage registrationPage;





    @BeforeMethod

    public void setupMainPage() {

        mainPage = new MainPageRegistration(driver);

        authPage = new AuthorizationPage(driver);

        registrationPage = new RegistrationPage(driver);

    }



    @Test

    public void loginIn() throws InterruptedException {
        Thread.sleep(2000);

        mainPage.clickSighIn();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        authPage.emailInput("olehtest@gmeil.ua.com");

        authPage.clickSubmitButton();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        registrationPage.customerFirstName("TestFirstName");

        registrationPage.customerLastName("TestLastName");

        registrationPage.password("Test1234Test");

        registrationPage.firstName("TestFirstName");

        registrationPage.lastName("TestLastName");

        registrationPage.address("Test London");

        registrationPage.city("London");

        registrationPage.postCode("32432432");

        registrationPage.phoneMobile("+0999990000");

        registrationPage.aliasAddTest("Test");

        registrationPage.clickSubmitButton();

    }

}