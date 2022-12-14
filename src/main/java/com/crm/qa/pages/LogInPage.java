package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LogInPage extends TestBase {
	
	//FagePactory
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css=".ui.fluid.large.blue.submit.button")
	WebElement loginbutton;
	
	public LogInPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public void login(String user, String psd) {
		
		username.sendKeys(user);
		password.sendKeys(psd);
		loginbutton.click();
		
		
	}
		
		
		
	}
