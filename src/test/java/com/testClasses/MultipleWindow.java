package com.testClasses;

     import org.testng.annotations.Test;
	 import org.openqa.selenium.WebElement;
	import com.pageClasses.ForgotPasswordPage;
	import com.pageClasses.Homepage;
import com.pageClasses.MultipleWondowPage;

import junit.framework.Assert;

	public class MultipleWindow extends BaseClass{
	  @Test
	  public void VerifyforgotPassword() throws InterruptedException
		{
		  
	      Homepage pg=new Homepage(driver);
	        Thread.sleep(2000);
			pg.multipleWindowsClick();
			
			MultipleWondowPage mw=new MultipleWondowPage(driver);
			Thread.sleep(2000);
			mw.clickhereLink();
			
			
			BaseClass.SwitchToChildWindow("New Window");
		
			String actulaWindowTitle=driver.getTitle();
			
	        String ExpectedWindowTitle="New Window";
	    
	        if(actulaWindowTitle.contains(ExpectedWindowTitle))
	        {
	        	
				Assert.assertTrue(true);
				
	        }
		     else
		     {
		    	 System.out.println("Expected homepage tile is:"+ExpectedWindowTitle +"Actual page title is :" +actulaWindowTitle);
		    	 Assert.assertTrue(false);
		    	 
		      }      
	         
	        BaseClass.SwitchToChildWindow("The Internet");
	        Thread.sleep(2000);
	        String homepageTitle=driver.getTitle();
	        	   
	        String ExpectedhomepageTitle="The Internet";
	      
	        if(homepageTitle.contains(ExpectedhomepageTitle))
	        {
				Assert.assertTrue(true);
				
	        }
		     else
		     {
		    	 System.out.println("Expected homepage tile is: >>"+ExpectedhomepageTitle + "  Actual page title is >>:" +homepageTitle);
		    	 Assert.assertTrue(false);
		    	 
		    }
	        
		}
		  
	
}
