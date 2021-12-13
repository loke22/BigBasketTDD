package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class viewOffer extends Base{
    @FindBy(xpath="//*[@id='navbar']/ul/li[2]/a")
    WebElement offer;
    @FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[3]/a")
    WebElement image;
    @FindBy(xpath="@FindBy(xpath=\"//*[@id='navbar']/ul/li[2]/a\")\r\n"+ "    WebElement offer;")
    WebElement add;
    @FindBy(xpath="//*[@id=\"a28cf553-306c-4cdf-94d9-80310b59ef1b\"]/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[1]/div/input")
    WebElement quantity;
    public viewOffer(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
 
    	public void Clickoffer(WebDriver driver) {
    		offer.click();
    	}
    	public void hoverimage() {
    		Actions actions = new Actions(driver);
    		actions.moveToElement(image).perform();
    	}
    	public void clr() {
    		quantity.clear();
        }
    	public  void enter() {
    		quantity.sendKeys("3");
    	}
    	public void clck() {
    		add.click();
    	}
    	public void Assert_Order_Confirmation() {
    		
    		if(quantity.getText().contains("3")) {
    			System.out.println("Order Verified");
    		}else {
    			System.out.println("Order not completed");
    		}

    	}
}

