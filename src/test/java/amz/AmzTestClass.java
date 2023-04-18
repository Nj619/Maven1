package amz;

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
	
	@Test
	public void openBrowser() {
		
		initializeBrowser();
	}
	
	
	
}
