package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class dealsOfWeek extends Base{
	@FindBy(xpath="//*[@id=\"store-entry\"]/div[1]/div/div[6]/div/div/a/img")
    WebElement deal;
	@FindBy(xpath="//*[@id=\"sel1\"]")
    WebElement dropDown;
	@FindBy(xpath="//*[@id=\"sel1\"]")
    WebElement dropDown1;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[1]")
    WebElement popularity;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[2]")
    WebElement priceLh;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[3]")
    WebElement priceHl;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[4]")
    WebElement alphabetical;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[5]")
    WebElement rsSaveLh;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[6]")
    WebElement rsSaveHl;
    public dealsOfWeek(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    public void Click() {
		deal.click();
	}
    public void hoverimage() {
		Actions actions = new Actions(driver);
		actions.moveToElement(dropDown).perform();
	}
    public void Clickd() {
		dropDown.click();
	}
    public  void enter() {
		dropDown.sendKeys("popularity");
	}
    public void clck() {
		popularity.click();
	}
    public void Assert_popularity_Confirmation() {
		
		if(dropDown.getText().contains("popularity")) {
			System.out.println("popularity Verified");
		}else {
			System.out.println("popularity not completed");
		}

	}
    
    public void clr() {
    	dropDown.clear();
    }
    
    public  void enterLH() {
		dropDown.sendKeys("Price-Low to high");
	}
    public void clckLH() {
		priceLh.click();
	}
public void Assert_priceLh_Confirmation() {
		
		if(dropDown.getText().contains("Price-Low to high")) {
			System.out.println("priceLh Verified");
		}else {
			System.out.println("priceLh not completed");
		}

	}
public void clrHL() {
	dropDown.clear();
}

public  void enterHL() {
	dropDown.sendKeys("Price-High to low");
}
public void clckHL() {
	priceHl.click();
}
public void Assert_priceHl_Confirmation() {
	
	if(dropDown.getText().contains("Price-High to low")) {
		System.out.println("priceHl Verified");
	}else {
		System.out.println("priceHl not completed");
	}

}
public void clrAlp() {
	dropDown.clear();
}

public  void enterAlp() {
	dropDown.sendKeys("alphabetically");
}
public void clckAlp() {
	alphabetical.click();
}
public void Assert_alphabetically_Confirmation() {
	
	if(dropDown.getText().contains("alphabetically")) {
		System.out.println("alphabetically Verified");
	}else {
		System.out.println("alphabetically not completed");
	}
}

public void clrS() {
	dropDown.clear();
}

public  void enterS() {
	dropDown.sendKeys("Rupee saving-High to low");
}
public void clckS() {
	rsSaveLh.click();
}
public void Assert_RupeeHL_Confirmation() {
	
	if(dropDown.getText().contains("Rupee saving-High to low")) {
		System.out.println("Rupee saving-High to low Verified");
	}else {
		System.out.println("Rupee saving-High to low not completed");
	}
}
   
public void clrSH() {
	dropDown.clear();
}

public  void enterSH() {
	dropDown.sendKeys("Rupee saving-Low to high");
}
public void clckSH() {
	rsSaveHl.click();
}
public void Assert_RupeeLH_Confirmation() {
	
	if(dropDown.getText().contains("Rupee saving-Low to high")) {
		System.out.println("Rupee saving-Low to high Verified");
	}else {
		System.out.println("Rupee saving-Low to high not completed");
	}
}
}
