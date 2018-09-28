package Project1;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SikuliClass 
{
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		SikuliImageReader();

	}
	public static void SikuliImageReader() throws Exception
	{
		Screen screen = new Screen();
		Pattern Fname = new Pattern("./Images/F1.png");
		Pattern Lname = new Pattern("./Images/F2.png");
		Pattern Email = new Pattern("./Images/F3.png");
		Pattern ConEmail = new Pattern("./Images/F4.png");
		Pattern ZipCode = new Pattern("./Images/F5.png");
		Pattern submit = new Pattern("./Images/F6.png");
		Pattern OwnerHome = new Pattern("./Images/OwnerHome.png");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://owner.ford.com/content/ford-dot-com/en/tools/account/account-registration.html#/");
		System.out.println("testing done");
		System.out.println("project commiitted");
/*//			screen.wait(Fname, 10);
//			screen.find(Fname);
//			screen.type(Fname, "Neelam");
//			screen.find(Lname);
//			screen.type(Lname, "Verma");
//			screen.find(Email);
//			screen.type(Email, "neelamverma@gmail.com");
//			screen.find(ConEmail);
//			screen.type(ConEmail, "neelamverma@gmail.com");
//			screen.find(ZipCode);
//			screen.type(ZipCode, "600042");
*/			//screen.wait(ownerhome, 10);
		//screen.click(ownerhome);
		
		//js.executeScript("window.scrollBy(0,1000)");
		//screen.find(submit);
		//screen.click(submit);
		
		

		screen.wait(OwnerHome, 10);
		screen.find(OwnerHome);
		screen.click(OwnerHome);
	}

}
