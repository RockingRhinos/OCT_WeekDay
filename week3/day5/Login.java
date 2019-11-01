package week3.day5;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			driver.findElement(By.id("user")).sendKeys("Demosalesmanager");
		} catch (NoSuchElementException e) {
			System.err.println("The element you're trying to access isn't available in the DOM");
			throw new RuntimeException();
		}
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// take snap (similar to printSCR)
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		// Copy the temp file to desired location
		FileUtils.copyFile(screenshotAs, new File("./snaps/img1.png"));

	}

}
