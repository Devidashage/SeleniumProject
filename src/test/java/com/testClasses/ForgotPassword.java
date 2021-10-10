package com.testClasses;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pageClasses.ForgotPasswordPage;
import com.pageClasses.Homepage;

import junit.framework.Assert;

public class ForgotPassword extends BaseClass{
  @Test
  public void VerifyforgotPassword() throws InterruptedException
	{
	  
      Homepage pg=new Homepage(driver);
        Thread.sleep(2000);
		pg.forgotPasswordClick();
		
		ForgotPasswordPage forgotPass=new ForgotPasswordPage(driver);
		Thread.sleep(2000);
		forgotPass.setEmail("meetdevarh@gmail.com");
		Thread.sleep(2000);
		forgotPass.clickSubmit();
		
		WebElement ServerMessage=forgotPass.getElementInternalServerErrorMessage();
        String actualInternalServerMessage=BaseClass.getText(ServerMessage);
        String ExpectedInternalServerMessage="Internal Server Error";
        if(actualInternalServerMessage.equals(ExpectedInternalServerMessage))
        {
			Assert.assertTrue(true);
			
        }
	     else
	     {
	    	 System.out.println("Expected Message :"+ExpectedInternalServerMessage+" Actual Message"+actualInternalServerMessage);
	    	 Assert.assertTrue(false);
	    	 
	      }
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        String actualHomepageTitle=driver.getTitle();
        String ExpectedhomepageTitle="The Internet";
        if(actualHomepageTitle.contains(ExpectedhomepageTitle))
        {
			Assert.assertTrue(true);
			
        }
	     else
	     {
	    	 System.out.println("Expected homepage tile is:"+ExpectedhomepageTitle +"Actual page title is :" +actualHomepageTitle);
	    	 Assert.assertTrue(false);
	    	 
	      }
	}
	  
}
