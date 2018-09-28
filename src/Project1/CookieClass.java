package Project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieClass {

	public static void main(String[] args)
    {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
	  driver.findElement(By.name("username")).sendKeys("abc123");
	  driver.findElement(By.name("password")).sendKeys("123xyz");
	  //driver.findElement(By.name("submit")).click();
	  File file = new File("Cookies.data");
	  try 
	  {
		file.createNewFile();
		FileWriter fwriter = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		for (Cookie  cookie : driver.manage().getCookies())
		{
		bwriter.write(cookie.getName()+"  "+cookie.getValue()+"  "+cookie.getDomain()+"  "+cookie.getPath()+cookie.isSecure());
		bwriter.newLine();
		}
		bwriter.close();
		fwriter.close();
	}
	  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
 
	  
	}
	
	public void ReadCookie()
	{
		
	}

}
