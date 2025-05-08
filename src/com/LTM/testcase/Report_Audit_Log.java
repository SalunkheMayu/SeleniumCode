package com.LTM.testcase;

import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Date;
import com.LTM.pages.Login_Page;
import com.LTM.pages.Report_Audit_Log_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Report_Audit_Log 
{
	String URL="https://192.168.3.41";
	WebDriver wd= utility.startBrowser("chrome",URL);
	Login_Page abc = new Login_Page(wd);
	
	//Report_Audit_Log_Page ral= new Report_Audit_Log_Page(wd);
	Report_Audit_Log_Page ral=new Report_Audit_Log_Page(wd);
	
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
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
		recorder.start();
	
		abc.login_details(input.get("User"),input.get("Pass"));
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
	}
	
	
	@Test (priority=2)
	public void Create_Custom_Config_Report() throws IOException, InterruptedException 
	{
		ral.customconfigreport();
	}
	
	@AfterTest
	public void Close_Browser() throws ATUTestRecorderException 
	{
		wd.quit();	
		recorder.stop();
	}
	
	
}
