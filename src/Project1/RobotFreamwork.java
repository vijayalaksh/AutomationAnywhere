package Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;

public class RobotFreamwork {

	public static void main(String[] args) throws Exception {
		
		try 
		{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath(".//a[@href=contains(text(),'mailmerge.xls')]")).click();
			
			/*Robot rb = new Robot();
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_TAB);	
	           Thread.sleep(2000);	
	           rb.keyPress(KeyEvent.VK_TAB);	
	           Thread.sleep(2000);	
	           rb.keyPress(KeyEvent.VK_TAB);	
	           Thread.sleep(2000);	
	           rb.keyPress(KeyEvent.VK_ENTER);	*/
			
			 Robot robot = new Robot();	
		        robot.mouseMove(630, 420); // move mouse point to specific location	
		        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
		       
		        robot.delay(1500);	
		        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button	
		        Thread.sleep(2000);	
		        robot.keyPress(KeyEvent.VK_ENTER); 
		        
				
			
		} 
		catch (AWTException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
