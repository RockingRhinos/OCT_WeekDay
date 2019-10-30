package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[@id='Click']").click();
//		driver.switchTo().alert().sendKeys("Naveen");
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* Alert alert = */
				
		/*
		 * driver.switchTo().alert().getText(); driver.switchTo().alert().accept();
		 */
		
		/*
		 * String alertText = alert.getText(); System.out.println(alertText);
		 * Thread.sleep(2000); alert.accept();
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
