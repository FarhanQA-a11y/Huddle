import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
    }
	
	 public void clickSearchButton() throws InterruptedException {
		 System.out.println("Clicked on farh");
	        WebElement searchButton = driver.findElement(By.xpath("(//input[@id='subscribe-field'])[1]"));
	        searchButton.click();
	        Thread.sleep(300);
	        searchButton.sendKeys("farhan");
	        System.out.println("Clicked on Search button.");
	    }

}
