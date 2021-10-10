package com.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver ldriver;
	
	public Homepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(linkText="Form Authentication")
	@CacheLookup
	WebElement formAuthentication;
	
	@FindBy(linkText="Multiple Windows")
	@CacheLookup
	WebElement multipleWindows;
	
	@FindBy(linkText="Forgot Password")
	@CacheLookup
	WebElement forgotPassword;
	
	@FindBy(linkText="Basic Auth")
	@CacheLookup
	WebElement basicAuth;

	
	public void formAuthenticationClick()
	{
		formAuthentication.click();
		
	}		
	public void multipleWindowsClick()
	{
		multipleWindows.click();
	}
	public void forgotPasswordClick()
	{
		forgotPassword.click();
	}
	public void basicAuthClick()
	{
		basicAuth.click();
	}
}