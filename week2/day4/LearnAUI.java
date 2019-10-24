package week2.day4;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		Point location = item4.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		//System.out.println(location);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
