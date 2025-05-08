package com.LTM.testcase;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.LTM.pages.Login_Page;
import com.LTM.pages.Teradici_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Teradici_Template extends utility
{
  
WebDriver wd= utility.startBrowser("chrome", "https://192.168.5.143");
	
	//Objects
	utility sel= new utility();
	Teradici_Page tr= new Teradici_Page(wd);
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
		
		//Template name
		map.put("Template_Name", "Tera_Auto");
		
		//TeraIP
		map.put("TeraIP", "192.168.1.151");
		
		//Trusted Broker
		map.put("Teraagent", "192.168.2.32");
		map.put("Contype", "Direct");
		
		//NTP
		map.put("Address", "times.google.com");
		map.put("Port", "143");
		map.put("QInterval", "86350");
		
		//Time Zone
		map.put("Tzone", "Africa/Abidjan"); 
		map.put("TDformat","%b %d %Y %H:%M:%S");
		
		//Log Lavel Log 
		map.put("Log","error"); 
		
		return new Object[][] {{map}};
	}
	
	@Test (priority=1,dataProvider ="getdata")
	public void login(HashedMap<String, String> input) throws ATUTestRecorderException
	{
		recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
		recorder.start();
	
		abc.login_details(input.get("User"),input.get("Pass"));
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
	}
	
	@Test(priority=2,dataProvider ="getdata")
	public void create_template(HashedMap<String, String> input) 
	{
		tr.create_Template(input.get("Template_Name"),input.get("Teraagent")
				,input.get("Log"));
	}
	
	@Test(priority=3) //@AfterTest 
	public void quit() throws ATUTestRecorderException
	{
		wd.quit();
		recorder.stop();
	}

}
