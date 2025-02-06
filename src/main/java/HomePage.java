import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	protected WebDriver driver;
	
	@FindBy(xpath = "(//input[@id='subscribe-field'])[1]")
	private WebElement searchButton;
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	 public void clickSearchButton() throws InterruptedException {
		 System.out.println("Clicked on farh");
	        
	        searchButton.click();
	        Thread.sleep(300);
	        searchButton.sendKeys("farhan@yopmail.com");
	        System.out.println("Clicked on Search button.");
	    }

}
