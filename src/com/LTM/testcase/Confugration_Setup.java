package com.LTM.testcase;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.LTM.pages.ConfigurationSetup_Page;
import com.LTM.pages.Login_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Confugration_Setup 
{	
	utility selUtility=new utility();
	WebDriver wd= utility.startBrowser("chrome", "https://unifiedx.sundynetech.com/Login.aspx");
	ConfigurationSetup_Page cp=new ConfigurationSetup_Page(wd);
	
	Login_Page abc = new Login_Page(wd);
	
	String className = this.getClass().getSimpleName();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	ATUTestRecorder recorder;
	
	@DataProvider
	public Object [][]getdata() 
	{
		//Login Page
		HashedMap<String, String> map= new HashedMap<String, String>();
		map.put("User", "admin");
		map.put("Pass", "admin");
		
		return new Object[][] {{map}};
	}
	

	@Test (priority=1, dataProvider="getdata")
	public void login(HashedMap<String , String> input) throws ATUTestRecorderException
	{
		recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
		recorder.start();
		
		abc.login_details(input.get("User"),input.get("Pass"));
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
	}
	
//	@Test (priority=2)
	public void mailerEngine() throws InterruptedException 
	{
		cp.mailerEngine();
	}
	
	@Test (priority=3)
	public void oprnRepo() throws IOException 
	{
		cp.openRepo();
	}
	

	@Test (priority=4)
	public void syncRepo() throws IOException 
	{
		cp.syncRepo();
	}
	
	
	@Test (priority=5)
	public void quit() throws ATUTestRecorderException 
	{
		wd.quit();
		recorder.stop();
	}
	
}
