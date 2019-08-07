package com.gojek.gojek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gojekTestClasee {
	
	WebDriver driver;
	
	 
	@BeforeTest
	 @Parameters("crossbrowser")
	  public void setup(String browser) {
		 if(browser.equalsIgnoreCase("Chrome")){
			 
			 String path = System.getProperty("user.dir");
			 System.out.println(path); 
			 System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
			 driver = new ChromeDriver(); 
		 }
		 
		 else if(browser.equalsIgnoreCase("Firefox")){
			 String path = System.getProperty("user.dir");
			 System.out.println(path); 
			 System.setProperty("webdriver.gecko.driver",path+"\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 
			 
		 }
	  }
	
	 @Test
		public void Test() throws InterruptedException{
			driver.get("url");
			
		}
	 
	 
	 @AfterTest
	 public void teardown() throws Exception {
	  driver.quit();
}
}