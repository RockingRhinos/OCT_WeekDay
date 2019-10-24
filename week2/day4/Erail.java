package week2.day4;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	
	public static void main(String[] args) throws InterruptedException {
		//setting up system property
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// Declaring object for chromedriver class
				ChromeDriver driver = new ChromeDriver();
				//Launching url
				driver.get("https://erail.in/");
				
				driver.findElementById("txtStationFrom").clear();
				driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
				driver.findElementById("txtStationTo").clear();
				driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
				driver.findElementById("chkSelectDateOnly").click();
				
				
				// get list of rows
				Thread.sleep(2000);
				List<WebElement> rows = 
						driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
				// get row size
				int rowSize = rows.size();
				System.out.println(rowSize);
	}

}
