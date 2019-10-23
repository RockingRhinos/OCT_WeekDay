package week2.day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.get("https://www.myntra.com/");
		driver.navigate().to("http://leafground.com/pages/Dropdown.html");
		
		WebElement selenium = driver.findElementByXPath
				("(//select)[6]/option[2]");
		
		WebElement uft = driver.findElementByXPath
				("(//select)[6]/option[4]");
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(selenium).click(uft).
					keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
/*//		WebElement men = driver.findElementByLinkText("Men");
//		WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		
		
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		builder.doubleClick(men).perform();
		builder.clickAndHold(men).pause(2000).release().perform();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
