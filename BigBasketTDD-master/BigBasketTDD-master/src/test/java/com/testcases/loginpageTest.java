package com.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;
import com.pages.loginpage;

import junit.framework.Assert;

public class loginpageTest extends Base{
	loginpage lp;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		lp=new loginpage();
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
	public void loginTest()
	{
		ExtentTest test = extent.createTest("Bigbasket Login Test");
		driver.get("https://www.bigbasket.com/");
		test.log(Status.PASS, "Validate login Test case passed");
	}
	
	@Test
	public void titleTest()
	{  
		driver.get("https://www.bigbasket.com/");
		if(driver.getTitle().equals("Online Grocery Shopping and Online Supermarket in India - bigbasket"))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		ExtentTest test = extent.createTest("Bigbasket Title Test");
		test.log(Status.PASS, "Validate Title Test case passed");
		
	}

	
	
}

