package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ObjectRepository.SignInOR;

import com.Utilities.ConfigRead;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Base {

	ConfigRead configread = new ConfigRead();
	
	public String BaseURL = configread.getApplicationURL();
	public String chromepath = configread.getChromepath();
	public String firefoxpath = configread.getFirefoxpath();
	public String iepath = configread.getIEpath();
	public String userName = configread.getUserName();
	public String password = configread.getPassword();
	
	public static WebDriver driver = null;

	//public Scenario scenario;
	
	@Before
	public WebDriver  baseSetupAndLogin()
	{
		
		System.setProperty("webdriver.chrome.driver", chromepath);
		
    	driver = new ChromeDriver();

		driver.get(BaseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
         SignInOR loginPage = new SignInOR(driver);
		 loginPage.credentials(userName, password);
		
		 return driver;

	}
	
	
	
	
	
	@After
	public void tearDown()
	
	{
		driver.close();
	}
	
	
	/*@After
	public void screenShots(Scenario scenario) 
	{
	    if (this.scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	  }*/
	
	
	
}
