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
import com.pages.BuyItem;
public class BuyItemTest extends Base{
	WebDriver driver;
	BuyItem page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new BuyItem(driver);
		
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
	public void validateBuyItem()
	{
		ExtentTest test = extent.createTest("BuyItem");
		test.log(Status.FAIL, "Validate BuyItem case failed");
		
	}
	@Test
	public void Assert_addItem_Confirm()
	{
		ExtentTest test = extent.createTest("Basket");
		BuyItem prod=PageFactory.initElements(driver, BuyItem.class);
		prod.hover();
		prod.clckBtn();
		prod.hoveOn();
		prod.clrbtn();
		prod.enter();
		prod.clckbtn();
		prod.Assert_addItem_Confirmation();
		test.log(Status.PASS, "Validate Basket case failed");
		
	}
	@Test
	public void Assert_myBasket_Confirm()
	{
		ExtentTest test = extent.createTest("Basket");
		BuyItem basket=PageFactory.initElements(driver, BuyItem.class);
		basket.hoverB();
		basket.clckBtnF();
		basket.hoveBask();
		basket.clckbtnCheck();
		basket.Assert_myBasket_Confirmation();
		
		test.log(Status.PASS, "Validate Basket case failed");
		
	}
}
