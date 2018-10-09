package autoit;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmailWithAttachement {
	//System.setProperty("webdriver.chrome.driver", "D:\\Projects\\JAVA\\JavaProjects\\chromedriver_win32\\chromedriver.exe");
	public WebDriver driver = null;
	public static String Chrome_key = "webdriver.chrome.driver";
	public static String Chrome_value = "C:\\Program Files\\SeleniumClass\\ThirdPartyToolDeom\\Drivers\\chromedriver.exe";
	public WebDriverWait wait = null;
	
	@BeforeMethod
	public void precondition () {
		
		System.setProperty(Chrome_key,Chrome_value);
		driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void AutoIt() {
		try {
				String strFilePath = "D:\\Projects\\JAVA\\au3\\NewTextDocument.txt";
				String strPath = "D:\\Projects\\JAVA\\au3\\attachment.exe";
				String strParameter = strPath + " " + strFilePath;
				Runtime.getRuntime().exec(strParameter);
			
		} catch (Exception e) {
			
			System.out.println("Unable to upload the attachment");
		}
	}
	
	
	@Test
	public void composeEmailWithAttachement() {
		
		WebElement UserName = driver.findElement(By.id("identifierId"));
		UserName.sendKeys("kumbhar.sachin24@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Radha@2603");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.titleContains("Inbox"));
		WebElement Composebtn=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		Composebtn.click();
		
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		AutoIt();
	}
	
	//@AfterMethod
	//public void closeBrowser() {
	//	driver.close();	
	//}
}
 