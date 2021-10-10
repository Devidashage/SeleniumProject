package com.testClasses;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.utils.ReadConfigFile;


public class BaseClass {

	ReadConfigFile readconfig=new ReadConfigFile();	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	
    public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass	
	public void setup(String browser) throws InterruptedException
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
			Thread.sleep(2000);
			
			}
		else if(browser.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	//To Capture the screen shots
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		
	}	
	
	public static String getText(WebElement element)
	{
		return element.getText();
	}
	//To switch to child window
	public static void SwitchToChildWindow(String childWindowName) throws InterruptedException
	{
		   
		     String parent=driver.getWindowHandle();		      
		     for (String child : driver.getWindowHandles()) {    	 
		    	 	    	 
		    	 driver.switchTo().window(child);
		     	 String childTitle=driver.getTitle();		    	  
		    	 if(!parent.equals(child)&& childTitle.equals(childWindowName))
		    	 {	 Thread.sleep(2000);
		    		 return; 		 	    	
		    		 
		    	 }				
			}		
	    }
		
	}
			

