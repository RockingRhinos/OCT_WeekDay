package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		driver.findElementById("home").click();
		Set<String> winSet = driver.getWindowHandles();
		
		List<String> winList = new ArrayList<String>(winSet);
//		for (String eachHandle : winList) {
//			System.out.println(eachHandle);
//		}
//		winList.addAll(winSet);
		String firstWindow = winList.get(0);
		String secWindow = winList.get(1);
		
		driver.switchTo().window(secWindow);
		
		String secTitle = driver.getTitle();
		System.out.println(secTitle);
		driver.switchTo().window(firstWindow);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
