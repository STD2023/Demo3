package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

		
		//page factory or OR: 
		
		@FindBy(css=".btn-primary.btn-xs-2")
		WebElement LogIn_button;
		
		//Initialising the page Objects
		
		public HomePage() throws IOException {
			
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public void get_account() {
			
			LogIn_button.click();
			
		}
		
		

	}

	
	


