package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.TimeTrack;


public class TimeTrackTest extends TestBase{
	TimeTrack timeTrack;
	LoginPage loginPage;
	HomePage homePage;
	
	public TimeTrackTest() {
		super();
		
	}
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		homePage.clickOnTimeTrackLink();
		timeTrack = new TimeTrack();
	}
		
	
	@Test(priority = 1)
	public void LogoTest() {
	boolean flag= timeTrack.validateActiTimeLogo();
	Assert.assertTrue(flag);
	}
	
//	@Test(priority = 1)
//	public void clickOnApproveTimeTrack() {		
//	boolean flag= timeTrack.clickOnApproveTimeTrack();
//	Assert.assertTrue(flag,"Cannot find the Logo");
//		
//	}
	
	@Test(priority = 2)
	public void clickOnApproveTimeTrack() {		
	boolean flag= timeTrack.clickOnApproveTimeTrack();
	Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}