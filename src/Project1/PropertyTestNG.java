package Project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyTestNG
{
 static String  sPtah ="./Object_Repositry/Pro.properties.txt";
 static WebDriver driver;
 
 @BeforeTest
 public void InitizeBrowser()
 {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver = new ChromeDriver();
	 Reporter.log("Browser opened");
	 driver.manage().window().maximize();
	 Reporter.log("Windows Maximize");
 }
  
 
  @Test(priority=1)
  public static void ReadProperty()
   {
		try 
		{
			FileInputStream oFile = new FileInputStream(sPtah);
			Properties oPro = new Properties();
			try 
			{
				
				oPro.load(oFile);
				String sValue = oPro.getProperty("Url");
				System.out.println(sValue);
			} 
			catch (IOException e) 
			{				
				e.printStackTrace();
			}
			
		} 
		catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		}
	}
}
