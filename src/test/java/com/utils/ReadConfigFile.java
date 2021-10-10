package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	Properties pro;
	
	
	public ReadConfigFile()
	{
	     pro=new Properties();
		
		File src = new File("./BinFolder/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
				
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("homepageUrl");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
	public String getUsernameFilePath()
	{
	String usernamefilePath=pro.getProperty("usernamefilePath");
	return usernamefilePath;
	}
	public String getPasswordFilePath()
	{
	String passwordfilePath=pro.getProperty("passwordfilePath");
	return passwordfilePath;
	}
	public String getAuthURL()
	{
	String authURL=pro.getProperty("basicauthURL");
	return authURL;
	}
	
}
