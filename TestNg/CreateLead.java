package week3.day3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week4.day1.ReadExcel;

public class CreateLead extends BaseClass {
	@BeforeClass
	public void setData() {
		
		fileName = "createLead";
		
		
	}

	@Test(dataProvider = "fetchData")
	public void runCreatLead(String company, String fName , String lName) { // Test case begins here
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
//		driver.close();
	}

		
		
		
		
		
		
		
		
		
		
		
		
		

	}


