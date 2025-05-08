package com.LTM.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.LTM.pages.Login_Page;
import com.LTM.pages.Teradici_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Teradici extends utility
{
	
	//Create WebDriver
	
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
	
	
	//@Test (priority=0)//@BeforeTest
	public void bmethod() throws ATUTestRecorderException
		{
			recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
			recorder.start();
		}
	
	
	@Test (priority=1,dataProvider ="getdata")
	public void login(HashedMap<String, String> input) throws ATUTestRecorderException
	{
		recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
		recorder.start();
	
		abc.login_details(input.get("User"),input.get("Pass"));
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
	}
	
	@Test (priority=2)
	public void addgrp() 
	{
	  tr.addgroup();
	}
	
	@Test (priority=3)
	public void addtrustcenter() 
	{
		tr.addtrustcenter();
	}
	
	@Test (priority=4)
	public void trust_cen_config()
	{
		tr.trust_cen_config();
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 7000) == true);
	}

	@Test (priority=5,dataProvider ="getdata")
	public void firemware(HashedMap<String, String> input)
	{
		tr.firemware(input.get("TeraIP"));
	}
	
	@Test (priority=6)
	public void OTA()
	{
		tr.OTAupdate();
	}
	
	@Test (priority=7,dataProvider = "getdata")
	public void trust_broker(HashedMap<String, String> input)
	{
		tr.trust_broker(input.get("Teraagent"),input.get("Contype"));
	}
	
	@Test (priority=8,dataProvider = "getdata")
	public void datetime_NTP(HashedMap<String, String> input)
	{
		tr.datetime_NTP(input.get("Address"), input.get("Port"),input.get("QInterval"));
	}
	
	@Test (priority=9,dataProvider = "getdata")
	public void Time_Zone(HashedMap<String, String> input)
	{
		tr.Time_Zone(input.get("Tzone"),input.get("TDformat") );
	}
	
	@Test (priority=10,dataProvider = "getdata")
	public void log_level(HashedMap<String, String> input)
	{
		tr.log_level(input.get("Log"));
	}

	@Test(priority = 11)
	public void Keyboard() throws InterruptedException 
	{
		tr.Keyboard();
	}

	@Test(priority = 12)
	public void USB() 
	{
		tr.USB();
	}

	@Test(priority = 13)
	public void Audio() 
	{
		tr.Audio();
	}

	//@Test(priority = 14)
	public void Branding() 
	{
		tr.Branding("", "");
	}

	@Test(priority = 15)
	public void Imaging() 
	{
		tr.Imaging();
	}

	@Test(priority = 16)
	public void Power() 
	{
		tr.Power();
	}

	@Test(priority = 17)
	public void Network() 
	{
		tr.Network();
	}
	 
	
	@Test (priority=18)
	public void command_Restart()
	{
		tr.command_Restart();
	}
	
	//@Test (priority=19)
	public void command_FactoryReset()
	{
		tr.command_FactoryReset();
	}
	
	//@Test (priority=20)
	public void shutdown()
	{
		tr.command_Shutdown();
	}

	@Test (priority=21)
	public void SystemHelty()
	{
		tr.SystemHelty();
	}

	
	
	@Test(priority=22) //@AfterTest 
	public void quit() throws ATUTestRecorderException
	{
		
		wd.quit();
		recorder.stop();
		
	}
	
}


