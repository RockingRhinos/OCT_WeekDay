package week1.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dd = driver.findElementById("day");
		Select dropDown = new Select(dd);
//		dropDown.selectByVisibleText("21");
//		dropDown.selectByValue("12");
//		dropDown.selectByIndex(4);
//		dd.findElements(By.tagName("option"))
		List<WebElement> options = dropDown.getOptions();
		int size = options.size();
		System.out.println(size);
		dropDown.selectByIndex(size-1);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
