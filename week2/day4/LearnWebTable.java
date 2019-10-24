package week2.day4;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		//setting up system property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Declaring object for chromedriver class
		ChromeDriver driver = new ChromeDriver();
		//Launching url
		driver.get("http://leafground.com/pages/table.html");
		// get list of rows
		List<WebElement> rows = 
				driver.findElementsByXPath("//table//tr");
		// get row size
		int rowSize = rows.size();
		System.out.println(rowSize);
		
		for (int i = 2; i <= rowSize; i++) {
			// get list of columns
			List<WebElement> columns = driver.findElementsByXPath
					("//table//tr["+i+"]/td");
	        //get column size
			int colSize = columns.size();
			for (int j = 1; j <=colSize; j++) {
				// get text of first row value
				String text = driver.
findElementByXPath("//table//tr[" + i + "]/td[" + j+ "]").getText();
				System.out.print(text+"  ");

			}
			System.out.println();
		}
		
		

	}

}
