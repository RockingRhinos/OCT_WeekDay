package week1.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnUserInteractions {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
//		To launch browser
		ChromeDriver driver = new ChromeDriver();
//		To maximize the browser
		driver.manage().window().maximize();
//		To load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
//		TO find the element
		WebElement userName = driver.findElementById("username");
//		To enter a value
		userName.sendKeys("demosalesmanager");
//		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
//		To click on a button
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("CRM/").click();
	
	}

}
