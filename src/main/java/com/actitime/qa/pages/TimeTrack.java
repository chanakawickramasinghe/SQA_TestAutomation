package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;

public class TimeTrack extends TestBase {
	
		 @FindBy(xpath = "//div[@id='logo_aT']")
		    WebElement actitimeLogo;
	
		 @FindBy(xpath = "//*[@id=\"approveTTTable\"]/tbody[2]/tr[2]/td[7]/input")		
		    WebElement approveTimeTrackLink;
		 
		 
		//*[@id="approveButton"]
			//*[@id="approveButton"]
		 
		 @FindBy(xpath = "//*[@id=\"approveButton\"]")		
		 WebElement approveButton;	
		 
		 
		 @FindBy(xpath = "*[@id=\"approveTTTable\"]/tbody[2]/tr[2]/td[2]/span")		
		 WebElement approved;	
		
		 
		public TimeTrack() {
			PageFactory.initElements(driver, this);
		}

		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		 
		public Boolean clickOnApproveTimeTrack() {
			approveTimeTrackLink.click();
			approveButton.click();
			if(approved.isDisplayed()) {
				return true;				
			}else {
				return false;
			}
		}
}