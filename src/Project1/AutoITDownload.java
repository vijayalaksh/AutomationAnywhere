package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoITDownload 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("firefox");
		ds.setVersion("46.0");
		ds.setPlatform(Platform.ANY);
		ds.setCapability("marionette", false); 
        WebDriver driver = new FirefoxDriver(ds);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //To open URL
        driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
        //Download Text File
        driver.findElement(By.xpath("//*[@id='post-body-5864649494765988891']/div[1]/form/div[1]/a[1]")).click();
        //To call the AutoIt script
        Runtime.getRuntime().exec("D://FileDownload.exe");
	}
}
