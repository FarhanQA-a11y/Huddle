import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 protected static WebDriver driver;

	 @Parameters("browser")
	 @BeforeTest
	  
	    public void setUp(String browser) {
		 if (browser.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        } else {
	            throw new IllegalArgumentException("Invalid browser: " + browser);
	        }
	        // Setup ChromeDriver using WebDriverManager
//	        WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
	        
	        // Maximize browser window
	        driver.manage().window().maximize();
	        driver.get("https://automationpanda.com/");   
	        System.out.println("Opened website in " + browser);
	 }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Closed browser");
	        }
	    }
}
