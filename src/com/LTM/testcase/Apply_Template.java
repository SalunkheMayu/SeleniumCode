package com.LTM.testcase;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.LTM.pages.Apply_Template_Page;
import com.LTM.pages.Login_Page;
import com.LTM.pages.TemplateMangerConMGMT_Page;
import com.LTM.pages.Template_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Apply_Template 
{
	WebDriver wd= utility.startBrowser("chrome", "https://192.168.5.134");

	Login_Page abc = new Login_Page(wd);
	Template_Page Tm = new Template_Page(wd);
	TemplateMangerConMGMT_Page TC=new TemplateMangerConMGMT_Page(wd);
	Apply_Template_Page AT= new Apply_Template_Page(wd);
	
	String className = this.getClass().getSimpleName();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	ATUTestRecorder recorder;
	
	@DataProvider
	public Object [][]getdata() 
	{
		//Login Page
		HashedMap<String, String> map= new HashedMap<String, String>();
		map.put("User", "rajendra");
		map.put("Pass", "Admin@123");
		
		//RHS
		map.put("TempName", "RHS");
		
		map.put("Temp", "1");
		map.put("IP", "192.168.1.192");
		map.put("Temp_Name", "Template_User_Setting");
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
	
	@Test (priority=2, dataProvider="getdata")
	public void Create_Template(HashedMap<String , String> input) 
	{
		Tm.Create_Template_User_Setting(input.get("TempName"));	
	}
	
	@Test (priority=3,dataProvider="getdata")
	public void Create_Template_Dependancy(HashedMap<String , String> input)
	{
		TC.Create_Template_RemoteOperation(input.get("Temp"),input.get("TempName"));
	}
	
	
	@Test (priority=4)
	public void Apply_Template_Node() 
	{
		AT.Apply_Template_Node();
	}
	
	
	@Test (priority=6,dataProvider="getdata")
	public void Apply_Template_Device_List_View(HashedMap<String , String> input) 
	{
		AT.Apply_Template_Device_List_View(input.get("IP"), input.get("Temp_Name"));
	}
	
	@Test (priority=5)
	public void Apply_Template_Grp() 
	{
		AT.Apply_Template_grp();
	}
	
	@Test (priority=7)
	public void Close_Browser() throws ATUTestRecorderException 
	{
		wd.close();	
		recorder.stop();
	}
	
	
}
