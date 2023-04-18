package pomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutAmzPage {
	
@FindBy(xpath = "//span[text()='Account & Lists']") private WebElement AccDD;
@FindBy(xpath = "//span[text()='Sign Out']") private WebElement signout;
	
	public LogoutAmzPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void moveToAmzPageAccDD(WebDriver driver) {
		
		Actions act=new Actions(driver);
		act.moveToElement(AccDD).perform();
	
	}
	
	public void clickAmzPageSignOut() throws InterruptedException {
		Thread.sleep(3000);
		signout.click();
	}
}
