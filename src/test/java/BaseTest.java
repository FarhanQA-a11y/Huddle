import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 protected WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Setup ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        
	        // Maximize browser window
	        driver.manage().window().maximize();
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
