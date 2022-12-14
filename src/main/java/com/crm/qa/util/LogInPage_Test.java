package com.crm.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;

public class LogInPage_Test extends TestBase {

	LogInPage login;
	HomePage homepage;

	LogInPage_Test() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		init();
		login = new LogInPage();
		homepage = new HomePage();
	}

	@Test

	public void check_user() throws InterruptedException {
		System.out.println("hgkh");
		homepage.get_account();
		login.login("abc", "efg");
		
		Thread.sleep(2000);
	
		
		String msg=driver.findElement(By.cssSelector("div.ui.negative.message>p")).getText();
		
		
		System.out.println(msg);
		
		
		}
	

	@AfterMethod

	public void tearDown() {

		driver.quit();
	}
}
