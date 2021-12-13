package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class BuyItem extends Base {
	@FindBy(xpath="//*[@id=\"navBarMegaNav\"]/li[1]/a")
    WebElement fruitsVeg;
	 @FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[3]/a")
    WebElement onion;
	 @FindBy(xpath="@FindBy(xpath=\"//*[@id='navbar']/ul/li[2]/a\")\r\n"+ "    WebElement offer;")
	WebElement add;
	@FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[1]/div/input") 
	WebElement quantity;
	@FindBy(xpath="@FindBy(xpath=\"//*[@id=\\\"navBarMegaNav\\\"]/li[1]/a\")\r\n"+ "WebElement fruitsVeg;")
    WebElement myBasket;
	@FindBy(xpath="//*[@id=\"navbar-main\"]/div/bigbasket-cart-template/div/div[2]/ul/li[1]/div/ul/comment()[1]")
	WebElement bask;
	@FindBy(xpath="//*[@id=\"navbar-main\"]/div/bigbasket-cart-template/div/div[2]/ul/li[2]/div[2]/div[2]/button")
	WebElement checkOut;
	    public BuyItem(WebDriver driver) {
	    	PageFactory.initElements(driver,this);
	    }
	    
	    public void hover() {
    		Actions actions = new Actions(driver);
    		actions.moveToElement(fruitsVeg).perform();
    	}
	    public void clckBtn() {
    		fruitsVeg.click();
    	}
	    public void hoveOn() {
    		Actions actions = new Actions(driver);
    		actions.moveToElement(onion).perform();
    	}
	    public void clrbtn() {
    		quantity.clear();
    	}
	    public  void enter() {
			quantity.sendKeys("3");
		}
	    public void clckbtn() {
    		add.click();
    	}
 public void Assert_addItem_Confirmation() {
    		
    		if(quantity.getText().contains("3")) {
    			System.out.println("Location Verified");
    		}else {
    			System.out.println("Location not completed");
    		}
 }
	    
	  
 public void hoverB() {
		Actions actions = new Actions(driver);
		actions.moveToElement(myBasket).perform();
	}
 public void clckBtnF() {
		fruitsVeg.click();
	}
 public void hoveBask() {
		Actions actions = new Actions(driver);
		actions.moveToElement(bask).perform();
	}
 
 public void clckbtnCheck() {
		checkOut.click();
	}
public void Assert_myBasket_Confirmation() {
		
		if(bask.getText().contains("fresho onion 5kg")) {
			System.out.println("Location Verified");
		}else {
			System.out.println("Location not completed");
		}
}
	    
}
