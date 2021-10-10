package com.testClasses;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import com.pageClasses.Homepage;
import com.utils.ReadConfigFile;



public class BasicAuth extends BaseClass{
  
 @Test
 public void basicAuth() throws InterruptedException, FindFailed, IOException
 {
	 ReadConfigFile readconfig=new ReadConfigFile();	
		 String authURL=readconfig.getAuthURL();
         driver.get(authURL);	
		
 }
}
