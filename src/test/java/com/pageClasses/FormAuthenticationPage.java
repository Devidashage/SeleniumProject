package com.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage {
    WebDriver ldriver;
	public FormAuthenticationPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="username")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@class='example']//h4")
	 WebElement welcomeMessage;
	
	@FindBy(xpath="//div[@class='example']//a")
	WebElement btnLogout;
	
	@FindBy(xpath="//div[@class='flash success']")
	WebElement logOutMessage;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnSubmit.click();
	}	
	public void clickLogout()
	{
		btnLogout.click();
	}	
	
	public WebElement getWelComeMessageElement()
	{
		return welcomeMessage;
		
	}
	public WebElement getLogoutMessageElement()
	{
		return logOutMessage;
		
	}
	
	
	
}
