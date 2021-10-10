package com.pageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    WebDriver ldriver;
	public ForgotPasswordPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="form_submit")
	WebElement retrievePasswordBtn;
	
	@FindBy(xpath="//h1[contains(text(),'Internal Server Error')]")
	WebElement internalServerError;
	
	
	
	public void setEmail(String email)
	{
		emailTextBox.sendKeys(email);
		
	}
	
	public void clickSubmit()
	{
		retrievePasswordBtn.click();
	}
	public WebElement getElementInternalServerErrorMessage()
	{
		return internalServerError;
		
	}
	
}
