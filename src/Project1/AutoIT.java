package Project1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
try 
{
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,850)");
	driver.findElement(By.id("photo")).click();
	Runtime.getRuntime().exec("D://FileUpload.exe");
	Thread.sleep(5000);
	 
    //driver.close();
	System.out.println("testing done");
	
} 
catch (IOException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
