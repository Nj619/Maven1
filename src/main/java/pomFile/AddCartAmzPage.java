package pomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartAmzPage {
	
	@FindBy(xpath = "//span[text()='Hello, NinjaJod']") private WebElement name;
	
	public AddCartAmzPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAmxPageName() {
		String actName = name.getText();
		return actName;
	}
	
	//span[text()='Hello, NinjaJod']
}
