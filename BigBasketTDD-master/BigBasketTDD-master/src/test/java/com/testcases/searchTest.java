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
import com.pages.search;
public class searchTest extends Base {
	 WebDriver driver;
		search page;
		@BeforeMethod
		public void launchBrowser()
		{
			initializaiton();
			page=new search(driver);
			
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
		public void Assert_Fruits_Confirm()
		{
			ExtentTest test = extent.createTest("search fruits");
			search fruit=PageFactory.initElements(driver, search.class);
			fruit.enter();
			fruit.Click();
			fruit.Assert_Fruits_Confirmation();
			test.log(Status.PASS, "Validate Fruits search case passed");
			
		}
		@Test
		public void Assert_Vegetables_Confirm()
		{
			ExtentTest test = extent.createTest("search veg");
			search veg=PageFactory.initElements(driver, search.class);
			veg.clrS();
			veg.enterV();
			veg.ClickV();
			veg.Assert_Vegetables_Confirmation();
			test.log(Status.PASS, "Validate Veg search case passed");
			
		}
		@Test
		public void Assert_Oil_Confirma()
		{
			ExtentTest test = extent.createTest("search oil");
			search oil=PageFactory.initElements(driver, search.class);
			oil.clrO();
			oil.enterO();
			oil.ClickO();
			oil.Assert_Oil_Confirmation();
			test.log(Status.PASS, "Validate oil search case passed");
			
		}
}
