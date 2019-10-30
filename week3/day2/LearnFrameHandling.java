package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement myFrame = driver.findElementByXPath("//iframe");
		
		driver.switchTo().frame(myFrame);
		
		driver.findElementByXPath("//button[@id='Click']").click();
		System.out.println(driver.findElementByXPath("//button[@id='Click']").getText());
//		navigating into nested frames
		/*
		 * driver.switchTo().frame("frame1"); driver.switchTo().frame("frame2");
		 * driver.switchTo().frame("frame3"); // will take you to the 1st frame
		 * driver.switchTo().parentFrame(); driver.switchTo().parentFrame();
		 * 
		 * // will take you outta all the frames driver.switchTo().defaultContent();
		 * 
		 * String text =
		 * driver.findElementByXPath("//h1[text()='Fun with frames']").getText();
		 * 
		 * System.out.println(text);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
