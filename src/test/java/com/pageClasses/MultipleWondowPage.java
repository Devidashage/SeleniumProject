package com.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleWondowPage {
    WebDriver ldriver;
	public MultipleWondowPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//a[contains(text(),'Click Here')]")
	WebElement clickhereLink;
		
		
	public void clickhereLink()
	{
		clickhereLink.click();
	}	
	
	
	
	
	
}
