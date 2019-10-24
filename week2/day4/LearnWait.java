package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		// setting up system property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Declaring object for Chrome Driver class
		ChromeDriver driver = new ChromeDriver();
		//
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Launching url
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
        //Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-default btn-lg'])[4]"))).click();
		//driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
