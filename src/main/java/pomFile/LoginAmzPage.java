package pomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.page.Page.SetWebLifecycleStateState;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmzPage {
	
	@FindBy(xpath = "//span[text()='Account & Lists']") private WebElement AccDD;
	@FindBy(xpath = "//span[text()='Sign in']" )private WebElement signin;
	@FindBy(xpath = "//input[@id='ap_email']") private WebElement email;
	@FindBy(xpath = "//input[@id='continue']") private WebElement cont1;
	@FindBy(css = "#ap_password") private WebElement password;
	@FindBy(css = "[id='signInSubmit']") private WebElement signin2;
	
	public LoginAmzPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickAmzPageAccDD() {
		AccDD.click();
	}
	
	public void clickAmzPageSignIn() {
		signin.click();
	}
	
	public void inpAmzPageEmail() {
		email.sendKeys("ninjajod619@gmail.com");
	}
	
	public void inpAmzPagePwd() {
		password.sendKeys("Test@Ninja619");
	}
	
	public void clickAmzPageContinue() {
		cont1.click();
	}
	
	public void clickAmzPageSignInF (){
		signin2.click();
	}
}
//Test@Ninja619
//ninjajod619@gmail.com