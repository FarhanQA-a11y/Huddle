import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest {
    private HomePage homePage;

    @BeforeTest
    public void setUpHomePage() {
        // Initialize HomePage with the driver
        homePage = new HomePage(driver);
    }

    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void testClickSearchButton(String email) throws InterruptedException {
      
        homePage.clickSearchButton(email);
    }
}