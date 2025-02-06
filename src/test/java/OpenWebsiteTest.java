import org.testng.annotations.Test;

public class OpenWebsiteTest extends BaseTest {

	    @Test
	    public void openGoogle() {
	        
	        System.out.println("Website Title: " + driver.getTitle());
	    }
}
