package week1.day4;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
		List<WebElement> inputs = driver.findElementsByTagName("input");
		System.out.println(inputs.size());
		
		for (WebElement eachElement : inputs) {
			
			eachElement.sendKeys("Test");
			/*String attName = eachElement.getAttribute("class");
			System.out.println(attName);*/
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String text = driver.findElementByTagName("h2").getText();
//		driver.findElementByTagName("input").sendKeys("Test");
//		System.out.println(text);
		

	}

}
