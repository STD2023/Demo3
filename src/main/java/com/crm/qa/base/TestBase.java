package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
	    prop=new Properties();
		
		FileInputStream ip=new FileInputStream("/Users/yesmail/Documents/Java_Lessons/Data_driven/src/main/java/com/crm/qa/config/config.properties");
		
		prop.load(ip);
		
		
	}
	
	public static void init() {
		
        String browser_choice=prop.getProperty("browser");
		
		if (browser_choice.equals("chrome")) {
			
			System.setProperty("webdriver.gecko.driver", "/Users/yesmail/Downloads/geckodriver 2");
			
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("No browser selected ");
			
		
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
	
	

}
