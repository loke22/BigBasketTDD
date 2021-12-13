package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class changeLocation extends Base{
	@FindBy(xpath="//*[@id=\"cityWidget\"]/label/input")
    WebElement location;
    @FindBy(xpath="//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[2]/form/div[1]/div/div/span/i")
    WebElement dropDown;
    @FindBy(xpath="//*[@id=\"ui-select-choices-row-1-0\"]/a") 
    WebElement newLocation;
    @FindBy(xpath="//*[@id=\"ui-select-choices-row-1-0\"]/a") 
    WebElement newLocation1;
    @FindBy(xpath="//*[@id=\"headerControllerId\"]/header/div/div/div/div/ul/li[2]/div/div/div[2]/form/div[3]/button")
    WebElement btn;
    public changeLocation(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
 
    	public void Click() {
    		location.click();
    	}
    	public void clck() {
    		dropDown.click();
    	}
    	public void hover() {
    		Actions actions = new Actions(driver);
    		actions.moveToElement(newLocation).perform();
    	}
    	
    	public void clckbtn() {
    		btn.clear();
    	}
            public void Assert_Location_Confirmation() {
    		
    		if(newLocation.getText().contains("Agra")) {
    			System.out.println("Location Verified");
    		}else {
    			System.out.println("Location not completed");
    		}
	
}
}

