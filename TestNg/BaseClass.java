package week3.day3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week4.day1.ReadExcel;

public class BaseClass {
	public static ChromeDriver driver;
	public static String fileName;
	@Parameters({"username","url","password"})
	@BeforeMethod
	public void login(String uName,String url,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
