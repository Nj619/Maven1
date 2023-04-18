package amz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AmzLog1 {
	
	@Test
	public void AmzLogingComplete() throws InterruptedException {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
