package com.LTM.testcase;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.LTM.pages.UserManagement_Page;
import com.LTM.pages.Login_Page;
import com.PageFactory.utility;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class UserManegement 
{
	utility selUtility = new utility();
	WebDriver wd = utility.startBrowser("chrome", "https://192.168.5.145");
	UserManagement_Page user = new UserManagement_Page(wd);
	Login_Page abc = new Login_Page(wd);

	String className = this.getClass().getSimpleName();
	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	ATUTestRecorder recorder;
	
	
	
	@Test(priority = 1)
	public void login() throws ATUTestRecorderException 
	{
		recorder = new ATUTestRecorder("D:\\Recorder\\", "" +className+ "" + timestamp +"", false);
		recorder.start();
		
		abc.login_details("admin", "admin");
		if (utility.isDisaplyed(By.id("ibtntHome"), wd, 6000) == true);
	}

	// Create User role
	
	@Test(priority = 2)
	public void userrole_F_R() throws InterruptedException 
	{
		user.userrole("Full_Read");
	}
	
	@Test(priority = 3)
	public void userrole_R_N() throws InterruptedException 
	{
		user.userrole("Read_no");
	}
	
	// Create User Grp
	
	@Test(priority = 4)
	public void usergrp_F_R() throws InterruptedException 
	{
		user.usergrp("Full_Read");
	}
	
	@Test(priority = 5)
	public void usergrp_R_N() throws InterruptedException 
	{
		user.usergrp("Read_no");
	}

	// Mix User
	@Test(priority = 6)
	public void createmixuser_F_R() throws InterruptedException 
	{
		user.createmixuser("FullRead", "admin@123", "User", "user", "fullread@user.com", "Full_Read");
	}
	
	@Test(priority = 7)
	public void createmixuser_R_N() throws InterruptedException 
	{
		user.createmixuser("ReadNo", "admin@123", "User", "user", "readno@user.com", "Read_no");
	}
	
	
	//Domian User
	
	//@Test(priority = 8)
	public void domainuser() throws InterruptedException 
	{
		user.domainuser("vdi", "amol.thorat@vdi.com", "amol@123","ADMIN");
	}

	// Mailer Engine Confugration
	
	@Test(priority = 9)
	public void mailerEngine() throws InterruptedException 
	{
		user.mailerEngine();
	}

	// Default User
	
	@Test(priority = 10)
	public void defaultnoUser() throws InterruptedException 
	{
		user.defaultnoacessuser();
		
	}
	
	@Test(priority = 11)
	public void defaultadminUser() throws InterruptedException 
	{
		user.defaultnadmincessuser();
	}
	
	@Test(priority = 12)
	public void defaultreadUser() throws InterruptedException 
	{
		user.defaultnreadcessuser();
	}

	@Test(priority = 13)
	public void quit() throws ATUTestRecorderException
	{
		wd.quit();
		recorder.stop();
	}

}
