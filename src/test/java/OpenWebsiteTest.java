import org.testng.annotations.Test;

public class OpenWebsiteTest extends BaseTest {

	    @Test
	    public void openGoogle() {
	        driver.get("https://www.google.com");
	        System.out.println("Website Title: " + driver.getTitle());
	    }
}
