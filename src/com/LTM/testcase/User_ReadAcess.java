package com.LTM.testcase;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.LTM.pages.LinuxConMGMT_Page;
import com.LTM.pages.LinuxDM_Page;
import com.LTM.pages.Login_Page;
import com.LTM.pages.Readacess_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class User_ReadAcess 

{
	WebDriver wd= utility.startBrowser("chrome", "https://192.168.5.145");
	Readacess_Page rd=new Readacess_Page(wd);
	LinuxDM_Page ld=new LinuxDM_Page(wd);
	SoftAssert softAssert = new SoftAssert();
	//SoftAssert softAssert = new SoftAssert();
	//Assertion softAssert = new SoftAssert();
	Login_Page abc = new Login_Page(wd);
	LinuxConMGMT_Page lc=new LinuxConMGMT_Page(wd);
	
	String className = this.getClass().getSimpleName();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	ATUTestRecorder recorder;
	
	@DataProvider
	public Object [][]getdata() 
	{
		//Login Page
		HashedMap<String, String> map= new HashedMap<String, String>();
		map.put("User", "read");
		map.put("Pass", "admin@123");
		
		//Windows Device IP
		map.put("WindowsIP", "192.168.1.127");
		
		//Linux Device IP
		map.put("LinuxIP", "192.168.2.64");
				
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
	public void VerifyReadAcess_SystemSetting(HashedMap<String , String> input) throws InterruptedException 
	{
	  rd.VerifyReadAcess_SystemSetting(input.get("WindowsIP"));	
	}

	@Test (priority=3)
	public void VerifyReadAcess_UserSetting() 
	{
		rd.VerifyReadAcess_UserSetting();
	}
	
	@Test(priority = 4)
	public void VerifyReadAcess_Administration() 
	{
	  rd.VerifyReadAcess_Administration();
	}
	
	@Test(priority = 5)
	public void VerifyReadAcess_Security() throws InterruptedException 
	{
	  rd.VerifyReadAcess_Security();	
	}
	
	@Test(priority = 6)
	public void VerifyReadAcess_softwaredeploment() throws InterruptedException 
	{
	 rd.VerifyReadAcess_softwaredeploment();	
	}

	@Test(priority = 7)
	public void VerifyReadAcess_ContexMenu() throws InterruptedException
	{
		rd.VerifyReadAcess_ContexMenu();
	}
	
	@Test(priority = 8)
	public void VerifyReadAcess_tab_Profile() throws InterruptedException
	{
	 rd.VerifyReadAcess_tab_Profile();	
	}
	
	@Test(priority = 9, dataProvider="getdata")
	public void Linux_Readacess_SystemSetting(HashedMap<String , String> input)
	{
		ld.Linux_Readacess_SystemSetting(input.get("LinuxIP"));
	}
	
	@Test(priority = 10)
	public void Linux_Readacess_UserSetting()
	{
		ld.Linux_Readacess_UserSetting();
	}
	
	//@Test(priority = 11)
	public void Linux_Readacess_Security()
	{
		ld.Linux_Readacess_Security();
	}
	
	@Test(priority = 12)
	public void Linux_Readacess_UpgradeMGMT()
	{
		ld.Linux_Readacess_UpgradeMGMT();
	}
	
	@Test(priority = 13)
	public void Linux_Readacess_Administration() throws InterruptedException
	{
		ld.Linux_Readacess_Administration();
	}
	
	@Test (priority=14)
	public void LinuxConMGMT() 
	{
		lc.ConMGMT();
	}
	
	@Test (priority=15)  
	public void quit() throws ATUTestRecorderException 
	{
		wd.quit();
		recorder.stop(); 
	}




}
