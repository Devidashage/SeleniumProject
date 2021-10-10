package com.testClasses;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageClasses.FormAuthenticationPage;
import com.pageClasses.Homepage;
@Test
public class FormAuthontication extends BaseClass {
	
	
	public void formAuthentication() throws InterruptedException
	{
		
		Homepage pg=new Homepage(driver);
		Thread.sleep(2000);
		pg.formAuthenticationClick();	
		FormAuthenticationPage fp=new FormAuthenticationPage(driver);
		fp.setUserName(username);
		Thread.sleep(2000);
		fp.setPassword(password);
		Thread.sleep(2000);
		fp.clickSubmit();
		//String actulaTitle=driver.getTitle();	
		//System.out.println(actulaTitle);
		//Assert.assertEquals(actulaTitle, "The Internet");	
        WebElement welComeMessage=fp.getWelComeMessageElement();
        String actualWelcomeMessage=BaseClass.getText(welComeMessage);
        String ExpectedWelcomeMessage="Welcome to the Secure Area. When you are done click logout below.";
        if(actualWelcomeMessage.equals(ExpectedWelcomeMessage))
        {
			Assert.assertTrue(true);
			fp.clickLogout();
        }
	     else
	     {
	    	 System.out.println("Expeted Welcome Message :"+ExpectedWelcomeMessage +" \nActual Welcome Message :" +actualWelcomeMessage + "is not similar.");
	    	 Assert.assertTrue(false);
	    	 
	      }
        WebElement logoutMessage=fp.getLogoutMessageElement();
        String logoutMessageText=BaseClass.getText(logoutMessage);       
        String ExpectedLogoutMessage="You logged out of the secure area!";
        if(logoutMessageText.contains(ExpectedLogoutMessage))
        {
			Assert.assertTrue(true);
        }
	     else
	    {
	    	 System.out.println("Expeted Logout Message :"+ExpectedLogoutMessage +" \nActual Logout Message :" +logoutMessageText + "is not similar.");
	    	 Assert.assertTrue(false);	    	 
	     }

     }
}
