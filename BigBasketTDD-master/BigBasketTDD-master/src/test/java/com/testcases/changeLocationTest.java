package com.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;
import com.pages.changeLocation;
public class changeLocationTest extends Base{
	 WebDriver driver;
	 changeLocation page;
		@BeforeMethod
		public void launchBrowser()
		{
			initializaiton();
			page=new changeLocation(driver);
			
		}
		@AfterMethod
		public void closeSetup()
		{
			tearDown();
		}
		@BeforeTest
		public void reportSetup()
		{
			extentReportSetup();
		}
		@AfterTest
		public void closeReportSetup()
		{
			closeExtentReportSetup();
		}
		
		@Test
		public void Assert_Location_Confirm()
		{
			ExtentTest test = extent.createTest("ChangeLocation");
			changeLocation loc=PageFactory.initElements(driver, changeLocation.class);
			loc.Click();
			loc.clck();
			loc.hover();
			loc.clckbtn();
			loc.Assert_Location_Confirmation();
			test.log(Status.PASS, "Validate Change Location case failed");
			
		}
}
