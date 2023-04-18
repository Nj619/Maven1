package liabraryFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass {
	public WebDriver driver;
	public void initializeBrowser() {
		
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
	}
	
	
}
