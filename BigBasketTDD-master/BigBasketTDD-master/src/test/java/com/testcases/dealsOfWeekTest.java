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
import com.pages.dealsOfWeek;
public class dealsOfWeekTest extends Base {
	WebDriver driver;
	dealsOfWeek page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new dealsOfWeek(driver);
		
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
	public void Assert_popularity_Confirm()
	{
		ExtentTest test = extent.createTest("Popularity");
		dealsOfWeek pop = PageFactory.initElements(driver, dealsOfWeek.class);
		pop.Click();
		pop.hoverimage();
		pop.Clickd();
		pop.enter();
		pop.clck();
		pop.Assert_popularity_Confirmation();
		test.log(Status.PASS, "Validate Popularity case failed");
		
	}
	@Test
	public void Assert_priceLh_Confirm()
	{
		ExtentTest test = extent.createTest("PriceLH");
		dealsOfWeek prLH = PageFactory.initElements(driver, dealsOfWeek.class);
		prLH.clr();
		prLH.enterLH();
		prLH.clckLH();
		prLH.Assert_priceLh_Confirmation();
		test.log(Status.PASS, "Validate PriceLH case failed");
		
	}
	@Test
	public void Assert_priceHl_Confirm()
	{
		ExtentTest test = extent.createTest("Popularity");
		dealsOfWeek prHL = PageFactory.initElements(driver, dealsOfWeek.class);
		prHL.clrHL();
		prHL.enterHL();
		prHL.clckHL();
		prHL.Assert_priceHl_Confirmation();
		test.log(Status.PASS, "validate PriceHL case failed");
		
	}
	@Test
	public void Assert_alphabetically_Confirm()
	{
		ExtentTest test = extent.createTest("validateAlph");
		dealsOfWeek alph = PageFactory.initElements(driver, dealsOfWeek.class);
		alph.clrAlp();
		alph.enterAlp();
		alph.clckAlp();
		alph.Assert_alphabetically_Confirmation();
		test.log(Status.PASS, "Validate alphabetical case failed");
		
	}
	@Test
	public void Assert_RupeeHL_Confirm()
	{
		ExtentTest test = extent.createTest("SaveLH");
		dealsOfWeek rsHL = PageFactory.initElements(driver, dealsOfWeek.class);
		rsHL.clrS();
		rsHL.enterS();
		rsHL.clckS();
		rsHL.Assert_RupeeHL_Confirmation();
		test.log(Status.PASS, "Validate SaveLH case failed");
		
	}
	public void Assert_RupeeLH_Confirm()
	{
		ExtentTest test = extent.createTest("validateSaveHl");
		dealsOfWeek rsLH = PageFactory.initElements(driver, dealsOfWeek.class);
		rsLH.clrSH();
		rsLH.enterSH();
		rsLH.clckSH();
		rsLH.Assert_RupeeLH_Confirmation();
		test.log(Status.PASS, "Validate SaveHL case failed");
		
	}
}
