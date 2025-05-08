package com.LTM.testcase;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.LTM.pages.Login_Page;
import com.LTM.pages.Template_Page;
import com.LTM.pages.TemplateMangerAdministration_Page;
import com.LTM.pages.TemplateMangerConMGMT_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Template_MGR 
{
	WebDriver wd= utility.startBrowser("chrome", "https://192.168.3.13");
	
	Login_Page abc = new Login_Page(wd);
	Template_Page Tm = new Template_Page(wd);
	TemplateMangerAdministration_Page TA=new TemplateMangerAdministration_Page(wd);
	TemplateMangerConMGMT_Page TC=new TemplateMangerConMGMT_Page(wd);
	
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
		
		//RHS
		map.put("TempName", "Template"); //For ALL RHS remove No '1'
		
		//Domain Name
		map.put("dmUser", "asit");
		map.put("dmPass", "asit#123");
		
		//Computer Name
		map.put("grp", "WORKGROUP");
		map.put("cmUser", "administrator");
		map.put("cmPass", "000000");
		
		//Printer Setting
		map.put("Pindex", "IP Port"); // 0 For local,1 for IP, 2 for Network
		map.put("Pname", "test");
		
		map.put("Temp", "0");
		
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
	
	//@Test (priority=2)
	public void checkUrl() 
	{
	  utility.checkUrl(wd);	
	}
	
	@Test (priority=3, dataProvider="getdata")
	public void Template_System_Setting(HashedMap<String , String> input) throws InterruptedException 
	{
		Tm.Create_Template_System_Setting(input.get("TempName"));	
	}
	
	@Test (priority=4, dataProvider="getdata")
	public void Template_User_Setting(HashedMap<String , String> input) 
	{
		Tm.Create_Template_User_Setting(input.get("TempName"));	
	}
	
	@Test (priority=5, dataProvider="getdata")
	public void Create_Template_Administration(HashedMap<String , String> input)
	{
		TA.applicationcommand(input.get("TempName"));
		
	}
	
	@Test (priority=6, dataProvider="getdata")
	public void Create_Template_Security(HashedMap<String , String> input)
	{
		Tm.Create_Template_Security(input.get("TempName"));
	}
	
	
	@Test (priority=7, dataProvider="getdata")
	public void Create_Template_ConnectionMGMT(HashedMap<String , String> input)
	{
		TC.Create_Template_ConnectionMGMT(input.get("TempName"));
		
	}
	
	@Test (priority=8,dataProvider="getdata")
	public void Create_Template_Dependancy(HashedMap<String , String> input)
	{
		TC.Create_Template_RemoteOperation(input.get("Temp"),input.get("TempName"));
	}
	
	@Test (priority=9)
	public void Quit() throws ATUTestRecorderException 
	{
		wd.quit();	
		recorder.stop();
	}
	
	
	
}
