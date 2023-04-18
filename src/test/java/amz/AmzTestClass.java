package amz;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import liabraryFile.BaseClass;
import pomFile.AddCartAmzPage;
import pomFile.LoginAmzPage;
import pomFile.LogoutAmzPage;

public class AmzTestClass extends BaseClass
{
	AddCartAmzPage cart;
	LoginAmzPage login;
	LogoutAmzPage logout;
	
	@BeforeClass
	public void openBrowser() {
	
		initializeBrowser();
		
		login = new LoginAmzPage(driver);
		logout = new LogoutAmzPage(driver);
		cart =new AddCartAmzPage(driver);
	}
	
	@BeforeMethod
	public void loginAmz() throws InterruptedException {
		
		Thread.sleep(3000);
		login.clickAmzPageAccDD();
//		Thread.sleep(3000);
//		login.clickAmzPageSignIn();
		Thread.sleep(3000);
		login.inpAmzPageEmail();
		Thread.sleep(3000);
		login.clickAmzPageContinue();
		Thread.sleep(3000);
		login.inpAmzPagePwd();
		Thread.sleep(3000);
		login.clickAmzPageSignInF();
		Thread.sleep(3000);
		//driver.quit();
	}
	
	@Test
	public void mainTestNameVerification() {
		String txt = cart.verifyAmxPageName();
		String actTxt="Hello, NinjaJod";
		
		assertEquals(txt, actTxt);
		
	}
	
	@AfterMethod
	public void amzSignOut() throws InterruptedException {
		logout.moveToAmzPageAccDD(driver);
		
		logout.clickAmzPageSignOut();
	}
	
	@AfterClass
	public void closeBrowser() {
	        System.out.println("Jai Shree Ram");
		driver.quit();
	}
	
}
