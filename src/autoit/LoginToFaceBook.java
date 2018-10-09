package autoit;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToFaceBook {
	public WebDriver driver = null;
	public static String Chrome_key = "webdriver.chrome.driver";
	public static String Chrome_value = "C:\\Program Files\\SeleniumClass\\ThirdPartyToolDeom\\Drivers\\chromedriver.exe";
	public WebDriverWait wait = null;
	
	
	@BeforeMethod
	public void precondition () {
		
		System.setProperty(Chrome_key,Chrome_value);
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void LaunchFaceBook() throws FindFailed {
		Screen screen = new Screen();
		Pattern username = new Pattern("D:\\Projects\\JAVA\\sikuli\\Email.jpg");
		Pattern password = new Pattern("D:\\Projects\\JAVA\\sikuli\\Password.jpg");
		Pattern LoginBtn = new Pattern("D:\\Projects\\JAVA\\sikuli\\Login.jpg");
		
		screen.wait(username,10);
		screen.type(username,"sachin");
		screen.type(password,"Radha@1234");
		screen.click(LoginBtn);
		
		
	}
	
}
