package com.LTM.testcase;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.LTM.pages.ConfigurationSetup_Page;
import com.LTM.pages.DeviceManagerSystemseting_Page;
import com.LTM.pages.DeviceManagerUsersetting_Page;
import com.LTM.pages.Full_Acess_Page;
import com.LTM.pages.UserManagement_Page;
import com.LTM.pages.Login_Page;
import com.LTM.pages.MUI_Page;
import com.PageFactory.utility;

public class UserSetting 
{
	utility selUtility=new utility();
	//WebDriver wd= utility.startBrowser("chrome", "https://192.168.5.109");
	WebDriver wd= utility.startBrowser("chrome", "https://192.168.1.17/Login.aspx");
	DeviceManagerSystemseting_Page dm=new DeviceManagerSystemseting_Page(wd);
	UserManagement_Page user= new UserManagement_Page(wd);
	Login_Page abc = new Login_Page(wd);
	ConfigurationSetup_Page con= new ConfigurationSetup_Page(wd);
	DeviceManagerUsersetting_Page ds= new DeviceManagerUsersetting_Page(wd);
	Full_Acess_Page fa=new Full_Acess_Page(wd);
	MUI_Page demo=new MUI_Page(wd);
	
	
	@Test (priority=1)
	public void login()
	{
		//login.loginpage();
		abc.login_details("admin","admin");
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
		
		
	}
	//@Test (priority=2)
	public void print() throws IOException 
	{
		demo.greek();
	}
	
	
	
	
	//@Test (priority=2)
	public void usersetting() 
	{
		ds.usersetting();
	}
	
	
   	
	@Test (priority=3)
	public void quit()
	{
		wd.quit();
	}
	
}
