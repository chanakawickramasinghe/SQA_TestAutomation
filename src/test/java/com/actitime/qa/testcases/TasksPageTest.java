package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.ReportsPage;
import com.actitime.qa.pages.TasksPage;
import com.actitime.qa.pages.UsersPage;

public class TasksPageTest  extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ReportsPage reportsPage;
	UsersPage usersPage;
	TasksPage tasksPage;
	
	public TasksPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		homePage.clickOnTaskLink();
		tasksPage = new TasksPage();
	}
	
	@Test(priority = 1)
	public void tasksPageLogoTest() {		
	boolean flag= tasksPage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
