package liabraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getExcelData(int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\niraj\\eclipse-workspace\\Maven_1\\TestData");
		Sheet sh = WorkbookFactory.create(file).getSheetAt(0);
		
		String StVal = sh.getRow(rowNo).getCell(cellNo).getStringCellValue();
		
		return StVal;
	}
	
	public static void takeScreenShotOfFailedTC(WebDriver driver, int TestCaseID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\niraj\\eclipse-workspace\\Maven_1\\Failed_TC_SS"+TestCaseID+".png");
		
		FileHandler.copy(src, dest);
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\niraj\\eclipse-workspace\\Maven_1\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String PrData = p.getProperty(key);
		
		return PrData;
	}
}
