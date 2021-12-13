package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class search extends Base{
	@FindBy(xpath="//*[@id=\"input\"]")
    WebElement searchBox;
	@FindBy(xpath="//*[@id='navbar-main']/div/div[3]/div/div[1]/button/i[1]")
    WebElement searchBtn;
	WebElement newLocation;
    public search(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    public  void enter() {
		searchBox.sendKeys("fruits");
	}
    	public void Click() {
    		searchBtn.click();
    	}
       public void Assert_Fruits_Confirmation() {
    		
    		if(searchBox.getText().contains("Fruits")) {
    			System.out.println("search Verified");
    		}
    		else {
    			System.out.println("Search not completed");
    		}
       }

    	public void clrS() {
    		searchBox.clear();
        }
    	
    	public  void enterV() {
    		searchBox.sendKeys("vegetables");
    	}
        	public void ClickV() {
        		searchBtn.click();
        	}
           public void Assert_Vegetables_Confirmation() {
        		
        		if(searchBox.getText().contains("Vegetables")) {
        			System.out.println("search Verified");
        		}else {
        			System.out.println("Search not completed");
        		}
           }
        		public void clrO() {
            		searchBox.clear();
                }
            	
            	public  void enterO() {
            		searchBox.sendKeys("Oil");
            	}
                	public void ClickO() {
                		searchBtn.click();
                	}
                   public void Assert_Oil_Confirmation() {
                		
                		if(searchBox.getText().contains("Oil")) {
                			System.out.println("search Verified");
                		}else {
                			System.out.println("Search not completed");
                		}
    	
    }
}

