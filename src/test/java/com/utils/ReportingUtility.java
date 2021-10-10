package com.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testClasses.BaseClass;

public class ReportingUtility extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="TestStart -"+result.getName()+ "-"+timeStamp;
		
		
		File f = new File("./Screenshots"); 
		
		if(f.exists())
		{
		try {
			BaseClass bs=new BaseClass();
			bs.captureScreen(driver, repName);
			
			} 
		catch (IOException e) 
				{
				e.printStackTrace();
		     }
		}
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="TestSuccess"+result.getName()+timeStamp;
		
		File f = new File("./Screenshots"); 
		
		if(f.exists())
		{
		try {
			BaseClass bs=new BaseClass();
			bs.captureScreen(driver, repName);
			
			} 
		catch (IOException e) 
				{
				e.printStackTrace();
		     }
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="TestFailure"+result.getName()+timeStamp;
		
		File f = new File("./Screenshots"); 
		
		if(f.exists())
		{
		try {
			BaseClass bs=new BaseClass();
			bs.captureScreen(driver, repName);
			
			} 
		catch (IOException e) 
				{
				e.printStackTrace();
		     }
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {

		
	}

}
