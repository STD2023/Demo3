package com.crm.qa.util;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class HomeTest extends TestBase {
	
	HomePage homepage;
	
	public HomeTest() throws IOException{
		
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		init();
		homepage=new HomePage();
	}
	
	@Test

	public void HomePageTitleTest() throws InterruptedException {

		String title = homepage.validateLoginPageTitle();

		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
		System.out.println(title);
		
		homepage.get_account();
		

	}
	
	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}
	
	

